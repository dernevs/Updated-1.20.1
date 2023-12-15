package net.dernevs.updated.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import java.util.Random;

public class LifeStealEnchantment extends Enchantment {
    protected LifeStealEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight,target,slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        Random random = new Random();
        int x = random.nextInt(10+1);
        if (!user.getWorld().isClient && x>=7) {
         user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1,0), user);
         user.kill();
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
