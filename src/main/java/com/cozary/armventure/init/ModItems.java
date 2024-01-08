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

package com.cozary.armventure.init;

import com.cozary.armventure.Armventure;
import com.cozary.armventure.blocks.BlockItemBase;
import com.cozary.armventure.items.*;
import com.cozary.armventure.util.enums.ModArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Armventure.MOD_ID);

    //Items
    public static final RegistryObject<Item> FORJA = ITEMS.register("forja", ItemBase::new);
    public static final RegistryObject<MinerItem> MINER_ESSENCE = ITEMS.register("miner_essence", MinerItem::new);
    public static final RegistryObject<AngelItem> ANGEL_ESSENCE = ITEMS.register("angel_essence", AngelItem::new);
    public static final RegistryObject<BerserkerItem> BERSERKER_ESSENCE = ITEMS.register("berserker_essence", BerserkerItem::new);
    public static final RegistryObject<DefinitiveItem> DEFINITIVE_ESSENCE = ITEMS.register("definitive_essence", DefinitiveItem::new);
    public static final RegistryObject<DivingItem> DIVING_ESSENCE = ITEMS.register("diving_essence", DivingItem::new);
    public static final RegistryObject<HadesItem> HADES_ESSENCE = ITEMS.register("hades_essence", HadesItem::new);
    public static final RegistryObject<HoneyItem> HONEY_ESSENCE = ITEMS.register("honey_essence", HoneyItem::new);
    public static final RegistryObject<LifeItem> LIFE_ESSENCE = ITEMS.register("life_essence", LifeItem::new);
    public static final RegistryObject<NetherItem> NETHER_ESSENCE = ITEMS.register("nether_essence", NetherItem::new);
    public static final RegistryObject<TankItem> TANK_ESSENCE = ITEMS.register("tank_essence", TankItem::new);
    public static final RegistryObject<ItemTotem> FALSE_TOTEM = ITEMS.register("false_totem", ItemTotem::new);
    public static final RegistryObject<EssenceItem> ESSENCE = ITEMS.register("essence", EssenceItem::new);

    //Block Items
    public static final RegistryObject<Item> FORGIUM_BLOCK_ITEM = ITEMS.register("forgium_block_item", () -> new BlockItemBase(ModBlocks.FORGIUM_BLOCK.get()));
    public static final RegistryObject<Item> ESSENCE_ORE_ITEM = ITEMS.register("essence_ore_item", () -> new BlockItemBase(ModBlocks.ESSENCE_ORE.get()));

    ///// Armor
    //Miner
    public static final RegistryObject<ArmorItem> MINER_HELMETT1 = ITEMS.register("miner_helmet", () -> new EffectsArmor.MinerArmorTier1(ModArmorMaterial.MINER, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> MINER_HELMETT2 = ITEMS.register("miner_helmet2", () -> new EffectsArmor.MinerArmorTier2(ModArmorMaterial.MINER, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> MINER_HELMETT3 = ITEMS.register("miner_helmet3", () -> new EffectsArmor.MinerArmorTier3(ModArmorMaterial.MINER, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    //Life
    public static final RegistryObject<ArmorItem> LIFE_CHESTPLATE = ITEMS.register("life_chestplate", () -> new EffectsArmor.LifeArmor(ModArmorMaterial.LIFE, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> LIFE_CHESTPLATET2 = ITEMS.register("life_chestplatet2", () -> new EffectsArmor.LifeArmorT2(ModArmorMaterial.LIFE, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    //Berserk
    public static final RegistryObject<ArmorItem> BERSERK_CHESTPLATE = ITEMS.register("berserk_chestplate", () -> new EffectsArmor.BerserkArmor(ModArmorMaterial.BERSKERK, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> BERSERK_LEGGINGS = ITEMS.register("berserk_leggings", () -> new EffectsArmor.BerserkArmor(ModArmorMaterial.BERSKERK, EquipmentSlot.LEGS, new Item.Properties().tab(Armventure.TAB)));
    //Buceo
    public static final RegistryObject<EffectsArmor.DivingArmor> DIVING_HELMET = ITEMS.register("diving_helmet", () -> new EffectsArmor.DivingArmor(ModArmorMaterial.DIVING, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<EffectsArmor.DivingArmor> DIVING_BOOTS = ITEMS.register("diving_boots", () -> new EffectsArmor.DivingArmor(ModArmorMaterial.DIVING, EquipmentSlot.FEET, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<EffectsArmor.DivingArmorT2> DIVING_HELMETT2 = ITEMS.register("diving_helmett2", () -> new EffectsArmor.DivingArmorT2(ModArmorMaterial.DIVING, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<EffectsArmor.DivingArmorT2> DIVING_BOOTST2 = ITEMS.register("diving_bootst2", () -> new EffectsArmor.DivingArmorT2(ModArmorMaterial.DIVING, EquipmentSlot.FEET, new Item.Properties().tab(Armventure.TAB)));
    //Pyros
    public static final RegistryObject<ArmorItem> NETHER_CHESTPLATE = ITEMS.register("nether_chestplate", () -> new EffectsArmor.NetherArmor(ModArmorMaterial.NETHER, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> NETHER_LEGGINGS = ITEMS.register("nether_leggings", () -> new EffectsArmor.NetherArmor(ModArmorMaterial.NETHER, EquipmentSlot.LEGS, new Item.Properties().tab(Armventure.TAB)));
    //God
    public static final RegistryObject<ArmorItem> GOD_HELMET = ITEMS.register("god_helmet", () -> new EffectsArmor.GodArmor(ModArmorMaterial.GOD, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> GOD_CHESTPLATE = ITEMS.register("god_chestplate", () -> new EffectsArmor.GodArmor(ModArmorMaterial.GOD, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> GOD_LEGGINGS = ITEMS.register("god_leggings", () -> new EffectsArmor.GodArmor(ModArmorMaterial.GOD, EquipmentSlot.LEGS, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> GOD_BOOTS = ITEMS.register("god_boots", () -> new EffectsArmor.GodArmor(ModArmorMaterial.GOD, EquipmentSlot.FEET, new Item.Properties().tab(Armventure.TAB)));
    //Tank
    public static final RegistryObject<ArmorItem> TANK_CHESTPLATE = ITEMS.register("tank_chestplate", () -> new EffectsArmor.TankArmor(ModArmorMaterial.TANK, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<ArmorItem> TANK_BOOTS = ITEMS.register("tank_boots", () -> new EffectsArmor.TankArmor(ModArmorMaterial.TANK, EquipmentSlot.FEET, new Item.Properties().tab(Armventure.TAB)));
    //Honey
    public static final RegistryObject<EffectsArmor.HoneyArmor> HONEY_HELMET = ITEMS.register("honey_helmet", () -> new EffectsArmor.HoneyArmor(ModArmorMaterial.HONEY, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    //Hades
    public static final RegistryObject<ArmorItem> HADES_HELMET = ITEMS.register("hades_helmet", () -> new EffectsArmor.HadesArmor(ModArmorMaterial.HADES, EquipmentSlot.HEAD, new Item.Properties().tab(Armventure.TAB)));
    //Angel
    public static final RegistryObject<EffectsArmor.AngelArmor> ANGEL_CHESTPLATE = ITEMS.register("angel_chestplate", () -> new EffectsArmor.AngelArmor(ModArmorMaterial.ANGEL, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
    public static final RegistryObject<EffectsArmor.AngelArmorT2> ANGEL_CHESTPLATET2 = ITEMS.register("angel_chestplatet2", () -> new EffectsArmor.AngelArmorT2(ModArmorMaterial.ANGEL, EquipmentSlot.CHEST, new Item.Properties().tab(Armventure.TAB)));
}
