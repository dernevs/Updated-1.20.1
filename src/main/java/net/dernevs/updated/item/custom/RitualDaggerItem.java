package net.dernevs.updated.item.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.UUID;

public class RitualDaggerItem extends SwordItem {
    public RitualDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.EPIC;
    }

    @Override
    public void onItemEntityDestroyed(ItemEntity entity) {
        BlockPos blockpos = entity.getBlockPos();
        ServerWorld world = ((ServerWorld) entity.getWorld());
        if (!entity.getWorld().isClient) {
            EntityType.WARDEN.spawn(world,blockpos, SpawnReason.REINFORCEMENT);
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        UUID Uuid = UUID.fromString("1c7f3da7-da31-4afd-9020-f29ac7b8d095");
        if (!(entity.getUuid() == Uuid)) {
            entity.sendMessage(Text.literal("wrong user"));
        }else if (entity.getUuid() == Uuid) {
            entity.sendMessage(Text.literal("right user"));
        }
    }
}
