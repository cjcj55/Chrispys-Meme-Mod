package io.github.cjcj55.chrispymememod.common.item;

import io.github.cjcj55.chrispymememod.common.itemgroup.ChrispyMemeItemGroup;
import io.github.cjcj55.chrispymememod.core.init.ItemInit;
import io.github.cjcj55.chrispymememod.core.init.SoundInit;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class AirhornMemeItem extends Item {
    public AirhornMemeItem() {
        super(new Item.Properties().tab(ChrispyMemeItemGroup.CHRISPY_MEME_TAB).durability(420));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundInit.AIRHORN_MEME.get(), SoundSource.PLAYERS, 1f, 1.0F);

        if (!player.isCreative()) {
            stack.setDamageValue(stack.getDamageValue() + 1);
        }

        return InteractionResultHolder.success(stack);
    }
}
