package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class FuelBlockRegistry {

    public static void register() {
        StorageDelight.LOGGER.info("Registering furniture fuels for " + StorageDelight.MOD_ID);

        FuelRegistryEvents.BUILD.register((registry, context) -> {

            // Oak
            registry.add(BlockRegistry.OAK_DRAWER, 300);
            registry.add(BlockRegistry.OAK_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.OAK_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_OAK_CABINET, 300);
            registry.add(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.OAK_SINGLE_DOOR_CABINET, 300);

            // Birch
            registry.add(BlockRegistry.BIRCH_DRAWER, 300);
            registry.add(BlockRegistry.BIRCH_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_BIRCH_CABINET, 300);
            registry.add(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET, 300);

            // Spruce
            registry.add(BlockRegistry.SPRUCE_DRAWER, 300);
            registry.add(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_SPRUCE_CABINET, 300);
            registry.add(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET, 300);

            // Jungle
            registry.add(BlockRegistry.JUNGLE_DRAWER, 300);
            registry.add(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_JUNGLE_CABINET, 300);
            registry.add(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET, 300);

            // Acacia
            registry.add(BlockRegistry.ACACIA_DRAWER, 300);
            registry.add(BlockRegistry.ACACIA_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_ACACIA_CABINET, 300);
            registry.add(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET, 300);

            // Dark Oak
            registry.add(BlockRegistry.DARK_OAK_DRAWER, 300);
            registry.add(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_DARK_OAK_CABINET, 300);
            registry.add(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET, 300);

            // Mangrove
            registry.add(BlockRegistry.MANGROVE_DRAWER, 300);
            registry.add(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_MANGROVE_CABINET, 300);
            registry.add(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET, 300);

            // Cherry
            registry.add(BlockRegistry.CHERRY_DRAWER, 300);
            registry.add(BlockRegistry.CHERRY_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_CHERRY_CABINET, 300);
            registry.add(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET, 300);

            // Bamboo
            registry.add(BlockRegistry.BAMBOO_DRAWER, 300);
            registry.add(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR, 300);
            registry.add(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS, 300);
            registry.add(BlockRegistry.GLASS_BAMBOO_CABINET, 300);
            registry.add(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS, 300);
            registry.add(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET, 300);
        });
    }
}