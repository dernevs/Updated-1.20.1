package net.dernevs.updated.item.custom;

import net.dernevs.updated.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class NetheriteBundleItem extends Item {
    public NetheriteBundleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        Random random = new Random();
        Random random2 = new Random();
        int x = random.nextInt(10+1);
        int y = random2.nextInt(100+1);
        if (!world.isClient && user.isSneaking()) {
            if (x == 1) {
                if (y == 1){ //1%
                    user.dropItem(Items.DRAGON_EGG);
                } else if (y <= 90) { //10%
                    user.dropItem(ModItems.NETHERITE_BUNDLE);
                }
                user.dropItem(Items.NETHERITE_BLOCK);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 2) {
                if (y > 50){ //50%
                    user.dropItem(Items.NETHERITE_BLOCK);
                } else if (y < 50) { //50%
                    user.dropItem(Items.NETHERITE_INGOT);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 3) {
                if (y >= 60){ //40%
                    user.dropItem(Items.NETHERITE_CHESTPLATE);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                } else if (y <= 50) { //50%
                    user.dropItem(Items.NETHERITE_INGOT);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 4) {
                if (y >= 60){ //40%
                    user.dropItem(Items.NETHERITE_PICKAXE);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.NETHERITE_LEGGINGS);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 5) {
                if (y >= 60){ //40%
                    user.dropItem(Items.NETHERITE_AXE);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.NETHERITE_BOOTS);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 6) {
                if (y >= 60){ //40%
                    user.dropItem(Items.NETHERITE_SWORD);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.NETHERITE_HELMET);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 7) {
                if (y >= 60){ //40%
                    user.dropItem(Items.NETHERITE_INGOT);
                    user.dropItem(Items.NETHERITE_SCRAP);
                    user.dropItem(Items.NETHERITE_SCRAP);
                } else if (y <= 30) { //30%
                    user.dropItem(Items.NETHERITE_SHOVEL);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_INGOT);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 8) {
                if (y <= 40){ //40%
                    user.dropItem(Items.NETHERITE_INGOT);
                } else if (y >= 70) { //30%
                    user.dropItem(Items.NETHERITE_HOE);
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_SCRAP);
                user.dropItem(Items.NETHERITE_SCRAP);
            }

            if (x == 9) {
                if (y <= 50) { //50%
                    user.dropItem(Items.NETHERITE_SCRAP);
                }
                user.dropItem(Items.NETHERITE_SCRAP);
            }
            stack.decrement(1);
        }
        return super.use(world, user, hand);
    }
}
