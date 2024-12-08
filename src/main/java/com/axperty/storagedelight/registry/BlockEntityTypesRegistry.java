package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.CabinetVariantBlockEntity;
import com.axperty.storagedelight.block.entity.DrawerBlockEntity;
import com.axperty.storagedelight.block.entity.DrawerDoorBlockEntity;
import com.axperty.storagedelight.block.entity.GlassCabinetBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockEntityTypesRegistry {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(StorageDelight.MOD_ID, path), blockEntityType);
    }

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
                            BlockRegistry.PALE_OAK_DRAWER,
                            BlockRegistry.MANGROVE_DRAWER,
                            BlockRegistry.CRIMSON_DRAWER,
                            BlockRegistry.WARPED_DRAWER)
                    .build()
    );

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
                            BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR,
                            BlockRegistry.MANGROVE_DRAWER_WITH_DOOR,
                            BlockRegistry.CRIMSON_DRAWER_WITH_DOOR,
                            BlockRegistry.WARPED_DRAWER_WITH_DOOR)
                    .build()
    );

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
                            BlockRegistry.GLASS_PALE_OAK_CABINET,
                            BlockRegistry.GLASS_MANGROVE_CABINET,
                            BlockRegistry.GLASS_CRIMSON_CABINET,
                            BlockRegistry.GLASS_WARPED_CABINET)
                    .build()
    );

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
                            BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET,
                            BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET,
                            BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET,
                            BlockRegistry.WARPED_SINGLE_DOOR_CABINET)
                    .build()
    );

    public static void register() {
        StorageDelight.LOGGER.info("Registering block entity types for " + StorageDelight.MOD_ID);
    }
}
