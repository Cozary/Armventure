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
import com.cozary.armventure.blocks.EssenceOre;
import com.cozary.armventure.blocks.ForgiumBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Armventure.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> ESSENCE_ORE = BLOCKS.register("essence_ore", EssenceOre::new);
    public static final RegistryObject<Block> FORGIUM_BLOCK = BLOCKS.register("forgium_block", ForgiumBlock::new);

}
