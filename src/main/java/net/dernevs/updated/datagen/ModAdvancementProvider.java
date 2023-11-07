package net.dernevs.updated.datagen;

import net.dernevs.updated.UpdatedMod;
import net.dernevs.updated.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement ModRootOV = Advancement.Builder.create()
                .display(new ItemStack(Blocks.COMMAND_BLOCK),
                        Text.translatable("ModAdvancement.Text.Root.title"), Text.translatable("ModAdvancement.Text.Root.description"),
                        new Identifier(UpdatedMod.MOD_ID, "texture/block/rose_gold_block.png"), AdvancementFrame.TASK,
                        false, false, true)
                .criterion("has_item", InventoryChangedCriterion.Conditions.items(Blocks.DIRT))
                .build(consumer, UpdatedMod.MOD_ID + ":modrootov");

        Advancement Why = Advancement.Builder.create()
                .display(new ItemStack(ModItems.ROSE_GOLD_CREWMATE),
                        Text.translatable("ModAdvancement.Text.why.title"), Text.translatable("ModAdvancement.Text.why.description"),
                        new Identifier(UpdatedMod.MOD_ID, "texture/block/rose_gold_block.png"), AdvancementFrame.TASK,
                        true, true, true)
                .criterion("has_rose_gold_crewmate", InventoryChangedCriterion.Conditions.items(ModItems.ROSE_GOLD_CREWMATE))
                .parent(ModRootOV)
                .build(consumer, UpdatedMod.MOD_ID + ":why");
    }

}
