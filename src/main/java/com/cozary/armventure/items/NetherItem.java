/*
 *
 *  * Copyright (c) 2024 Cozary
 *  *
 *  * This file is part of Armventure, a mod made for Minecraft.
 *  *
 *  * Armventure is free software: you can redistribute it and/or modify it
 *  * under the terms of the GNU General Public License as published
 *  * by the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Armventure is distributed in the hope that it will be useful, but
 *  * WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * License along with Armventure.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.cozary.armventure.items;

import com.cozary.armventure.Armventure;
import net.minecraft.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.portal.PortalForcer;

import java.util.Optional;

public class NetherItem extends Item {

    public NetherItem() {
        super(new Properties()
                .tab(Armventure.TAB)
                .rarity(Rarity.UNCOMMON)
                .stacksTo(64)
                .defaultDurability(1)
        );
    }

    @Override
    public boolean canBeDepleted() {
        return super.canBeDepleted();
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand handIn) {
        ItemStack itemstack = player.getItemInHand(handIn);

        if (!world.isClientSide) {
            ServerLevel server = (ServerLevel) world;
            BlockPos pos = player.blockPosition();
            Direction.Axis axis = player.getDirection().getAxis();
            PortalForcer tp = server.getPortalForcer();
            Optional<BlockUtil.FoundRectangle> portalinfo = tp.createPortal(pos, axis);
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.getAbilities().instabuild) {
                itemstack.shrink(1);
                ((ServerLevel) player.getCommandSenderWorld()).sendParticles(ParticleTypes.PORTAL, player.getX(), player.getY(), player.getZ(), 100, 1D, 1D, 1D, 0.1);
                ((ServerLevel) player.getCommandSenderWorld()).sendParticles(ParticleTypes.REVERSE_PORTAL, player.getX(), player.getY(), player.getZ(), 100, 1D, 1D, 1D, 0.1);
            }
            return InteractionResultHolder.success(itemstack);
        }
        return super.use(world, player, handIn);
    }
}
