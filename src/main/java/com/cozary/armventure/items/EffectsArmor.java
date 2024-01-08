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

import com.cozary.armventure.init.ModItems;
import net.minecraft.BlockUtil;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.portal.PortalForcer;
import net.minecraftforge.client.ClientRegistry;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import static org.lwjgl.glfw.GLFW.*;

public class EffectsArmor {

    private static final String CATEGORY = "Armventure";

    public static class MinerArmorTier1 extends ArmorItem {

        public MinerArmorTier1(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier I" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
            if (helmet.getItem() == ModItems.MINER_HELMETT1.get()) {
                if (!player.hasEffect(MobEffects.DIG_SPEED)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.DIG_SPEED, 100, 0);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                }
            }
        }

    }

    public static class MinerArmorTier2 extends ArmorItem {

        public MinerArmorTier2(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier II" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
            if (helmet.getItem() == ModItems.MINER_HELMETT2.get()) {
                if (!player.hasEffect(MobEffect.byId(26))) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.DIG_SPEED, 100, 1);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.LUCK, 100, 1);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                }
            }
        }

    }

    public static class MinerArmorTier3 extends ArmorItem {

        public MinerArmorTier3(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier III" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
            if (helmet.getItem() == ModItems.MINER_HELMETT3.get()) {
                if (!player.hasEffect(MobEffect.byId(26))) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.DIG_SPEED, 100, 2);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.LUCK, 100, 1);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                }
            }
        }

    }

    public static class LifeArmor extends ArmorItem {

        public LifeArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier I" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            if (chest.getItem() == ModItems.LIFE_CHESTPLATE.get()) {
                if (!player.hasEffect(MobEffects.REGENERATION)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.REGENERATION, 80, 0);
                    player.addEffect(statusEffect);
                }

            }
        }
    }

    public static class LifeArmorT2 extends ArmorItem {

        public LifeArmorT2(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier II" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            if (chest.getItem() == ModItems.LIFE_CHESTPLATET2.get()) {
                if (!player.hasEffect(MobEffects.REGENERATION)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.REGENERATION, 80, 0);
                    player.addEffect(statusEffect);
                }

            }
        }
    }

    public static class BerserkArmor extends ArmorItem {

        static int deadCount = 0;

        public BerserkArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
            deadCount = 0;
            return super.use(worldIn, playerIn, handIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);

            if (chest.getItem() == ModItems.BERSERK_CHESTPLATE.get() && legs.getItem() == ModItems.BERSERK_LEGGINGS.get()) {
                if (!player.hasEffect(MobEffects.MOVEMENT_SPEED) && deadCount <= 3) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 3);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 3);
                    MobEffectInstance statusEffect4 = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 3);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                    player.addEffect(statusEffect4);
                    deadCount++;
                }
                if (deadCount >= 3 && !player.hasEffect(MobEffects.MOVEMENT_SPEED)) {
                    MobEffectInstance statusEffect6 = new MobEffectInstance(MobEffects.HARM, 20, 100);
                    player.addEffect(statusEffect6);
                    deadCount = 0;
                }
            }
        }
    }

    public static class DivingArmor extends ArmorItem {


        public DivingArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier I" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
            ItemStack foot = player.getItemBySlot(EquipmentSlot.FEET);
            if (foot.getItem() == ModItems.DIVING_BOOTS.get() && helmet.getItem() == ModItems.DIVING_HELMET.get()) {
                if (!player.hasEffect(MobEffects.WATER_BREATHING) && player.isEyeInFluid(FluidTags.WATER)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.WATER_BREATHING, 100, 0);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 1);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                } else if (!player.isEyeInFluid(FluidTags.WATER)) {
                    player.removeAllEffects();
                }
            }
        }
    }

    public static class DivingArmorT2 extends ArmorItem {


        public DivingArmorT2(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier II" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
            ItemStack foot = player.getItemBySlot(EquipmentSlot.FEET);
            if (foot.getItem() == ModItems.DIVING_BOOTST2.get() && helmet.getItem() == ModItems.DIVING_HELMETT2.get()) {
                if (!player.hasEffect(MobEffects.WATER_BREATHING) && player.isEyeInFluid(FluidTags.WATER)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.CONDUIT_POWER, 100, 1);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 2);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                } else if (!player.isEyeInFluid(FluidTags.WATER)) {
                    player.removeAllEffects();
                }
            }
        }
    }

    public static class NetherArmor extends ArmorItem {
        private static final KeyMapping goToPortal = new KeyMapping("Nether Teleport", GLFW_KEY_H, CATEGORY);

        static {
            ClientRegistry.registerKeyBinding(goToPortal);
        }

        Random rand;

        public NetherArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
            if (chest.getItem() == ModItems.NETHER_CHESTPLATE.get() && legs.getItem() == ModItems.NETHER_LEGGINGS.get()) {
                if (!player.hasEffect(MobEffect.byId(11))) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 100, 1);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                }
                if (goToPortal.consumeClick() && !world.isClientSide()) {
                    chest.hurt(15, rand, null);
                    legs.hurt(15, rand, null);
                    ServerLevel server = (ServerLevel) world;
                    BlockPos pos = player.blockPosition();
                    Direction.Axis axis = player.getDirection().getAxis();
                    PortalForcer tp = server.getPortalForcer();
                    Optional<BlockUtil.FoundRectangle> portalinfo = tp.createPortal(pos, axis);
                }
            }
        }

        @Override
        public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
            return true;
        }
    }

    public static class GodArmor extends ArmorItem {

        public GodArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
            ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
            ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);
            if (chest.getItem() == ModItems.GOD_CHESTPLATE.get() && legs.getItem() == ModItems.GOD_LEGGINGS.get() && head.getItem() == ModItems.GOD_HELMET.get() && feet.getItem() == ModItems.GOD_BOOTS.get()) {
                if (!player.hasEffect(MobEffect.byId(11))) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 2);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.HEAL, 20, 0);
                    MobEffectInstance statusEffect4 = new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 3);
                    MobEffectInstance statusEffect5 = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 100, 0);
                    MobEffectInstance statusEffect6 = new MobEffectInstance(MobEffects.WATER_BREATHING, 100, 0);
                    MobEffectInstance statusEffect7 = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0);
                    if (!player.hasEffect(MobEffect.byId(22))) {
                        MobEffectInstance statusEffect8 = new MobEffectInstance(MobEffects.ABSORPTION, 1200, 4);
                        player.addEffect(statusEffect8);
                    }
                    MobEffectInstance statusEffect9 = new MobEffectInstance(MobEffects.SATURATION, 100, 0);
                    MobEffectInstance statusEffect10 = new MobEffectInstance(MobEffects.JUMP, 100, 2);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                    player.addEffect(statusEffect4);
                    player.addEffect(statusEffect5);
                    player.addEffect(statusEffect6);
                    player.addEffect(statusEffect7);
                    player.addEffect(statusEffect9);
                    player.addEffect(statusEffect10);
                }
            }
        }
    }

    public static class TankArmor extends ArmorItem {

        public TankArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);
            if (chest.getItem() == ModItems.TANK_CHESTPLATE.get() && feet.getItem() == ModItems.TANK_BOOTS.get()) {
                if (!player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 4);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 3);
                    MobEffectInstance statusEffect4 = new MobEffectInstance(MobEffects.JUMP, 100, -20);
                    if (!player.hasEffect(MobEffects.ABSORPTION)) {
                        MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.ABSORPTION, 1200, 4);
                        player.addEffect(statusEffect2);
                    }
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect3);
                    player.addEffect(statusEffect4);
                }
            }
        }
    }

    public static class HoneyArmor extends ArmorItem {

        public HoneyArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
            if (head.getItem() == ModItems.HONEY_HELMET.get()) {
                if (!player.hasEffect(MobEffect.byId(26))) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.JUMP, 100, 2);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2);
                    MobEffectInstance statusEffect3 = new MobEffectInstance(MobEffects.LUCK, 100, 6);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                    player.addEffect(statusEffect3);
                }
            }
        }
