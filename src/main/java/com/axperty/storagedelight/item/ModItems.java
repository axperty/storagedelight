package com.axperty.storagedelight.item;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.registry.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.FuelBlockItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StorageDelight.MOD_ID);

    public static Item.Properties basicItem() {
        return new Item.Properties().tab(StorageDelight.CREATIVE_TAB);
    }

    // Drawers
    public static final RegistryObject<Item> OAK_DRAWER = ITEMS.register("oak_drawer",
            () -> new FuelBlockItem(ModBlocks.OAK_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> SPRUCE_DRAWER = ITEMS.register("spruce_drawer",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> BIRCH_DRAWER = ITEMS.register("birch_drawer",
            () -> new FuelBlockItem(ModBlocks.BIRCH_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> JUNGLE_DRAWER = ITEMS.register("jungle_drawer",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> ACACIA_DRAWER = ITEMS.register("acacia_drawer",
            () -> new FuelBlockItem(ModBlocks.ACACIA_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> DARK_OAK_DRAWER = ITEMS.register("dark_oak_drawer",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> MANGROVE_DRAWER = ITEMS.register("mangrove_drawer",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_DRAWER.get(), basicItem(), 300));

    public static final RegistryObject<Item> CRIMSON_DRAWER = ITEMS.register("crimson_drawer",
            () -> new BlockItem(ModBlocks.CRIMSON_DRAWER.get(), basicItem()));

    public static final RegistryObject<Item> WARPED_DRAWER = ITEMS.register("warped_drawer",
            () -> new BlockItem(ModBlocks.WARPED_DRAWER.get(), basicItem()));

    // Glass Cabinets
    public static final RegistryObject<Item> GLASS_OAK_CABINET = ITEMS.register("glass_oak_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_OAK_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_SPRUCE_CABINET = ITEMS.register("glass_spruce_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_SPRUCE_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_BIRCH_CABINET = ITEMS.register("glass_birch_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_BIRCH_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_JUNGLE_CABINET = ITEMS.register("glass_jungle_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_JUNGLE_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_ACACIA_CABINET = ITEMS.register("glass_acacia_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_ACACIA_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_DARK_OAK_CABINET = ITEMS.register("glass_dark_oak_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_DARK_OAK_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_MANGROVE_CABINET = ITEMS.register("glass_mangrove_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_MANGROVE_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> GLASS_CRIMSON_CABINET = ITEMS.register("glass_crimson_cabinet",
            () -> new BlockItem(ModBlocks.GLASS_CRIMSON_CABINET.get(), basicItem()));

    public static final RegistryObject<Item> GLASS_WARPED_CABINET = ITEMS.register("glass_warped_cabinet",
            () -> new BlockItem(ModBlocks.GLASS_WARPED_CABINET.get(), basicItem()));

    // Cabinets with Glass Doors
    public static final RegistryObject<Item> OAK_CABINET_WITH_GLASS_DOORS = ITEMS.register("oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.OAK_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> SPRUCE_CABINET_WITH_GLASS_DOORS = ITEMS.register("spruce_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> BIRCH_CABINET_WITH_GLASS_DOORS = ITEMS.register("birch_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> JUNGLE_CABINET_WITH_GLASS_DOORS = ITEMS.register("jungle_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> ACACIA_CABINET_WITH_GLASS_DOORS = ITEMS.register("acacia_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> DARK_OAK_CABINET_WITH_GLASS_DOORS = ITEMS.register("dark_oak_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> MANGROVE_CABINET_WITH_GLASS_DOORS = ITEMS.register("mangrove_cabinet_with_glass_doors",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), basicItem(), 300));

    public static final RegistryObject<Item> CRIMSON_CABINET_WITH_GLASS_DOORS = ITEMS.register("crimson_cabinet_with_glass_doors",
            () -> new BlockItem(ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS.get(), basicItem()));

    public static final RegistryObject<Item> WARPED_CABINET_WITH_GLASS_DOORS = ITEMS.register("warped_cabinet_with_glass_doors",
            () -> new BlockItem(ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS.get(), basicItem()));

    // Single Door Cabinets
    public static final RegistryObject<Item> OAK_SINGLE_DOOR_CABINET = ITEMS.register("oak_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.OAK_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> SPRUCE_SINGLE_DOOR_CABINET = ITEMS.register("spruce_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> BIRCH_SINGLE_DOOR_CABINET = ITEMS.register("birch_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.BIRCH_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> JUNGLE_SINGLE_DOOR_CABINET = ITEMS.register("jungle_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> ACACIA_SINGLE_DOOR_CABINET = ITEMS.register("acacia_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.ACACIA_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> DARK_OAK_SINGLE_DOOR_CABINET = ITEMS.register("dark_oak_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> MANGROVE_SINGLE_DOOR_CABINET = ITEMS.register("mangrove_single_door_cabinet",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_SINGLE_DOOR_CABINET.get(), basicItem(), 300));

    public static final RegistryObject<Item> CRIMSON_SINGLE_DOOR_CABINET = ITEMS.register("crimson_single_door_cabinet",
            () -> new BlockItem(ModBlocks.CRIMSON_SINGLE_DOOR_CABINET.get(), basicItem()));

    public static final RegistryObject<Item> WARPED_SINGLE_DOOR_CABINET = ITEMS.register("warped_single_door_cabinet",
            () -> new BlockItem(ModBlocks.WARPED_SINGLE_DOOR_CABINET.get(), basicItem()));

}
