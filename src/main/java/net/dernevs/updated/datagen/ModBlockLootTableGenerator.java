package net.dernevs.updated.datagen;

import net.dernevs.updated.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WRATH_BLOCK);
        addDrop(ModBlocks.GREED_BLOCK);
        addDrop(ModBlocks.GLUTTONY_BLOCK);
        addDrop(ModBlocks.ENVY_BLOCK);
        addDrop(ModBlocks.SLOTH_BLOCK);
        addDrop(ModBlocks.PRIDE_BLOCK);
        addDrop(ModBlocks.LUST_BLOCK);
    }
}
