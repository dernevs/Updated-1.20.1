package net.dernevs.updated.world;

import net.dernevs.updated.UpdatedMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeature {
    public static final RegistryKey<PlacedFeature> VARIANT_DIAMOND_PLACED_KEY = registerKey("variant_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_COPPER_PLACED_KEY = registerKey("variant_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_GOLD_PLACED_KEY = registerKey("variant_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_IRON_PLACED_KEY = registerKey("variant_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_COAL_PLACED_KEY = registerKey("variant_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_LAPIS_PLACED_KEY = registerKey("variant_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_EMERALD_PLACED_KEY = registerKey("variant_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> VARIANT_REDSTONE_PLACED_KEY = registerKey("variant_redstone_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, VARIANT_DIAMOND_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_DIAMOND_KEY),
                ModOrePlacement.modifiersWithCount(7, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))); // the level the veins spawn in
        register(context, VARIANT_COPPER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_COPPER_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));
        register(context, VARIANT_GOLD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_GOLD_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));
        register(context, VARIANT_IRON_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_IRON_KEY),
                ModOrePlacement.modifiersWithCount(20,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(384))));
        register(context, VARIANT_COAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_COAL_KEY),
                ModOrePlacement.modifiersWithCount(20,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));
        register(context, VARIANT_LAPIS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_LAPIS_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(32))));
        register(context, VARIANT_EMERALD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_EMERALD_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480))));
        register(context, VARIANT_REDSTONE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VARIANT_REDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(UpdatedMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
