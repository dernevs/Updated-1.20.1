package net.dernevs.updated.entity.variant;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.entity.custom.BottledLightningProjectileEntity;
import net.dernevs.updated.entity.custom.ModDragonFireballProjectileEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BottledLightningProjectileEntity> BOTTLED_LIGHTNING_PROJECTILE_ENTITY = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(UpdatedMod.MOD_ID, "bottled_lightning_projectile"),
            FabricEntityTypeBuilder.<BottledLightningProjectileEntity>create(SpawnGroup.CREATURE, BottledLightningProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f,0.25f)).build());
    public static final EntityType<ModDragonFireballProjectileEntity> MOD_DRAGON_FIREBALL_PROJECTILE_ENTITY = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(UpdatedMod.MOD_ID, "mod_dragon_fireball_projectile"),
            FabricEntityTypeBuilder.<ModDragonFireballProjectileEntity>create(SpawnGroup.CREATURE, ModDragonFireballProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f,0.25f)).build());
    public static void registerModEntities() {
        UpdatedMod.LOGGER.info("Registering Mod Entities for " + UpdatedMod.MOD_ID);
    }
}
