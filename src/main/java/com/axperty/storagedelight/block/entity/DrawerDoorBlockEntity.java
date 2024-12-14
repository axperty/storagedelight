package com.axperty.storagedelight.block.entity;

import com.axperty.storagedelight.block.DrawerDoorBlock;
import com.axperty.storagedelight.registry.BlockEntityTypesRegistry;
import net.minecraft.core.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DrawerDoorBlockEntity extends RandomizableContainerBlockEntity
{
    private NonNullList<ItemStack> items;
    private final ContainerOpenersCounter openersCounter;

    public DrawerDoorBlockEntity(BlockPos p_155052_, BlockState p_155053_) {
        super(BlockEntityTypesRegistry.DRAWER_DOOR.get(), p_155052_, p_155053_);
        this.items = NonNullList.withSize(27, ItemStack.EMPTY);
        this.openersCounter = new ContainerOpenersCounter() {
            protected void onOpen(Level p_155062_, BlockPos p_155063_, BlockState p_155064_) {
                DrawerDoorBlockEntity.this.playSound(p_155064_, SoundEvents.WOODEN_TRAPDOOR_OPEN);
                DrawerDoorBlockEntity.this.updateBlockState(p_155064_, true);
            }

            protected void onClose(Level p_155072_, BlockPos p_155073_, BlockState p_155074_) {
                DrawerDoorBlockEntity.this.playSound(p_155074_, SoundEvents.WOODEN_TRAPDOOR_CLOSE  );
                DrawerDoorBlockEntity.this.updateBlockState(p_155074_, false);
            }

            protected void openerCountChanged(Level p_155066_, BlockPos p_155067_, BlockState p_155068_, int p_155069_, int p_155070_) {
            }

            protected boolean isOwnContainer(Player p_155060_) {
                if (p_155060_.containerMenu instanceof ChestMenu) {
                    Container $$1 = ((ChestMenu)p_155060_.containerMenu).getContainer();
                    return $$1 == DrawerDoorBlockEntity.this;
                } else {
                    return false;
                }
            }
        };
    }

    protected void saveAdditional(CompoundTag p_187459_, HolderLookup.Provider p_330809_) {
        super.saveAdditional(p_187459_, p_330809_);
        if (!this.trySaveLootTable(p_187459_)) {
            ContainerHelper.saveAllItems(p_187459_, this.items, p_330809_);
        }

    }

    protected void loadAdditional(CompoundTag p_332191_, HolderLookup.Provider p_334663_) {
        super.loadAdditional(p_332191_, p_334663_);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(p_332191_)) {
            ContainerHelper.loadAllItems(p_332191_, this.items, p_334663_);
        }

    }

    public int getContainerSize() {
        return 27;
    }

    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    protected void setItems(NonNullList<ItemStack> p_58610_) {
        this.items = p_58610_;
    }

    protected Component getDefaultName() {
        return Component.translatable("container.storagedelight.drawer_door");
    }

    protected AbstractContainerMenu createMenu(int p_58598_, Inventory p_58599_) {
        return ChestMenu.threeRows(p_58598_, p_58599_, this);
    }

    public void startOpen(Player p_58616_) {
        if (!this.remove && !p_58616_.isSpectator()) {
            this.openersCounter.incrementOpeners(p_58616_, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public void stopOpen(Player p_58614_) {
        if (!this.remove && !p_58614_.isSpectator()) {
            this.openersCounter.decrementOpeners(p_58614_, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public void recheckOpen() {
        if (!this.remove) {
            this.openersCounter.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    void updateBlockState(BlockState p_58607_, boolean p_58608_) {
        this.level.setBlock(this.getBlockPos(), (BlockState)p_58607_.setValue(DrawerDoorBlock.OPEN, p_58608_), 3);
    }

    void playSound(BlockState p_58601_, SoundEvent p_58602_) {
        Vec3i $$2 = ((Direction)p_58601_.getValue(DrawerDoorBlock.FACING)).getNormal();
        double $$3 = (double)this.worldPosition.getX() + 0.5 + (double)$$2.getX() / 2.0;
        double $$4 = (double)this.worldPosition.getY() + 0.5 + (double)$$2.getY() / 2.0;
        double $$5 = (double)this.worldPosition.getZ() + 0.5 + (double)$$2.getZ() / 2.0;
        this.level.playSound((Player)null, $$3, $$4, $$5, p_58602_, SoundSource.BLOCKS, 0.5F, this.level.random.nextFloat() * 0.1F + 0.9F);
    }
}