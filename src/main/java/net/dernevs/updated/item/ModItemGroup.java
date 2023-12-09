package net.dernevs.updated.item;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(UpdatedMod.MOD_ID, "mod_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod_group"))
                    .icon(() -> new ItemStack(ModItems.ROSE_GOLD_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.ROSE_GOLD_NUGGET);
                        entries.add(ModItems.ROSE_GOLDEN_CARROT);
                        entries.add(ModItems.ROSE_GOLDEN_APPLE);
                        entries.add(ModBlocks.ROSE_GOLD_BLOCK);

                        entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_STAIRS);

                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(ModBlocks.SMOOTH_STONE_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
                        entries.add(ModBlocks.QUARTZ_BRICK_WALL);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(ModBlocks.PURPUR_WALL);
                        entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_DIORITE_WALL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_WALL);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.PRISMARINE_BRICK_WALL);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_WALL);
                        entries.add(ModBlocks.DARK_PRISMARINE_WALL);

                        entries.add(ModBlocks.ACO);
                        entries.add(ModBlocks.ACOO);
                        entries.add(ModBlocks.ADO);
                        entries.add(ModBlocks.AEO);
                        entries.add(ModBlocks.AGO);
                        entries.add(ModBlocks.ALO);
                        entries.add(ModBlocks.AIO);
                        entries.add(ModBlocks.ARO);

                        entries.add(ModBlocks.DCO);
                        entries.add(ModBlocks.DCOO);
                        entries.add(ModBlocks.DDO);
                        entries.add(ModBlocks.DEO);
                        entries.add(ModBlocks.DGO);
                        entries.add(ModBlocks.DLO);
                        entries.add(ModBlocks.DIO);
                        entries.add(ModBlocks.DRO);

                        entries.add(ModBlocks.GCO);
                        entries.add(ModBlocks.GCOO);
                        entries.add(ModBlocks.GDO);
                        entries.add(ModBlocks.GEO);
                        entries.add(ModBlocks.GGO);
                        entries.add(ModBlocks.GLO);
                        entries.add(ModBlocks.GIO);
                        entries.add(ModBlocks.GRO);

                        entries.add(ModBlocks.TCO);
                        entries.add(ModBlocks.TCOO);
                        entries.add(ModBlocks.TDO);
                        entries.add(ModBlocks.TEO);
                        entries.add(ModBlocks.TGO);
                        entries.add(ModBlocks.TLO);
                        entries.add(ModBlocks.TIO);
                        entries.add(ModBlocks.TRO);

                        entries.add(ModItems.ANDESITE_SWORD);
                        entries.add(ModItems.ANDESITE_PICKAXE);
                        entries.add(ModItems.ANDESITE_AXE);
                        entries.add(ModItems.ANDESITE_SHOVEL);
                        entries.add(ModItems.ANDESITE_HOE);

                        entries.add(ModItems.DIORITE_SWORD);
                        entries.add(ModItems.DIORITE_PICKAXE);
                        entries.add(ModItems.DIORITE_AXE);
                        entries.add(ModItems.DIORITE_SHOVEL);
                        entries.add(ModItems.DIORITE_HOE);

                        entries.add(ModItems.GRANITE_SWORD);
                        entries.add(ModItems.GRANITE_PICKAXE);
                        entries.add(ModItems.GRANITE_AXE);
                        entries.add(ModItems.GRANITE_SHOVEL);
                        entries.add(ModItems.GRANITE_HOE);

                        entries.add(ModItems.TUFF_SWORD);
                        entries.add(ModItems.TUFF_PICKAXE);
                        entries.add(ModItems.TUFF_AXE);
                        entries.add(ModItems.TUFF_SHOVEL);
                        entries.add(ModItems.TUFF_HOE);

                        entries.add(ModItems.DAMAGED_SWORD);
                        entries.add(ModItems.DAMAGED_PICKAXE);
                        entries.add(ModItems.DAMAGED_AXE);
                        entries.add(ModItems.DAMAGED_SHOVEL);
                        entries.add(ModItems.DAMAGED_HOE);

                        entries.add(ModItems.DAMAGED_HELMET);
                        entries.add(ModItems.DAMAGED_CHESTPLATE);
                        entries.add(ModItems.DAMAGED_LEGGINGS);
                        entries.add(ModItems.DAMAGED_BOOTS);
                        entries.add(ModItems.IRON_PLATES);
                        /*
                        entries.add(ModItems.PLATED_IRON_HELMET);
                        entries.add(ModItems.PLATED_IRON_CHESTPLATE);
                        entries.add(ModItems.PLATED_IRON_LEGGINGS);
                        entries.add(ModItems.PLATED_IRON_BOOTS);
                         */

                        entries.add(ModItems.VENOM_SWORD);
                        entries.add(ModItems.REPAIR_TEMPLATE);
                        entries.add(ModItems.NETHERITE_HORSE_ARMOR);
                        entries.add(ModItems.GLASS_VILE);
                        entries.add(ModItems.WHISKEY_GLASS);
                        entries.add(ModItems.FILLED_WHISKEY_GLASS);
                        entries.add(ModItems.WHISKEY_BOTTLE);
                        entries.add(ModItems.WINE_GLASS);
                        entries.add(ModItems.FILLED_RED_WINE_GLASS);
                        entries.add(ModItems.FILLED_WHITE_WINE_GLASS);
                        entries.add(ModItems.RED_WINE_BOTTLE);
                        entries.add(ModItems.WHITE_WINE_BOTTLE);

                    }).build());
    public static final ItemGroup MOD_GROUP2 = Registry.register(Registries.ITEM_GROUP,
            new Identifier(UpdatedMod.MOD_ID, "mod_group2"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod_group2"))
                    .icon(() -> new ItemStack(Items.CLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEART_GEM);
                        entries.add(ModItems.CORRUPTED_HEART_GEM);
                        entries.add(ModBlocks.ALCHEMY_TABLE);
                        entries.add(ModItems.HELLSTONE_AND_NETHERITE);
                        entries.add(ModItems.AMETHYST_SHIELD);
                        entries.add(ModItems.ENDER_TRANSPORTER);

                    }).build());




    public static void registerItemGroups() {

    }
}
