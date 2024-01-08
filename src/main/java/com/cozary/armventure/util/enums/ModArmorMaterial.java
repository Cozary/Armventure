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

package com.cozary.armventure.util.enums;

import com.cozary.armventure.Armventure;
import com.cozary.armventure.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    MINER(Armventure.MOD_ID + ":miner", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    LIFE(Armventure.MOD_ID + ":life", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    BERSKERK(Armventure.MOD_ID + ":berserk", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    DIVING(Armventure.MOD_ID + ":diving", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    NETHER(Armventure.MOD_ID + ":nether", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    GOD(Armventure.MOD_ID + ":god", 50, new int[]{6, 16, 12, 6}, 35, SoundEvents.ARMOR_EQUIP_GENERIC, 5.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    TANK(Armventure.MOD_ID + ":tank", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    HONEY(Armventure.MOD_ID + ":honey", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    HADES(Armventure.MOD_ID + ":hades", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F),
    ANGEL(Armventure.MOD_ID + ":angel", 35, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, () -> {
        return Ingredient.of(ModItems.FORJA.get());
    }, 0.2F);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float thougness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float thougness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.thougness = thougness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;

    }


    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return this.damageReductionArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public @NotNull String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.thougness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }


}
