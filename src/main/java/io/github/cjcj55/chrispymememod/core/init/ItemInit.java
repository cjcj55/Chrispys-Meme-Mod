package io.github.cjcj55.chrispymememod.core.init;

import io.github.cjcj55.chrispymememod.ChrispyMemeMod;
import io.github.cjcj55.chrispymememod.common.item.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChrispyMemeMod.MODID);

    public static final RegistryObject<Item> DICE_ITEM = ITEMS.register("dice", () -> new DiceItem());
    public static final RegistryObject<Item> LIGHTNING_STAFF_MEME_ITEM = ITEMS.register("lightning_staff_meme_item", () -> new LightningStaffMemeItem());
    public static final RegistryObject<Item> KNOCKBACK_STICK_1_ITEM = ITEMS.register("knockback_stick_1_item", () -> new KnockbackStick1Item());
    public static final RegistryObject<Item> KNOCKBACK_STICK_2_ITEM = ITEMS.register("knockback_stick_2_item", () -> new KnockbackStick2Item());
    public static final RegistryObject<Item> KNOCKBACK_STICK_3_ITEM = ITEMS.register("knockback_stick_3_item", () -> new KnockbackStick3Item());
    public static final RegistryObject<Item> KNOCKBACK_STICK_4_ITEM = ITEMS.register("knockback_stick_4_item", () -> new KnockbackStick4Item());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
