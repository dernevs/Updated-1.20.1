package net.dernevs.updated.screen;

import net.dernevs.updated.UpdatedMod;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<AlchemyTableScreenHandler> ALCHEMY_TABLE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(UpdatedMod.MOD_ID,"alchemy_table_screen_handler"),
                    new ExtendedScreenHandlerType<>(AlchemyTableScreenHandler::new));
    public static void registerScreenHandlers() {
        UpdatedMod.LOGGER.info("Registering Screen Handlers for " + UpdatedMod.MOD_ID);
    }
}
