package net.dernevs.updated;

import net.dernevs.updated.block.ModBlocks;
import net.dernevs.updated.entity.client.ModDragonFireballProjectileModel;
import net.dernevs.updated.entity.client.ModDragonFireballProjectileRenderer;
import net.dernevs.updated.entity.layer.ModModelLayers;
import net.dernevs.updated.entity.variant.ModEntities;
import net.dernevs.updated.screen.AlchemyTableScreen;
import net.dernevs.updated.screen.ModScreenHandlers;
import net.dernevs.updated.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class UpdatedModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALCHEMY_TABLE, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.ALCHEMY_TABLE_SCREEN_HANDLER, AlchemyTableScreen::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MOD_DRAGON_FIREBALL_PROJECTILE, ModDragonFireballProjectileModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.BOTTLED_LIGHTNING_PROJECTILE_ENTITY, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.MOD_DRAGON_FIREBALL_PROJECTILE_ENTITY, ModDragonFireballProjectileRenderer::new);
    }
}
