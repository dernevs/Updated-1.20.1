package net.dernevs.updated.recipe;

import net.dernevs.updated.UpdatedMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(UpdatedMod.MOD_ID,
                AlchemyTableRecipe.Serializer.ID), AlchemyTableRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(UpdatedMod.MOD_ID,
                AlchemyTableRecipe.Type.ID), AlchemyTableRecipe.Type.INSTANCE);
    }
}
