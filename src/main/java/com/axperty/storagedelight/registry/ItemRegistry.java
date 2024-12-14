package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StorageDelight.MOD_ID);

    // Oak Furniture
    public static final DeferredItem<BlockItem> OAK_DRAWER = ITEMS.registerSimpleBlockItem("oak_drawer", BlockRegistry.OAK_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> OAK_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("oak_drawer_with_door", BlockRegistry.OAK_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> OAK_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("oak_drawer_with_books", BlockRegistry.OAK_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_OAK_CABINET = ITEMS.registerSimpleBlockItem("glass_oak_cabinet", BlockRegistry.GLASS_OAK_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("oak_cabinet_with_glass_doors", BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> OAK_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("oak_single_door_cabinet", BlockRegistry.OAK_SINGLE_DOOR_CABINET, new Item.Properties());

    // Birch Furniture
    public static final DeferredItem<BlockItem> BIRCH_DRAWER = ITEMS.registerSimpleBlockItem("birch_drawer", BlockRegistry.BIRCH_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> BIRCH_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("birch_drawer_with_door", BlockRegistry.BIRCH_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> BIRCH_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("birch_drawer_with_books", BlockRegistry.BIRCH_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_BIRCH_CABINET = ITEMS.registerSimpleBlockItem("glass_birch_cabinet", BlockRegistry.GLASS_BIRCH_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("birch_cabinet_with_glass_doors", BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> BIRCH_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("birch_single_door_cabinet", BlockRegistry.BIRCH_SINGLE_DOOR_CABINET, new Item.Properties());

    // Spruce Furniture
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER = ITEMS.registerSimpleBlockItem("spruce_drawer", BlockRegistry.SPRUCE_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("spruce_drawer_with_door", BlockRegistry.SPRUCE_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("spruce_drawer_with_books", BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_SPRUCE_CABINET = ITEMS.registerSimpleBlockItem("glass_spruce_cabinet", BlockRegistry.GLASS_SPRUCE_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_glass_doors", BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> SPRUCE_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("spruce_single_door_cabinet", BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET, new Item.Properties());

    // Jungle Furniture
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER = ITEMS.registerSimpleBlockItem("jungle_drawer", BlockRegistry.JUNGLE_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("jungle_drawer_with_door", BlockRegistry.JUNGLE_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("jungle_drawer_with_books", BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_JUNGLE_CABINET = ITEMS.registerSimpleBlockItem("glass_jungle_cabinet", BlockRegistry.GLASS_JUNGLE_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_glass_doors", BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> JUNGLE_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("jungle_single_door_cabinet", BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET, new Item.Properties());

    // Acacia Furniture
    public static final DeferredItem<BlockItem> ACACIA_DRAWER = ITEMS.registerSimpleBlockItem("acacia_drawer", BlockRegistry.ACACIA_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> ACACIA_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("acacia_drawer_with_door", BlockRegistry.ACACIA_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> ACACIA_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("acacia_drawer_with_books", BlockRegistry.ACACIA_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_ACACIA_CABINET = ITEMS.registerSimpleBlockItem("glass_acacia_cabinet", BlockRegistry.GLASS_ACACIA_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_glass_doors", BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> ACACIA_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("acacia_single_door_cabinet", BlockRegistry.ACACIA_SINGLE_DOOR_CABINET, new Item.Properties());

    // Dark Oak Furniture
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER = ITEMS.registerSimpleBlockItem("dark_oak_drawer", BlockRegistry.DARK_OAK_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("dark_oak_drawer_with_door", BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("dark_oak_drawer_with_books", BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_DARK_OAK_CABINET = ITEMS.registerSimpleBlockItem("glass_dark_oak_cabinet", BlockRegistry.GLASS_DARK_OAK_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_glass_doors", BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> DARK_OAK_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("dark_oak_single_door_cabinet", BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET, new Item.Properties());

    // Mangrove Furniture
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER = ITEMS.registerSimpleBlockItem("mangrove_drawer", BlockRegistry.MANGROVE_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("mangrove_drawer_with_door", BlockRegistry.MANGROVE_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("mangrove_drawer_with_books", BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_MANGROVE_CABINET = ITEMS.registerSimpleBlockItem("glass_mangrove_cabinet", BlockRegistry.GLASS_MANGROVE_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_glass_doors", BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> MANGROVE_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("mangrove_single_door_cabinet", BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET, new Item.Properties());

    // Cherry Furniture
    public static final DeferredItem<BlockItem> CHERRY_DRAWER = ITEMS.registerSimpleBlockItem("cherry_drawer", BlockRegistry.CHERRY_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> CHERRY_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("cherry_drawer_with_door", BlockRegistry.CHERRY_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> CHERRY_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("cherry_drawer_with_books", BlockRegistry.CHERRY_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_CHERRY_CABINET = ITEMS.registerSimpleBlockItem("glass_cherry_cabinet", BlockRegistry.GLASS_CHERRY_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_glass_doors", BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> CHERRY_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("cherry_single_door_cabinet", BlockRegistry.CHERRY_SINGLE_DOOR_CABINET, new Item.Properties());

    // Bamboo Furniture
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER = ITEMS.registerSimpleBlockItem("bamboo_drawer", BlockRegistry.BAMBOO_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("bamboo_drawer_with_door", BlockRegistry.BAMBOO_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("bamboo_drawer_with_books", BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_BAMBOO_CABINET = ITEMS.registerSimpleBlockItem("glass_bamboo_cabinet", BlockRegistry.GLASS_BAMBOO_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_glass_doors", BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> BAMBOO_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("bamboo_single_door_cabinet", BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET, new Item.Properties());

    // Crimson Furniture
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER = ITEMS.registerSimpleBlockItem("crimson_drawer", BlockRegistry.CRIMSON_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("crimson_drawer_with_door", BlockRegistry.CRIMSON_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("crimson_drawer_with_books", BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_CRIMSON_CABINET = ITEMS.registerSimpleBlockItem("glass_crimson_cabinet", BlockRegistry.GLASS_CRIMSON_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_glass_doors", BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> CRIMSON_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("crimson_single_door_cabinet", BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET, new Item.Properties());

    // Warped Furniture
    public static final DeferredItem<BlockItem> WARPED_DRAWER = ITEMS.registerSimpleBlockItem("warped_drawer", BlockRegistry.WARPED_DRAWER, new Item.Properties());
    public static final DeferredItem<BlockItem> WARPED_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("warped_drawer_with_door", BlockRegistry.WARPED_DRAWER_WITH_DOOR, new Item.Properties());
    public static final DeferredItem<BlockItem> WARPED_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("warped_drawer_with_books", BlockRegistry.WARPED_DRAWER_WITH_BOOKS, new Item.Properties());
    public static final DeferredItem<BlockItem> GLASS_WARPED_CABINET = ITEMS.registerSimpleBlockItem("glass_warped_cabinet", BlockRegistry.GLASS_WARPED_CABINET, new Item.Properties());
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("warped_cabinet_with_glass_doors", BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS, new Item.Properties());
    public static final DeferredItem<BlockItem> WARPED_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("warped_single_door_cabinet", BlockRegistry.WARPED_SINGLE_DOOR_CABINET, new Item.Properties());
}
