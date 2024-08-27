package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.BlockEntityTypesRegistry;
import com.axperty.storagedelight.registry.BlocksRegistry;
import com.axperty.storagedelight.registry.ItemsRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class StorageDelight implements ModInitializer {

    public static final String MOD_ID = "storagedelight";
    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "title"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.storagedelight"))
                .icon(() -> new ItemStack(ItemsRegistry.OAK_DRAWER.get()))
                .build());
        BlocksRegistry.registerAll();
        ItemsRegistry.registerAll();
        BlockEntityTypesRegistry.registerAll();
    }
}