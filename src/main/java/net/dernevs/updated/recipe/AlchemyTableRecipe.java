package net.dernevs.updated.recipe;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class AlchemyTableRecipe implements Recipe<SimpleInventory> {
    private final Identifier id;
    private final ItemStack output;
    private final DefaultedList<Ingredient> recipeItems;

    public AlchemyTableRecipe(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }
    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if (world.isClient()) {
            return false;
        }
        return recipeItems.get(0).test(inventory.getStack(0)) &&
                recipeItems.get(1).test(inventory.getStack(1)) &&
                recipeItems.get(2).test(inventory.getStack(2)) &&
                recipeItems.get(3).test(inventory.getStack(3)) &&
                recipeItems.get(4).test(inventory.getStack(4)) &&
                recipeItems.get(5).test(inventory.getStack(5)) &&
                recipeItems.get(6).test(inventory.getStack(6)) &&
                recipeItems.get(7).test(inventory.getStack(7)) &&
                recipeItems.get(8).test(inventory.getStack(8)) &&
                //ingredient slot
                recipeItems.get(11).test(inventory.getStack(11)) &&
                //potion vials
                recipeItems.get(12).test(inventory.getStack(12)) &&
                recipeItems.get(13).test(inventory.getStack(13)) &&
                recipeItems.get(14).test(inventory.getStack(14));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public Identifier getId() {
        return this.id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return this.recipeItems;
    }

    public static class Type implements RecipeType<AlchemyTableRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alchemy_table";
    }
    public static class Serializer implements RecipeSerializer<AlchemyTableRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "alchemy_table";
        // this is the name given in the json file

        @Override
        public AlchemyTableRecipe read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(12, Ingredient.EMPTY); //might have to increase size idk tho lol

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new AlchemyTableRecipe(id, output, inputs);
        }

        @Override
        public AlchemyTableRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new AlchemyTableRecipe(id, output, inputs);
        }

        @Override
        public void write(PacketByteBuf buf, AlchemyTableRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput(null));
        }
    }
}
