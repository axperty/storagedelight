package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.BlockEntityTypesRegistry;
import com.axperty.storagedelight.registry.BlocksRegistry;
import com.axperty.storagedelight.registry.ItemsRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageDelight implements ModInitializer {
	public static final String MOD_ID = "storagedelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "title"),
			() -> new ItemStack(ItemsRegistry.OAK_DRAWER.get()));

	@Override
	public void onInitialize() {
		System.out.println("[Storage Delight Fabric]: Registering items and blocks...");
		BlocksRegistry.registerAll();
		ItemsRegistry.registerAll();
		BlockEntityTypesRegistry.registerAll();
		System.out.println("[Storage Delight Fabric]: Items and blocks registered successfully!");
	}
}
