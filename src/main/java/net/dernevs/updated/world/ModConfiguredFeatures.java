package net.dernevs.updated.world;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_DIAMOND_KEY = registerKey("variant_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_COPPER_KEY = registerKey("variant_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_GOLD_KEY = registerKey("variant_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_IRON_KEY = registerKey("variant_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_COAL_KEY = registerKey("variant_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_LAPIS_KEY = registerKey("variant_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_EMERALD_KEY = registerKey("variant_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARIANT_REDSTONE_KEY = registerKey("variant_redstone_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(UpdatedMod.MOD_ID, name));
    }
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest andesiteReplaceables = new BlockMatchRuleTest(Blocks.ANDESITE);
        RuleTest dioriteReplaceables = new BlockMatchRuleTest(Blocks.DIORITE);
        RuleTest graniteReplaceables = new BlockMatchRuleTest(Blocks.GRANITE);
        RuleTest tuffReplaceables = new BlockMatchRuleTest(Blocks.TUFF);

        List<OreFeatureConfig.Target> diamondVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.ADO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DDO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GDO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TDO.getDefaultState()));
        List<OreFeatureConfig.Target> copperVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.ACOO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DCOO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GCOO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TCOO.getDefaultState()));
        List<OreFeatureConfig.Target> goldVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.AGO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DGO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GGO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TGO.getDefaultState()));
        List<OreFeatureConfig.Target> ironVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.AIO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DIO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GIO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TIO.getDefaultState()));
        List<OreFeatureConfig.Target> coalVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.ACO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DCO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GCO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TCO.getDefaultState()));
        List<OreFeatureConfig.Target> lapisVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.ALO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DLO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GLO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TLO.getDefaultState()));
        List<OreFeatureConfig.Target> emeraldVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.AEO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DEO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GEO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TEO.getDefaultState()));
        List<OreFeatureConfig.Target> redstoneVariantOres =
                List.of(OreFeatureConfig.createTarget(andesiteReplaceables, ModBlocks.ARO.getDefaultState()),
                        OreFeatureConfig.createTarget(dioriteReplaceables, ModBlocks.DRO.getDefaultState()),
                        OreFeatureConfig.createTarget(graniteReplaceables, ModBlocks.GRO.getDefaultState()),
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TRO.getDefaultState()));

        register(context, VARIANT_DIAMOND_KEY, Feature.ORE, new OreFeatureConfig(diamondVariantOres,4,0.5f));
        register(context, VARIANT_COPPER_KEY, Feature.ORE, new OreFeatureConfig(copperVariantOres,10));
        register(context, VARIANT_GOLD_KEY, Feature.ORE, new OreFeatureConfig(goldVariantOres,9));
        register(context, VARIANT_IRON_KEY, Feature.ORE, new OreFeatureConfig(ironVariantOres,4));
        register(context, VARIANT_COAL_KEY, Feature.ORE, new OreFeatureConfig(coalVariantOres,17));
        register(context, VARIANT_LAPIS_KEY, Feature.ORE, new OreFeatureConfig(lapisVariantOres,7));
        register(context, VARIANT_EMERALD_KEY, Feature.ORE, new OreFeatureConfig(emeraldVariantOres,3));
        register(context, VARIANT_REDSTONE_KEY, Feature.ORE, new OreFeatureConfig(redstoneVariantOres,8));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
