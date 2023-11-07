package net.dernevs.updated.datagen;

import net.dernevs.updated.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(

                        ModBlocks.ROSE_GOLD_BLOCK,
                        ModBlocks.ALCHEMY_TABLE,
                        ModBlocks.AGO,
                        ModBlocks.ACO,
                        ModBlocks.AIO,
                        ModBlocks.ALO,
                        ModBlocks.ACOO,
                        ModBlocks.ADO,
                        ModBlocks.AEO,
                        ModBlocks.ARO,

                        ModBlocks.DGO,
                        ModBlocks.DCO,
                        ModBlocks.DIO,
                        ModBlocks.DLO,
                        ModBlocks.DCOO,
                        ModBlocks.DDO,
                        ModBlocks.DEO,
                        ModBlocks.DRO,

                        ModBlocks.GGO,
                        ModBlocks.GCO,
                        ModBlocks.GIO,
                        ModBlocks.GLO,
                        ModBlocks.GCOO,
                        ModBlocks.GDO,
                        ModBlocks.GEO,
                        ModBlocks.GRO,

                        ModBlocks.TGO,
                        ModBlocks.TCO,
                        ModBlocks.TIO,
                        ModBlocks.TLO,
                        ModBlocks.TCOO,
                        ModBlocks.TDO,
                        ModBlocks.TEO,
                        ModBlocks.TRO,

                        ModBlocks.CRACKED_STONE_BRICK_STAIRS,
                        ModBlocks.CRACKED_STONE_BRICK_WALL,
                        ModBlocks.CRACKED_STONE_BRICK_SLAB,
                        ModBlocks.CRACKED_NETHER_BRICK_STAIRS,
                        ModBlocks.CRACKED_NETHER_BRICK_SLAB,
                        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,
                        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
                        ModBlocks.QUARTZ_BRICK_STAIRS,
                        ModBlocks.QUARTZ_BRICK_SLAB,
                        ModBlocks.GILDED_BLACKSTONE_STAIRS,
                        ModBlocks.GILDED_BLACKSTONE_SLAB,



                        ModBlocks.STONE_WALL,
                        ModBlocks.SMOOTH_STONE_WALL,
                        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                        ModBlocks.QUARTZ_BRICK_WALL,
                        ModBlocks.SMOOTH_QUARTZ_WALL,
                        ModBlocks.PURPUR_WALL,
                        ModBlocks.POLISHED_GRANITE_WALL,
                        ModBlocks.POLISHED_DIORITE_WALL,
                        ModBlocks.POLISHED_ANDESITE_WALL,
                        ModBlocks.CRACKED_NETHER_BRICK_WALL,
                        ModBlocks.SMOOTH_RED_SANDSTONE_WALL,
                        ModBlocks.PRISMARINE_BRICK_WALL,
                        ModBlocks.SMOOTH_SANDSTONE_WALL,
                        ModBlocks.GILDED_BLACKSTONE_WALL,
                        ModBlocks.DARK_PRISMARINE_WALL);
    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
          .add(
                  ModBlocks.ALCHEMY_TABLE
          );

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

            .add(
                    ModBlocks.AEO,
                    ModBlocks.ADO,
                    ModBlocks.AGO,
                    ModBlocks.ARO,

                    ModBlocks.DEO,
                    ModBlocks.DDO,
                    ModBlocks.DGO,
                    ModBlocks.DRO,

                    ModBlocks.GEO,
                    ModBlocks.GDO,
                    ModBlocks.GGO,
                    ModBlocks.GRO,

                    ModBlocks.TEO,
                    ModBlocks.TDO,
                    ModBlocks.TGO,
                    ModBlocks.TRO);


   getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ModBlocks.AIO,
                        ModBlocks.ALO,
                        ModBlocks.ROSE_GOLD_BLOCK,

                        ModBlocks.DIO,
                        ModBlocks.DLO,

                        ModBlocks.GIO,
                        ModBlocks.GLO,

                        ModBlocks.TIO,
                        ModBlocks.TLO);


    getOrCreateTagBuilder(BlockTags.WALLS)
            .add(
                    ModBlocks.CRACKED_STONE_BRICK_WALL,
                    ModBlocks.STONE_WALL,
                    ModBlocks.SMOOTH_STONE_WALL,
                    ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                    ModBlocks.QUARTZ_BRICK_WALL,
                    ModBlocks.SMOOTH_QUARTZ_WALL,
                    ModBlocks.PURPUR_WALL,
                    ModBlocks.POLISHED_GRANITE_WALL,
                    ModBlocks.POLISHED_DIORITE_WALL,
                    ModBlocks.POLISHED_ANDESITE_WALL,
                    ModBlocks.CRACKED_NETHER_BRICK_WALL,
                    ModBlocks.SMOOTH_RED_SANDSTONE_WALL,
                    ModBlocks.PRISMARINE_BRICK_WALL,
                    ModBlocks.SMOOTH_SANDSTONE_WALL,
                    ModBlocks.GILDED_BLACKSTONE_WALL,
                    ModBlocks.DARK_PRISMARINE_WALL);
   //Tags for Mining levels
    //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));
    //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")));



    }


}