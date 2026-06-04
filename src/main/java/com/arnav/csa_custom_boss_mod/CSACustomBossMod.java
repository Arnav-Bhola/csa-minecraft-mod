package com.arnav.csa_custom_boss_mod;

import com.arnav.csa_custom_boss_mod.registry.ModEntities;
import com.arnav.csa_custom_boss_mod.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CSACustomBossMod.MODID)
public class CSACustomBossMod {

    public static final String MODID = "csa_custom_boss_mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CSACustomBossMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // REGISTER ALL YOUR CONTENT HERE
        ModItems.ITEMS.register(modEventBus);
        ModEntities.ENTITIES.register(modEventBus);
        modEventBus.addListener(ModEntities::registerAttributes);

        LOGGER.info("CSA Custom Boss Mod initialized");
    }
}