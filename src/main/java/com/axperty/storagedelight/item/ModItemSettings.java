package com.axperty.storagedelight.item;

import net.minecraft.item.Item;

public class ModItemSettings extends Item.Settings {

    public static Item.Settings base() {
        return new ModItemSettings();
    }

    public static Item.Settings noStack() {
        return new ModItemSettings().maxCount(1);
    }

    public ModItemSettings() {
        super();
    }
}