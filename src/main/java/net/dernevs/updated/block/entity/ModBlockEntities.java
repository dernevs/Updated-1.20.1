package net.dernevs.updated.block.entity;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<AlchemyTableBlockEntity> ALCHEMY_TABLE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(UpdatedMod.MOD_ID, "alchemy_table_block_entity"),
                    FabricBlockEntityTypeBuilder.create(AlchemyTableBlockEntity::new,
                            ModBlocks.ALCHEMY_TABLE).build(null));

    public static void registerBlockEntities(){
        UpdatedMod.LOGGER.info("registering Block Entities for " + UpdatedMod.MOD_ID);
    }
}
