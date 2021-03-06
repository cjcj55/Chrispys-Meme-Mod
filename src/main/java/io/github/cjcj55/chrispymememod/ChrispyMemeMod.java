package io.github.cjcj55.chrispymememod;

import io.github.cjcj55.chrispymememod.core.init.BlockInit;
import io.github.cjcj55.chrispymememod.core.init.ItemInit;
import io.github.cjcj55.chrispymememod.core.init.MobEffectInit;
import io.github.cjcj55.chrispymememod.core.init.SoundInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ChrispyMemeMod.MODID)
public class ChrispyMemeMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "chrispymememod";

    public ChrispyMemeMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(bus);
        BlockInit.register(bus);
        //EnchantInit.register(bus);
        SoundInit.register(bus);
        MobEffectInit.register(bus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}
