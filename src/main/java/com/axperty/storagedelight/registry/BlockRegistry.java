package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.DrawerBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlockRegistry {

    public static final Block OAK_DRAWER = registerBlock("oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(StorageDelight.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, factory, settings);
        registerItem(path, itemSettings -> new BlockItem(block, itemSettings), new Item.Settings());
        return block;
    }

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(StorageDelight.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {

    }
}
