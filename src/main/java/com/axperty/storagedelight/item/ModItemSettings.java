package com.axperty.storagedelight.item;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.registry.CreativeTabRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItemSettings extends FabricItemSettings {

    public ModItemSettings() {
        super();
        group(CreativeTabRegistry.ITEM_GROUP);
    }

}