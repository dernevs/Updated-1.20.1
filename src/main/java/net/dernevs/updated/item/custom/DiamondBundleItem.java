package net.dernevs.updated.item.custom;

import net.dernevs.updated.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class DiamondBundleItem extends Item {
    public DiamondBundleItem(Settings settings) {
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
                    user.dropItem(ModItems.NETHERITE_BUNDLE);
                } else if (y <= 90) { //10%
                    user.dropItem(ModItems.DIAMOND_BUNDLE);
                }
                user.dropItem(Items.DIAMOND_BLOCK);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 2) {
                if (y > 50){ //50%
                    user.dropItem(Items.DIAMOND_BLOCK);
                } else if (y < 50) { //50%
                    user.dropItem(ModItems.DIAMOND_PLATES);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 3) {
                if (y >= 60){ //40%
                    user.dropItem(Items.DIAMOND_CHESTPLATE);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                } else if (y <= 50) { //50%
                    user.dropItem(ModItems.DIAMOND_PLATES);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 4) {
                if (y >= 60){ //40%
                    user.dropItem(Items.DIAMOND_PICKAXE);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.DIAMOND_LEGGINGS);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 5) {
                if (y >= 60){ //40%
                    user.dropItem(Items.DIAMOND_AXE);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.DIAMOND_BOOTS);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 6) {
                if (y >= 60){ //40%
                    user.dropItem(Items.DIAMOND_SWORD);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                } else if (y <= 40) { //40%
                    user.dropItem(Items.DIAMOND_HELMET);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 7) {
                if (y >= 60){ //40%
                    user.dropItem(ModItems.DIAMOND_PLATES);
                    user.dropItem(Items.DIAMOND);
                    user.dropItem(Items.DIAMOND);
                } else if (y <= 30) { //30%
                    user.dropItem(Items.DIAMOND_SHOVEL);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(ModItems.DIAMOND_PLATES);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 8) {
                if (y <= 40){ //40%
                    user.dropItem(ModItems.DIAMOND_PLATES);
                } else if (y >= 70) { //30%
                    user.dropItem(Items.DIAMOND_HOE);
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(Items.DIAMOND);
                user.dropItem(Items.DIAMOND);
            }

            if (x == 9) {
                if (y <= 50) { //50%
                    user.dropItem(Items.DIAMOND);
                }
                user.dropItem(Items.DIAMOND);
            }
            stack.decrement(1);


        }
        return super.use(world, user, hand);
    }
}
