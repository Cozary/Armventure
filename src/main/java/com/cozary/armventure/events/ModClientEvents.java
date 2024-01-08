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

package com.cozary.armventure.events;

import com.cozary.armventure.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import static com.cozary.armventure.Armventure.MOD_ID;
import static net.minecraft.world.entity.EquipmentSlot.CHEST;
import static net.minecraft.world.entity.EquipmentSlot.HEAD;


@EventBusSubscriber(modid = MOD_ID)
public class ModClientEvents {

    public static boolean isJumping = false;
    public static boolean isDoubleJumping = false;

    static int i = 0;

    @SubscribeEvent
    public static void jumping(LivingEvent.LivingUpdateEvent event) {

        if (event.getEntityLiving().getItemBySlot(HEAD).getItem() == ModItems.HONEY_HELMET.get()) {
            if (isJumping && !isDoubleJumping && !event.getEntityLiving().isOnGround() && Minecraft.getInstance().options.keyJump.consumeClick()) {
                i++;
                if (i == 2) {
                    event.getEntityLiving().lerpMotion(0F, 1F, 0F);
                    isDoubleJumping = true;
                    i = 0;
                }
            }
        }
    }

    @SubscribeEvent
    public static void onJump(LivingEvent.LivingUpdateEvent.LivingJumpEvent event) {
        if (event.getEntityLiving() instanceof Player) {
            isJumping = true;
        }
    }

    @SubscribeEvent
    public static void onFall(LivingFallEvent event) {
        if (event.getEntityLiving() instanceof Player) {
            isJumping = false;
            isDoubleJumping = false;
        }
    }

    @SubscribeEvent
    public static void getHurt(LivingHurtEvent event) {
        onDamage(event);
        onDamage2(event);
    }

    public static void onDamage(LivingHurtEvent event) {
        if (event.getEntityLiving().getItemBySlot(CHEST).getItem() == ModItems.LIFE_CHESTPLATE.get() && !event.getEntityLiving().hasEffect(MobEffects.ABSORPTION)) {
            event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 0));
            event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.SATURATION, 20, 0));
            ((ServerLevel) event.getEntityLiving().getCommandSenderWorld()).sendParticles(ParticleTypes.INSTANT_EFFECT, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), 250, 1D, 1D, 1D, 1);
        }
    }

    public static void onDamage2(LivingHurtEvent event) {
        if (event.getEntityLiving().getItemBySlot(CHEST).getItem() == ModItems.LIFE_CHESTPLATET2.get() && !event.getEntityLiving().hasEffect(MobEffects.ABSORPTION)) {
            event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2));
            event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.SATURATION, 40, 0));
            event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.REGENERATION, 80, 2));
            ((ServerLevel) event.getEntityLiving().getCommandSenderWorld()).sendParticles(ParticleTypes.INSTANT_EFFECT, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), 250, 1D, 1D, 1D, 1);
        }
    }
}