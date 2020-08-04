package com.tutor.pixelmon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Pokeblock extends Block {

    public Pokeblock() {
        super(Block.Properties.create(Material.CLAY)
                .hardnessAndResistance(3f, 4f)
                .harvestLevel(1)
                /*
                level 0 = wood
                level 1 = stone
                level 2 = iron
                level 3 = diamond
                 */
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
                .lightValue(5000)
                .slipperiness(1f)
                .variableOpacity());
    }
}