package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(StorageDelight.MOD_ID, "title"),
            () -> new ItemStack(ItemRegistry.OAK_DRAWER.get()));

    public static void register() {
        StorageDelight.LOGGER.info("Registering creative mode tab for " + StorageDelight.MOD_ID);
    }
}
