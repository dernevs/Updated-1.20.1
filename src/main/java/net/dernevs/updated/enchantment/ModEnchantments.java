package net.dernevs.updated.enchantment;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.item.ModItems;
import net.dernevs.updated.item.custom.RitualDaggerItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final Enchantment ThunderStrike = register("thunder_strike",
            new ThunderStrikeEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment LifeSteal = register("life_steal",
            new LifeStealEnchantment(Enchantment.Rarity.RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment WitherHeart = register("wither_heart",
            new WitherHeartEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.ARMOR_CHEST, EquipmentSlot.CHEST));
    public static final Enchantment BerserkEnchantment = register("berserk",
            new BerserkEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.DIGGER, EquipmentSlot.MAINHAND));
    public static final Enchantment TheProphecyEnchantment = register("the_prophecy",
            new TheProphecyEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment EnvyEnchantment = register("envy",
            new EnvyEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment GluttonyEnchantment = register("gluttony",
            new GluttonyEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment GreedEnchantment = register("greed",
            new GreedEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment LustEnchantment = register("lust",
            new LustEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment PrideEnchantment = register("pride",
            new PrideEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment SlothEnchantment = register("sloth",
            new SlothEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final Enchantment WrathEnchantment = register("wrath",
            new WrathEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(UpdatedMod.MOD_ID, name), enchantment);
    }
    public static void registerModEnchanments() {
        UpdatedMod.LOGGER.info("Registering ModEnchantments for " + UpdatedMod.MOD_ID);
    }
}
