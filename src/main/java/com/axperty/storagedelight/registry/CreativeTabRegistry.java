package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup STORAGEDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(StorageDelight.MOD_ID + ":" + "storagedelight_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.storagedelight"))
                    .icon(() -> new ItemStack(BlockRegistry.OAK_DRAWER))
                    .entries((displayContext, entries) -> {
                        entries.add(BlockRegistry.OAK_DRAWER);
                        entries.add(BlockRegistry.OAK_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_OAK_CABINET);
                        entries.add(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.OAK_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.BIRCH_DRAWER);
                        entries.add(BlockRegistry.BIRCH_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_BIRCH_CABINET);
                        entries.add(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.SPRUCE_DRAWER);
                        entries.add(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_SPRUCE_CABINET);
                        entries.add(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.JUNGLE_DRAWER);
                        entries.add(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_JUNGLE_CABINET);
                        entries.add(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.ACACIA_DRAWER);
                        entries.add(BlockRegistry.ACACIA_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_ACACIA_CABINET);
                        entries.add(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.DARK_OAK_DRAWER);
                        entries.add(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_DARK_OAK_CABINET);
                        entries.add(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.MANGROVE_DRAWER);
                        entries.add(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_MANGROVE_CABINET);
                        entries.add(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.CHERRY_DRAWER);
                        entries.add(BlockRegistry.CHERRY_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_CHERRY_CABINET);
                        entries.add(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.PALE_OAK_DRAWER);
                        entries.add(BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_PALE_OAK_CABINET);
                        entries.add(BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.BAMBOO_DRAWER);
                        entries.add(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_BAMBOO_CABINET);
                        entries.add(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.CRIMSON_DRAWER);
                        entries.add(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_CRIMSON_CABINET);
                        entries.add(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET);

                        entries.add(BlockRegistry.WARPED_DRAWER);
                        entries.add(BlockRegistry.WARPED_DRAWER_WITH_DOOR);
                        entries.add(BlockRegistry.GLASS_WARPED_CABINET);
                        entries.add(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS);
                        entries.add(BlockRegistry.WARPED_SINGLE_DOOR_CABINET);
                    })
                    .build());

    public static void register() {
        StorageDelight.LOGGER.info("Registering creative mode tab for " + StorageDelight.MOD_ID);
    }
}
