package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.DrawerBlock;
import com.axperty.storagedelight.block.DrawerDoorBlock;
import com.axperty.storagedelight.block.DrawerBooksBlock;
import com.axperty.storagedelight.block.GlassCabinetBlock;
import com.axperty.storagedelight.block.CabinetVariantBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StorageDelight.MOD_ID);

    // Oak Furniture
    public static final DeferredBlock<Block> OAK_DRAWER = BLOCKS.register("oak_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> OAK_DRAWER_WITH_DOOR = BLOCKS.register("oak_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> OAK_DRAWER_WITH_BOOKS = BLOCKS.register("oak_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_OAK_CABINET = BLOCKS.register("glass_oak_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register("oak_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> OAK_SINGLE_DOOR_CABINET = BLOCKS.register("oak_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Birch Furniture
    public static final DeferredBlock<Block> BIRCH_DRAWER = BLOCKS.register("birch_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BIRCH_DRAWER_WITH_DOOR = BLOCKS.register("birch_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BIRCH_DRAWER_WITH_BOOKS = BLOCKS.register("birch_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_BIRCH_CABINET = BLOCKS.register("glass_birch_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BIRCH_CABINET_WITH_GLASS_DOORS = BLOCKS.register("birch_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BIRCH_SINGLE_DOOR_CABINET = BLOCKS.register("birch_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Spruce Furniture
    public static final DeferredBlock<Block> SPRUCE_DRAWER = BLOCKS.register("spruce_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> SPRUCE_DRAWER_WITH_DOOR = BLOCKS.register("spruce_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> SPRUCE_DRAWER_WITH_BOOKS = BLOCKS.register("spruce_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_SPRUCE_CABINET = BLOCKS.register("glass_spruce_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> SPRUCE_CABINET_WITH_GLASS_DOORS = BLOCKS.register("spruce_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> SPRUCE_SINGLE_DOOR_CABINET = BLOCKS.register("spruce_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Jungle Furniture
    public static final DeferredBlock<Block> JUNGLE_DRAWER = BLOCKS.register("jungle_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> JUNGLE_DRAWER_WITH_DOOR = BLOCKS.register("jungle_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> JUNGLE_DRAWER_WITH_BOOKS = BLOCKS.register("jungle_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_JUNGLE_CABINET = BLOCKS.register("glass_jungle_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> JUNGLE_CABINET_WITH_GLASS_DOORS = BLOCKS.register("jungle_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> JUNGLE_SINGLE_DOOR_CABINET = BLOCKS.register("jungle_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Acacia Furniture
    public static final DeferredBlock<Block> ACACIA_DRAWER = BLOCKS.register("acacia_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> ACACIA_DRAWER_WITH_DOOR = BLOCKS.register("acacia_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> ACACIA_DRAWER_WITH_BOOKS = BLOCKS.register("acacia_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_ACACIA_CABINET = BLOCKS.register("glass_acacia_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> ACACIA_CABINET_WITH_GLASS_DOORS = BLOCKS.register("acacia_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> ACACIA_SINGLE_DOOR_CABINET = BLOCKS.register("acacia_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Dark Oak Furniture
    public static final DeferredBlock<Block> DARK_OAK_DRAWER = BLOCKS.register("dark_oak_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> DARK_OAK_DRAWER_WITH_DOOR = BLOCKS.register("dark_oak_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> DARK_OAK_DRAWER_WITH_BOOKS = BLOCKS.register("dark_oak_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_DARK_OAK_CABINET = BLOCKS.register("glass_dark_oak_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> DARK_OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register("dark_oak_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> DARK_OAK_SINGLE_DOOR_CABINET = BLOCKS.register("dark_oak_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Mangrove Furniture
    public static final DeferredBlock<Block> MANGROVE_DRAWER = BLOCKS.register("mangrove_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> MANGROVE_DRAWER_WITH_DOOR = BLOCKS.register("mangrove_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> MANGROVE_DRAWER_WITH_BOOKS = BLOCKS.register("mangrove_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_MANGROVE_CABINET = BLOCKS.register("glass_mangrove_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> MANGROVE_CABINET_WITH_GLASS_DOORS = BLOCKS.register("mangrove_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> MANGROVE_SINGLE_DOOR_CABINET = BLOCKS.register("mangrove_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Cherry Furniture
    public static final DeferredBlock<Block> CHERRY_DRAWER = BLOCKS.register("cherry_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CHERRY_DRAWER_WITH_DOOR = BLOCKS.register("cherry_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CHERRY_DRAWER_WITH_BOOKS = BLOCKS.register("cherry_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_CHERRY_CABINET = BLOCKS.register("glass_cherry_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CHERRY_CABINET_WITH_GLASS_DOORS = BLOCKS.register("cherry_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CHERRY_SINGLE_DOOR_CABINET = BLOCKS.register("cherry_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Bamboo Furniture
    public static final DeferredBlock<Block> BAMBOO_DRAWER = BLOCKS.register("bamboo_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BAMBOO_DRAWER_WITH_DOOR = BLOCKS.register("bamboo_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BAMBOO_DRAWER_WITH_BOOKS = BLOCKS.register("bamboo_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_BAMBOO_CABINET = BLOCKS.register("glass_bamboo_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BAMBOO_CABINET_WITH_GLASS_DOORS = BLOCKS.register("bamboo_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> BAMBOO_SINGLE_DOOR_CABINET = BLOCKS.register("bamboo_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Crimson Furniture
    public static final DeferredBlock<Block> CRIMSON_DRAWER = BLOCKS.register("crimson_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CRIMSON_DRAWER_WITH_DOOR = BLOCKS.register("crimson_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CRIMSON_DRAWER_WITH_BOOKS = BLOCKS.register("crimson_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_CRIMSON_CABINET = BLOCKS.register("glass_crimson_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CRIMSON_CABINET_WITH_GLASS_DOORS = BLOCKS.register("crimson_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> CRIMSON_SINGLE_DOOR_CABINET = BLOCKS.register("crimson_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));

    // Warped Furniture
    public static final DeferredBlock<Block> WARPED_DRAWER = BLOCKS.register("warped_drawer",
            registryName -> new DrawerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> WARPED_DRAWER_WITH_DOOR = BLOCKS.register("warped_drawer_with_door",
            registryName -> new DrawerDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> WARPED_DRAWER_WITH_BOOKS = BLOCKS.register("warped_drawer_with_books",
            registryName -> new DrawerBooksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> GLASS_WARPED_CABINET = BLOCKS.register("glass_warped_cabinet",
            registryName -> new GlassCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> WARPED_CABINET_WITH_GLASS_DOORS = BLOCKS.register("warped_cabinet_with_glass_doors",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
    public static final DeferredBlock<Block> WARPED_SINGLE_DOOR_CABINET = BLOCKS.register("warped_single_door_cabinet",
            registryName -> new CabinetVariantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD).setId(ResourceKey.create(Registries.BLOCK, registryName))));
}
