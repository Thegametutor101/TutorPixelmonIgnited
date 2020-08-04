package com.tutor.pixelmon.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ItemGroup.MISC));
    }

    public ItemBase(Properties properties) {
        super(properties);
    }
}
