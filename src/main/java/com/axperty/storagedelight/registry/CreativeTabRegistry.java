package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeTabRegistry {
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(StorageDelight.MOD_ID)
    {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.OAK_DRAWER.get());
        }
    };
    public static void register() {
        StorageDelight.LOGGER.info("Registering creative mode tab for " + StorageDelight.MOD_ID);
    }
}
