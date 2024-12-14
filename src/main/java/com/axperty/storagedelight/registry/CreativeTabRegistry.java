package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

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
                output.accept(BlockRegistry.GLASS_OAK_CABINET.get());
                output.accept(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.BIRCH_DRAWER.get());
                output.accept(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_BIRCH_CABINET.get());
                output.accept(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.SPRUCE_DRAWER.get());
                output.accept(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_SPRUCE_CABINET.get());
                output.accept(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.JUNGLE_DRAWER.get());
                output.accept(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_JUNGLE_CABINET.get());
                output.accept(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.ACACIA_DRAWER.get());
                output.accept(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_ACACIA_CABINET.get());
                output.accept(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.DARK_OAK_DRAWER.get());
                output.accept(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_DARK_OAK_CABINET.get());
                output.accept(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.MANGROVE_DRAWER.get());
                output.accept(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_MANGROVE_CABINET.get());
                output.accept(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.CHERRY_DRAWER.get());
                output.accept(BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_CHERRY_CABINET.get());
                output.accept(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.BAMBOO_DRAWER.get());
                output.accept(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_BAMBOO_CABINET.get());
                output.accept(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.CRIMSON_DRAWER.get());
                output.accept(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_CRIMSON_CABINET.get());
                output.accept(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get());

                output.accept(BlockRegistry.WARPED_DRAWER.get());
                output.accept(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get());
                output.accept(BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get());
                output.accept(BlockRegistry.GLASS_WARPED_CABINET.get());
                output.accept(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get());
                output.accept(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get());

            }).build());
}