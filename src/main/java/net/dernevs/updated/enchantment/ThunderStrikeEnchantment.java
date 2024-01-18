package net.dernevs.updated.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class ThunderStrikeEnchantment extends Enchantment {
    protected ThunderStrikeEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight,target,slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient){
            ServerWorld world = ((ServerWorld) user.getWorld());
            BlockPos position = target.getBlockPos();
            Random random = new Random();
            int x = random.nextInt(10+1);

            if (level == 1 && x==1){
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.BREEDING);
            }
            if (level == 2 && x<=2){
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.BREEDING);
            }
            if (level == 3 && x<=3){
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.BREEDING);
            }
            if (level == 4 && x<=4){
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.BREEDING);
            }
            if (level == 5 && x<=5){
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.BREEDING);
            }
        }

        super.onTargetDamaged(user, target, level);
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}
