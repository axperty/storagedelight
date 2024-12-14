package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.BlockEntityTypesRegistry;
import com.axperty.storagedelight.registry.BlockRegistry;
import com.axperty.storagedelight.registry.FuelBlockRegistry;
import com.axperty.storagedelight.registry.ItemRegistry;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageDelight implements ModInitializer {

    public static final String MOD_ID = "storagedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "title"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.storagedelight"))
                .icon(() -> new ItemStack(ItemRegistry.OAK_DRAWER.get()))
                .build());
        BlockRegistry.registerAll();
        ItemRegistry.registerAll();
        FuelBlockRegistry.register();
        BlockEntityTypesRegistry.registerAll();
    }
}