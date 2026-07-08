package com.axperty.storagedelight.compat.everycompat;

import com.axperty.storagedelight.block.*;
import com.axperty.storagedelight.registry.BlockRegistry;
import com.axperty.storagedelight.registry.EntityTypesRegistry;
import net.mehvahdjukaar.every_compat.api.PaletteStrategies;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;

/**
 * Every Compat (Wood Good) module for Storage Delight.
 * Generates Storage Delight blocks for all available wood types via Every Compat (Wood Good).
 */
public class StorageDelightEveryCompatModule extends SimpleModule {

    public StorageDelightEveryCompatModule(String modId) {
        super(modId, "sd", "everycomp");

        // Drawers
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawer",
                        () -> BlockRegistry.OAK_DRAWER.get(), () -> VanillaWoodTypes.OAK,
                        w -> new DrawerBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.DRAWER.get())
                .addTexture(modRes("block/oak_drawer_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_drawer_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Drawer with Door
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawer_with_door",
                        () -> BlockRegistry.OAK_DRAWER_WITH_DOOR.get(), () -> VanillaWoodTypes.OAK,
                        w -> new DrawerDoorBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.DRAWER_DOOR.get())
                .addTexture(modRes("block/oak_drawer_with_door_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_drawer_with_door_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Drawer with Books
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawer_with_books",
                        () -> BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(), () -> VanillaWoodTypes.OAK,
                        w -> new DrawerBooksBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.DRAWER_BOOKS.get())
                .addTexture(modRes("block/oak_drawer_with_books_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_drawer_with_books_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Small Drawers
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawers", "small",
                        () -> BlockRegistry.SMALL_OAK_DRAWERS.get(), () -> VanillaWoodTypes.OAK,
                        w -> new SmallDrawersBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.SMALL_DRAWERS.get())
                .addTexture(modRes("block/small_oak_drawers_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/small_oak_drawers_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Bookshelf with Door
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "bookshelf_with_door",
                        () -> BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get(), () -> VanillaWoodTypes.OAK,
                        w -> new BookshelfDoorBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.BOOKSHELF_DOOR.get())
                .addTexture(modRes("block/oak_bookshelf_with_door_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_bookshelf_with_door_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Glass Cabinet
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet", "glass",
                        () -> BlockRegistry.GLASS_OAK_CABINET.get(), () -> VanillaWoodTypes.OAK,
                        w -> new GlassCabinetBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.GLASS_CABINET.get())
                .addTexture(modRes("block/glass_oak_cabinet_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/glass_oak_cabinet_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Cabinet with Glass Doors
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet_with_glass_doors",
                        () -> BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(), () -> VanillaWoodTypes.OAK,
                        w -> new CabinetVariantBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.CABINET_VARIANT.get())
                .addTexture(modRes("block/oak_cabinet_with_glass_doors_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_glass_doors_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Single Door Cabinet
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "single_door_cabinet",
                        () -> BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(), () -> VanillaWoodTypes.OAK,
                        w -> new CabinetVariantBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.CABINET_VARIANT.get())
                .addTexture(modRes("block/oak_single_door_cabinet_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_single_door_cabinet_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Cabinet with Polished Andesite Countertop
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet_with_polished_andesite_countertop",
                        () -> BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(), () -> VanillaWoodTypes.OAK,
                        w -> new CabinetCountertopBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.COUNTERTOP.get())
                .addTexture(modRes("block/oak_cabinet_with_polished_andesite_countertop_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_polished_andesite_countertop_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_polished_andesite_countertop_side"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Cabinet with Polished Deepslate Countertop
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet_with_polished_deepslate_countertop",
                        () -> BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(), () -> VanillaWoodTypes.OAK,
                        w -> new CabinetCountertopBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.COUNTERTOP.get())
                .addTexture(modRes("block/oak_cabinet_with_polished_deepslate_countertop_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_polished_deepslate_countertop_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_polished_deepslate_countertop_side"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());

        // Cabinet with Polished Tuff Countertop
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet_with_polished_tuff_countertop",
                        () -> BlockRegistry.OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP.get(), () -> VanillaWoodTypes.OAK,
                        w -> new CabinetCountertopBlock(Utils.copyPropertySafe(w.planks)))
                .addTile(() -> EntityTypesRegistry.COUNTERTOP.get())
                .addTexture(modRes("block/oak_cabinet_with_polished_tuff_countertop_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_polished_tuff_countertop_front_open"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_with_polished_tuff_countertop_side"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .setTab(getModTab(modId))
                .defaultRecipe()
                .build());
    }
}
