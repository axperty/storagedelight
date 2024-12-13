package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class EntityTypesRegistry {
    public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StorageDelight.MOD_ID);

    public static final RegistryObject<BlockEntityType<DrawerBlockEntity>> DRAWER = TILES.register("drawer",
            () -> new BlockEntityType<>(DrawerBlockEntity::new, Set.of(
                            BlockRegistry.OAK_DRAWER.get(),
                            BlockRegistry.BIRCH_DRAWER.get(),
                            BlockRegistry.SPRUCE_DRAWER.get(),
                            BlockRegistry.JUNGLE_DRAWER.get(),
                            BlockRegistry.ACACIA_DRAWER.get(),
                            BlockRegistry.DARK_OAK_DRAWER.get(),
                            BlockRegistry.BAMBOO_DRAWER.get(),
                            BlockRegistry.CHERRY_DRAWER.get(),
                            BlockRegistry.PALE_OAK_DRAWER.get(),
                            BlockRegistry.MANGROVE_DRAWER.get(),
                            BlockRegistry.CRIMSON_DRAWER.get(),
                            BlockRegistry.WARPED_DRAWER.get()
            )));

    public static final RegistryObject<BlockEntityType<DrawerDoorBlockEntity>> DRAWER_DOOR = TILES.register("drawer_door",
            () -> new BlockEntityType<>(DrawerDoorBlockEntity::new, Set.of(
                            BlockRegistry.OAK_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.WARPED_DRAWER_WITH_DOOR.get()
            )));

    public static final RegistryObject<BlockEntityType<DrawerBooksBlockEntity>> DRAWER_BOOKS = TILES.register("drawer_books",
            () -> new BlockEntityType<>(DrawerBooksBlockEntity::new, Set.of(
                    BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.CHERRY_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get(),
                    BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get()
            )));

    public static final RegistryObject<BlockEntityType<GlassCabinetBlockEntity>> GLASS_CABINET = TILES.register("glass_cabinet",
            () -> new BlockEntityType<>(GlassCabinetBlockEntity::new, Set.of(
                            BlockRegistry.GLASS_OAK_CABINET.get(),
                            BlockRegistry.GLASS_BIRCH_CABINET.get(),
                            BlockRegistry.GLASS_SPRUCE_CABINET.get(),
                            BlockRegistry.GLASS_JUNGLE_CABINET.get(),
                            BlockRegistry.GLASS_ACACIA_CABINET.get(),
                            BlockRegistry.GLASS_DARK_OAK_CABINET.get(),
                            BlockRegistry.GLASS_BAMBOO_CABINET.get(),
                            BlockRegistry.GLASS_CHERRY_CABINET.get(),
                            BlockRegistry.GLASS_PALE_OAK_CABINET.get(),
                            BlockRegistry.GLASS_MANGROVE_CABINET.get(),
                            BlockRegistry.GLASS_CRIMSON_CABINET.get(),
                            BlockRegistry.GLASS_WARPED_CABINET.get()
            )));

    public static final RegistryObject<BlockEntityType<CabinetVariantBlockEntity>> CABINET_VARIANT = TILES.register("cabinet_variant",
            () -> new BlockEntityType<>(CabinetVariantBlockEntity::new, Set.of(
                            BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get()
            )));
}
