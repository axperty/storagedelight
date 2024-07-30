package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.item.ModBlockItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum ItemsRegistry {

    // Drawers
    OAK_DRAWER("oak_drawer", () -> new ModBlockItem(BlocksRegistry.OAK_DRAWER.get()), 300),
    BIRCH_DRAWER("birch_drawer", () -> new ModBlockItem(BlocksRegistry.BIRCH_DRAWER.get()), 300),
    SPRUCE_DRAWER("spruce_drawer", () -> new ModBlockItem(BlocksRegistry.SPRUCE_DRAWER.get()), 300),
    JUNGLE_DRAWER("jungle_drawer", () -> new ModBlockItem(BlocksRegistry.JUNGLE_DRAWER.get()), 300),
    ACACIA_DRAWER("acacia_drawer", () -> new ModBlockItem(BlocksRegistry.ACACIA_DRAWER.get()), 300),
    DARK_OAK_DRAWER("dark_oak_drawer", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_DRAWER.get()), 300),
    MANGROVE_DRAWER("mangrove_drawer", () -> new ModBlockItem(BlocksRegistry.MANGROVE_DRAWER.get()), 300),
    CRIMSON_DRAWER("crimson_drawer", () -> new ModBlockItem(BlocksRegistry.CRIMSON_DRAWER.get())),
    WARPED_DRAWER("warped_drawer", () -> new ModBlockItem(BlocksRegistry.WARPED_DRAWER.get())),

    // Glass Cabinets
    GLASS_OAK_CABINET("glass_oak_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_OAK_CABINET.get()), 300),
    GLASS_BIRCH_CABINET("glass_birch_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_BIRCH_CABINET.get()), 300),
    GLASS_SPRUCE_CABINET("glass_spruce_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_SPRUCE_CABINET.get()), 300),
    GLASS_JUNGLE_CABINET("glass_jungle_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_JUNGLE_CABINET.get()), 300),
    GLASS_ACACIA_CABINET("glass_acacia_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_ACACIA_CABINET.get()), 300),
    GLASS_DARK_OAK_CABINET("glass_dark_oak_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_DARK_OAK_CABINET.get()), 300),
    GLASS_MANGROVE_CABINET("glass_mangrove_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_MANGROVE_CABINET.get()), 300),
    GLASS_CRIMSON_CABINET("glass_crimson_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_CRIMSON_CABINET.get())),
    GLASS_WARPED_CABINET("glass_warped_cabinet", () -> new ModBlockItem(BlocksRegistry.GLASS_WARPED_CABINET.get())),

    // Cabinets with Glass Doors
    OAK_CABINET_WITH_GLASS_DOORS("oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.OAK_CABINET_WITH_GLASS_DOORS.get())),
    BIRCH_CABINET_WITH_GLASS_DOORS("birch_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get())),
    SPRUCE_CABINET_WITH_GLASS_DOORS("spruce_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get())),
    JUNGLE_CABINET_WITH_GLASS_DOORS("jungle_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get())),
    ACACIA_CABINET_WITH_GLASS_DOORS("acacia_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get())),
    DARK_OAK_CABINET_WITH_GLASS_DOORS("dark_oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get())),
    MANGROVE_CABINET_WITH_GLASS_DOORS("mangrove_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get())),
    CRIMSON_CABINET_WITH_GLASS_DOORS("crimson_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get())),
    WARPED_CABINET_WITH_GLASS_DOORS("warped_cabinet_with_glass_doors", () -> new ModBlockItem(BlocksRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get())),

    // Single Door Cabinets
    OAK_SINGLE_DOOR_CABINET("oak_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.OAK_SINGLE_DOOR_CABINET.get())),
    BIRCH_SINGLE_DOOR_CABINET("birch_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.BIRCH_SINGLE_DOOR_CABINET.get())),
    SPRUCE_SINGLE_DOOR_CABINET("spruce_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.SPRUCE_SINGLE_DOOR_CABINET.get())),
    JUNGLE_SINGLE_DOOR_CABINET("jungle_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.JUNGLE_SINGLE_DOOR_CABINET.get())),
    ACACIA_SINGLE_DOOR_CABINET("acacia_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.ACACIA_SINGLE_DOOR_CABINET.get())),
    DARK_OAK_SINGLE_DOOR_CABINET("dark_oak_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get())),
    MANGROVE_SINGLE_DOOR_CABINET("mangrove_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.MANGROVE_SINGLE_DOOR_CABINET.get())),
    CRIMSON_SINGLE_DOOR_CABINET("crimson_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.CRIMSON_SINGLE_DOOR_CABINET.get())),
    WARPED_SINGLE_DOOR_CABINET("warped_single_door_cabinet", () -> new ModBlockItem(BlocksRegistry.WARPED_SINGLE_DOOR_CABINET.get()));

    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private final Integer burnTime;
    private Item item;

    ItemsRegistry(String pathName, Supplier<Item> itemSupplier) {
        this(pathName, itemSupplier, null);
    }

    ItemsRegistry(String pathName, Supplier<Item> itemSupplier, Integer burnTime) {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
        this.burnTime = burnTime;
    }

    public static void registerAll() {
        for (ItemsRegistry value : values()) {
            Registry.register(Registry.ITEM, new Identifier(StorageDelight.MOD_ID, value.pathName), value.get());
            if (value.burnTime != null && value.burnTime > 0) {
                FuelRegistry.INSTANCE.add(value.get(), value.burnTime);
            }
        }
    }

    public Item get() {
        if (item == null) {
            item = itemSupplier.get();
        }
        return item;
    }

    public String getId() {
        return Registry.ITEM.getId(get()).toString();
    }
}
