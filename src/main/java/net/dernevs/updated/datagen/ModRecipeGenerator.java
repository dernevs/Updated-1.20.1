package net.dernevs.updated.datagen;

import net.dernevs.updated.block.ModBlocks;
import net.dernevs.updated.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT);
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK);
        /*
        offerSmelting(exporter, List.of(Blocks.STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS,
                0.1f, 200, "cracked_stone_brick_stairs");
        offerSmelting(exporter, List.of(Blocks.STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB,
                0.1f, 200, "cracked_stone_brick_slab");
        offerSmelting(exporter, List.of(Blocks.STONE_BRICK_WALL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL,
                0.1f, 200, "cracked_stone_brick_wall");

        offerSmelting(exporter, List.of(Blocks.NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS,
                0.1f, 200, "cracked_nether_brick_stairs");
        offerSmelting(exporter, List.of(Blocks.NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB,
                0.1f, 200, "cracked_nether_brick_slab");
        offerSmelting(exporter, List.of(Blocks.NETHER_BRICK_WALL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL,
                0.1f, 200, "cracked_nether_brick_wall");

        offerSmelting(exporter, List.of(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,
                0.1f, 200, "cracked_polished_blackstone_brick_stairs");
        offerSmelting(exporter, List.of(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
                0.1f, 200, "cracked_polished_blackstone_brick_slab");
        offerSmelting(exporter, List.of(Blocks.POLISHED_BLACKSTONE_BRICK_WALL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                0.1f, 200, "cracked_polished_blackstone_brick_wall");



        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE,1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL,Blocks.POLISHED_DIORITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE, 1);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.STONE_WALL, Blocks.STONE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_QUARTZ_WALL,Blocks.SMOOTH_QUARTZ);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_WALL,Blocks.PURPUR_BLOCK);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_GRANITE_WALL,Blocks.POLISHED_GRANITE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_DIORITE_WALL,Blocks.POLISHED_DIORITE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_ANDESITE_WALL,Blocks.POLISHED_ANDESITE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_NETHER_BRICK_WALL,Blocks.CRACKED_NETHER_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_SANDSTONE_WALL,Blocks.SMOOTH_SANDSTONE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_RED_SANDSTONE_WALL,Blocks.SMOOTH_RED_SANDSTONE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.GILDED_BLACKSTONE_WALL,Blocks.GILDED_BLACKSTONE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.PRISMARINE_BRICK_WALL,Blocks.PRISMARINE_BRICKS);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_WALL,Blocks.DARK_PRISMARINE);

         */

        /*
        offerSmelting(exporter, List.of(ModBlocks.ACO), RecipeCategory.MISC, Items.COAL,
                0.1f, 200, "coal");
        offerBlasting(exporter, List.of(ModBlocks.ACO), RecipeCategory.MISC, Items.COAL,
                0.1f, 100, "coal");
        offerSmelting(exporter, List.of(ModBlocks.DCO), RecipeCategory.MISC, Items.COAL,
                0.1f, 200, "coal");
        offerBlasting(exporter, List.of(ModBlocks.DCO), RecipeCategory.MISC, Items.COAL,
                0.1f, 100, "coal");
        offerSmelting(exporter, List.of(ModBlocks.GCO), RecipeCategory.MISC, Items.COAL,
                0.1f, 200, "coal");
        offerBlasting(exporter, List.of(ModBlocks.GCO), RecipeCategory.MISC, Items.COAL,
                0.1f, 100, "coal");
        offerSmelting(exporter, List.of(ModBlocks.TCO), RecipeCategory.MISC, Items.COAL,
                0.1f, 200, "coal");
        offerBlasting(exporter, List.of(ModBlocks.TCO), RecipeCategory.MISC, Items.COAL,
                0.1f, 100, "coal");

        offerSmelting(exporter, List.of(ModBlocks.ACOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "copper_ingot");
        offerBlasting(exporter, List.of(ModBlocks.ACOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "copper_ingot");
        offerSmelting(exporter, List.of(ModBlocks.DCOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "copper_ingot");
        offerBlasting(exporter, List.of(ModBlocks.DCOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "copper_ingot");
        offerSmelting(exporter, List.of(ModBlocks.GCOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "copper_ingot");
        offerBlasting(exporter, List.of(ModBlocks.GCOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "copper_ingot");
        offerSmelting(exporter, List.of(ModBlocks.TCOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "copper_ingot");
        offerBlasting(exporter, List.of(ModBlocks.TCOO), RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "copper_ingot");

        offerSmelting(exporter, List.of(ModBlocks.ADO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 200, "diamond");
        offerBlasting(exporter, List.of(ModBlocks.ADO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 100, "diamond");
        offerSmelting(exporter, List.of(ModBlocks.DDO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 200, "diamond");
        offerBlasting(exporter, List.of(ModBlocks.DDO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 100, "diamond");
        offerSmelting(exporter, List.of(ModBlocks.GDO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 200, "diamond");
        offerBlasting(exporter, List.of(ModBlocks.GDO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 100, "diamond");
        offerSmelting(exporter, List.of(ModBlocks.TDO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 200, "diamond");
        offerBlasting(exporter, List.of(ModBlocks.TDO), RecipeCategory.MISC, Items.DIAMOND,
                1f, 100, "diamond");

        offerSmelting(exporter, List.of(ModBlocks.AEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 200, "emerald");
        offerBlasting(exporter, List.of(ModBlocks.AEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 100, "emerald");
        offerSmelting(exporter, List.of(ModBlocks.DEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 200, "emerald");
        offerBlasting(exporter, List.of(ModBlocks.DEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 100, "emerald");
        offerSmelting(exporter, List.of(ModBlocks.GEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 200, "emerald");
        offerBlasting(exporter, List.of(ModBlocks.GEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 100, "emerald");
        offerSmelting(exporter, List.of(ModBlocks.TEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 200, "emerald");
        offerBlasting(exporter, List.of(ModBlocks.TEO), RecipeCategory.MISC, Items.EMERALD,
                1f, 100, "emerald");

        offerSmelting(exporter, List.of(ModBlocks.AGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 200, "gold_ingot");
        offerBlasting(exporter, List.of(ModBlocks.AGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 100, "gold_ingot");
        offerSmelting(exporter, List.of(ModBlocks.DGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 200, "gold_ingot");
        offerBlasting(exporter, List.of(ModBlocks.DGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 100, "gold_ingot");
        offerSmelting(exporter, List.of(ModBlocks.GGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 200, "gold_ingot");
        offerBlasting(exporter, List.of(ModBlocks.GGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 100, "gold_ingot");
        offerSmelting(exporter, List.of(ModBlocks.TGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 200, "gold_ingot");
        offerBlasting(exporter, List.of(ModBlocks.TGO), RecipeCategory.MISC, Items.GOLD_INGOT,
                1f, 100, "gold_ingot");

        offerSmelting(exporter, List.of(ModBlocks.AIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron_ingot");
        offerBlasting(exporter, List.of(ModBlocks.AIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron_ingot");
        offerSmelting(exporter, List.of(ModBlocks.DIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron_ingot");
        offerBlasting(exporter, List.of(ModBlocks.DIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron_ingot");
        offerSmelting(exporter, List.of(ModBlocks.GIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron_ingot");
        offerBlasting(exporter, List.of(ModBlocks.GIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron_ingot");
        offerSmelting(exporter, List.of(ModBlocks.TIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron_ingot");
        offerBlasting(exporter, List.of(ModBlocks.TIO), RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron_ingot");

        offerSmelting(exporter, List.of(ModBlocks.ALO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 200, "lapis_lazuli");
        offerBlasting(exporter, List.of(ModBlocks.ALO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 100, "lapis_lazuli");
        offerSmelting(exporter, List.of(ModBlocks.DLO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 200, "lapis_lazuli");
        offerBlasting(exporter, List.of(ModBlocks.DLO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 100, "lapis_lazuli");
        offerSmelting(exporter, List.of(ModBlocks.GLO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 200, "lapis_lazuli");
        offerBlasting(exporter, List.of(ModBlocks.GLO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 100, "lapis_lazuli");
        offerSmelting(exporter, List.of(ModBlocks.TLO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 200, "lapis_lazuli");
        offerBlasting(exporter, List.of(ModBlocks.TLO), RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 100, "lapis_lazuli");

        offerSmelting(exporter, List.of(ModBlocks.ARO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        offerBlasting(exporter, List.of(ModBlocks.ARO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");
        offerSmelting(exporter, List.of(ModBlocks.DRO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        offerBlasting(exporter, List.of(ModBlocks.DRO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");
        offerSmelting(exporter, List.of(ModBlocks.GRO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        offerBlasting(exporter, List.of(ModBlocks.GRO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");
        offerSmelting(exporter, List.of(ModBlocks.TRO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        offerBlasting(exporter, List.of(ModBlocks.TRO), RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");

         */
    }
}
