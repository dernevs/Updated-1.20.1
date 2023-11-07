package net.dernevs.updated.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.sun.net.httpserver.Authenticator;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class HeartGemItem extends Item {
    public HeartGemItem(Settings settings) {
        super(settings);
    }


        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            ItemStack itemStack = user.getStackInHand(hand);
            if (user.getMaxHealth() <= 38) {

                Multimap<EntityAttribute, EntityAttributeModifier> attributes;
                ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
                builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Element modifier", 2,
                        EntityAttributeModifier.Operation.ADDITION));
                attributes = builder.build();
                user.getAttributes().addTemporaryModifiers(attributes);
                user.heal(2);
                user.getStackInHand(hand).decrement(1);

                return TypedActionResult.success(itemStack, world.isClient());

            } else {
                user.sendMessage(Text.translatable("item.updated.heart_gem.max.use"));

            }
            return TypedActionResult.fail(itemStack);
        }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.updated.heart_gem.information"));
        } else {
            tooltip.add(Text.translatable("tooltip.updated.hold_shift"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}



