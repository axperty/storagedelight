package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.function.Function;

public class BlockRegistry {

    // Oak Furniture
    public static final Block OAK_DRAWER = registerBlock("oak_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_DRAWER_WITH_DOOR = registerBlock("oak_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_DRAWER_WITH_BOOKS = registerBlock("oak_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_OAK_DRAWERS = registerBlock("small_oak_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_BOOKSHELF_WITH_DOOR = registerBlock("oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_OAK_CABINET = registerBlock("glass_oak_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_GLASS_DOORS = registerBlock("oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_SINGLE_DOOR_CABINET = registerBlock("oak_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("oak_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("oak_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("oak_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("oak_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("oak_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("oak_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Birch Furniture
    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_DRAWER_WITH_DOOR = registerBlock("birch_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_DRAWER_WITH_BOOKS = registerBlock("birch_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_BIRCH_DRAWERS = registerBlock("small_birch_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_BOOKSHELF_WITH_DOOR = registerBlock("birch_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_BIRCH_CABINET = registerBlock("glass_birch_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_GLASS_DOORS = registerBlock("birch_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_SINGLE_DOOR_CABINET = registerBlock("birch_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("birch_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("birch_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("birch_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("birch_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("birch_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("birch_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Spruce Furniture
    public static final Block SPRUCE_DRAWER = registerBlock("spruce_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_DRAWER_WITH_DOOR = registerBlock("spruce_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_DRAWER_WITH_BOOKS = registerBlock("spruce_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_SPRUCE_DRAWERS = registerBlock("small_spruce_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_BOOKSHELF_WITH_DOOR = registerBlock("spruce_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_SPRUCE_CABINET = registerBlock("glass_spruce_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_GLASS_DOORS = registerBlock("spruce_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_SINGLE_DOOR_CABINET = registerBlock("spruce_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("spruce_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Jungle Furniture
    public static final Block JUNGLE_DRAWER = registerBlock("jungle_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_DRAWER_WITH_DOOR = registerBlock("jungle_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_DRAWER_WITH_BOOKS = registerBlock("jungle_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_JUNGLE_DRAWERS = registerBlock("small_jungle_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_BOOKSHELF_WITH_DOOR = registerBlock("jungle_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_JUNGLE_CABINET = registerBlock("glass_jungle_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_GLASS_DOORS = registerBlock("jungle_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_SINGLE_DOOR_CABINET = registerBlock("jungle_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("jungle_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Acacia Furniture
    public static final Block ACACIA_DRAWER = registerBlock("acacia_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_DRAWER_WITH_DOOR = registerBlock("acacia_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_DRAWER_WITH_BOOKS = registerBlock("acacia_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_ACACIA_DRAWERS = registerBlock("small_acacia_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_BOOKSHELF_WITH_DOOR = registerBlock("acacia_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_ACACIA_CABINET = registerBlock("glass_acacia_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_GLASS_DOORS = registerBlock("acacia_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_SINGLE_DOOR_CABINET = registerBlock("acacia_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("acacia_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Dark Oak Furniture
    public static final Block DARK_OAK_DRAWER = registerBlock("dark_oak_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_DRAWER_WITH_DOOR = registerBlock("dark_oak_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_DRAWER_WITH_BOOKS = registerBlock("dark_oak_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_DARK_OAK_DRAWERS = registerBlock("small_dark_oak_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_BOOKSHELF_WITH_DOOR = registerBlock("dark_oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_DARK_OAK_CABINET = registerBlock("glass_dark_oak_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("dark_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_SINGLE_DOOR_CABINET = registerBlock("dark_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("dark_oak_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Mangrove Furniture
    public static final Block MANGROVE_DRAWER = registerBlock("mangrove_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_DRAWER_WITH_DOOR = registerBlock("mangrove_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_DRAWER_WITH_BOOKS = registerBlock("mangrove_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_MANGROVE_DRAWERS = registerBlock("small_mangrove_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_BOOKSHELF_WITH_DOOR = registerBlock("mangrove_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_MANGROVE_CABINET = registerBlock("glass_mangrove_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_GLASS_DOORS = registerBlock("mangrove_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_SINGLE_DOOR_CABINET = registerBlock("mangrove_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("mangrove_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Cherry Furniture
    public static final Block CHERRY_DRAWER = registerBlock("cherry_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_DRAWER_WITH_DOOR = registerBlock("cherry_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_DRAWER_WITH_BOOKS = registerBlock("cherry_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block SMALL_CHERRY_DRAWERS = registerBlock("small_cherry_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_BOOKSHELF_WITH_DOOR = registerBlock("cherry_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block GLASS_CHERRY_CABINET = registerBlock("glass_cherry_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_GLASS_DOORS = registerBlock("cherry_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_SINGLE_DOOR_CABINET = registerBlock("cherry_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("cherry_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("cherry_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("cherry_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("cherry_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("cherry_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);
    public static final Block CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("cherry_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD), 300);

    // Poplar Furniture
    public static final Block POPLAR_CABINET = registerBlock("poplar_cabinet", CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_DRAWER = registerBlock("poplar_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_DRAWER_WITH_DOOR = registerBlock("poplar_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_DRAWER_WITH_BOOKS = registerBlock("poplar_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_POPLAR_DRAWERS = registerBlock("small_poplar_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_BOOKSHELF_WITH_DOOR = registerBlock("poplar_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_POPLAR_CABINET = registerBlock("glass_poplar_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_GLASS_DOORS = registerBlock("poplar_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_SINGLE_DOOR_CABINET = registerBlock("poplar_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("poplar_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("poplar_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("poplar_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("poplar_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("poplar_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block POPLAR_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("poplar_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Pale Oak Furniture
    public static final Block PALE_OAK_CABINET = registerBlock("pale_oak_cabinet", CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_DRAWER = registerBlock("pale_oak_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_DRAWER_WITH_DOOR = registerBlock("pale_oak_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_DRAWER_WITH_BOOKS = registerBlock("pale_oak_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block SMALL_PALE_OAK_DRAWERS = registerBlock("small_pale_oak_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_BOOKSHELF_WITH_DOOR = registerBlock("pale_oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block GLASS_PALE_OAK_CABINET = registerBlock("glass_pale_oak_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("pale_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_SINGLE_DOOR_CABINET = registerBlock("pale_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("pale_oak_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("pale_oak_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("pale_oak_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("pale_oak_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("pale_oak_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);
    public static final Block PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("pale_oak_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL), 300);

    // Bamboo Furniture
    public static final Block BAMBOO_DRAWER = registerBlock("bamboo_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_DRAWER_WITH_DOOR = registerBlock("bamboo_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_DRAWER_WITH_BOOKS = registerBlock("bamboo_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block SMALL_BAMBOO_DRAWERS = registerBlock("small_bamboo_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_BOOKSHELF_WITH_DOOR = registerBlock("bamboo_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block GLASS_BAMBOO_CABINET = registerBlock("glass_bamboo_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_GLASS_DOORS = registerBlock("bamboo_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_SINGLE_DOOR_CABINET = registerBlock("bamboo_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("bamboo_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("bamboo_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("bamboo_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("bamboo_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("bamboo_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);
    public static final Block BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("bamboo_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD), 300);

    // Crimson Furniture
    public static final Block CRIMSON_DRAWER = registerBlock("crimson_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_DRAWER_WITH_DOOR = registerBlock("crimson_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_DRAWER_WITH_BOOKS = registerBlock("crimson_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block SMALL_CRIMSON_DRAWERS = registerBlock("small_crimson_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_BOOKSHELF_WITH_DOOR = registerBlock("crimson_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block GLASS_CRIMSON_CABINET = registerBlock("glass_crimson_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_GLASS_DOORS = registerBlock("crimson_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_SINGLE_DOOR_CABINET = registerBlock("crimson_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("crimson_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));

    // Warped Furniture
    public static final Block WARPED_DRAWER = registerBlock("warped_drawer", DrawerBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_DRAWER_WITH_DOOR = registerBlock("warped_drawer_with_door", DrawerDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_DRAWER_WITH_BOOKS = registerBlock("warped_drawer_with_books", DrawerBooksBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block SMALL_WARPED_DRAWERS = registerBlock("small_warped_drawers", SmallDrawersBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_BOOKSHELF_WITH_DOOR = registerBlock("warped_bookshelf_with_door", BookshelfDoorBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block GLASS_WARPED_CABINET = registerBlock("glass_warped_cabinet", GlassCabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_GLASS_DOORS = registerBlock("warped_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_SINGLE_DOOR_CABINET = registerBlock("warped_single_door_cabinet", CabinetVariantBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("warped_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("warped_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = registerBlock("warped_cabinet_with_polished_tuff_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = registerBlock("warped_cabinet_with_polished_blackstone_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = registerBlock("warped_cabinet_with_polished_diorite_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP = registerBlock("warped_cabinet_with_stone_bricks_countertop", CabinetCountertopBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));

    private static Block registerBlock(String path, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return registerBlock(path, factory, settings, 0);
    }

    private static Block registerBlock(String path, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, int fuelBurnTime) {
        final Identifier identifier = Identifier.fromNamespaceAndPath(StorageDelight.MOD_ID, path);
        final ResourceKey<Block> registryKey = ResourceKey.create(Registries.BLOCK, identifier);
        final Block block = factory.apply(settings.setId(registryKey));
        Registry.register(BuiltInRegistries.BLOCK, registryKey, block);
        // Fix for Fabric fuel change
        Item.Properties itemSettings = new Item.Properties();
        if (fuelBurnTime > 0) {
            itemSettings = itemSettings.component(DataComponents.COOKING_FUEL, new CookingFuel(
                    new ResolvableInt.Constant(fuelBurnTime),
                    ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)
            ));
        }
        registerItem(path, blockItemSettings -> new BlockItem(block, blockItemSettings), itemSettings);
        return block;
    }

    public static Item registerItem(String path, Function<Item.Properties, Item> factory, Item.Properties settings) {
        final ResourceKey<Item> registryKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StorageDelight.MOD_ID, path));
        Item item = factory.apply(settings.setId(registryKey));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }
        return Registry.register(BuiltInRegistries.ITEM, registryKey, item);
    }

    public static void register() {}
}
