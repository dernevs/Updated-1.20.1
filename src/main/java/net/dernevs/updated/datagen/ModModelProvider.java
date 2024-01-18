package net.dernevs.updated.datagen;

import net.dernevs.updated.block.ModBlocks;
import net.dernevs.updated.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WRATH_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLUTTONY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENVY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLOTH_BLOCK);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
