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

        BlockStateModelGenerator.BlockTexturePool cracked_stone_brick_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cracked_nether_brick_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cracked_polished_blackstone_brick_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartz_brick_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool gilded_blackstone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool smooth_stone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool cut_sandstone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool cut_red_sandstone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool stone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool smooth_quartz_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool purpur_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        BlockStateModelGenerator.BlockTexturePool polished_granite_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polished_diorite_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool polished_andesite_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool dark_prismarine_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool smooth_sandstone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool smooth_red_sandstone_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool prismarine_brick_texturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);

        cracked_stone_brick_texturePool.wall(ModBlocks.CRACKED_STONE_BRICK_WALL);
        stone_texturePool.wall(ModBlocks.STONE_WALL);
        smooth_stone_texturePool.wall(ModBlocks.SMOOTH_STONE_WALL);
        cracked_polished_blackstone_brick_texturePool.wall(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        quartz_brick_texturePool.wall(ModBlocks.QUARTZ_BRICK_WALL);
        smooth_quartz_texturePool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
        purpur_texturePool.wall(ModBlocks.PURPUR_WALL);
        polished_granite_texturePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        polished_diorite_texturePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        polished_andesite_texturePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        cracked_nether_brick_texturePool.wall(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        smooth_red_sandstone_texturePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        prismarine_brick_texturePool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
        smooth_sandstone_texturePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        gilded_blackstone_texturePool.wall(ModBlocks.GILDED_BLACKSTONE_WALL);
        dark_prismarine_texturePool.wall(ModBlocks.DARK_PRISMARINE_WALL);


        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_GOLD_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACOO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ALO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ARO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AIO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AGO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AEO);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DCOO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DCO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DDO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DLO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DGO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEO);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GCOO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GCO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GDO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GIO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GGO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GEO);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TCOO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TCO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TDO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TLO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TGO);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEO);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ALCHEMY_TABLE);

        cracked_stone_brick_texturePool.stairs(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        cracked_stone_brick_texturePool.slab(ModBlocks.CRACKED_STONE_BRICK_SLAB);
        cracked_nether_brick_texturePool.stairs(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        cracked_nether_brick_texturePool.slab(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
        cracked_polished_blackstone_brick_texturePool.stairs(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        cracked_polished_blackstone_brick_texturePool.slab(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        quartz_brick_texturePool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartz_brick_texturePool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        gilded_blackstone_texturePool.stairs(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        gilded_blackstone_texturePool.slab(ModBlocks.GILDED_BLACKSTONE_SLAB);

        smooth_stone_texturePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        cut_sandstone_texturePool.stairs(ModBlocks.CUT_SANDSTONE_STAIRS);
        cut_red_sandstone_texturePool.stairs(ModBlocks.CUT_RED_SANDSTONE_STAIRS);


    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.REPAIR_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLDEN_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLDEN_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEART_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTED_HEART_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLASS_VILE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANDESITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DIORITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GRANITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TUFF_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUFF_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUFF_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUFF_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUFF_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DAMAGED_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMAGED_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMAGED_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMAGED_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMAGED_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DAMAGED_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAMAGED_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAMAGED_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAMAGED_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_TRANSPORTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELLSTONE_AND_NETHERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_CREWMATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.VENOM_SWORD, Models.HANDHELD);



    }
}
