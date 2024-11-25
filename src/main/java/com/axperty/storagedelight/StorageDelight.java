package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.BlockEntityTypesRegistry;
import com.axperty.storagedelight.registry.BlockRegistry;
import com.axperty.storagedelight.registry.CreativeTabRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageDelight implements ModInitializer {

    public static final String MOD_ID = "storagedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        BlockRegistry.initialize();
        BlockEntityTypesRegistry.initialize();
        CreativeTabRegistry.registerCreativeTab();
    }
}