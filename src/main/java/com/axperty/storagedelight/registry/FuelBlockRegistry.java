package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class FuelBlockRegistry {

    public static void register() {
        StorageDelight.LOGGER.info("Registering furniture fuels for " + StorageDelight.MOD_ID);

        // Oak
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_OAK_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(), 300);

        // Birch
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_BIRCH_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get(), 300);

        // Spruce
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_SPRUCE_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(), 300);

        // Jungle
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_JUNGLE_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(), 300);

        // Acacia
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_ACACIA_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get(), 300);

        // Dark Oak
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_DARK_OAK_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(), 300);

        // Mangrove
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_DRAWER.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_MANGROVE_CABINET.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(), 300);
    }
}