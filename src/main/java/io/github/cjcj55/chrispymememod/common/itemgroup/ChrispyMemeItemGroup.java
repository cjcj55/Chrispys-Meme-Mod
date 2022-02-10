package io.github.cjcj55.chrispymememod.common.itemgroup;

import io.github.cjcj55.chrispymememod.ChrispyMemeMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ChrispyMemeItemGroup {
    public static final CreativeModeTab CHRISPY_MEME_TAB = new CreativeModeTab(ChrispyMemeMod.MODID) {
        @Override
        public ItemStack makeIcon() {
            return Items.DIAMOND.getDefaultInstance();
        }
    };
}
