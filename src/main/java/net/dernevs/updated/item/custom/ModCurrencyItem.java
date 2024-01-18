package net.dernevs.updated.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModCurrencyItem extends Item {
    public ModCurrencyItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        NbtCompound nbt = new NbtCompound();
        ItemStack stack = user.getStackInHand(hand);
        if (!world.isClient && !stack.hasNbt()){
            nbt.putString("updated.user_name.for.currency", user.getEntityName());
            stack.setNbt(nbt);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.hasNbt()) {
            String nametooltip = "Signed by " + stack.getNbt().getString("updated.user_name.for.currency");
            tooltip.add(Text.of(nametooltip));
        }
    }
}
