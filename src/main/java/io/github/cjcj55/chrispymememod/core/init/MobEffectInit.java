package io.github.cjcj55.chrispymememod.core.init;

import io.github.cjcj55.chrispymememod.ChrispyMemeMod;
import io.github.cjcj55.chrispymememod.common.mobeffects.FlightMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobEffectInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ChrispyMemeMod.MODID);

    public static final RegistryObject<MobEffect> FLIGHT = MOB_EFFECTS.register("flight", () -> new FlightMobEffect(MobEffectCategory.BENEFICIAL, 0xFFFFFF));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
