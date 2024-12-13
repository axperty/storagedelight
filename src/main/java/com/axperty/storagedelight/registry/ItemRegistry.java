package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.item.FuelBlockItem;
import com.google.common.collect.Sets;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StorageDelight.MOD_ID);
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    // Oak Furniture
    public static final RegistryObject<Item> OAK_DRAWER = registerWithTab("oak_drawer",
            () -> new FuelBlockItem(BlockRegistry.OAK_DRAWER.get(), new Item.Properties().setId(ITEMS.key("oak_drawer")),300)
    );
    public static final RegistryObject<Item> OAK_DRAWER_WITH_DOOR = registerWithTab("oak_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.OAK_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("oak_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> OAK_DRAWER_WITH_BOOKS = registerWithTab("oak_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("oak_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_OAK_CABINET = registerWithTab("glass_oak_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_OAK_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_oak_cabinet")),300)
    );
    public static final RegistryObject<Item> OAK_CABINET_WITH_GLASS_DOORS = registerWithTab("oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("oak_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> OAK_SINGLE_DOOR_CABINET = registerWithTab("oak_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("oak_single_door_cabinet")),300)
    );

    // Spruce Furniture
    public static final RegistryObject<Item> SPRUCE_DRAWER = registerWithTab("spruce_drawer",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_DRAWER.get(), new Item.Properties().setId(ITEMS.key("spruce_drawer")),300)
    );
    public static final RegistryObject<Item> SPRUCE_DRAWER_WITH_DOOR = registerWithTab("spruce_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("spruce_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> SPRUCE_DRAWER_WITH_BOOKS = registerWithTab("spruce_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("spruce_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_SPRUCE_CABINET = registerWithTab("glass_spruce_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_SPRUCE_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_spruce_cabinet")),300)
    );
    public static final RegistryObject<Item> SPRUCE_CABINET_WITH_GLASS_DOORS = registerWithTab("spruce_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("spruce_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> SPRUCE_SINGLE_DOOR_CABINET = registerWithTab("spruce_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("spruce_single_door_cabinet")),300)
    );

    // Birch Furniture
    public static final RegistryObject<Item> BIRCH_DRAWER = registerWithTab("birch_drawer",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_DRAWER.get(), new Item.Properties().setId(ITEMS.key("birch_drawer")),300)
    );
    public static final RegistryObject<Item> BIRCH_DRAWER_WITH_DOOR = registerWithTab("birch_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("birch_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> BIRCH_DRAWER_WITH_BOOKS = registerWithTab("birch_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("birch_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_BIRCH_CABINET = registerWithTab("glass_birch_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_BIRCH_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_birch_cabinet")),300)
    );
    public static final RegistryObject<Item> BIRCH_CABINET_WITH_GLASS_DOORS = registerWithTab("birch_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("birch_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> BIRCH_SINGLE_DOOR_CABINET = registerWithTab("birch_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("birch_single_door_cabinet")),300)
    );

    // Jungle Furniture
    public static final RegistryObject<Item> JUNGLE_DRAWER = registerWithTab("jungle_drawer",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_DRAWER.get(), new Item.Properties().setId(ITEMS.key("jungle_drawer")),300)
    );
    public static final RegistryObject<Item> JUNGLE_DRAWER_WITH_DOOR = registerWithTab("jungle_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("jungle_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> JUNGLE_DRAWER_WITH_BOOKS = registerWithTab("jungle_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("jungle_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_JUNGLE_CABINET = registerWithTab("glass_jungle_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_JUNGLE_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_jungle_cabinet")),300)
    );
    public static final RegistryObject<Item> JUNGLE_CABINET_WITH_GLASS_DOORS = registerWithTab("jungle_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("jungle_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> JUNGLE_SINGLE_DOOR_CABINET = registerWithTab("jungle_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("jungle_single_door_cabinet")),300)
    );

    // Acacia Furniture
    public static final RegistryObject<Item> ACACIA_DRAWER = registerWithTab("acacia_drawer",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_DRAWER.get(), new Item.Properties().setId(ITEMS.key("acacia_drawer")),300)
    );
    public static final RegistryObject<Item> ACACIA_DRAWER_WITH_DOOR = registerWithTab("acacia_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("acacia_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> ACACIA_DRAWER_WITH_BOOKS = registerWithTab("acacia_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("acacia_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_ACACIA_CABINET = registerWithTab("glass_acacia_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_ACACIA_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_acacia_cabinet")),300)
    );
    public static final RegistryObject<Item> ACACIA_CABINET_WITH_GLASS_DOORS = registerWithTab("acacia_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("acacia_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> ACACIA_SINGLE_DOOR_CABINET = registerWithTab("acacia_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("acacia_single_door_cabinet")),300)
    );

    // Dark Oak Furniture
    public static final RegistryObject<Item> DARK_OAK_DRAWER = registerWithTab("dark_oak_drawer",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_DRAWER.get(), new Item.Properties().setId(ITEMS.key("dark_oak_drawer")),300)
    );
    public static final RegistryObject<Item> DARK_OAK_DRAWER_WITH_DOOR = registerWithTab("dark_oak_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("dark_oak_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> DARK_OAK_DRAWER_WITH_BOOKS = registerWithTab("dark_oak_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("dark_oak_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_DARK_OAK_CABINET = registerWithTab("glass_dark_oak_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_DARK_OAK_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_dark_oak_cabinet")),300)
    );
    public static final RegistryObject<Item> DARK_OAK_CABINET_WITH_GLASS_DOORS = registerWithTab("dark_oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("dark_oak_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> DARK_OAK_SINGLE_DOOR_CABINET = registerWithTab("dark_oak_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("dark_oak_single_door_cabinet")),300)
    );

    // Mangrove Furniture
    public static final RegistryObject<Item> MANGROVE_DRAWER = registerWithTab("mangrove_drawer",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_DRAWER.get(), new Item.Properties().setId(ITEMS.key("mangrove_drawer")),300)
    );
    public static final RegistryObject<Item> MANGROVE_DRAWER_WITH_DOOR = registerWithTab("mangrove_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("mangrove_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> MANGROVE_DRAWER_WITH_BOOKS = registerWithTab("mangrove_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("mangrove_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_MANGROVE_CABINET = registerWithTab("glass_mangrove_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_MANGROVE_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_mangrove_cabinet")),300)
    );
    public static final RegistryObject<Item> MANGROVE_CABINET_WITH_GLASS_DOORS = registerWithTab("mangrove_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("mangrove_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> MANGROVE_SINGLE_DOOR_CABINET = registerWithTab("mangrove_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("mangrove_single_door_cabinet")),300)
    );

    // Cherry Furniture
    public static final RegistryObject<Item> CHERRY_DRAWER = registerWithTab("cherry_drawer",
            () -> new FuelBlockItem(BlockRegistry.CHERRY_DRAWER.get(), new Item.Properties().setId(ITEMS.key("cherry_drawer")),300)
    );
    public static final RegistryObject<Item> CHERRY_DRAWER_WITH_DOOR = registerWithTab("cherry_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("cherry_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> CHERRY_DRAWER_WITH_BOOKS = registerWithTab("cherry_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("cherry_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_CHERRY_CABINET = registerWithTab("glass_cherry_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_CHERRY_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_cherry_cabinet")),300)
    );
    public static final RegistryObject<Item> CHERRY_CABINET_WITH_GLASS_DOORS = registerWithTab("cherry_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("cherry_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> CHERRY_SINGLE_DOOR_CABINET = registerWithTab("cherry_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("cherry_single_door_cabinet")),300)
    );

    // Pale Oak Furniture
    public static final RegistryObject<Item> PALE_OAK_DRAWER = registerWithTab("pale_oak_drawer",
            () -> new FuelBlockItem(BlockRegistry.PALE_OAK_DRAWER.get(), new Item.Properties().setId(ITEMS.key("pale_oak_drawer")),300)
    );
    public static final RegistryObject<Item> PALE_OAK_DRAWER_WITH_DOOR = registerWithTab("pale_oak_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("pale_oak_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> PALE_OAK_DRAWER_WITH_BOOKS = registerWithTab("pale_oak_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("pale_oak_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_PALE_OAK_CABINET = registerWithTab("glass_pale_oak_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_PALE_OAK_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_pale_oak_cabinet")),300)
    );
    public static final RegistryObject<Item> PALE_OAK_CABINET_WITH_GLASS_DOORS = registerWithTab("pale_oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("pale_oak_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> PALE_OAK_SINGLE_DOOR_CABINET = registerWithTab("pale_oak_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("pale_oak_single_door_cabinet")),300)
    );

    // Bamboo Furniture
    public static final RegistryObject<Item> BAMBOO_DRAWER = registerWithTab("bamboo_drawer",
            () -> new FuelBlockItem(BlockRegistry.BAMBOO_DRAWER.get(), new Item.Properties().setId(ITEMS.key("bamboo_drawer")),300)
    );
    public static final RegistryObject<Item> BAMBOO_DRAWER_WITH_DOOR = registerWithTab("bamboo_drawer_with_door",
            () -> new FuelBlockItem(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("bamboo_drawer_with_door")),300)
    );
    public static final RegistryObject<Item> BAMBOO_DRAWER_WITH_BOOKS = registerWithTab("bamboo_drawer_with_books",
            () -> new FuelBlockItem(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("bamboo_drawer_with_books")),300)
    );
    public static final RegistryObject<Item> GLASS_BAMBOO_CABINET = registerWithTab("glass_bamboo_cabinet",
            () -> new FuelBlockItem(BlockRegistry.GLASS_BAMBOO_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_bamboo_cabinet")),300)
    );
    public static final RegistryObject<Item> BAMBOO_CABINET_WITH_GLASS_DOORS = registerWithTab("bamboo_cabinet_with_glass_doors",
            () -> new FuelBlockItem(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("bamboo_cabinet_with_glass_doors")),300)
    );
    public static final RegistryObject<Item> BAMBOO_SINGLE_DOOR_CABINET = registerWithTab("bamboo_single_door_cabinet",
            () -> new FuelBlockItem(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("bamboo_single_door_cabinet")),300)
    );

    // Crimson Furniture
    public static final RegistryObject<Item> CRIMSON_CABINET = registerWithTab("crimson_drawer",
            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER.get(), new Item.Properties().setId(ITEMS.key("crimson_drawer")))
    );
    public static final RegistryObject<Item> CRIMSON_CABINET_WITH_DOOR = registerWithTab("crimson_drawer_with_door",
            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("crimson_drawer_with_door")))
    );
    public static final RegistryObject<Item> CRIMSON_DRAWER_WITH_BOOKS = registerWithTab("crimson_drawer_with_books",
            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("crimson_drawer_with_books")))
    );
    public static final RegistryObject<Item> GLASS_CRIMSON_CABINET = registerWithTab("glass_crimson_cabinet",
            () -> new BlockItem(BlockRegistry.GLASS_CRIMSON_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_crimson_cabinet")))
    );
    public static final RegistryObject<Item> CRIMSON_CABINET_WITH_GLASS_DOORS = registerWithTab("crimson_cabinet_with_glass_doors",
            () -> new BlockItem(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("crimson_cabinet_with_glass_doors")))
    );
    public static final RegistryObject<Item> CRIMSON_SINGLE_DOOR_CABINET = registerWithTab("crimson_single_door_cabinet",
            () -> new BlockItem(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("crimson_single_door_cabinet")))
    );

    // Warped Furniture
    public static final RegistryObject<Item> WARPED_DRAWER = registerWithTab("warped_drawer",
            () -> new BlockItem(BlockRegistry.WARPED_DRAWER.get(), new Item.Properties().setId(ITEMS.key("warped_drawer")))
    );
    public static final RegistryObject<Item> WARPED_DRAWER_WITH_DOOR = registerWithTab("warped_drawer_with_door",
            () -> new BlockItem(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get(), new Item.Properties().setId(ITEMS.key("warped_drawer_with_door")))
    );
    public static final RegistryObject<Item> WARPED_DRAWER_WITH_BOOKS = registerWithTab("warped_drawer_with_books",
            () -> new BlockItem(BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get(), new Item.Properties().setId(ITEMS.key("warped_drawer_with_books")))
    );
    public static final RegistryObject<Item> GLASS_WARPED_CABINET = registerWithTab("glass_warped_cabinet",
            () -> new BlockItem(BlockRegistry.GLASS_WARPED_CABINET.get(), new Item.Properties().setId(ITEMS.key("glass_warped_cabinet")))
    );
    public static final RegistryObject<Item> WARPED_CABINET_WITH_GLASS_DOORS = registerWithTab("warped_cabinet_with_glass_doors",
            () -> new BlockItem(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties().setId(ITEMS.key("warped_cabinet_with_glass_doors")))
    );
    public static final RegistryObject<Item> WARPED_SINGLE_DOOR_CABINET = registerWithTab("warped_single_door_cabinet",
            () -> new BlockItem(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get(), new Item.Properties().setId(ITEMS.key("warped_single_door_cabinet")))
    );
}
