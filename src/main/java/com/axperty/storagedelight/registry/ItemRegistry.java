package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.item.ModBlockItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.function.Supplier;

public enum ItemRegistry {

    // Oak Furniture
    OAK_DRAWER("oak_drawer", () -> new ModBlockItem(BlockRegistry.OAK_DRAWER.get())),
    OAK_DRAWER_WITH_DOOR("oak_drawer_with_door", () -> new ModBlockItem(BlockRegistry.OAK_DRAWER_WITH_DOOR.get())),
    OAK_DRAWER_WITH_BOOKS("oak_drawer_with_books", () -> new ModBlockItem(BlockRegistry.OAK_DRAWER_WITH_BOOKS.get())),
    GLASS_OAK_CABINET("glass_oak_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_OAK_CABINET.get())),
    OAK_CABINET_WITH_GLASS_DOORS("oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get())),
    OAK_SINGLE_DOOR_CABINET("oak_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get())),

    // Birch Furniture
    BIRCH_DRAWER("birch_drawer", () -> new ModBlockItem(BlockRegistry.BIRCH_DRAWER.get())),
    BIRCH_DRAWER_WITH_DOOR("birch_drawer_with_door", () -> new ModBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get())),
    BIRCH_DRAWER_WITH_BOOKS("birch_drawer_with_books", () -> new ModBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get())),
    GLASS_BIRCH_CABINET("glass_birch_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_BIRCH_CABINET.get())),
    BIRCH_CABINET_WITH_GLASS_DOORS("birch_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get())),
    BIRCH_SINGLE_DOOR_CABINET("birch_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get())),

    // Spruce Furniture
    SPRUCE_DRAWER("spruce_drawer", () -> new ModBlockItem(BlockRegistry.SPRUCE_DRAWER.get())),
    SPRUCE_DRAWER_WITH_DOOR("spruce_drawer_with_door", () -> new ModBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get())),
    SPRUCE_DRAWER_WITH_BOOKS("spruce_drawer_with_books", () -> new ModBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get())),
    GLASS_SPRUCE_CABINET("glass_spruce_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_SPRUCE_CABINET.get())),
    SPRUCE_CABINET_WITH_GLASS_DOORS("spruce_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get())),
    SPRUCE_SINGLE_DOOR_CABINET("spruce_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get())),

    // Jungle Furniture
    JUNGLE_DRAWER("jungle_drawer", () -> new ModBlockItem(BlockRegistry.JUNGLE_DRAWER.get())),
    JUNGLE_DRAWER_WITH_DOOR("jungle_drawer_with_door", () -> new ModBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get())),
    JUNGLE_DRAWER_WITH_BOOKS("jungle_drawer_with_books", () -> new ModBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get())),
    GLASS_JUNGLE_CABINET("glass_jungle_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_JUNGLE_CABINET.get())),
    JUNGLE_CABINET_WITH_GLASS_DOORS("jungle_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get())),
    JUNGLE_SINGLE_DOOR_CABINET("jungle_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get())),

    // Acacia Furniture
    ACACIA_DRAWER("acacia_drawer", () -> new ModBlockItem(BlockRegistry.ACACIA_DRAWER.get())),
    ACACIA_DRAWER_WITH_DOOR("acacia_drawer_with_door", () -> new ModBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get())),
    ACACIA_DRAWER_WITH_BOOKS("acacia_drawer_with_books", () -> new ModBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get())),
    GLASS_ACACIA_CABINET("glass_acacia_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_ACACIA_CABINET.get())),
    ACACIA_CABINET_WITH_GLASS_DOORS("acacia_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get())),
    ACACIA_SINGLE_DOOR_CABINET("acacia_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get())),

    // Dark Oak Furniture
    DARK_OAK_DRAWER("dark_oak_drawer", () -> new ModBlockItem(BlockRegistry.DARK_OAK_DRAWER.get())),
    DARK_OAK_DRAWER_WITH_DOOR("dark_oak_drawer_with_door", () -> new ModBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get())),
    DARK_OAK_DRAWER_WITH_BOOKS("dark_oak_drawer_with_books", () -> new ModBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get())),
    GLASS_DARK_OAK_CABINET("glass_dark_oak_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_DARK_OAK_CABINET.get())),
    DARK_OAK_CABINET_WITH_GLASS_DOORS("dark_oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get())),
    DARK_OAK_SINGLE_DOOR_CABINET("dark_oak_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get())),

    // Mangrove Furniture
    MANGROVE_DRAWER("mangrove_drawer", () -> new ModBlockItem(BlockRegistry.MANGROVE_DRAWER.get())),
    MANGROVE_DRAWER_WITH_DOOR("mangrove_drawer_with_door", () -> new ModBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get())),
    MANGROVE_DRAWER_WITH_BOOKS("mangrove_drawer_with_books", () -> new ModBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get())),
    GLASS_MANGROVE_CABINET("glass_mangrove_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_MANGROVE_CABINET.get())),
    MANGROVE_CABINET_WITH_GLASS_DOORS("mangrove_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get())),
    MANGROVE_SINGLE_DOOR_CABINET("mangrove_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get())),

    // Cherry Furniture
    CHERRY_DRAWER("cherry_drawer", () -> new ModBlockItem(BlockRegistry.CHERRY_DRAWER.get())),
    CHERRY_DRAWER_WITH_DOOR("cherry_drawer_with_door", () -> new ModBlockItem(BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get())),
    CHERRY_DRAWER_WITH_BOOKS("cherry_drawer_with_books", () -> new ModBlockItem(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS.get())),
    GLASS_CHERRY_CABINET("glass_cherry_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_CHERRY_CABINET.get())),
    CHERRY_CABINET_WITH_GLASS_DOORS("cherry_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get())),
    CHERRY_SINGLE_DOOR_CABINET("cherry_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get())),

    // Bamboo Furniture
    BAMBOO_DRAWER("bamboo_drawer", () -> new ModBlockItem(BlockRegistry.BAMBOO_DRAWER.get())),
    BAMBOO_DRAWER_WITH_DOOR("bamboo_drawer_with_door", () -> new ModBlockItem(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get())),
    BAMBOO_DRAWER_WITH_BOOKS("bamboo_drawer_with_books", () -> new ModBlockItem(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS.get())),
    GLASS_BAMBOO_CABINET("glass_bamboo_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_BAMBOO_CABINET.get())),
    BAMBOO_CABINET_WITH_GLASS_DOORS("bamboo_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get())),
    BAMBOO_SINGLE_DOOR_CABINET("bamboo_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get())),

    // Crimson Furniture
    CRIMSON_DRAWER("crimson_drawer", () -> new ModBlockItem(BlockRegistry.CRIMSON_DRAWER.get())),
    CRIMSON_DRAWER_WITH_DOOR("crimson_drawer_with_door", () -> new ModBlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get())),
    CRIMSON_DRAWER_WITH_BOOKS("crimson_drawer_with_books", () -> new ModBlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get())),
    GLASS_CRIMSON_CABINET("glass_crimson_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_CRIMSON_CABINET.get())),
    CRIMSON_CABINET_WITH_GLASS_DOORS("crimson_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get())),
    CRIMSON_SINGLE_DOOR_CABINET("crimson_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get())),

    // Warped Furniture
    WARPED_DRAWER("warped_drawer", () -> new ModBlockItem(BlockRegistry.WARPED_DRAWER.get())),
    WARPED_DRAWER_WITH_DOOR("warped_drawer_with_door", () -> new ModBlockItem(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get())),
    WARPED_DRAWER_WITH_BOOKS("warped_drawer_with_books", () -> new ModBlockItem(BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get())),
    GLASS_WARPED_CABINET("glass_warped_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_WARPED_CABINET.get())),
    WARPED_CABINET_WITH_GLASS_DOORS("warped_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get())),
    WARPED_SINGLE_DOOR_CABINET("warped_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get()));

    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private Item item;

    ItemRegistry(String pathName, Supplier<Item> itemSupplier) {
        this(pathName, itemSupplier, null);
    }

    ItemRegistry(String pathName, Supplier<Item> itemSupplier, Integer burnTime) {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
    }

    public static void registerAll() {
        for (ItemRegistry value : values()) {
            Registry.register(Registries.ITEM, new Identifier(StorageDelight.MOD_ID, value.pathName), value.get());
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
