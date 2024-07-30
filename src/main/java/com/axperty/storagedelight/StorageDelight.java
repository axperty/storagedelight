package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.ModBlockEntityTypes;
import com.mojang.logging.LogUtils;
import com.axperty.storagedelight.registry.ModBlocks;
import com.axperty.storagedelight.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.annotation.Nonnull;

@Mod(StorageDelight.MOD_ID)
public class StorageDelight {
    public static final String MOD_ID = "storagedelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(StorageDelight.MOD_ID)
    {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OAK_DRAWER.get());
        }
    };

    public StorageDelight() {
        System.out.println("[Storage Delight Forge]: Registering items and blocks...");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlockEntityTypes.TILES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("[Storage Delight Forge]: Items and blocks registered successfully!");
    }
}
