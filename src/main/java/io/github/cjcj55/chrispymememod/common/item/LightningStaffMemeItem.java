package io.github.cjcj55.chrispymememod.common.item;

import io.github.cjcj55.chrispymememod.common.itemgroup.ChrispyMemeItemGroup;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class LightningStaffMemeItem extends Item {
    public LightningStaffMemeItem() {
        super(new Item.Properties().tab(ChrispyMemeItemGroup.CHRISPY_MEME_TAB).durability(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);
        player.getCooldowns().addCooldown(this, 20);
        if (!level.isClientSide()) {
                ServerLevel world = ((ServerLevel) player.level);
                if (!player.isCreative()) {
                    itemStack.setDamageValue(itemStack.getDamageValue() + 1);
                }
                if (!level.isClientSide) {
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, player.blockPosition(), MobSpawnType.TRIGGERED, true, true);
                }
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, itemStack);
        }
        return new InteractionResultHolder<>(InteractionResult.FAIL, itemStack);
    }
}
