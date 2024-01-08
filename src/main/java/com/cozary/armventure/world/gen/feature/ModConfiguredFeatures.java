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

package com.cozary.armventure.world.gen.feature;

import com.cozary.armventure.Armventure;
import com.cozary.armventure.handler.ModConfig;
import com.cozary.armventure.init.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.DEEPSLATE_ORE_REPLACEABLES;
import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> ESSENCE_ORE_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.ESSENCE_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ESSENCE_ORE.get().defaultBlockState()));

    public static PlacedFeature ESSENCE_ORE = Feature.ORE.configured(new OreConfiguration(ESSENCE_ORE_TARGET_LIST, ModConfig.COMMON.veinSizeEssence.get(), 0.5F))
            .placed(commonOrePlacement(ModConfig.COMMON.spawnRateEssence.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(ModConfig.COMMON.botOffsetEssence.get()), VerticalAnchor.belowTop(ModConfig.COMMON.topOffsetEssence.get()))));

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static void registerConfiguredFeatures() {
        Registry<PlacedFeature> registry = BuiltinRegistries.PLACED_FEATURE;
        Registry.register(registry, new ResourceLocation(Armventure.MOD_ID, "essence_ore"), ESSENCE_ORE);
    }
}
