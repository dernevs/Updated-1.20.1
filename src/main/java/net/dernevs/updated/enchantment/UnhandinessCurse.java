package net.dernevs.updated.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageEffects;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

import java.util.Random;

public class UnhandinessCurse extends Enchantment {
    protected UnhandinessCurse(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }
/*
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        Random random = new Random();
        int x = random.nextInt(10+1);
        if (!user.getWorld().isClient && x <= 5) {
            user.damage(new DamageSource(),4f);
        }
        super.onTargetDamaged(user, target, level);
    }

 */

    @Override
    public boolean isCursed() {
        return true;
    }
}
