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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class BerserkerItem extends Item {

    public BerserkerItem() {
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
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);
        if (!worldIn.isClientSide) {
            playerIn.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 1));
            playerIn.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1));
            playerIn.setSecondsOnFire(1200);
            playerIn.awardStat(Stats.ITEM_USED.get(this));
            if (!playerIn.getAbilities().instabuild) {
                itemstack.shrink(1);
                ServerLevel world = (ServerLevel) playerIn.getCommandSenderWorld();
                ((ServerLevel) playerIn.getCommandSenderWorld()).sendParticles(ParticleTypes.FLAME, playerIn.getX(), playerIn.getY(), playerIn.getZ(), 500, 1D, 1D, 1D, 0.1);
            }
            return InteractionResultHolder.success(itemstack);
        }
        return super.use(worldIn, playerIn, handIn);
    }
}
