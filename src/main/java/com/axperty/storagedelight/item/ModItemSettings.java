package com.axperty.storagedelight.item;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItemSettings extends FabricItemSettings {

    public ModItemSettings() {
        super();
        group(StorageDelight.ITEM_GROUP);
    }

}