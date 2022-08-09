package com.seamusmullan.divinedistilleries.item;

import com.seamusmullan.divinedistilleries.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {

    public static final CreativeModeTab DISTILLERIES_TAB = new CreativeModeTab("Divine Distilleries") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DRINK_MIXER.get());
        }
    };
}
