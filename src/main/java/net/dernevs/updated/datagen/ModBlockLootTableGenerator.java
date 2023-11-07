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

        addDrop(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_STONE_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_NETHER_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        addDrop(ModBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(ModBlocks.QUARTZ_BRICK_SLAB, slabDrops(ModBlocks.QUARTZ_BRICK_SLAB));
        addDrop(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.GILDED_BLACKSTONE_SLAB, slabDrops(ModBlocks.GILDED_BLACKSTONE_SLAB));

        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_STAIRS);

        addDrop(ModBlocks.ROSE_GOLD_BLOCK);
        addDrop(ModBlocks.ALCHEMY_TABLE);

        addDrop(ModBlocks.ADO, oreDrops(ModBlocks.ADO, Items.DIAMOND));
        addDrop(ModBlocks.ACO, oreDrops(ModBlocks.ACO, Items.COAL));
        addDrop(ModBlocks.AEO, oreDrops(ModBlocks.AEO, Items.EMERALD));
        addDrop(ModBlocks.AIO, oreDrops(ModBlocks.AIO, Items.RAW_IRON));
        addDrop(ModBlocks.AGO, oreDrops(ModBlocks.AGO, Items.RAW_GOLD));
        addDrop(ModBlocks.ARO, redstoneOreDrops(ModBlocks.ARO));
        addDrop(ModBlocks.ALO, lapisOreDrops(ModBlocks.ALO));
        addDrop(ModBlocks.ACOO, copperOreDrops(ModBlocks.ACOO));

        addDrop(ModBlocks.DDO, oreDrops(ModBlocks.DDO, Items.DIAMOND));
        addDrop(ModBlocks.DCO, oreDrops(ModBlocks.DCO, Items.COAL));
        addDrop(ModBlocks.DEO, oreDrops(ModBlocks.DEO, Items.EMERALD));
        addDrop(ModBlocks.DIO, oreDrops(ModBlocks.DIO, Items.RAW_IRON));
        addDrop(ModBlocks.DGO, oreDrops(ModBlocks.DGO, Items.RAW_GOLD));
        addDrop(ModBlocks.DRO, redstoneOreDrops(ModBlocks.DRO));
        addDrop(ModBlocks.DLO, lapisOreDrops(ModBlocks.DLO));
        addDrop(ModBlocks.DCOO, copperOreDrops(ModBlocks.DCOO));

        addDrop(ModBlocks.GDO, oreDrops(ModBlocks.GDO, Items.DIAMOND));
        addDrop(ModBlocks.GCO, oreDrops(ModBlocks.GCO, Items.COAL));
        addDrop(ModBlocks.GEO, oreDrops(ModBlocks.GEO, Items.EMERALD));
        addDrop(ModBlocks.GIO, oreDrops(ModBlocks.GIO, Items.RAW_IRON));
        addDrop(ModBlocks.GGO, oreDrops(ModBlocks.GGO, Items.RAW_GOLD));
        addDrop(ModBlocks.GRO, redstoneOreDrops(ModBlocks.GRO));
        addDrop(ModBlocks.GLO, lapisOreDrops(ModBlocks.GLO));
        addDrop(ModBlocks.GCOO, copperOreDrops(ModBlocks.GCOO));

        addDrop(ModBlocks.TDO, oreDrops(ModBlocks.TDO, Items.DIAMOND));
        addDrop(ModBlocks.TCO, oreDrops(ModBlocks.TCO, Items.COAL));
        addDrop(ModBlocks.TEO, oreDrops(ModBlocks.TEO, Items.EMERALD));
        addDrop(ModBlocks.TIO, oreDrops(ModBlocks.TIO, Items.RAW_IRON));
        addDrop(ModBlocks.TGO, oreDrops(ModBlocks.TGO, Items.RAW_GOLD));
        addDrop(ModBlocks.TRO, redstoneOreDrops(ModBlocks.TRO));
        addDrop(ModBlocks.TLO, lapisOreDrops(ModBlocks.TLO));
        addDrop(ModBlocks.TCOO, copperOreDrops(ModBlocks.TCOO));


        addDrop(ModBlocks.STONE_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        addDrop(ModBlocks.QUARTZ_BRICK_WALL);
        addDrop(ModBlocks.SMOOTH_QUARTZ_WALL);
        addDrop(ModBlocks.PURPUR_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        addDrop(ModBlocks.PRISMARINE_BRICK_WALL);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(ModBlocks.GILDED_BLACKSTONE_WALL);
        addDrop(ModBlocks.DARK_PRISMARINE_WALL);

    }
}
