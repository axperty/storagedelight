package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.DrawerBlock;
import com.axperty.storagedelight.block.DrawerDoorBlock;
import com.axperty.storagedelight.block.GlassCabinetBlock;
import com.axperty.storagedelight.block.CabinetVariantBlock;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlockRegistry {

    // Oak Furniture Registry
    public static final Block OAK_DRAWER = registerBlock("oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_DRAWER_WITH_DOOR = registerBlock("oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_OAK_CABINET = registerBlock("glass_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_CABINET_WITH_GLASS_DOORS = registerBlock("oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_SINGLE_DOOR_CABINET = registerBlock("oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Birch Furniture Registry
    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_DRAWER_WITH_DOOR = registerBlock("birch_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_BIRCH_CABINET = registerBlock("glass_birch_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_CABINET_WITH_GLASS_DOORS = registerBlock("birch_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_SINGLE_DOOR_CABINET = registerBlock("birch_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Spruce Furniture Registry
    public static final Block SPRUCE_DRAWER = registerBlock("spruce_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_DRAWER_WITH_DOOR = registerBlock("spruce_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_SPRUCE_CABINET = registerBlock("glass_spruce_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_CABINET_WITH_GLASS_DOORS = registerBlock("spruce_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_SINGLE_DOOR_CABINET = registerBlock("spruce_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Jungle Furniture Registry
    public static final Block JUNGLE_DRAWER = registerBlock("jungle_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_DRAWER_WITH_DOOR = registerBlock("jungle_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_JUNGLE_CABINET = registerBlock("glass_jungle_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_CABINET_WITH_GLASS_DOORS = registerBlock("jungle_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_SINGLE_DOOR_CABINET = registerBlock("jungle_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Acacia Furniture Registry
    public static final Block ACACIA_DRAWER = registerBlock("acacia_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_DRAWER_WITH_DOOR = registerBlock("acacia_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_ACACIA_CABINET = registerBlock("glass_acacia_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_CABINET_WITH_GLASS_DOORS = registerBlock("acacia_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_SINGLE_DOOR_CABINET = registerBlock("acacia_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Dark Oak Furniture Registry
    public static final Block DARK_OAK_DRAWER = registerBlock("dark_oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_DRAWER_WITH_DOOR = registerBlock("dark_oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_DARK_OAK_CABINET = registerBlock("glass_dark_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("dark_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_SINGLE_DOOR_CABINET = registerBlock("dark_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Mangrove Furniture Registry
    public static final Block MANGROVE_DRAWER = registerBlock("mangrove_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_DRAWER_WITH_DOOR = registerBlock("mangrove_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_MANGROVE_CABINET = registerBlock("glass_mangrove_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_CABINET_WITH_GLASS_DOORS = registerBlock("mangrove_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_SINGLE_DOOR_CABINET = registerBlock("mangrove_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Cherry Furniture Registry
    public static final Block CHERRY_DRAWER = registerBlock("cherry_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CHERRY_DRAWER_WITH_DOOR = registerBlock("cherry_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_CHERRY_CABINET = registerBlock("glass_cherry_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CHERRY_CABINET_WITH_GLASS_DOORS = registerBlock("cherry_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CHERRY_SINGLE_DOOR_CABINET = registerBlock("cherry_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Pale Oak Furniture Registry
    public static final Block PALE_OAK_DRAWER = registerBlock("pale_oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block PALE_OAK_DRAWER_WITH_DOOR = registerBlock("pale_oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_PALE_OAK_CABINET = registerBlock("glass_pale_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block PALE_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("pale_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block PALE_OAK_SINGLE_DOOR_CABINET = registerBlock("pale_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Bamboo Furniture Registry
    public static final Block BAMBOO_DRAWER = registerBlock("bamboo_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BAMBOO_DRAWER_WITH_DOOR = registerBlock("bamboo_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_BAMBOO_CABINET = registerBlock("glass_bamboo_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BAMBOO_CABINET_WITH_GLASS_DOORS = registerBlock("bamboo_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BAMBOO_SINGLE_DOOR_CABINET = registerBlock("bamboo_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Crimson Furniture Registry
    public static final Block CRIMSON_DRAWER = registerBlock("crimson_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_DRAWER_WITH_DOOR = registerBlock("crimson_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_CRIMSON_CABINET = registerBlock("glass_crimson_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_CABINET_WITH_GLASS_DOORS = registerBlock("crimson_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_SINGLE_DOOR_CABINET = registerBlock("crimson_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Warped Furniture Registry
    public static final Block WARPED_DRAWER = registerBlock("warped_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_DRAWER_WITH_DOOR = registerBlock("warped_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_WARPED_CABINET = registerBlock("glass_warped_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_CABINET_WITH_GLASS_DOORS = registerBlock("warped_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_SINGLE_DOOR_CABINET = registerBlock("warped_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(StorageDelight.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, factory, settings);
        registerItem(path, itemSettings -> new BlockItem(block, itemSettings), new Item.Settings());
        return block;
    }

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(StorageDelight.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void register() {
        StorageDelight.LOGGER.info("Registering blocks for " + StorageDelight.MOD_ID);
    }
}
