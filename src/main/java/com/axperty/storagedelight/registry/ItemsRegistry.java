package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.item.ModBlockItem;
import com.axperty.storagedelight.item.ModItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.function.Supplier;

public enum ItemsRegistry {

    // Oak Furniture
    OAK_DRAWER("oak_drawer", () -> new ModBlockItem(BlocksRegistry.OAK_DRAWER.get(), ModItemSettings.base())),
    OAK_DRAWER_WITH_DOOR("oak_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.OAK_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_OAK_CABINET("glass_oak_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_OAK_CABINET.get(), ModItemSettings.base())),
    OAK_CABINET_WITH_GLASS_DOORS("oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    OAK_SINGLE_DOOR_CABINET("oak_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.OAK_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Birch Furniture
    BIRCH_DRAWER("birch_drawer", () -> new ModBlockItem(BlocksRegistry.BIRCH_DRAWER.get(), ModItemSettings.base())),
    BIRCH_DRAWER_WITH_DOOR("birch_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.BIRCH_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_BIRCH_CABINET("glass_birch_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_BIRCH_CABINET.get(), ModItemSettings.base())),
    BIRCH_CABINET_WITH_GLASS_DOORS("birch_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    BIRCH_SINGLE_DOOR_CABINET("birch_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.BIRCH_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Spruce Furniture
    SPRUCE_DRAWER("spruce_drawer", () -> new ModBlockItem(BlocksRegistry.SPRUCE_DRAWER.get(), ModItemSettings.base())),
    SPRUCE_DRAWER_WITH_DOOR("spruce_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.SPRUCE_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_SPRUCE_CABINET("glass_spruce_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_SPRUCE_CABINET.get(), ModItemSettings.base())),
    SPRUCE_CABINET_WITH_GLASS_DOORS("spruce_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    SPRUCE_SINGLE_DOOR_CABINET("spruce_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Jungle Furniture
    JUNGLE_DRAWER("jungle_drawer", () -> new ModBlockItem(BlocksRegistry.JUNGLE_DRAWER.get(), ModItemSettings.base())),
    JUNGLE_DRAWER_WITH_DOOR("jungle_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.JUNGLE_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_JUNGLE_CABINET("glass_jungle_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_JUNGLE_CABINET.get(), ModItemSettings.base())),
    JUNGLE_CABINET_WITH_GLASS_DOORS("jungle_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    JUNGLE_SINGLE_DOOR_CABINET("jungle_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Acacia Furniture
    ACACIA_DRAWER("acacia_drawer", () -> new ModBlockItem(BlocksRegistry.ACACIA_DRAWER.get(), ModItemSettings.base())),
    ACACIA_DRAWER_WITH_DOOR("acacia_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.ACACIA_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_ACACIA_CABINET("glass_acacia_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_ACACIA_CABINET.get(), ModItemSettings.base())),
    ACACIA_CABINET_WITH_GLASS_DOORS("acacia_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    ACACIA_SINGLE_DOOR_CABINET("acacia_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.ACACIA_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Dark Oak Furniture
    DARK_OAK_DRAWER("dark_oak_drawer", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_DRAWER.get(), ModItemSettings.base())),
    DARK_OAK_DRAWER_WITH_DOOR("dark_oak_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_DARK_OAK_CABINET("glass_dark_oak_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_DARK_OAK_CABINET.get(), ModItemSettings.base())),
    DARK_OAK_CABINET_WITH_GLASS_DOORS("dark_oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    DARK_OAK_SINGLE_DOOR_CABINET("dark_oak_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Mangrove Furniture
    MANGROVE_DRAWER("mangrove_drawer", () -> new ModBlockItem(BlocksRegistry.MANGROVE_DRAWER.get(), ModItemSettings.base())),
    MANGROVE_DRAWER_WITH_DOOR("mangrove_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.MANGROVE_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_MANGROVE_CABINET("glass_mangrove_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_MANGROVE_CABINET.get(), ModItemSettings.base())),
    MANGROVE_CABINET_WITH_GLASS_DOORS("mangrove_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    MANGROVE_SINGLE_DOOR_CABINET("mangrove_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Cherry Furniture
    CHERRY_DRAWER("cherry_drawer", () -> new ModBlockItem(BlocksRegistry.CHERRY_DRAWER.get(), ModItemSettings.base())),
    CHERRY_DRAWER_WITH_DOOR("cherry_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.CHERRY_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_CHERRY_CABINET("glass_cherry_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_CHERRY_CABINET.get(), ModItemSettings.base())),
    CHERRY_CABINET_WITH_GLASS_DOORS("cherry_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    CHERRY_SINGLE_DOOR_CABINET("cherry_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.CHERRY_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Bamboo Furniture
    BAMBOO_DRAWER("bamboo_drawer", () -> new ModBlockItem(BlocksRegistry.BAMBOO_DRAWER.get(), ModItemSettings.base())),
    BAMBOO_DRAWER_WITH_DOOR("bamboo_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.BAMBOO_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_BAMBOO_CABINET("glass_bamboo_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_BAMBOO_CABINET.get(), ModItemSettings.base())),
    BAMBOO_CABINET_WITH_GLASS_DOORS("bamboo_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    BAMBOO_SINGLE_DOOR_CABINET("bamboo_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.BAMBOO_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Crimson Furniture
    CRIMSON_DRAWER("crimson_drawer", () -> new ModBlockItem(BlocksRegistry.CRIMSON_DRAWER.get(), ModItemSettings.base())),
    CRIMSON_DRAWER_WITH_DOOR("crimson_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.CRIMSON_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_CRIMSON_CABINET("glass_crimson_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_CRIMSON_CABINET.get(), ModItemSettings.base())),
    CRIMSON_CABINET_WITH_GLASS_DOORS("crimson_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    CRIMSON_SINGLE_DOOR_CABINET("crimson_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.CRIMSON_SINGLE_DOOR_CABINET.get(), ModItemSettings.base())),

    // Warped Furniture
    WARPED_DRAWER("warped_drawer", () -> new ModBlockItem(BlocksRegistry.WARPED_DRAWER.get(), ModItemSettings.base())),
    WARPED_DRAWER_WITH_DOOR("warped_drawer_with_door", () -> new ModBlockItem(BlocksRegistry.WARPED_DRAWER_WITH_DOOR.get(), ModItemSettings.base())),
    GLASS_WARPED_CABINET("glass_warped_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_WARPED_CABINET.get(), ModItemSettings.base())),
    WARPED_CABINET_WITH_GLASS_DOORS("warped_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get(), ModItemSettings.base())),
    WARPED_SINGLE_DOOR_CABINET("warped_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.WARPED_SINGLE_DOOR_CABINET.get(), ModItemSettings.base()));

    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private Item item;

    ItemsRegistry(String pathName, Supplier<Item> itemSupplier) {
        this(pathName, itemSupplier, null);
    }

    ItemsRegistry(String pathName, Supplier<Item> itemSupplier, Integer burnTime) {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
    }

    public static void registerAll() {
        for (ItemsRegistry value : values()) {
            Registry.register(Registries.ITEM, Identifier.of(StorageDelight.MOD_ID, value.pathName), value.get());
        }
        ItemGroupEvents.modifyEntriesEvent(StorageDelight.ITEM_GROUP).register(entries -> entries.addAll(
                Arrays.stream(values()).map(item -> item.get().getDefaultStack()).toList()));
    }

    public Item get() {
        if (item == null) {
            item = itemSupplier.get();
        }
        return item;
    }

    public String getId() {
        return Registries.ITEM.getId(get()).toString();
    }
}
