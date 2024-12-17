package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.item.FuelBlockItem;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StorageDelight.MOD_ID);

    public static Item.Properties basicItem() {
        return new Item.Properties().tab(CreativeTabRegistry.CREATIVE_TAB);
    }

    // Oak Furniture
    public static final RegistryObject<Item> OAK_DRAWER = ITEMS.register("oak_drawer",
            () -> new FuelBlockItem(BlockRegistry.OAK_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> OAK_DRAWER_WITH_DOOR = ITEMS.register("oak_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.OAK_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> OAK_DRAWER_WITH_BOOKS = ITEMS.register("oak_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_OAK_CABINET = ITEMS.register("glass_oak_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_OAK_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> OAK_CABINET_WITH_GLASS_DOORS = ITEMS.register("oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> OAK_SINGLE_DOOR_CABINET = ITEMS.register("oak_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Spruce Furniture
    public static final RegistryObject<Item> SPRUCE_DRAWER = ITEMS.register("spruce_drawer",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> SPRUCE_DRAWER_WITH_DOOR = ITEMS.register("spruce_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> SPRUCE_DRAWER_WITH_BOOKS = ITEMS.register("spruce_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_SPRUCE_CABINET = ITEMS.register("glass_spruce_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_SPRUCE_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> SPRUCE_CABINET_WITH_GLASS_DOORS = ITEMS.register("spruce_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> SPRUCE_SINGLE_DOOR_CABINET = ITEMS.register("spruce_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Birch Furniture
    public static final RegistryObject<Item> BIRCH_DRAWER = ITEMS.register("birch_drawer",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> BIRCH_DRAWER_WITH_DOOR = ITEMS.register("birch_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> BIRCH_DRAWER_WITH_BOOKS = ITEMS.register("birch_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_BIRCH_CABINET = ITEMS.register("glass_birch_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_BIRCH_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> BIRCH_CABINET_WITH_GLASS_DOORS = ITEMS.register("birch_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> BIRCH_SINGLE_DOOR_CABINET = ITEMS.register("birch_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Jungle Furniture
    public static final RegistryObject<Item> JUNGLE_DRAWER = ITEMS.register("jungle_drawer",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> JUNGLE_DRAWER_WITH_DOOR = ITEMS.register("jungle_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> JUNGLE_DRAWER_WITH_BOOKS = ITEMS.register("jungle_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_JUNGLE_CABINET = ITEMS.register("glass_jungle_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_JUNGLE_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> JUNGLE_CABINET_WITH_GLASS_DOORS = ITEMS.register("jungle_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> JUNGLE_SINGLE_DOOR_CABINET = ITEMS.register("jungle_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Acacia Furniture
    public static final RegistryObject<Item> ACACIA_DRAWER = ITEMS.register("acacia_drawer",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> ACACIA_DRAWER_WITH_DOOR = ITEMS.register("acacia_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> ACACIA_DRAWER_WITH_BOOKS = ITEMS.register("acacia_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_ACACIA_CABINET = ITEMS.register("glass_acacia_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_ACACIA_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> ACACIA_CABINET_WITH_GLASS_DOORS = ITEMS.register("acacia_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> ACACIA_SINGLE_DOOR_CABINET = ITEMS.register("acacia_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Dark Oak Furniture
    public static final RegistryObject<Item> DARK_OAK_DRAWER = ITEMS.register("dark_oak_drawer",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> DARK_OAK_DRAWER_WITH_DOOR = ITEMS.register("dark_oak_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> DARK_OAK_DRAWER_WITH_BOOKS = ITEMS.register("dark_oak_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_DARK_OAK_CABINET = ITEMS.register("glass_dark_oak_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_DARK_OAK_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> DARK_OAK_CABINET_WITH_GLASS_DOORS = ITEMS.register("dark_oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> DARK_OAK_SINGLE_DOOR_CABINET = ITEMS.register("dark_oak_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Mangrove Furniture
    public static final RegistryObject<Item> MANGROVE_DRAWER = ITEMS.register("mangrove_drawer",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> MANGROVE_DRAWER_WITH_DOOR = ITEMS.register("mangrove_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get(), basicItem(), 300));
    public static final RegistryObject<Item> MANGROVE_DRAWER_WITH_BOOKS = ITEMS.register("mangrove_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_MANGROVE_CABINET = ITEMS.register("glass_mangrove_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_MANGROVE_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> MANGROVE_CABINET_WITH_GLASS_DOORS = ITEMS.register("mangrove_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));
    public static final RegistryObject<Item> MANGROVE_SINGLE_DOOR_CABINET = ITEMS.register("mangrove_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Crimson Furniture
    public static final RegistryObject<Item> CRIMSON_DRAWER = ITEMS.register("crimson_drawer",
            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER.get(), basicItem()));
    public static final RegistryObject<Item> CRIMSON_DRAWER_WITH_DOOR = ITEMS.register("crimson_drawer_with_door",
            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get(), basicItem()));
    public static final RegistryObject<Item> CRIMSON_DRAWER_WITH_BOOKS = ITEMS.register("crimson_drawer_with_books",
            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get(), basicItem()));
    public static final RegistryObject<Item> GLASS_CRIMSON_CABINET = ITEMS.register("glass_crimson_cabinet",
            () -> new BlockItem(BlockRegistry.GLASS_CRIMSON_CABINET.get(), basicItem()));
    public static final RegistryObject<Item> CRIMSON_CABINET_WITH_GLASS_DOORS = ITEMS.register("crimson_cabinet_with_glass_doors",
            () -> new BlockItem(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get(), basicItem()));
    public static final RegistryObject<Item> CRIMSON_SINGLE_DOOR_CABINET = ITEMS.register("crimson_single_door_cabinet",
            () -> new BlockItem(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get(), basicItem()));

    // Warped Furniture
    public static final RegistryObject<Item> WARPED_DRAWER = ITEMS.register("warped_drawer",
            () -> new BlockItem(BlockRegistry.WARPED_DRAWER.get(), basicItem()));
    public static final RegistryObject<Item> WARPED_DRAWER_WITH_DOOR = ITEMS.register("warped_drawer_with_door",
            () -> new BlockItem(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get(), basicItem()));
    public static final RegistryObject<Item> WARPED_DRAWER_WITH_BOOKS = ITEMS.register("warped_drawer_with_books",
            () -> new BlockItem(BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get(), basicItem()));
    public static final RegistryObject<Item> GLASS_WARPED_CABINET = ITEMS.register("glass_warped_cabinet",
            () -> new BlockItem(BlockRegistry.GLASS_WARPED_CABINET.get(), basicItem()));
    public static final RegistryObject<Item> WARPED_CABINET_WITH_GLASS_DOORS = ITEMS.register("warped_cabinet_with_glass_doors",
            () -> new BlockItem(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get(), basicItem()));
    public static final RegistryObject<Item> WARPED_SINGLE_DOOR_CABINET = ITEMS.register("warped_single_door_cabinet",
            () -> new BlockItem(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get(), basicItem()));
}
