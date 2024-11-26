package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.CabinetVariantBlockEntity;
import com.axperty.storagedelight.block.entity.DrawerBlockEntity;
import com.axperty.storagedelight.block.entity.DrawerDoorBlockEntity;
import com.axperty.storagedelight.block.entity.GlassCabinetBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;
import java.util.function.Supplier;

public enum BlockEntityTypesRegistry {

    // Drawers
    DRAWER("drawer", DrawerBlockEntity.class, DrawerBlockEntity::new,
            BlockRegistry.OAK_DRAWER, BlockRegistry.BIRCH_DRAWER,
            BlockRegistry.SPRUCE_DRAWER, BlockRegistry.JUNGLE_DRAWER,
            BlockRegistry.ACACIA_DRAWER, BlockRegistry.DARK_OAK_DRAWER,
            BlockRegistry.MANGROVE_DRAWER, BlockRegistry.CRIMSON_DRAWER,
            BlockRegistry.WARPED_DRAWER),

    // Drawers with Doors
    DRAWER_DOOR("drawer_door", DrawerDoorBlockEntity.class, DrawerDoorBlockEntity::new,
            BlockRegistry.OAK_DRAWER_WITH_DOOR, BlockRegistry.BIRCH_DRAWER_WITH_DOOR,
            BlockRegistry.SPRUCE_DRAWER_WITH_DOOR, BlockRegistry.JUNGLE_DRAWER_WITH_DOOR,
            BlockRegistry.ACACIA_DRAWER_WITH_DOOR, BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR,
            BlockRegistry.MANGROVE_DRAWER_WITH_DOOR, BlockRegistry.CRIMSON_DRAWER_WITH_DOOR,
            BlockRegistry.WARPED_DRAWER_WITH_DOOR),

    // Glass Cabinets
    GLASS_CABINET("glass_cabinet",GlassCabinetBlockEntity .class, GlassCabinetBlockEntity::new,
                  BlockRegistry.GLASS_OAK_CABINET, BlockRegistry.GLASS_BIRCH_CABINET,
                  BlockRegistry.GLASS_SPRUCE_CABINET, BlockRegistry.GLASS_JUNGLE_CABINET,
                  BlockRegistry.GLASS_ACACIA_CABINET, BlockRegistry.GLASS_DARK_OAK_CABINET,
                  BlockRegistry.GLASS_MANGROVE_CABINET, BlockRegistry.GLASS_CRIMSON_CABINET,
                  BlockRegistry.GLASS_WARPED_CABINET),

    // Cabinets with Glass Doors, Single Door Cabinets
    CABINET_VARIANT("cabinet_variant", CabinetVariantBlockEntity.class, CabinetVariantBlockEntity::new,
            BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS, BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS, BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS, BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS, BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS, BlockRegistry.OAK_SINGLE_DOOR_CABINET,
            BlockRegistry.BIRCH_SINGLE_DOOR_CABINET, BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET,
            BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET, BlockRegistry.ACACIA_SINGLE_DOOR_CABINET,
            BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET, BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET,
            BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET, BlockRegistry.WARPED_SINGLE_DOOR_CABINET);

    private final String pathName;
    private final Class<? extends BlockEntity> blockEntityClass;
    private final Supplier<BlockEntityType<? extends BlockEntity>> blockEntityTypeSupplier;
    private BlockEntityType<? extends BlockEntity> blockEntityType;

    BlockEntityTypesRegistry(String pathName, Class<? extends BlockEntity> blockEntityClass,
                             FabricBlockEntityTypeBuilder.Factory<? extends BlockEntity> blockEntitySupplier, BlockRegistry... blockRegistryArray) {
        this.pathName = pathName;
        this.blockEntityClass = blockEntityClass;
        this.blockEntityTypeSupplier = () -> FabricBlockEntityTypeBuilder.create(blockEntitySupplier, Arrays.stream(blockRegistryArray)
                .map(BlockRegistry::get).toArray(Block[]::new)).build(null);
    }

    public static void registerAll() {
        StorageDelight.LOGGER.info("Registering block entity types for " + StorageDelight.MOD_ID);
        for (BlockEntityTypesRegistry value : values()) {
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(StorageDelight.MOD_ID, value.pathName), value.get());
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends BlockEntity> BlockEntityType<T> get() {
        return (BlockEntityType<T>) get(blockEntityClass);
    }

    @SuppressWarnings({"unchecked","unused"})
    private <T extends BlockEntity> BlockEntityType<T> get(Class<T> clazz) {
        if (blockEntityType == null) {
            blockEntityType = blockEntityTypeSupplier.get();
        }

        return (BlockEntityType<T>) blockEntityType;
    }

    public String getId() {
        return Registry.BLOCK_ENTITY_TYPE.getId(get()).toString();
    }
}
