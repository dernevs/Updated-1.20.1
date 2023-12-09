package net.dernevs.updated.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HellstoneAndNetheriteItem extends Item {
    public HellstoneAndNetheriteItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        BlockPos blockPos = player.getBlockPos();

        // east

        if (!world.isClient && world.getBlockState(blockPos.east(1)).isReplaceable()) {
            world.setBlockState(blockPos.east(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.east(2)).isReplaceable()) {
            world.setBlockState(blockPos.east(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.east(3)).isReplaceable()) {
            world.setBlockState(blockPos.east(3), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.east(2).north(2)).isReplaceable()) {
            world.setBlockState(blockPos.east(2).north(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.east(2).south(2)).isReplaceable()) {
            world.setBlockState(blockPos.east(2).south(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.east(3).north(1)).isReplaceable()) {
            world.setBlockState(blockPos.east(3).north(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.east(3).south(1)).isReplaceable()) {
            world.setBlockState(blockPos.east(3).south(1), Blocks.FIRE.getDefaultState(), 3);
        }

        //west

        if (!world.isClient && world.getBlockState(blockPos.west(1)).isReplaceable()) {
            world.setBlockState(blockPos.west(1), Blocks.FIRE.getDefaultState(),3);
        }
        if (!world.isClient && world.getBlockState(blockPos.west(2)).isReplaceable()) {
            world.setBlockState(blockPos.west(2), Blocks.FIRE.getDefaultState(),3);
        }
        if (!world.isClient && world.getBlockState(blockPos.west(3)).isReplaceable()) {
            world.setBlockState(blockPos.west(3), Blocks.FIRE.getDefaultState(),3);
        }
        if (!world.isClient && world.getBlockState(blockPos.west(2).north(2)).isReplaceable()) {
            world.setBlockState(blockPos.west(2).north(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.west(2).south(2)).isReplaceable()) {
            world.setBlockState(blockPos.west(2).south(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.west(3).north(1)).isReplaceable()) {
            world.setBlockState(blockPos.west(3).north(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.west(3).south(1)).isReplaceable()) {
            world.setBlockState(blockPos.west(3).south(1), Blocks.FIRE.getDefaultState(), 3);
        }

        //north

        if (!world.isClient && world.getBlockState(blockPos.north(1)).isReplaceable()) {
            world.setBlockState(blockPos.north(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.north(2)).isReplaceable()) {
            world.setBlockState(blockPos.north(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.north(3)).isReplaceable()) {
            world.setBlockState(blockPos.north(3), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.north(3).west(1)).isReplaceable()) {
            world.setBlockState(blockPos.north(3).west(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.north(3).east(1)).isReplaceable()) {
            world.setBlockState(blockPos.north(3).east(1), Blocks.FIRE.getDefaultState(), 3);
        }

        //south

        if (!world.isClient && world.getBlockState(blockPos.south(1)).isReplaceable()) {
            world.setBlockState(blockPos.south(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.south(2)).isReplaceable()) {
            world.setBlockState(blockPos.south(2), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.south(3)).isReplaceable()) {
            world.setBlockState(blockPos.south(3), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.south(3).west(1)).isReplaceable()) {
            world.setBlockState(blockPos.south(3).west(1), Blocks.FIRE.getDefaultState(), 3);
        }
        if (!world.isClient && world.getBlockState(blockPos.south(3).east(1)).isReplaceable()) {
            world.setBlockState(blockPos.south(3).east(1), Blocks.FIRE.getDefaultState(), 3);
        }
        return super.use(world, player, hand);
    }
}
