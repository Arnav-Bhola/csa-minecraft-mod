package com.arnav.csa_custom_boss_mod;

import com.arnav.csa_custom_boss_mod.registry.ModEntities;
import com.arnav.csa_custom_boss_mod.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(CSACustomBossMod.MODID)
public class CSACustomBossMod {

    public static final String MODID = "csa_custom_boss_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CSACustomBossMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // REGISTER ALL YOUR CONTENT HERE
        ModItems.ITEMS.register(modEventBus);
        ModEntities.ENTITIES.register(modEventBus);
        modEventBus.addListener(ModEntities::registerAttributes);
    }
}