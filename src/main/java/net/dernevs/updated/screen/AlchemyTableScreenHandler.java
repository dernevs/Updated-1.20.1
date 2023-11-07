package net.dernevs.updated.screen;

import net.dernevs.updated.block.entity.AlchemyTableBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.*;
import net.minecraft.screen.slot.Slot;

public class AlchemyTableScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final AlchemyTableBlockEntity blockEntity;

    public AlchemyTableScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(buf.readBlockPos()),
                new ArrayPropertyDelegate(2));
    }

    public AlchemyTableScreenHandler(int syncId, PlayerInventory playerInventory,
                                     BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.ALCHEMY_TABLE_SCREEN_HANDLER, syncId);
        checkSize(((Inventory) blockEntity), 15);
        this.inventory = (Inventory)blockEntity;
        this.propertyDelegate = arrayPropertyDelegate;
        this.blockEntity = ((AlchemyTableBlockEntity) blockEntity);

        //Crafting Grid
        this.addSlot(new Slot(inventory,0,8,18));
        this.addSlot(new Slot(inventory,1,8+18,18));
        this.addSlot(new Slot(inventory,2,8+18+18,18));
        this.addSlot(new Slot(inventory,3,8,18+18));
        this.addSlot(new Slot(inventory,4,8+18,18+18));
        this.addSlot(new Slot(inventory,5,8+18+18,18+18));
        this.addSlot(new Slot(inventory,6,8,18+18+18));
        this.addSlot(new Slot(inventory,7,8+18,18+18+18));
        this.addSlot(new Slot(inventory,8,8+18+18,18+18+18));

        //Crafting Table Output
        this.addSlot(new Slot(inventory,9,72,50));

        //Brewing Fuel Input
        this.addSlot(new Slot(inventory,10,90,6));

        //Brewing Ingredient Input
        this.addSlot(new Slot(inventory,11,130,13));

        //Brewing Vials Inputs
        this.addSlot(new Slot(inventory,12,107,47));
        this.addSlot(new Slot(inventory,13,130,54));
        this.addSlot(new Slot(inventory,14,153,47));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(arrayPropertyDelegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);  // Max Progress
        int progressArrowSize = 26; // This is the width in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
