package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.CabinetVariantBlock;
import com.axperty.storagedelight.block.DrawerBlock;
import com.axperty.storagedelight.block.DrawerDoorBlock;
import com.axperty.storagedelight.block.GlassCabinetBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum BlocksRegistry {

    // Oak
    OAK_DRAWER("oak_drawer", DrawerBlock::new),
    OAK_DRAWER_WITH_DOOR("oak_drawer_with_door", DrawerDoorBlock::new),
    GLASS_OAK_CABINET("glass_oak_cabinet", GlassCabinetBlock::new),
    OAK_CABINET_WITH_GLASS_DOORS("oak_cabinet_with_glass_doors", CabinetVariantBlock::new),
    OAK_SINGLE_DOOR_CABINET("oak_single_door_cabinet", CabinetVariantBlock::new),

    // Birch
    BIRCH_DRAWER("birch_drawer", DrawerBlock::new),
    BIRCH_DRAWER_WITH_DOOR("birch_drawer_with_door", DrawerDoorBlock::new),
    GLASS_BIRCH_CABINET("glass_birch_cabinet", GlassCabinetBlock::new),
    BIRCH_CABINET_WITH_GLASS_DOORS("birch_cabinet_with_glass_doors", CabinetVariantBlock::new),
    BIRCH_SINGLE_DOOR_CABINET("birch_single_door_cabinet", CabinetVariantBlock::new),

    // Spruce
    SPRUCE_DRAWER("spruce_drawer", DrawerBlock::new),
    SPRUCE_DRAWER_WITH_DOOR("spruce_drawer_with_door", DrawerDoorBlock::new),
    GLASS_SPRUCE_CABINET("glass_spruce_cabinet", GlassCabinetBlock::new),
    SPRUCE_CABINET_WITH_GLASS_DOORS("spruce_cabinet_with_glass_doors", CabinetVariantBlock::new),
    SPRUCE_SINGLE_DOOR_CABINET("spruce_single_door_cabinet", CabinetVariantBlock::new),

    // Jungle
    JUNGLE_DRAWER("jungle_drawer", DrawerBlock::new),
    JUNGLE_DRAWER_WITH_DOOR("jungle_drawer_with_door", DrawerDoorBlock::new),
    GLASS_JUNGLE_CABINET("glass_jungle_cabinet", GlassCabinetBlock::new),
    JUNGLE_CABINET_WITH_GLASS_DOORS("jungle_cabinet_with_glass_doors", CabinetVariantBlock::new),
    JUNGLE_SINGLE_DOOR_CABINET("jungle_single_door_cabinet", CabinetVariantBlock::new),

    // Acacia
    ACACIA_DRAWER("acacia_drawer", DrawerBlock::new),
    ACACIA_DRAWER_WITH_DOOR("acacia_drawer_with_door", DrawerDoorBlock::new),
    GLASS_ACACIA_CABINET("glass_acacia_cabinet", GlassCabinetBlock::new),
    ACACIA_CABINET_WITH_GLASS_DOORS("acacia_cabinet_with_glass_doors", CabinetVariantBlock::new),
    ACACIA_SINGLE_DOOR_CABINET("acacia_single_door_cabinet", CabinetVariantBlock::new),

    // Dark Oak
    DARK_OAK_DRAWER("dark_oak_drawer", DrawerBlock::new),
    DARK_OAK_DRAWER_WITH_DOOR("dark_oak_drawer_with_door", DrawerDoorBlock::new),
    GLASS_DARK_OAK_CABINET("glass_dark_oak_cabinet", GlassCabinetBlock::new),
    DARK_OAK_CABINET_WITH_GLASS_DOORS("dark_oak_cabinet_with_glass_doors", CabinetVariantBlock::new),
    DARK_OAK_SINGLE_DOOR_CABINET("dark_oak_single_door_cabinet", CabinetVariantBlock::new),

    // Mangrove
    MANGROVE_DRAWER("mangrove_drawer", DrawerBlock::new),
    MANGROVE_DRAWER_WITH_DOOR("mangrove_drawer_with_door", DrawerDoorBlock::new),
    GLASS_MANGROVE_CABINET("glass_mangrove_cabinet", GlassCabinetBlock::new),
    MANGROVE_CABINET_WITH_GLASS_DOORS("mangrove_cabinet_with_glass_doors", CabinetVariantBlock::new),
    MANGROVE_SINGLE_DOOR_CABINET("mangrove_single_door_cabinet", CabinetVariantBlock::new),

    // Cherry
    CHERRY_DRAWER("cherry_drawer", DrawerBlock::new),
    CHERRY_DRAWER_WITH_DOOR("cherry_drawer_with_door", DrawerDoorBlock::new),
    GLASS_CHERRY_CABINET("glass_cherry_cabinet", GlassCabinetBlock::new),
    CHERRY_CABINET_WITH_GLASS_DOORS("cherry_cabinet_with_glass_doors", CabinetVariantBlock::new),
    CHERRY_SINGLE_DOOR_CABINET("cherry_single_door_cabinet", CabinetVariantBlock::new),

    // Bamboo
    BAMBOO_DRAWER("bamboo_drawer", DrawerBlock::new),
    BAMBOO_DRAWER_WITH_DOOR("bamboo_drawer_with_door", DrawerDoorBlock::new),
    GLASS_BAMBOO_CABINET("glass_bamboo_cabinet", GlassCabinetBlock::new),
    BAMBOO_CABINET_WITH_GLASS_DOORS("bamboo_cabinet_with_glass_doors", CabinetVariantBlock::new),
    BAMBOO_SINGLE_DOOR_CABINET("bamboo_single_door_cabinet", CabinetVariantBlock::new),

    // Crimson
    CRIMSON_DRAWER("crimson_drawer", DrawerBlock::new),
    CRIMSON_DRAWER_WITH_DOOR("crimson_drawer_with_door", DrawerDoorBlock::new),
    GLASS_CRIMSON_CABINET("glass_crimson_cabinet", GlassCabinetBlock::new),
    CRIMSON_CABINET_WITH_GLASS_DOORS("crimson_cabinet_with_glass_doors", CabinetVariantBlock::new),
    CRIMSON_SINGLE_DOOR_CABINET("crimson_single_door_cabinet", CabinetVariantBlock::new),

    // Warped
    WARPED_DRAWER("warped_drawer", DrawerBlock::new),
    WARPED_DRAWER_WITH_DOOR("warped_drawer_with_door", DrawerDoorBlock::new),
    GLASS_WARPED_CABINET("glass_warped_cabinet", GlassCabinetBlock::new),
    WARPED_CABINET_WITH_GLASS_DOORS("warped_cabinet_with_glass_doors", CabinetVariantBlock::new),
    WARPED_SINGLE_DOOR_CABINET("warped_single_door_cabinet", CabinetVariantBlock::new);

    private final String pathName;
    private final Supplier<Block> blockSupplier;
    private final boolean isCutout;
    private Block block;

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier) {
        this(pathName, blockSupplier, false, new FlammableBlockRegistry.Entry(0, 0));
    }

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier, boolean isCutout, FlammableBlockRegistry.Entry flammableRate) {
        this.pathName = pathName;
        this.blockSupplier = blockSupplier;
        this.isCutout = isCutout;
    }

    public static void registerAll() {
        for (BlocksRegistry value : values()) {
            Block block = value.get();
            Registry.register(Registries.BLOCK, new Identifier(StorageDelight.MOD_ID, value.pathName), block);
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayer() {
        for (BlocksRegistry value : values()) {
            if (value.isCutout) {
                BlockRenderLayerMap.INSTANCE.putBlock(value.get(), RenderLayer.getCutout());
            }
        }
    }

    public Block get() {
        if (block == null) {
            block = blockSupplier.get();
        }
        return block;
    }

    public String getId() {
        return Registries.BLOCK.getId(get()).toString();
    }
}
