package net.dernevs.updated.enchantment;

import net.dernevs.updated.item.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class TheProphecyEnchantment extends Enchantment {
    protected TheProphecyEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight,target,slotTypes);
    }
    boolean t = true;
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        World world = user.getWorld();
        if (user instanceof PlayerEntity player && t && !target.isAlive()) {
            player.giveItemStack(ModItems.ROSE_GOLDEN_APPLE.getDefaultStack());
            t = !t;
        }else {t = !t;}

        //if (!world.isClient && ((LivingEntity)target).isDead() && user instanceof PlayerEntity playerEntity){
        //    playerEntity.giveItemStack(ModItems.ROSE_GOLDEN_APPLE.getDefaultStack());
        //    if (target.isPlayer()){
        //        user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,20,0), user);
        //    }


        super.onTargetDamaged(user, target, level);
    }

    @Override
    public Text getName(int level) {
        MutableText mutableText = Text.translatable(this.getTranslationKey());
            mutableText.formatted(Formatting.GOLD);
        if (level != 1 || this.getMaxLevel() != 1) {
            mutableText.append(ScreenTexts.SPACE).append(Text.translatable("enchantment.level." + level));
        }
        return mutableText;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isCursed() {
        return true;
    }
}
