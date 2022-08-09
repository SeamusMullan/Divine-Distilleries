package com.seamusmullan.divinedistilleries.item;

import com.seamusmullan.divinedistilleries.DivineDistilleries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DivineDistilleries.MODID);


    public static final RegistryObject<Item> ENERGY_DRINK = ITEMS.register("energy_drink",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DISTILLERIES_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
