package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;

public class EntityTypesRegistry {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(StorageDelight.MOD_ID, path), blockEntityType);
    }

    // Drawers
    public static final BlockEntityType<DrawerBlockEntity> DRAWER = register(
            "drawer", FabricBlockEntityTypeBuilder.create(DrawerBlockEntity::new,
                            BlockRegistry.OAK_DRAWER,
                            BlockRegistry.BIRCH_DRAWER,
                            BlockRegistry.SPRUCE_DRAWER,
                            BlockRegistry.JUNGLE_DRAWER,
                            BlockRegistry.ACACIA_DRAWER,
                            BlockRegistry.DARK_OAK_DRAWER,
                            BlockRegistry.BAMBOO_DRAWER,
                            BlockRegistry.CHERRY_DRAWER,
                            BlockRegistry.POPLAR_DRAWER,
                            BlockRegistry.PALE_OAK_DRAWER,
                            BlockRegistry.MANGROVE_DRAWER,
                            BlockRegistry.CRIMSON_DRAWER,
                            BlockRegistry.WARPED_DRAWER)
                    .build()
    );

    // Drawers with Doors
    public static final BlockEntityType<DrawerDoorBlockEntity> DRAWER_DOOR = register(
            "drawer_door", FabricBlockEntityTypeBuilder.create(DrawerDoorBlockEntity::new,
                            BlockRegistry.OAK_DRAWER_WITH_DOOR,
                            BlockRegistry.BIRCH_DRAWER_WITH_DOOR,
                            BlockRegistry.SPRUCE_DRAWER_WITH_DOOR,
                            BlockRegistry.JUNGLE_DRAWER_WITH_DOOR,
                            BlockRegistry.ACACIA_DRAWER_WITH_DOOR,
                            BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR,
                            BlockRegistry.BAMBOO_DRAWER_WITH_DOOR,
                            BlockRegistry.CHERRY_DRAWER_WITH_DOOR,
                            BlockRegistry.POPLAR_DRAWER_WITH_DOOR,
                            BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR,
                            BlockRegistry.MANGROVE_DRAWER_WITH_DOOR,
                            BlockRegistry.CRIMSON_DRAWER_WITH_DOOR,
                            BlockRegistry.WARPED_DRAWER_WITH_DOOR)
                    .build()
    );

    // Drawers with Books
    public static final BlockEntityType<DrawerBooksBlockEntity> DRAWER_BOOKS = register(
            "drawer_books", FabricBlockEntityTypeBuilder.create(DrawerBooksBlockEntity::new,
                            BlockRegistry.OAK_DRAWER_WITH_BOOKS,
                            BlockRegistry.BIRCH_DRAWER_WITH_BOOKS,
                            BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS,
                            BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS,
                            BlockRegistry.ACACIA_DRAWER_WITH_BOOKS,
                            BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS,
                            BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS,
                            BlockRegistry.CHERRY_DRAWER_WITH_BOOKS,
                            BlockRegistry.POPLAR_DRAWER_WITH_BOOKS,
                            BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS,
                            BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS,
                            BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS,
                            BlockRegistry.WARPED_DRAWER_WITH_BOOKS)
                    .build()
    );

    // Glass Cabinets
    public static final BlockEntityType<GlassCabinetBlockEntity> GLASS_CABINET = register(
            "glass_cabinet", FabricBlockEntityTypeBuilder.create(GlassCabinetBlockEntity::new,
                            BlockRegistry.GLASS_OAK_CABINET,
                            BlockRegistry.GLASS_BIRCH_CABINET,
                            BlockRegistry.GLASS_SPRUCE_CABINET,
                            BlockRegistry.GLASS_JUNGLE_CABINET,
                            BlockRegistry.GLASS_ACACIA_CABINET,
                            BlockRegistry.GLASS_DARK_OAK_CABINET,
                            BlockRegistry.GLASS_BAMBOO_CABINET,
                            BlockRegistry.GLASS_CHERRY_CABINET,
                            BlockRegistry.GLASS_POPLAR_CABINET,
                            BlockRegistry.GLASS_PALE_OAK_CABINET,
                            BlockRegistry.GLASS_MANGROVE_CABINET,
                            BlockRegistry.GLASS_CRIMSON_CABINET,
                            BlockRegistry.GLASS_WARPED_CABINET)
                    .build()
    );

    // Cabinets with Glass Doors and Single Door Cabinets
    public static final BlockEntityType<CabinetVariantBlockEntity> CABINET_VARIANT = register(
            "cabinet_variant", FabricBlockEntityTypeBuilder.create(CabinetVariantBlockEntity::new,
                            BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.POPLAR_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS,
                            BlockRegistry.OAK_SINGLE_DOOR_CABINET,
                            BlockRegistry.BIRCH_SINGLE_DOOR_CABINET,
                            BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET,
                            BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET,
                            BlockRegistry.ACACIA_SINGLE_DOOR_CABINET,
                            BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET,
                            BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET,
                            BlockRegistry.CHERRY_SINGLE_DOOR_CABINET,
                            BlockRegistry.POPLAR_SINGLE_DOOR_CABINET,
                            BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET,
                            BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET,
                            BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET,
                            BlockRegistry.WARPED_SINGLE_DOOR_CABINET)
                    .build()
    );

    // Bookshelves with Doors
    public static final BlockEntityType<BookshelfDoorBlockEntity> BOOKSHELF_DOOR = register(
            "bookshelf_door", FabricBlockEntityTypeBuilder.create(BookshelfDoorBlockEntity::new,
                            BlockRegistry.OAK_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.POPLAR_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR,
                            BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR)
                    .build()
    );

    // Small Drawers
    public static final BlockEntityType<SmallDrawersBlockEntity> SMALL_DRAWERS = register(
            "small_drawers", FabricBlockEntityTypeBuilder.create(SmallDrawersBlockEntity::new,
                            BlockRegistry.SMALL_OAK_DRAWERS,
                            BlockRegistry.SMALL_BIRCH_DRAWERS,
                            BlockRegistry.SMALL_SPRUCE_DRAWERS,
                            BlockRegistry.SMALL_JUNGLE_DRAWERS,
                            BlockRegistry.SMALL_ACACIA_DRAWERS,
                            BlockRegistry.SMALL_DARK_OAK_DRAWERS,
                            BlockRegistry.SMALL_BAMBOO_DRAWERS,
                            BlockRegistry.SMALL_CHERRY_DRAWERS,
                            BlockRegistry.SMALL_POPLAR_DRAWERS,
                            BlockRegistry.SMALL_PALE_OAK_DRAWERS,
                            BlockRegistry.SMALL_MANGROVE_DRAWERS,
                            BlockRegistry.SMALL_CRIMSON_DRAWERS,
                            BlockRegistry.SMALL_WARPED_DRAWERS)
                    .build()
    );

    // Cabinets with Countertops
    public static final BlockEntityType<CabinetCountertopBlockEntity> COUNTERTOP = register(
            "countertop", FabricBlockEntityTypeBuilder.create(CabinetCountertopBlockEntity::new,
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP,
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.POPLAR_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP,
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.POPLAR_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP,
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.POPLAR_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP,
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP,
                            BlockRegistry.OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.POPLAR_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP,
                            BlockRegistry.WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP)
                    .build()
    );

    public static final BlockEntityType<CabinetBlockEntity> CABINET = register(
            "cabinet", FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
                            BlockRegistry.PALE_OAK_CABINET,
                            BlockRegistry.POPLAR_CABINET)
                    .build()
    );

    public static void register() {}
}
