package net.dernevs.updated.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ROSE_GOLDEN_CARROT = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).snack().build();
    public static final FoodComponent ROSE_GOLDEN_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1f).alwaysEdible().build();
    public static final FoodComponent FILLED_WHISKEY_GLASS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent FILLED_RED_WINE_GLASS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent FILLED_WHITE_WINE_GLASS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent WHISKEY_BOTTLE = new FoodComponent.Builder().hunger(10).saturationModifier(1f).alwaysEdible().build();
    public static final FoodComponent RED_WINE_BOTTLE = new FoodComponent.Builder().hunger(10).saturationModifier(1f).alwaysEdible().build();
    public static final FoodComponent WHITE_WINE_BOTTLE = new FoodComponent.Builder().hunger(10).saturationModifier(1f).alwaysEdible().build();
}
