package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageDelight implements ModInitializer {
	public static final String MOD_ID = "storagedelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.registerAll();
		ItemRegistry.registerAll();
		FuelBlockRegistry.register();
		BlockEntityTypesRegistry.registerAll();
		CreativeTabRegistry.register();
	}
}
