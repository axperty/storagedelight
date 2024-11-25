package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.DrawerBlockEntity;
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
                    BlockRegistry.BIRCH_DRAWER)
                    .build()
    );

    public static void initialize() {

    }
}
