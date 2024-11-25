package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup STORAGEDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(StorageDelight.MOD_ID + ":" + "storagedelight_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.storagedelight"))
                    .icon(() -> new ItemStack(BlockRegistry.OAK_DRAWER))
                    .entries((displayContext, entries) -> {
                        entries.add(BlockRegistry.OAK_DRAWER);
                        entries.add(BlockRegistry.BIRCH_DRAWER);
                    })
                    .build());

    public static void registerCreativeTab() {
        StorageDelight.LOGGER.info("Registering creative mode tab for " + StorageDelight.MOD_ID);
    }
}
