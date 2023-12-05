package net.dernevs.updated.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class WitherHeartEnchantment extends Enchantment {
    protected WitherHeartEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (!user.getWorld().isClient && user.getHealth() <= 0.5f) {
            ServerWorld world = ((ServerWorld) user.getWorld());
            BlockPos position = user.getBlockPos();
            EntityType.WITHER.spawn(world, position, SpawnReason.BREEDING);
        }
        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }
}
