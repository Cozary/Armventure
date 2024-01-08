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

package com.cozary.armventure.world.gen;

import com.cozary.armventure.world.gen.feature.ModConfiguredFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class WorldOreGen {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void generateOverworld(final BiomeLoadingEvent evt) {
        Biome.BiomeCategory category = evt.getCategory();
        BiomeGenerationSettingsBuilder builder = evt.getGeneration();

        if (category != Biome.BiomeCategory.NETHER && category != Biome.BiomeCategory.THEEND) {
            builder.addFeature(Decoration.UNDERGROUND_ORES, ModConfiguredFeatures.ESSENCE_ORE);
        }
    }
}
