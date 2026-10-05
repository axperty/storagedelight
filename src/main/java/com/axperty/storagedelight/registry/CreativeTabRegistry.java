package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabRegistry
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StorageDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STORAGEDELIGHT_TAB = CREATIVE_MODE_TABS.register("storagedelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.storagedelight"))
            .icon(() -> ItemRegistry.OAK_DRAWER.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                output.accept(BlockRegistry.OAK_DRAWER.get());
                output.accept(BlockRegistry.OAK_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.OAK_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_OAK_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_OAK_CABINET.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.BIRCH_DRAWER.get());
                output.accept(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_BIRCH_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_BIRCH_CABINET.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.SPRUCE_DRAWER.get());
                output.accept(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_SPRUCE_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_SPRUCE_CABINET.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.JUNGLE_DRAWER.get());
                output.accept(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_JUNGLE_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_JUNGLE_CABINET.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.ACACIA_DRAWER.get());
                output.accept(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_ACACIA_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_ACACIA_CABINET.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.DARK_OAK_DRAWER.get());
                output.accept(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_DARK_OAK_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_DARK_OAK_CABINET.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.MANGROVE_DRAWER.get());
                output.accept(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_MANGROVE_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_MANGROVE_CABINET.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.CHERRY_DRAWER.get());
                output.accept(BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_CHERRY_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_CHERRY_CABINET.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                if (!ModList.get().isLoaded("farmersdelight")) {
                    output.accept(BlockRegistry.POPLAR_CABINET.get());
                }
                output.accept(BlockRegistry.POPLAR_DRAWER.get());
                output.accept(BlockRegistry.POPLAR_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.POPLAR_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.POPLAR_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_POPLAR_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_POPLAR_CABINET.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.POPLAR_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.POPLAR_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                if (!ModList.get().isLoaded("farmersdelight")) {
                    output.accept(BlockRegistry.PALE_OAK_CABINET.get());
                }
                output.accept(BlockRegistry.PALE_OAK_DRAWER.get());
                output.accept(BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_PALE_OAK_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_PALE_OAK_CABINET.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.BAMBOO_DRAWER.get());
                output.accept(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_BAMBOO_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_BAMBOO_CABINET.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.CRIMSON_DRAWER.get());
                output.accept(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_CRIMSON_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_CRIMSON_CABINET.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

                output.accept(BlockRegistry.WARPED_DRAWER.get());
                output.accept(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR.get());
                output.accept(BlockRegistry.SMALL_WARPED_DRAWERS.get());
                output.accept(BlockRegistry.GLASS_WARPED_CABINET.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get());

            }).build());
}