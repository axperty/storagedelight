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

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StorageDelight.MOD_ID);
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    // Oak Furniture
    public static final RegistryObject<Item> OAK_DRAWER = registerWithTab("oak_drawer",
            () -> new FuelBlockItem(ModBlocks.OAK_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> OAK_DRAWER_WITH_DOOR = registerWithTab("oak_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.OAK_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_OAK_CABINET = registerWithTab("glass_oak_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_OAK_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> OAK_CABINET_WITH_GLASS_DOORS = registerWithTab("oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.OAK_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> OAK_SINGLE_DOOR_CABINET = registerWithTab("oak_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.OAK_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Spruce Furniture
    public static final RegistryObject<Item> SPRUCE_DRAWER = registerWithTab("spruce_drawer",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> SPRUCE_DRAWER_WITH_DOOR = registerWithTab("spruce_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_SPRUCE_CABINET = registerWithTab("glass_spruce_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_SPRUCE_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> SPRUCE_CABINET_WITH_GLASS_DOORS = registerWithTab("spruce_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> SPRUCE_SINGLE_DOOR_CABINET = registerWithTab("spruce_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Birch Furniture
    public static final RegistryObject<Item> BIRCH_DRAWER = registerWithTab("birch_drawer",
            () -> new FuelBlockItem(ModBlocks.BIRCH_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> BIRCH_DRAWER_WITH_DOOR = registerWithTab("birch_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.BIRCH_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_BIRCH_CABINET = registerWithTab("glass_birch_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_BIRCH_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> BIRCH_CABINET_WITH_GLASS_DOORS = registerWithTab("birch_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> BIRCH_SINGLE_DOOR_CABINET = registerWithTab("birch_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.BIRCH_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Jungle Furniture
    public static final RegistryObject<Item> JUNGLE_DRAWER = registerWithTab("jungle_drawer",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> JUNGLE_DRAWER_WITH_DOOR = registerWithTab("jungle_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_JUNGLE_CABINET = registerWithTab("glass_jungle_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_JUNGLE_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> JUNGLE_CABINET_WITH_GLASS_DOORS = registerWithTab("jungle_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> JUNGLE_SINGLE_DOOR_CABINET = registerWithTab("jungle_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Acacia Furniture
    public static final RegistryObject<Item> ACACIA_DRAWER = registerWithTab("acacia_drawer",
            () -> new FuelBlockItem(ModBlocks.ACACIA_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> ACACIA_DRAWER_WITH_DOOR = registerWithTab("acacia_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.ACACIA_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_ACACIA_CABINET = registerWithTab("glass_acacia_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_ACACIA_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> ACACIA_CABINET_WITH_GLASS_DOORS = registerWithTab("acacia_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> ACACIA_SINGLE_DOOR_CABINET = registerWithTab("acacia_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.ACACIA_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Dark Oak Furniture
    public static final RegistryObject<Item> DARK_OAK_DRAWER = registerWithTab("dark_oak_drawer",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> DARK_OAK_DRAWER_WITH_DOOR = registerWithTab("dark_oak_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_DARK_OAK_CABINET = registerWithTab("glass_dark_oak_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_DARK_OAK_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> DARK_OAK_CABINET_WITH_GLASS_DOORS = registerWithTab("dark_oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> DARK_OAK_SINGLE_DOOR_CABINET = registerWithTab("dark_oak_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Mangrove Furniture
    public static final RegistryObject<Item> MANGROVE_DRAWER = registerWithTab("mangrove_drawer",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> MANGROVE_DRAWER_WITH_DOOR = registerWithTab("mangrove_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_MANGROVE_CABINET = registerWithTab("glass_mangrove_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_MANGROVE_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> MANGROVE_CABINET_WITH_GLASS_DOORS = registerWithTab("mangrove_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> MANGROVE_SINGLE_DOOR_CABINET = registerWithTab("mangrove_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Cherry Furniture
    public static final RegistryObject<Item> CHERRY_DRAWER = registerWithTab("cherry_drawer",
            () -> new FuelBlockItem(ModBlocks.CHERRY_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> CHERRY_DRAWER_WITH_DOOR = registerWithTab("cherry_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.CHERRY_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_CHERRY_CABINET = registerWithTab("glass_cherry_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_CHERRY_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> CHERRY_CABINET_WITH_GLASS_DOORS = registerWithTab("cherry_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.CHERRY_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> CHERRY_SINGLE_DOOR_CABINET = registerWithTab("cherry_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.CHERRY_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Bamboo Furniture
    public static final RegistryObject<Item> BAMBOO_DRAWER = registerWithTab("bamboo_drawer",
            () -> new FuelBlockItem(ModBlocks.BAMBOO_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> BAMBOO_DRAWER_WITH_DOOR = registerWithTab("bamboo_drawer_with_door",
            () -> new FuelBlockItem(ModBlocks.BAMBOO_DRAWER_WITH_DOOR.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_BAMBOO_CABINET = registerWithTab("glass_bamboo_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_BAMBOO_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> BAMBOO_CABINET_WITH_GLASS_DOORS = registerWithTab("bamboo_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.BAMBOO_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> BAMBOO_SINGLE_DOOR_CABINET = registerWithTab("bamboo_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.BAMBOO_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    // Crimson Furniture
    public static final RegistryObject<Item> CRIMSON_CABINET = registerWithTab("crimson_drawer",
            () -> new BlockItem(ModBlocks.CRIMSON_DRAWER.get(), basicItem()));

    public static final RegistryObject<Item> CRIMSON_CABINET_WITH_DOOR = registerWithTab("crimson_drawer_with_door",
            () -> new BlockItem(ModBlocks.CRIMSON_DRAWER_WITH_DOOR.get(), basicItem()));

    public static final RegistryObject<Item> GLASS_CRIMSON_CABINET = registerWithTab("glass_crimson_cabinet",
            () -> new BlockItem(ModBlocks.GLASS_CRIMSON_CABINET.get(), basicItem()));

    public static final RegistryObject<Item> CRIMSON_CABINET_WITH_GLASS_DOORS = registerWithTab("crimson_cabinet_with_glass_doors",
            () -> new BlockItem(ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS.get(), basicItem()));

    public static final RegistryObject<Item> CRIMSON_SINGLE_DOOR_CABINET = registerWithTab("crimson_single_door_cabinet",
            () -> new BlockItem(ModBlocks.CRIMSON_SINGLE_DOOR_CABINET.get(), basicItem()));

    // Warped Furniture
    public static final RegistryObject<Item> WARPED_DRAWER = registerWithTab("warped_drawer",
            () -> new BlockItem(ModBlocks.WARPED_DRAWER.get(), basicItem()));

    public static final RegistryObject<Item> WARPED_DRAWER_WITH_DOOR = registerWithTab("warped_drawer_with_door",
            () -> new BlockItem(ModBlocks.WARPED_DRAWER_WITH_DOOR.get(), basicItem()));

    public static final RegistryObject<Item> GLASS_WARPED_CABINET = registerWithTab("glass_warped_cabinet",
            () -> new BlockItem(ModBlocks.GLASS_WARPED_CABINET.get(), basicItem()));

    public static final RegistryObject<Item> WARPED_CABINET_WITH_GLASS_DOORS = registerWithTab("warped_cabinet_with_glass_doors",
            () -> new BlockItem(ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS.get(), basicItem()));

    public static final RegistryObject<Item> WARPED_SINGLE_DOOR_CABINET = registerWithTab("warped_single_door_cabinet",
            () -> new BlockItem(ModBlocks.WARPED_SINGLE_DOOR_CABINET.get(), basicItem()));
}
