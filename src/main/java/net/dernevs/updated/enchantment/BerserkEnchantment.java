package net.dernevs.updated.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import javax.print.DocFlavor;

public class BerserkEnchantment extends Enchantment {
    protected BerserkEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient){
            if (level == 1 && user.getHealth() <= 2f) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100,0), user);
            }
            if (level == 2 && user.getHealth() <= 2f) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200,0), user);
            }
            if (level == 3 && user.getHealth() <= 3f) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100,1), user);
            }
            if (level == 4 && user.getHealth() <= 3f) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100,1), user);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100,0), user);
            }
            if (level == 5 && user.getHealth() <= 5f) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100,1), user);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100,0), user);
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}
