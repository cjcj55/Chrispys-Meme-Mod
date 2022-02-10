package io.github.cjcj55.chrispymememod.core.init;

import io.github.cjcj55.chrispymememod.ChrispyMemeMod;
import io.github.cjcj55.chrispymememod.common.item.DiceItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChrispyMemeMod.MODID);

    public static final RegistryObject<Item> DICE_ITEM = ITEMS.register("dice", () -> new DiceItem());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
