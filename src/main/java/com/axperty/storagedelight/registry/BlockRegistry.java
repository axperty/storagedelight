package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.CabinetVariantBlock;
import com.axperty.storagedelight.block.DrawerBlock;
import com.axperty.storagedelight.block.DrawerDoorBlock;
import com.axperty.storagedelight.block.GlassCabinetBlock;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StorageDelight.MOD_ID);

    // Oak Furniture
    public static final RegistryObject<Block> OAK_DRAWER = BLOCKS.register("oak_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_DRAWER_WITH_DOOR = BLOCKS.register("oak_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_OAK_CABINET = BLOCKS.register("glass_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register("oak_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_SINGLE_DOOR_CABINET = BLOCKS.register("oak_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Spruce Furniture
    public static final RegistryObject<Block> SPRUCE_DRAWER = BLOCKS.register("spruce_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_DRAWER_WITH_DOOR = BLOCKS.register("spruce_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_SPRUCE_CABINET = BLOCKS.register("glass_spruce_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_GLASS_DOORS = BLOCKS.register("spruce_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_SINGLE_DOOR_CABINET = BLOCKS.register("spruce_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Birch Furniture
    public static final RegistryObject<Block> BIRCH_DRAWER = BLOCKS.register("birch_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_DRAWER_WITH_DOOR = BLOCKS.register("birch_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_BIRCH_CABINET = BLOCKS.register("glass_birch_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_GLASS_DOORS = BLOCKS.register("birch_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_SINGLE_DOOR_CABINET = BLOCKS.register("birch_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Jungle Furniture
    public static final RegistryObject<Block> JUNGLE_DRAWER = BLOCKS.register("jungle_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_DRAWER_WITH_DOOR = BLOCKS.register("jungle_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_JUNGLE_CABINET = BLOCKS.register("glass_jungle_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_GLASS_DOORS = BLOCKS.register("jungle_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_SINGLE_DOOR_CABINET = BLOCKS.register("jungle_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Acacia Furniture
    public static final RegistryObject<Block> ACACIA_DRAWER = BLOCKS.register("acacia_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_DRAWER_WITH_DOOR = BLOCKS.register("acacia_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_ACACIA_CABINET = BLOCKS.register("glass_acacia_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_GLASS_DOORS = BLOCKS.register("acacia_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_SINGLE_DOOR_CABINET = BLOCKS.register("acacia_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Dark Oak Furniture
    public static final RegistryObject<Block> DARK_OAK_DRAWER = BLOCKS.register("dark_oak_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_DRAWER_WITH_DOOR = BLOCKS.register("dark_oak_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_DARK_OAK_CABINET = BLOCKS.register("glass_dark_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register("dark_oak_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_SINGLE_DOOR_CABINET = BLOCKS.register("dark_oak_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Mangrove Furniture
    public static final RegistryObject<Block> MANGROVE_DRAWER = BLOCKS.register("mangrove_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MANGROVE_DRAWER_WITH_DOOR = BLOCKS.register("mangrove_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_MANGROVE_CABINET = BLOCKS.register("glass_mangrove_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_GLASS_DOORS = BLOCKS.register("mangrove_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MANGROVE_SINGLE_DOOR_CABINET = BLOCKS.register("mangrove_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Crimson Furniture
    public static final RegistryObject<Block> CRIMSON_DRAWER = BLOCKS.register("crimson_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_DRAWER_WITH_DOOR = BLOCKS.register("crimson_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_CRIMSON_CABINET = BLOCKS.register("glass_crimson_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_GLASS_DOORS = BLOCKS.register("crimson_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_SINGLE_DOOR_CABINET = BLOCKS.register("crimson_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));

    // Warped Furniture
    public static final RegistryObject<Block> WARPED_DRAWER = BLOCKS.register("warped_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_DRAWER_WITH_DOOR = BLOCKS.register("warped_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_WARPED_CABINET = BLOCKS.register("glass_warped_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_GLASS_DOORS = BLOCKS.register("warped_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_SINGLE_DOOR_CABINET = BLOCKS.register("warped_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.copy(Blocks.BARREL)));
}
