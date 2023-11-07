package net.dernevs.updated.util;

import net.dernevs.updated.tag.ModItemTags;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Items;

public class ModRegistries {
    public static void registerModThingies() {
        registerFuel();
    }
    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(Items.NETHER_STAR, 10000);
    }
}
