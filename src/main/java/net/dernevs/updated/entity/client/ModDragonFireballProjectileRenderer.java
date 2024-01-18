package net.dernevs.updated.entity.client;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.entity.custom.ModDragonFireballProjectileEntity;
import net.dernevs.updated.entity.layer.ModModelLayers;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;

import net.minecraft.util.Identifier;

public class ModDragonFireballProjectileRenderer extends EntityRenderer<ModDragonFireballProjectileEntity> {
    public static final Identifier TEXTURE = new Identifier(UpdatedMod.MOD_ID, "textures/entity/dragon_fireball.png");
    protected ModDragonFireballProjectileModel model;

    public ModDragonFireballProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        model = new ModDragonFireballProjectileModel(ctx.getPart(ModModelLayers.MOD_DRAGON_FIREBALL_PROJECTILE));
    }
    @Override
    public Identifier getTexture(ModDragonFireballProjectileEntity entity) {
        return TEXTURE;
    }

}
