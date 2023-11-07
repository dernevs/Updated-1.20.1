package net.dernevs.updated;

import net.dernevs.updated.block.ModBlocks;
import net.dernevs.updated.screen.AlchemyTableScreen;
import net.dernevs.updated.screen.ModScreenHandlers;
import net.dernevs.updated.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class UpdatedModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALCHEMY_TABLE, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.ALCHEMY_TABLE_SCREEN_HANDLER, AlchemyTableScreen::new);

    }
}
