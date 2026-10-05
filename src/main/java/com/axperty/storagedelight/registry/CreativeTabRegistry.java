package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class CreativeTabRegistry {
    public static final CreativeModeTab STORAGEDELIGHT_ITEMGROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.tryParse(StorageDelight.MOD_ID + ":" + "storagedelight_itemgroup"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.storagedelight"))
                    .icon(() -> new ItemStack(BlockRegistry.OAK_DRAWER))
                    .displayItems((displayContext, entries) -> {

                        // Oak Furniture
                        entries.accept(BlockRegistry.OAK_DRAWER);
                        entries.accept(BlockRegistry.OAK_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.OAK_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_OAK_DRAWERS);
                        entries.accept(BlockRegistry.OAK_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_OAK_CABINET);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.OAK_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Birch Furniture
                        entries.accept(BlockRegistry.BIRCH_DRAWER);
                        entries.accept(BlockRegistry.BIRCH_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_BIRCH_DRAWERS);
                        entries.accept(BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_BIRCH_CABINET);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Spruce Furniture
                        entries.accept(BlockRegistry.SPRUCE_DRAWER);
                        entries.accept(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_SPRUCE_DRAWERS);
                        entries.accept(BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_SPRUCE_CABINET);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Jungle Furniture
                        entries.accept(BlockRegistry.JUNGLE_DRAWER);
                        entries.accept(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_JUNGLE_DRAWERS);
                        entries.accept(BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_JUNGLE_CABINET);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Acacia Furniture
                        entries.accept(BlockRegistry.ACACIA_DRAWER);
                        entries.accept(BlockRegistry.ACACIA_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_ACACIA_DRAWERS);
                        entries.accept(BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_ACACIA_CABINET);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Dark Oak Furniture
                        entries.accept(BlockRegistry.DARK_OAK_DRAWER);
                        entries.accept(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_DARK_OAK_DRAWERS);
                        entries.accept(BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_DARK_OAK_CABINET);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Mangrove Furniture
                        entries.accept(BlockRegistry.MANGROVE_DRAWER);
                        entries.accept(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_MANGROVE_DRAWERS);
                        entries.accept(BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_MANGROVE_CABINET);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Cherry Furniture
                        entries.accept(BlockRegistry.CHERRY_DRAWER);
                        entries.accept(BlockRegistry.CHERRY_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_CHERRY_DRAWERS);
                        entries.accept(BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_CHERRY_CABINET);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Poplar Furniture
                        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {entries.accept(BlockRegistry.POPLAR_CABINET);}
                        entries.accept(BlockRegistry.POPLAR_DRAWER);
                        entries.accept(BlockRegistry.POPLAR_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.POPLAR_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_POPLAR_DRAWERS);
                        entries.accept(BlockRegistry.POPLAR_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_POPLAR_CABINET);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.POPLAR_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.POPLAR_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Pale Oak Furniture
                        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {entries.accept(BlockRegistry.PALE_OAK_CABINET);}
                        entries.accept(BlockRegistry.PALE_OAK_DRAWER);
                        entries.accept(BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_PALE_OAK_DRAWERS);
                        entries.accept(BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_PALE_OAK_CABINET);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Bamboo Furniture
                        entries.accept(BlockRegistry.BAMBOO_DRAWER);
                        entries.accept(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_BAMBOO_DRAWERS);
                        entries.accept(BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_BAMBOO_CABINET);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Crimson Furniture
                        entries.accept(BlockRegistry.CRIMSON_DRAWER);
                        entries.accept(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_CRIMSON_DRAWERS);
                        entries.accept(BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_CRIMSON_CABINET);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP);

                        // Warped Furniture
                        entries.accept(BlockRegistry.WARPED_DRAWER);
                        entries.accept(BlockRegistry.WARPED_DRAWER_WITH_DOOR);
                        entries.accept(BlockRegistry.WARPED_DRAWER_WITH_BOOKS);
                        entries.accept(BlockRegistry.SMALL_WARPED_DRAWERS);
                        entries.accept(BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR);
                        entries.accept(BlockRegistry.GLASS_WARPED_CABINET);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS);
                        entries.accept(BlockRegistry.WARPED_SINGLE_DOOR_CABINET);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP);
                        entries.accept(BlockRegistry.WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP);
                    })
                    .build());

    public static void register() {}
}
