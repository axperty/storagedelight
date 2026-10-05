package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StorageDelight.MOD_ID);

    // Oak Furniture
    public static final DeferredItem<BlockItem> OAK_DRAWER = ITEMS.registerSimpleBlockItem("oak_drawer", BlockRegistry.OAK_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("oak_drawer_with_door", BlockRegistry.OAK_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("oak_drawer_with_books", BlockRegistry.OAK_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_OAK_DRAWERS = ITEMS.registerSimpleBlockItem("small_oak_drawers", BlockRegistry.SMALL_OAK_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("oak_bookshelf_with_door", BlockRegistry.OAK_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_OAK_CABINET = ITEMS.registerSimpleBlockItem("glass_oak_cabinet", BlockRegistry.GLASS_OAK_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("oak_cabinet_with_glass_doors", BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("oak_single_door_cabinet", BlockRegistry.OAK_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("oak_cabinet_with_polished_deepslate_countertop", BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("oak_cabinet_with_polished_andesite_countertop", BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("oak_cabinet_with_polished_tuff_countertop", BlockRegistry.OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("oak_cabinet_with_polished_blackstone_countertop", BlockRegistry.OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("oak_cabinet_with_polished_diorite_countertop", BlockRegistry.OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("oak_cabinet_with_stone_bricks_countertop", BlockRegistry.OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Birch Furniture
    public static final DeferredItem<BlockItem> BIRCH_DRAWER = ITEMS.registerSimpleBlockItem("birch_drawer", BlockRegistry.BIRCH_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("birch_drawer_with_door", BlockRegistry.BIRCH_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("birch_drawer_with_books", BlockRegistry.BIRCH_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_BIRCH_DRAWERS = ITEMS.registerSimpleBlockItem("small_birch_drawers", BlockRegistry.SMALL_BIRCH_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("birch_bookshelf_with_door", BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_BIRCH_CABINET = ITEMS.registerSimpleBlockItem("glass_birch_cabinet", BlockRegistry.GLASS_BIRCH_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("birch_cabinet_with_glass_doors", BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("birch_single_door_cabinet", BlockRegistry.BIRCH_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("birch_cabinet_with_polished_deepslate_countertop", BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("birch_cabinet_with_polished_andesite_countertop", BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("birch_cabinet_with_polished_tuff_countertop", BlockRegistry.BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("birch_cabinet_with_polished_blackstone_countertop", BlockRegistry.BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("birch_cabinet_with_polished_diorite_countertop", BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("birch_cabinet_with_stone_bricks_countertop", BlockRegistry.BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Spruce Furniture
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER = ITEMS.registerSimpleBlockItem("spruce_drawer", BlockRegistry.SPRUCE_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("spruce_drawer_with_door", BlockRegistry.SPRUCE_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("spruce_drawer_with_books", BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_SPRUCE_DRAWERS = ITEMS.registerSimpleBlockItem("small_spruce_drawers", BlockRegistry.SMALL_SPRUCE_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("spruce_bookshelf_with_door", BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_SPRUCE_CABINET = ITEMS.registerSimpleBlockItem("glass_spruce_cabinet", BlockRegistry.GLASS_SPRUCE_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_glass_doors", BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("spruce_single_door_cabinet", BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_polished_deepslate_countertop", BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_polished_andesite_countertop", BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_polished_tuff_countertop", BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_polished_blackstone_countertop", BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_polished_diorite_countertop", BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("spruce_cabinet_with_stone_bricks_countertop", BlockRegistry.SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Jungle Furniture
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER = ITEMS.registerSimpleBlockItem("jungle_drawer", BlockRegistry.JUNGLE_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("jungle_drawer_with_door", BlockRegistry.JUNGLE_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("jungle_drawer_with_books", BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_JUNGLE_DRAWERS = ITEMS.registerSimpleBlockItem("small_jungle_drawers", BlockRegistry.SMALL_JUNGLE_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("jungle_bookshelf_with_door", BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_JUNGLE_CABINET = ITEMS.registerSimpleBlockItem("glass_jungle_cabinet", BlockRegistry.GLASS_JUNGLE_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_glass_doors", BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("jungle_single_door_cabinet", BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_polished_deepslate_countertop", BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_polished_andesite_countertop", BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_polished_tuff_countertop", BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_polished_blackstone_countertop", BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_polished_diorite_countertop", BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("jungle_cabinet_with_stone_bricks_countertop", BlockRegistry.JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Acacia Furniture
    public static final DeferredItem<BlockItem> ACACIA_DRAWER = ITEMS.registerSimpleBlockItem("acacia_drawer", BlockRegistry.ACACIA_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("acacia_drawer_with_door", BlockRegistry.ACACIA_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("acacia_drawer_with_books", BlockRegistry.ACACIA_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_ACACIA_DRAWERS = ITEMS.registerSimpleBlockItem("small_acacia_drawers", BlockRegistry.SMALL_ACACIA_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("acacia_bookshelf_with_door", BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_ACACIA_CABINET = ITEMS.registerSimpleBlockItem("glass_acacia_cabinet", BlockRegistry.GLASS_ACACIA_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_glass_doors", BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("acacia_single_door_cabinet", BlockRegistry.ACACIA_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_polished_deepslate_countertop", BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_polished_andesite_countertop", BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_polished_tuff_countertop", BlockRegistry.ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_polished_blackstone_countertop", BlockRegistry.ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_polished_diorite_countertop", BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("acacia_cabinet_with_stone_bricks_countertop", BlockRegistry.ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Dark Oak Furniture
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER = ITEMS.registerSimpleBlockItem("dark_oak_drawer", BlockRegistry.DARK_OAK_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("dark_oak_drawer_with_door", BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("dark_oak_drawer_with_books", BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_DARK_OAK_DRAWERS = ITEMS.registerSimpleBlockItem("small_dark_oak_drawers", BlockRegistry.SMALL_DARK_OAK_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("dark_oak_bookshelf_with_door", BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_DARK_OAK_CABINET = ITEMS.registerSimpleBlockItem("glass_dark_oak_cabinet", BlockRegistry.GLASS_DARK_OAK_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_glass_doors", BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("dark_oak_single_door_cabinet", BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_polished_deepslate_countertop", BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_polished_andesite_countertop", BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_polished_tuff_countertop", BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_polished_blackstone_countertop", BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_polished_diorite_countertop", BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("dark_oak_cabinet_with_stone_bricks_countertop", BlockRegistry.DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Mangrove Furniture
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER = ITEMS.registerSimpleBlockItem("mangrove_drawer", BlockRegistry.MANGROVE_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("mangrove_drawer_with_door", BlockRegistry.MANGROVE_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("mangrove_drawer_with_books", BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_MANGROVE_DRAWERS = ITEMS.registerSimpleBlockItem("small_mangrove_drawers", BlockRegistry.SMALL_MANGROVE_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("mangrove_bookshelf_with_door", BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_MANGROVE_CABINET = ITEMS.registerSimpleBlockItem("glass_mangrove_cabinet", BlockRegistry.GLASS_MANGROVE_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_glass_doors", BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("mangrove_single_door_cabinet", BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_polished_deepslate_countertop", BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_polished_andesite_countertop", BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_polished_tuff_countertop", BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_polished_blackstone_countertop", BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_polished_diorite_countertop", BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("mangrove_cabinet_with_stone_bricks_countertop", BlockRegistry.MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Cherry Furniture
    public static final DeferredItem<BlockItem> CHERRY_DRAWER = ITEMS.registerSimpleBlockItem("cherry_drawer", BlockRegistry.CHERRY_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("cherry_drawer_with_door", BlockRegistry.CHERRY_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("cherry_drawer_with_books", BlockRegistry.CHERRY_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_CHERRY_DRAWERS = ITEMS.registerSimpleBlockItem("small_cherry_drawers", BlockRegistry.SMALL_CHERRY_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("cherry_bookshelf_with_door", BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_CHERRY_CABINET = ITEMS.registerSimpleBlockItem("glass_cherry_cabinet", BlockRegistry.GLASS_CHERRY_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_glass_doors", BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("cherry_single_door_cabinet", BlockRegistry.CHERRY_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_polished_deepslate_countertop", BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_polished_andesite_countertop", BlockRegistry.CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_polished_tuff_countertop", BlockRegistry.CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_polished_blackstone_countertop", BlockRegistry.CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_polished_diorite_countertop", BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("cherry_cabinet_with_stone_bricks_countertop", BlockRegistry.CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Poplar Furniture
    public static final DeferredItem<BlockItem> POPLAR_CABINET = ITEMS.registerSimpleBlockItem("poplar_cabinet", BlockRegistry.POPLAR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_DRAWER = ITEMS.registerSimpleBlockItem("poplar_drawer", BlockRegistry.POPLAR_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("poplar_drawer_with_door", BlockRegistry.POPLAR_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("poplar_drawer_with_books", BlockRegistry.POPLAR_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_POPLAR_DRAWERS = ITEMS.registerSimpleBlockItem("small_poplar_drawers", BlockRegistry.SMALL_POPLAR_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("poplar_bookshelf_with_door", BlockRegistry.POPLAR_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_POPLAR_CABINET = ITEMS.registerSimpleBlockItem("glass_poplar_cabinet", BlockRegistry.GLASS_POPLAR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_glass_doors", BlockRegistry.POPLAR_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("poplar_single_door_cabinet", BlockRegistry.POPLAR_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_polished_deepslate_countertop", BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_polished_andesite_countertop", BlockRegistry.POPLAR_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_polished_tuff_countertop", BlockRegistry.POPLAR_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_polished_blackstone_countertop", BlockRegistry.POPLAR_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_polished_diorite_countertop", BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> POPLAR_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("poplar_cabinet_with_stone_bricks_countertop", BlockRegistry.POPLAR_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Pale Oak Furniture
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET = ITEMS.registerSimpleBlockItem("pale_oak_cabinet", BlockRegistry.PALE_OAK_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_DRAWER = ITEMS.registerSimpleBlockItem("pale_oak_drawer", BlockRegistry.PALE_OAK_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("pale_oak_drawer_with_door", BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("pale_oak_drawer_with_books", BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_PALE_OAK_DRAWERS = ITEMS.registerSimpleBlockItem("small_pale_oak_drawers", BlockRegistry.SMALL_PALE_OAK_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("pale_oak_bookshelf_with_door", BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_PALE_OAK_CABINET = ITEMS.registerSimpleBlockItem("glass_pale_oak_cabinet", BlockRegistry.GLASS_PALE_OAK_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_glass_doors", BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("pale_oak_single_door_cabinet", BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_polished_deepslate_countertop", BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_polished_andesite_countertop", BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_polished_tuff_countertop", BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_polished_blackstone_countertop", BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_polished_diorite_countertop", BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("pale_oak_cabinet_with_stone_bricks_countertop", BlockRegistry.PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Bamboo Furniture
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER = ITEMS.registerSimpleBlockItem("bamboo_drawer", BlockRegistry.BAMBOO_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("bamboo_drawer_with_door", BlockRegistry.BAMBOO_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("bamboo_drawer_with_books", BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_BAMBOO_DRAWERS = ITEMS.registerSimpleBlockItem("small_bamboo_drawers", BlockRegistry.SMALL_BAMBOO_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("bamboo_bookshelf_with_door", BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_BAMBOO_CABINET = ITEMS.registerSimpleBlockItem("glass_bamboo_cabinet", BlockRegistry.GLASS_BAMBOO_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_glass_doors", BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("bamboo_single_door_cabinet", BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_polished_deepslate_countertop", BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_polished_andesite_countertop", BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_polished_tuff_countertop", BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_polished_blackstone_countertop", BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_polished_diorite_countertop", BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("bamboo_cabinet_with_stone_bricks_countertop", BlockRegistry.BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Crimson Furniture
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER = ITEMS.registerSimpleBlockItem("crimson_drawer", BlockRegistry.CRIMSON_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("crimson_drawer_with_door", BlockRegistry.CRIMSON_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("crimson_drawer_with_books", BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_CRIMSON_DRAWERS = ITEMS.registerSimpleBlockItem("small_crimson_drawers", BlockRegistry.SMALL_CRIMSON_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("crimson_bookshelf_with_door", BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_CRIMSON_CABINET = ITEMS.registerSimpleBlockItem("glass_crimson_cabinet", BlockRegistry.GLASS_CRIMSON_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_glass_doors", BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("crimson_single_door_cabinet", BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_polished_deepslate_countertop", BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_polished_andesite_countertop", BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_polished_tuff_countertop", BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_polished_blackstone_countertop", BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_polished_diorite_countertop", BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("crimson_cabinet_with_stone_bricks_countertop", BlockRegistry.CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);

    // Warped Furniture
    public static final DeferredItem<BlockItem> WARPED_DRAWER = ITEMS.registerSimpleBlockItem("warped_drawer", BlockRegistry.WARPED_DRAWER, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("warped_drawer_with_door", BlockRegistry.WARPED_DRAWER_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_DRAWER_WITH_BOOKS = ITEMS.registerSimpleBlockItem("warped_drawer_with_books", BlockRegistry.WARPED_DRAWER_WITH_BOOKS, Item.Properties::new);
    public static final DeferredItem<BlockItem> SMALL_WARPED_DRAWERS = ITEMS.registerSimpleBlockItem("small_warped_drawers", BlockRegistry.SMALL_WARPED_DRAWERS, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_BOOKSHELF_WITH_DOOR = ITEMS.registerSimpleBlockItem("warped_bookshelf_with_door", BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR, Item.Properties::new);
    public static final DeferredItem<BlockItem> GLASS_WARPED_CABINET = ITEMS.registerSimpleBlockItem("glass_warped_cabinet", BlockRegistry.GLASS_WARPED_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("warped_cabinet_with_glass_doors", BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("warped_single_door_cabinet", BlockRegistry.WARPED_SINGLE_DOOR_CABINET, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = ITEMS.registerSimpleBlockItem("warped_cabinet_with_polished_deepslate_countertop", BlockRegistry.WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("warped_cabinet_with_polished_andesite_countertop", BlockRegistry.WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = ITEMS.registerSimpleBlockItem("warped_cabinet_with_polished_tuff_countertop", BlockRegistry.WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = ITEMS.registerSimpleBlockItem("warped_cabinet_with_polished_blackstone_countertop", BlockRegistry.WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = ITEMS.registerSimpleBlockItem("warped_cabinet_with_polished_diorite_countertop", BlockRegistry.WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP, Item.Properties::new);
    public static final DeferredItem<BlockItem> WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP = ITEMS.registerSimpleBlockItem("warped_cabinet_with_stone_bricks_countertop", BlockRegistry.WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP, Item.Properties::new);
}