package net.dernevs.updated.item.custom;

import net.dernevs.updated.block.ModBlocks;
import net.dernevs.updated.enchantment.ModEnchantments;
import net.dernevs.updated.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
            EntityType.WARDEN.spawn(world, blockpos, SpawnReason.REINFORCEMENT);
        }
    }


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient && entity.isAlive() && EnchantmentHelper.getLevel(ModEnchantments.GluttonyEnchantment, stack) >= 1) {
            if (entity.isUndead()) {
                user.getWorld().playSound(null, user.getX(), user.getY(), user.getZ(),
                        SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, SoundCategory.NEUTRAL, 1.5f, 1f);
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), user);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1, 7), user);
                stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                user.getItemCooldownManager().set(this, 10);
            }
            if (!entity.isUndead()) {
                user.getWorld().playSound(null, user.getX(), user.getY(), user.getZ(),
                        SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, SoundCategory.NEUTRAL, 1.5f, 1f);
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0), user);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1, 7), user);
                stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                user.getItemCooldownManager().set(this, 10);
                if (entity.isPlayer()){
                    user.getWorld().playSound(null, user.getX(), user.getY(), user.getZ(),
                            SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, SoundCategory.NEUTRAL, 1.5f, 1f);
                    entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0), user);
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1, 7), user);
                    stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                    user.getItemCooldownManager().set(this, 10);
                }
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.EnvyEnchantment, stack) >= 1){
                if (entity.getArmor() <=4){
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 2));
                    stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                }
                if (entity.getArmor() <=8){
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0));
                    stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                }
                if (entity.getArmor() <=12){
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0));
                    stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                }
                if (entity.getArmor() <=16){
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1));
                    stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                }
                if (entity.getArmor() <=20){
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 1));
                    stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                }
            }
        }
        return ActionResult.success(user.getWorld().isClient);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1, 0), player);

            if (EnchantmentHelper.getLevel(ModEnchantments.SlothEnchantment, stack) >= 1) {
                Hand hand = player.getActiveHand();
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1, 5), player);
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1, 3), player);
                stack.damage(10, player, p -> p.sendToolBreakStatus(hand));
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.PrideEnchantment, stack) >= 1){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1,0));
            }
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (!world.isClient) {
            if (EnchantmentHelper.getLevel(ModEnchantments.WrathEnchantment, stack) >= 1 && !user.isSneaking()) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                world.getClosestPlayer(user.getX(), user.getY(), user.getZ() - 5.0, 10.0, EntityPredicates.VALID_ENTITY).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                ;
                world.getClosestPlayer(user.getX(), user.getY(), user.getZ() + 5.0, 10.0, EntityPredicates.VALID_ENTITY).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                world.getClosestPlayer(user.getX() + 5.0, user.getY(), user.getZ(), 10.0, EntityPredicates.VALID_ENTITY).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                world.getClosestPlayer(user.getX() - 5.0, user.getY(), user.getZ(), 10.0, EntityPredicates.VALID_ENTITY).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                world.getClosestPlayer(user.getX(), user.getY() + 5.0, user.getZ(), 10.0, EntityPredicates.VALID_ENTITY).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                world.getClosestPlayer(user.getX(), user.getY() - 5.0, user.getZ(), 10.0, EntityPredicates.VALID_ENTITY).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2));
                stack.damage(1000, user, p -> p.sendToolBreakStatus(hand));
                world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_DRAGON_GROWL, SoundCategory.NEUTRAL, 1.5f, 1f);
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.LustEnchantment, stack) >= 1 && user.getInventory().contains(ModItems.HEART_GEM.getDefaultStack())) {
                EntityType.VILLAGER.spawn(((ServerWorld) world), user.getBlockPos(), SpawnReason.CONVERSION);
                stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_DEACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
            }
        }

            return super.use(world, user, hand);
        }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity user = context.getPlayer();
        assert user != null;
        Hand hand = user.getActiveHand();
        ItemStack stack = user.getStackInHand(hand);
        if (!world.isClient) {

            if (user.isSneaking()) {
                if (world.getBlockState(blockPos) == Blocks.DRAGON_EGG.getDefaultState()) {
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                    stack.addEnchantment(ModEnchantments.TheProphecyEnchantment, 1);
                    stack.damage(9999, user, p -> p.sendToolBreakStatus(hand));
                }
                if (EnchantmentHelper.getLevel(ModEnchantments.WrathEnchantment, stack) == 0 &&
                        EnchantmentHelper.getLevel(ModEnchantments.GreedEnchantment, stack) == 0 &&
                        EnchantmentHelper.getLevel(ModEnchantments.GluttonyEnchantment, stack) == 0 &&
                        EnchantmentHelper.getLevel(ModEnchantments.EnvyEnchantment, stack) == 0 &&
                        EnchantmentHelper.getLevel(ModEnchantments.SlothEnchantment, stack) == 0 &&
                        EnchantmentHelper.getLevel(ModEnchantments.PrideEnchantment, stack) == 0 &&
                        EnchantmentHelper.getLevel(ModEnchantments.LustEnchantment, stack) == 0) {

                    if (world.getBlockState(blockPos) == ModBlocks.WRATH_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.WrathEnchantment, 1);
                        stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == ModBlocks.GLUTTONY_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.GluttonyEnchantment, 1);
                        stack.damage(2500, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == ModBlocks.GREED_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.GreedEnchantment, 1);
                        stack.damage(2500, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == ModBlocks.ENVY_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.EnvyEnchantment, 1);
                        stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == ModBlocks.SLOTH_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.SlothEnchantment, 1);
                        stack.damage(1000, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == ModBlocks.PRIDE_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.PrideEnchantment, 1);
                        stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == ModBlocks.LUST_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        stack.addEnchantment(ModEnchantments.LustEnchantment, 1);
                        stack.damage(1000, user, p -> p.sendToolBreakStatus(hand));
                    }
                }
                if (EnchantmentHelper.getLevel(ModEnchantments.TheProphecyEnchantment, stack) >= 1) {
                    if (world.getBlockState(blockPos) == Blocks.NETHERITE_BLOCK.getDefaultState()) {
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 12000, 2));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9000, 1));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000, 2));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 2));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 24000, 4));
                        stack.damage(2500, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState()) {
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9000, 4));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 9000, 9));
                        stack.damage(5000, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == Blocks.DIAMOND_BLOCK.getDefaultState()) {
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 2));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4500, 1));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 2));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 2));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000, 4));
                        stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == Blocks.EMERALD_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 1));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 1));
                        stack.damage(250, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == Blocks.GOLD_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 1));
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000, 2));
                        stack.damage(250, user, p -> p.sendToolBreakStatus(hand));
                    }
                    if (world.getBlockState(blockPos) == Blocks.IRON_BLOCK.getDefaultState()) {
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.NEUTRAL, 1.5f, 1f);
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4500, 0));
                        stack.damage(250, user, p -> p.sendToolBreakStatus(hand));
                    }
                }
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.GreedEnchantment, stack) >= 1) {
                if (world.getBlockState(blockPos) == Blocks.DIAMOND_ORE.getDefaultState() ||
                        world.getBlockState(blockPos) == Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.ADO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.DDO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.GDO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.TDO.getDefaultState()) {
                    world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.NEUTRAL, 1.5f, 1f);
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                    user.giveItemStack(Items.DIAMOND_BLOCK.getDefaultStack());
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0));
                    stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                }
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.GreedEnchantment, stack) >= 1) {
                if (world.getBlockState(blockPos) == Blocks.EMERALD_ORE.getDefaultState() ||
                        world.getBlockState(blockPos) == Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.AEO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.DEO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.GEO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.TEO.getDefaultState()) {
                    world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.NEUTRAL, 1.5f, 1f);
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                    user.giveItemStack(Items.EMERALD_BLOCK.getDefaultStack());
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0));
                    stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                }
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.GreedEnchantment, stack) >= 1) {
                if (world.getBlockState(blockPos) == Blocks.GOLD_ORE.getDefaultState() ||
                        world.getBlockState(blockPos) == Blocks.DEEPSLATE_GOLD_ORE.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.AGO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.DGO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.GGO.getDefaultState() ||
                        world.getBlockState(blockPos) == ModBlocks.TGO.getDefaultState()) {
                    world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.NEUTRAL, 1.5f, 1f);
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                    user.giveItemStack(Items.GOLD_BLOCK.getDefaultStack());
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0));
                    stack.damage(500, user, p -> p.sendToolBreakStatus(hand));
                }
            }
            if (EnchantmentHelper.getLevel(ModEnchantments.GreedEnchantment, stack) >= 1) {
                if (world.getBlockState(blockPos) == Blocks.ANCIENT_DEBRIS.getDefaultState()) {
                    world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_ANCIENT_DEBRIS_BREAK, SoundCategory.NEUTRAL, 1.5f, 1f);
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
                    user.giveItemStack(Items.NETHERITE_INGOT.getDefaultStack());
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1));
                    stack.damage(1000, user, p -> p.sendToolBreakStatus(hand));
                }
            }
        }
        return super.useOnBlock(context);
    }
}
