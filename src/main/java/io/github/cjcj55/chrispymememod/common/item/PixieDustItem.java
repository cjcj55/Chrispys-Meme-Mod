package io.github.cjcj55.chrispymememod.common.item;

import io.github.cjcj55.chrispymememod.common.itemgroup.ChrispyMemeItemGroup;
import io.github.cjcj55.chrispymememod.common.mobeffects.FlightMobEffect;
import io.github.cjcj55.chrispymememod.core.init.MobEffectInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PixieDustItem extends Item {
    public PixieDustItem() {
        super(new Item.Properties().tab(ChrispyMemeItemGroup.CHRISPY_MEME_TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.addEffect(new MobEffectInstance(MobEffectInit.FLIGHT.get(), 1200));
        if (!player.isCreative()) {
            stack.shrink(1);
        }
        return InteractionResultHolder.success(stack);
    }
}