/*
        @Override
        public <A extends HumanoidModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default) {
            return Armventure.PROXY.getHoneyArmorModel(armorSlot);
        }
*/
    }

    public static class HadesArmor extends ArmorItem {

        public HadesArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
            if (head.getItem() == ModItems.HADES_HELMET.get()) {
                // if (!player.isPotionActive(Effect.get(14))) {
                MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.INVISIBILITY, 100, 1);
                MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1);
                //Le meto vision nocturna??

                player.addEffect(statusEffect);
                player.addEffect(statusEffect2);

                // }
            }
        }
    }

    public static class AngelArmor extends ArmorItem {

        public AngelArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier I" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            if (chest.getItem() == ModItems.ANGEL_CHESTPLATE.get()) {
                if (!player.hasEffect(MobEffects.SLOW_FALLING)) {
                    MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.LEVITATION, 120, 1);
                    MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.SLOW_FALLING, 170, 3);
                    player.addEffect(statusEffect);
                    player.addEffect(statusEffect2);
                }
            }
        }
        /*
        @Override
        public <A extends HumanoidModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default) {
            return Armventure.PROXY.getAngelArmorModel(armorSlot);
        }
         */
    }

    public static class AngelArmorT2 extends ArmorItem {

        private static final KeyMapping semiFly = new KeyMapping("Fly", GLFW_KEY_X, CATEGORY);
        private static final KeyMapping semiFly2 = new KeyMapping("Descend", GLFW_KEY_C, CATEGORY);

        static {
            ClientRegistry.registerKeyBinding(semiFly);
        }

        static {
            ClientRegistry.registerKeyBinding(semiFly2);
        }

        public AngelArmorT2(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
            super(materialIn, slot, p_i48534_3_);
        }

        @Override
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> toolTip, TooltipFlag flagIn) {
            toolTip.add(new TextComponent("\u00A7e" + "Tier II" + "\u00A77"));
            super.appendHoverText(stack, worldIn, toolTip, flagIn);
        }

        @Override
        public void onArmorTick(ItemStack itemStack, Level world, Player player) {
            ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
            if (chest.getItem() == ModItems.ANGEL_CHESTPLATET2.get()) {
                if (!player.hasEffect(MobEffects.SLOW_FALLING) && !player.hasEffect(MobEffects.LEVITATION)) {

                    if (semiFly.consumeClick()) {
                        MobEffectInstance statusEffect = new MobEffectInstance(MobEffects.LEVITATION, 200, 1);
                        player.addEffect(statusEffect);

                    } else if (semiFly2.consumeClick()) {
                        MobEffectInstance statusEffect2 = new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 3);
                        player.addEffect(statusEffect2);
                    }
                }
            }
        }
/*
        @Override
        public <A extends HumanoidModel<?>>A getArmorModel (LivingEntity entityLiving, ItemStack
                itemStack, EquipmentSlot armorSlot, A _default){
            return Armventure.PROXY.getAngelArmorModel(armorSlot);
        }

 */
    }
}