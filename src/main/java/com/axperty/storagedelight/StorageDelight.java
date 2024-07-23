package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.*;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StorageDelight.MOD_ID)
public class StorageDelight {
    public static final String MOD_ID = "storagedelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StorageDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        System.out.println("[Storage Delight Forge]: Registering items, blocks, and entities...");
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlockEntityTypes.TILES.register(modEventBus);
        ModCreativeTabs.CREATIVE_TABS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("[Storage Delight Forge]: Items, blocks, and entities registered registered successfully!");
    }
}
