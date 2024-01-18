package net.dernevs.updated.block.custom;

import net.dernevs.updated.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChallengeBlock extends Block {
    public ChallengeBlock(Settings settings) {
        super(settings);
    }
/*
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient()){
            int X = pos.getX();
            int Z = pos.getZ();
            if (entity.isSneaking()){
                entity.teleport(X, 200, Z);
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                world.setBlockState(pos.up(200), ModBlocks.CHALLENGE_BLOCK.getDefaultState());
                //idk how to get the player pos
            }else if (pos.getY() >= 200){
                EntityType.LIGHTNING_BOLT.spawn(((ServerWorld) world), pos, SpawnReason.MOB_SUMMONED);
            }
            else {
                world.setBlockState(pos.east(0), Blocks.AIR.getDefaultState());
                entity.teleport(X, 200, Z);
            }
        super.onEntityCollision(state, world, pos, entity);
        }
    }

 */
}

