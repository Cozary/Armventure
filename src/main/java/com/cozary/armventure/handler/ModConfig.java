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

package com.cozary.armventure.handler;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public final class ModConfig {

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Common {

        public final ForgeConfigSpec.IntValue veinSizeEssence;
        public final ForgeConfigSpec.IntValue botOffsetEssence;
        public final ForgeConfigSpec.IntValue topOffsetEssence;
        public final ForgeConfigSpec.IntValue spawnRateEssence;
        public final ForgeConfigSpec.DoubleValue discardChanceOnAirExposureEssence;


        public Common(ForgeConfigSpec.Builder builder) {

            builder.push("Materials");
            builder.push("Essence Ore");
            builder.push("World Gen");
            veinSizeEssence = builder.comment("Set to the max vein size you a Essence cluster could generate with.").defineInRange("veinSizeEssence", 6, 0, 64);
            botOffsetEssence = builder.comment("Set to the number of blocks above the world bottom that Essence should try and generate.").defineInRange("botOffsetEssence", -80, -256, 256);
            topOffsetEssence = builder.comment("Set to the number of blocks below the max spawn level that Essence should try and generate.").defineInRange("topOffsetEssence", 80, -80, 256);
            spawnRateEssence = builder.comment("Set to the number of attempts that Essence will try to generate in a chunk.").defineInRange("spawnRateEssence", 1, 0, 64);
            discardChanceOnAirExposureEssence = builder.comment("Set to the number of attempts that Essence will try to generate in a chunk.").defineInRange("discardChanceOnAirExposureEssence", 0.5F, 0.0F, 1.0F);
            builder.pop();
            builder.pop();
            builder.pop();
        }
    }
}
