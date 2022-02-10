package io.github.cjcj55.chrispymememod.common.item;

import io.github.cjcj55.chrispymememod.common.itemgroup.ChrispyMemeItemGroup;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class KnockbackStick3Item extends Item {
    public KnockbackStick3Item() {
        super(new Properties().tab(ChrispyMemeItemGroup.CHRISPY_MEME_TAB).durability(150).rarity(Rarity.RARE));
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.knockback((double)((float)12 * 0.5F), (double) Mth.sin(attacker.getYRot() * ((float)Math.PI / 180F)), (double)(-Mth.cos(attacker.getYRot() * ((float)Math.PI / 180F))));
        return super.hurtEnemy(stack, target, attacker);
    }
}
