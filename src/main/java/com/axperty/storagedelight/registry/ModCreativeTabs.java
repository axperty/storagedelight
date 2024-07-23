package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StorageDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TAB_STORAGE_DELIGHT = CREATIVE_TABS.register(StorageDelight.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.storagedelight"))
                    .icon(() -> new ItemStack(ModBlocks.OAK_DRAWER.get()))
                    .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());
}