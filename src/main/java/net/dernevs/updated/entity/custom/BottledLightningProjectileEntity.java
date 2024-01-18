package net.dernevs.updated.entity.custom;

import net.dernevs.updated.entity.variant.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BottledLightningProjectileEntity extends ThrownItemEntity {
    public BottledLightningProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public BottledLightningProjectileEntity(LivingEntity livingEntity, World world){
        super(ModEntities.BOTTLED_LIGHTNING_PROJECTILE_ENTITY, livingEntity, world);
    }

    @Override //very Important
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient ){
            this.getWorld().sendEntityStatus(this,(byte) 3);
            EntityType.LIGHTNING_BOLT.spawn((ServerWorld) this.getWorld(), this.getBlockPos(), SpawnReason.BREEDING);
        }

        this.discard();
        super.onBlockHit(blockHitResult);
    }
}
