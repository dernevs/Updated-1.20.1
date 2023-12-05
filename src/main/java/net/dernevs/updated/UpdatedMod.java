package net.dernevs.updated;

import net.dernevs.updated.block.ModBlocks;
import net.dernevs.updated.block.entity.ModBlockEntities;
import net.dernevs.updated.enchantment.ModEnchantments;
import net.dernevs.updated.item.ModItemGroup;
import net.dernevs.updated.item.ModItems;
import net.dernevs.updated.recipe.ModRecipes;
import net.dernevs.updated.screen.ModScreenHandlers;
import net.dernevs.updated.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdatedMod implements ModInitializer {
	public static final String MOD_ID = "updated";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModThingies();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();
		ModEnchantments.registerModEnchanments();
	}
}