package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.DrawerBlock;
import com.axperty.storagedelight.block.GlassCabinetBlock;
import com.axperty.storagedelight.block.CabinetVariantBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum BlocksRegistry {

    // Drawers

    OAK_DRAWER("oak_drawer",DrawerBlock::new),
    BIRCH_DRAWER("birch_drawer", DrawerBlock::new),
    SPRUCE_DRAWER("spruce_drawer", DrawerBlock::new),
    JUNGLE_DRAWER("jungle_drawer", DrawerBlock::new),
    ACACIA_DRAWER("acacia_drawer", DrawerBlock::new),
    DARK_OAK_DRAWER("dark_oak_drawer", DrawerBlock::new),
    MANGROVE_DRAWER("mangrove_drawer", DrawerBlock::new),
    CRIMSON_DRAWER("crimson_drawer", DrawerBlock::new),
    WARPED_DRAWER("warped_drawer", DrawerBlock::new),

    // Glass Cabinets

    GLASS_OAK_CABINET("glass_oak_cabinet",GlassCabinetBlock::new),
    GLASS_BIRCH_CABINET("glass_birch_cabinet", GlassCabinetBlock::new),
    GLASS_SPRUCE_CABINET("glass_spruce_cabinet", GlassCabinetBlock::new),
    GLASS_JUNGLE_CABINET("glass_jungle_cabinet", GlassCabinetBlock::new),
    GLASS_ACACIA_CABINET("glass_acacia_cabinet", GlassCabinetBlock::new),
    GLASS_DARK_OAK_CABINET("glass_dark_oak_cabinet", GlassCabinetBlock::new),
    GLASS_MANGROVE_CABINET("glass_mangrove_cabinet", GlassCabinetBlock::new),
    GLASS_CRIMSON_CABINET("glass_crimson_cabinet", GlassCabinetBlock::new),
    GLASS_WARPED_CABINET("glass_warped_cabinet", GlassCabinetBlock::new),

    // Cabinets with Glass Doors

    OAK_CABINET_WITH_GLASS_DOORS("oak_cabinet_with_glass_doors", CabinetVariantBlock::new),
    BIRCH_CABINET_WITH_GLASS_DOORS("birch_cabinet_with_glass_doors", CabinetVariantBlock::new),
    SPRUCE_CABINET_WITH_GLASS_DOORS("spruce_cabinet_with_glass_doors", CabinetVariantBlock::new),
    JUNGLE_CABINET_WITH_GLASS_DOORS("jungle_cabinet_with_glass_doors", CabinetVariantBlock::new),
    ACACIA_CABINET_WITH_GLASS_DOORS("acacia_cabinet_with_glass_doors", CabinetVariantBlock::new),
    DARK_OAK_CABINET_WITH_GLASS_DOORS("dark_oak_cabinet_with_glass_doors", CabinetVariantBlock::new),
    MANGROVE_CABINET_WITH_GLASS_DOORS("mangrove_cabinet_with_glass_doors", CabinetVariantBlock::new),
    CRIMSON_CABINET_WITH_GLASS_DOORS("crimson_cabinet_with_glass_doors", CabinetVariantBlock::new),
    WARPED_CABINET_WITH_GLASS_DOORS("warped_cabinet_with_glass_doors", CabinetVariantBlock::new),

    // Single Door Cabinets

    OAK_SINGLE_DOOR_CABINET("oak_single_door_cabinet", CabinetVariantBlock::new),
    BIRCH_SINGLE_DOOR_CABINET("birch_single_door_cabinet", CabinetVariantBlock::new),
    SPRUCE_SINGLE_DOOR_CABINET("spruce_single_door_cabinet", CabinetVariantBlock::new),
    JUNGLE_SINGLE_DOOR_CABINET("jungle_single_door_cabinet", CabinetVariantBlock::new),
    ACACIA_SINGLE_DOOR_CABINET("acacia_single_door_cabinet", CabinetVariantBlock::new),
    DARK_OAK_SINGLE_DOOR_CABINET("dark_oak_single_door_cabinet", CabinetVariantBlock::new),
    MANGROVE_SINGLE_DOOR_CABINET("mangrove_single_door_cabinet", CabinetVariantBlock::new),
    CRIMSON_SINGLE_DOOR_CABINET("crimson_single_door_cabinet", CabinetVariantBlock::new),
    WARPED_SINGLE_DOOR_CABINET("warped_single_door_cabinet", CabinetVariantBlock::new);

    private static FlammableBlockRegistry.Entry flammable(int burnChance, @SuppressWarnings("SameParameterValue") int spreadChance) {
        return new FlammableBlockRegistry.Entry(burnChance, spreadChance);
    }

    private static boolean isValidFlammableEntry(FlammableBlockRegistry.Entry flammableRate) {
        return flammableRate != null && flammableRate.getBurnChance() > 0 && flammableRate.getSpreadChance() > 0;
    }

    private final String pathName;
    private final Supplier<Block> blockSupplier;
    private final FlammableBlockRegistry.Entry flammableRate;
    private final boolean isCutout;
    private Block block;

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier) {
        this(pathName, blockSupplier, false, new FlammableBlockRegistry.Entry(0, 0));
    }

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier, boolean isCutout) {
        this(pathName, blockSupplier, isCutout, new FlammableBlockRegistry.Entry(0, 0));
    }

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier, boolean isCutout, FlammableBlockRegistry.Entry flammableRate) {
        this.pathName = pathName;
        this.blockSupplier = blockSupplier;
        this.flammableRate = flammableRate;
        this.isCutout = isCutout;
    }

    public static void registerAll() {
        for (BlocksRegistry value : values()) {
            Block block = value.get();
            Registry.register(Registry.BLOCK, new Identifier(StorageDelight.MOD_ID, value.pathName), block);
            if (isValidFlammableEntry(value.flammableRate)) {
                FlammableBlockRegistry.getDefaultInstance().add(block, value.flammableRate);
            }
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
        return Registry.BLOCK.getId(get()).toString();
    }

}
