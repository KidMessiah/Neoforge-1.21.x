package com.humble.humblethings.item;

import com.humble.humblethings.HumbleThings;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HumbleThings.MOD_ID);

    public static final DeferredItem<Item> IRIDITE = ITEMS.register("iridite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_IRIDITE = ITEMS.register("raw_iridite",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
