package io.github.cjcj55.chrispymememod.common.item;

import io.github.cjcj55.chrispymememod.common.itemgroup.ChrispyMemeItemGroup;
import io.github.cjcj55.chrispymememod.core.init.ItemInit;
import io.github.cjcj55.chrispymememod.core.init.SoundInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class DiceItem extends Item {
    public DiceItem() {
        super(new Item.Properties().tab(ChrispyMemeItemGroup.CHRISPY_MEME_TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        Random random = new Random();
        int num = random.nextInt(1, 6);
        player.getCooldowns().addCooldown(this, 55);
        level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundInit.DICE_ROLL.get(), SoundSource.PLAYERS, 1f, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        // TODO: Create List<> for items that may be spawned from rolling the die
        if (!level.isClientSide) {
            ItemEntity entity = new ItemEntity(level, player.getX(), player.getY(), player.getZ(), new ItemStack(ItemInit.DICE_ITEM.get(), 1));
            level.addFreshEntity(entity);
            if (!player.isCreative()) {
                stack.shrink(1);
            }
        }
        return InteractionResultHolder.success(stack);
    }
}
