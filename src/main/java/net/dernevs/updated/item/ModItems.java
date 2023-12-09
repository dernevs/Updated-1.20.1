package net.dernevs.updated.item;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new FabricItemSettings()));

    public static final Item GLASS_VILE = registerItem("glass_vile",
            new Item(new FabricItemSettings().maxCount(16)));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget",
            new Item(new FabricItemSettings()));
    public static final Item REPAIR_TEMPLATE = registerItem("repair_template",
            new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLDEN_CARROT = registerItem("rose_golden_carrot",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROSE_GOLDEN_CARROT)));
    public static final Item ROSE_GOLDEN_APPLE = registerItem("rose_golden_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROSE_GOLDEN_APPLE)));
    public static final Item HEART_GEM = registerItem("heart_gem",
            new HeartGemItem(new FabricItemSettings()));
    public static final Item CORRUPTED_HEART_GEM = registerItem("corrupted_heart_gem",
            new CorruptedHeartGemItem(new FabricItemSettings()));
    public static final Item ANDESITE_SWORD = registerItem("andesite_sword",
            new SwordItem(ModToolMaterial.ANDESITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item ANDESITE_PICKAXE = registerItem("andesite_pickaxe",
            new PickaxeItem(ModToolMaterial.ANDESITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item ANDESITE_AXE = registerItem("andesite_axe",
            new AxeItem(ModToolMaterial.ANDESITE, 7, -3f, new FabricItemSettings()));
    public static final Item ANDESITE_SHOVEL = registerItem("andesite_shovel",
            new ShovelItem(ModToolMaterial.ANDESITE, 1.5f, -3f, new FabricItemSettings()));
    public static final Item ANDESITE_HOE = registerItem("andesite_hoe",
            new HoeItem(ModToolMaterial.ANDESITE, -1, -2f, new FabricItemSettings()));
    public static final Item DIORITE_SWORD = registerItem("diorite_sword",
            new SwordItem(ModToolMaterial.DIORITE, 4, -2.4f, new FabricItemSettings()));
    public static final Item DIORITE_PICKAXE = registerItem("diorite_pickaxe",
            new PickaxeItem(ModToolMaterial.DIORITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item DIORITE_AXE = registerItem("diorite_axe",
            new AxeItem(ModToolMaterial.DIORITE, 7, -3f, new FabricItemSettings()));
    public static final Item DIORITE_SHOVEL = registerItem("diorite_shovel",
            new ShovelItem(ModToolMaterial.DIORITE, 1.5f, -3f, new FabricItemSettings()));
    public static final Item DIORITE_HOE = registerItem("diorite_hoe",
            new HoeItem(ModToolMaterial.DIORITE, -1, -2f, new FabricItemSettings()));
    public static final Item GRANITE_SWORD = registerItem("granite_sword",
            new SwordItem(ModToolMaterial.GRANITE, 3, -2.2f, new FabricItemSettings()));
    public static final Item GRANITE_PICKAXE = registerItem("granite_pickaxe",
            new PickaxeItem(ModToolMaterial.GRANITE, 1, -2.6f, new FabricItemSettings()));
    public static final Item GRANITE_AXE = registerItem("granite_axe",
            new AxeItem(ModToolMaterial.GRANITE, 7, -2.8f, new FabricItemSettings()));
    public static final Item GRANITE_SHOVEL = registerItem("granite_shovel",
            new ShovelItem(ModToolMaterial.GRANITE, 1.5f, -2.8f, new FabricItemSettings()));
    public static final Item GRANITE_HOE = registerItem("granite_hoe",
            new HoeItem(ModToolMaterial.GRANITE, -1, -1.8f, new FabricItemSettings()));
    public static final Item TUFF_SWORD = registerItem("tuff_sword",
            new SwordItem(ModToolMaterial.TUFF, 3, -2.4f, new FabricItemSettings()));
    public static final Item TUFF_PICKAXE = registerItem("tuff_pickaxe",
            new PickaxeItem(ModToolMaterial.TUFF, 1, -2.8f, new FabricItemSettings()));
    public static final Item TUFF_AXE = registerItem("tuff_axe",
            new AxeItem(ModToolMaterial.TUFF, 7, -3f, new FabricItemSettings()));
    public static final Item TUFF_SHOVEL = registerItem("tuff_shovel",
            new ShovelItem(ModToolMaterial.TUFF, 1.5f, -3f, new FabricItemSettings()));
    public static final Item TUFF_HOE = registerItem("tuff_hoe",
            new HoeItem(ModToolMaterial.TUFF, -1, -2f, new FabricItemSettings()));

    public static final Item DAMAGED_SWORD = registerItem("damaged_sword",
            new SwordItem(ModToolMaterial.DAMAGED, 3, -2.4f, new FabricItemSettings()));
    public static final Item DAMAGED_PICKAXE = registerItem("damaged_pickaxe",
            new PickaxeItem(ModToolMaterial.DAMAGED, 1, -2.8f, new FabricItemSettings()));
    public static final Item DAMAGED_AXE = registerItem("damaged_axe",
            new AxeItem(ModToolMaterial.DAMAGED, 7, -3f, new FabricItemSettings()));
    public static final Item DAMAGED_SHOVEL = registerItem("damaged_shovel",
            new ShovelItem(ModToolMaterial.DAMAGED, 1.5f, -3f, new FabricItemSettings()));
    public static final Item DAMAGED_HOE = registerItem("damaged_hoe",
            new HoeItem(ModToolMaterial.DAMAGED, 0, -2f, new FabricItemSettings()));
    public static final Item VENOM_SWORD = registerItem("venom_sword",
            new VenomSwordItem(ModToolMaterial.IRON, 3, -2.4f, new FabricItemSettings()));
    public static final Item DAMAGED_HELMET = registerItem("damaged_helmet",
            new ArmorItem(ModArmorMaterial.DAMAGED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DAMAGED_CHESTPLATE = registerItem("damaged_chestplate",
            new ArmorItem(ModArmorMaterial.DAMAGED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DAMAGED_LEGGINGS = registerItem("damaged_leggings",
            new ArmorItem(ModArmorMaterial.DAMAGED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DAMAGED_BOOTS = registerItem("damaged_boots",
            new ArmorItem(ModArmorMaterial.DAMAGED, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new HorseArmorItem(19,"netherite", new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_AND_NETHERITE = registerItem("hellstone_and_netherite",
            new HellstoneAndNetheriteItem(new FabricItemSettings()));
    public static final Item AMETHYST_SHIELD = registerItem("amethyst_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(350)));
    public static final Item ENDER_TRANSPORTER = registerItem("ender_transporter",
            new EnderTransporterItem(new FabricItemSettings().maxCount(1).maxDamage(16)));
    public static final Item IRON_PLATES = registerItem("iron_plates",
            new Item(new FabricItemSettings()));
    public static final Item WHISKEY_GLASS = registerItem("whiskey_glass",
            new Item(new FabricItemSettings()));
    public static final Item WINE_GLASS = registerItem("wine_glass",
            new Item(new FabricItemSettings()));
    public static final Item FILLED_WHISKEY_GLASS = registerItem("filled_whiskey_glass",
            new WhiskeyDrinkItem(new FabricItemSettings().food(ModFoodComponents.FILLED_WHISKEY_GLASS).recipeRemainder(ModItems.WHISKEY_GLASS)));
    public static final Item FILLED_WHITE_WINE_GLASS = registerItem("filled_white_wine_glass",
            new WineDrinkItem(new FabricItemSettings().food(ModFoodComponents.FILLED_WHITE_WINE_GLASS).recipeRemainder(ModItems.WINE_GLASS)));
    public static final Item FILLED_RED_WINE_GLASS = registerItem("filled_red_wine_glass",
            new WineDrinkItem(new FabricItemSettings().food(ModFoodComponents.FILLED_RED_WINE_GLASS).recipeRemainder(ModItems.WINE_GLASS)));
    public static final Item WHISKEY_BOTTLE = registerItem("whiskey_bottle",
            new ModDrinkItem(new FabricItemSettings().food(ModFoodComponents.WHISKEY_BOTTLE).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item WHITE_WINE_BOTTLE = registerItem("white_wine_bottle",
            new ModDrinkItem(new FabricItemSettings().food(ModFoodComponents.WHITE_WINE_BOTTLE).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item RED_WINE_BOTTLE = registerItem("red_wine_bottle",
            new ModDrinkItem(new FabricItemSettings().food(ModFoodComponents.RED_WINE_BOTTLE).recipeRemainder(Items.GLASS_BOTTLE)));
    /*
    public static final Item PLATED_IRON_HELMET = registerItem("plated_iron_helmet",
            new ArmorItem(ModArmorMaterial.PLATED_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATED_IRON_CHESTPLATE = registerItem("plated_iron_chestplate",
            new ArmorItem(ModArmorMaterial.PLATED_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATED_IRON_LEGGINGS = registerItem("plated_iron_leggings",
            new ArmorItem(ModArmorMaterial.PLATED_IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATED_IRON_BOOTS = registerItem("plated_iron_boots",
            new ArmorItem(ModArmorMaterial.PLATED_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));
     */
    public static final Item ROSE_GOLD_CREWMATE = registerItem("rose_gold_crewmate",
            new Item(new Item.Settings().maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UpdatedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UpdatedMod.LOGGER.info("Register mod items for " + UpdatedMod.MOD_ID);
    }

}
