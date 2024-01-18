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

public class IronBundleItem extends Item {
    public IronBundleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        Random random = new Random();
        Random random2 = new Random();
        int x = random.nextInt(10)+1;
        int y = random2.nextInt(100)+1;
        if (!world.isClient && user.isSneaking()) {
            if (x == 1) {
                if (y == 1){ //1%
                    user.dropItem(ModItems.GOLD_BUNDLE);
                } else if (y <= 90) { //10%
                    user.dropItem(ModItems.IRON_BUNDLE);
                }
                user.dropItem(Items.IRON_BLOCK);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 2) {
                if (y > 50){ //50%
                    user.dropItem(Items.IRON_BLOCK);
                } else if (y < 50) { //50%
                    user.dropItem(ModItems.IRON_PLATES);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 3) {
                if (y >= 60){ //40%
                    user.dropItem(Items.IRON_CHESTPLATE);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                } else if (y <= 50) { //50%
                    user.dropItem(ModItems.IRON_PLATES);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 4) {
                if (y >= 60){ //40%
                    user.dropItem(Items.IRON_PICKAXE);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.IRON_LEGGINGS);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 5) {
                if (y >= 60){ //40%
                    user.dropItem(Items.IRON_AXE);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.IRON_BOOTS);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 6) {
                if (y >= 60){ //40%
                    user.dropItem(Items.IRON_SWORD);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.IRON_HELMET);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 7) {
                if (y >= 60){ //40%
                    user.dropItem(ModItems.IRON_PLATES);
                    user.dropItem(Items.IRON_INGOT);
                    user.dropItem(Items.IRON_INGOT);
                } else if (y <= 30) { //30%
                    user.dropItem(Items.IRON_SHOVEL);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(ModItems.IRON_PLATES);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 8) {
                if (y <= 40){ //40%
                    user.dropItem(ModItems.IRON_PLATES);
                } else if (y >= 70) { //30%
                    user.dropItem(Items.IRON_HOE);
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(Items.IRON_INGOT);
                user.dropItem(Items.IRON_INGOT);
            }

            if (x == 9) {
                if (y <= 50) { //50%
                    user.dropItem(Items.IRON_INGOT);
                }
                user.dropItem(Items.IRON_INGOT);
            }
            stack.decrement(1);


        }
        return super.use(world, user, hand);
    }
}
