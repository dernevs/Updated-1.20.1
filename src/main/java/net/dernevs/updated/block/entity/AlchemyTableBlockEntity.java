package net.dernevs.updated.block.entity;

import net.dernevs.updated.recipe.AlchemyTableRecipe;
import net.dernevs.updated.screen.AlchemyTableScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class AlchemyTableBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(25,ItemStack.EMPTY);

    private static final int INPUT_SLOT = 0;
    private static final int INPUT_SLOT1 = 1;
    private static final int INPUT_SLOT2 = 2;
    private static final int INPUT_SLOT3 = 3;
    private static final int INPUT_SLOT4 = 4;
    private static final int INPUT_SLOT5 = 5;
    private static final int INPUT_SLOT6 = 6;
    private static final int INPUT_SLOT7 = 7;
    private static final int INPUT_SLOT8 = 8;
    private static final int OUTPUT_SLOT = 9;
    private static final int FUEL_SLOT = 10;
    private static final int INGREDIENT_SLOT = 11;
    private static final int VIAL_SLOT = 12;
    private static final int VIAL_SLOT2 = 13;
    private static final int VIAL_SLOT3 = 14;
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public AlchemyTableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ALCHEMY_TABLE_BE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> AlchemyTableBlockEntity.this.progress;
                    case 1 -> AlchemyTableBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0: AlchemyTableBlockEntity.this.progress = value;
                    case 1: AlchemyTableBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.updated.alchemy_table");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new AlchemyTableScreenHandler(syncId, playerInventory, this,propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("alchemy_table.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("alchemy_table.progress");
        super.readNbt(nbt);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(canInsertIntoOutputSlot() && hasRecipe()) {
            increaseCraftingProgress();
            markDirty(world, pos, state);

            if(hasCraftingFinished()) {
                craftItem();
                resetProgress();
            }
        }else {
            resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem() {
        Optional<AlchemyTableRecipe> recipe = getCurrentRecipe();

        this.removeStack(INPUT_SLOT, 1);
        this.removeStack(INPUT_SLOT1, 1);
        this.removeStack(INPUT_SLOT2, 1);
        this.removeStack(INPUT_SLOT3, 1);
        this.removeStack(INPUT_SLOT4, 1);
        this.removeStack(INPUT_SLOT5, 1);
        this.removeStack(INPUT_SLOT6, 1);
        this.removeStack(INPUT_SLOT7, 1);
        this.removeStack(INPUT_SLOT8, 1);
        this.setStack(OUTPUT_SLOT, new ItemStack(recipe.get().getOutput(null).getItem(),
                this.getStack(OUTPUT_SLOT).getCount() + recipe.get().getOutput(null).getCount()));
    }

    private boolean hasCraftingFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProgress() {
        this.progress++;
    }

    private boolean hasRecipe() {
        Optional<AlchemyTableRecipe> recipe = getCurrentRecipe();

        if (recipe.isEmpty()) {
            return false;
        }
        ItemStack output = recipe.get().getOutput(null);

        return canInsertAmountIntoOutputSlot(output.getCount())
                && canInsertItemIntoOutputSlot(output);
    }

    private boolean canInsertItemIntoOutputSlot(ItemStack output) {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getItem() == output.getItem();
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.getStack(OUTPUT_SLOT).getMaxCount() >= this.getStack(OUTPUT_SLOT).getCount() + count;
    }

    private Optional<AlchemyTableRecipe> getCurrentRecipe() {
        SimpleInventory inventory = new SimpleInventory((this.size()));
        for (int i = 0; i < this.size(); i++) {
            inventory.setStack(i, this.getStack(i));
        }
        return this.getWorld().getRecipeManager().getFirstMatch(AlchemyTableRecipe.Type.INSTANCE, inventory, this.getWorld());
    }

    private boolean canInsertIntoOutputSlot() {
        return this.getStack(OUTPUT_SLOT).isEmpty() ||
                this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }
}
