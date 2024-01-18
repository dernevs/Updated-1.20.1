package net.dernevs.updated.entity.layer;

import net.dernevs.updated.UpdatedMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MOD_DRAGON_FIREBALL_PROJECTILE =
            new EntityModelLayer(new Identifier(UpdatedMod.MOD_ID, "mod_dragon_fireball_projectile"), "main");
}
