package com.arnav.csa_custom_boss_mod.client;

import com.arnav.csa_custom_boss_mod.CSACustomBossMod;
import com.arnav.csa_custom_boss_mod.client.renderer.BossRenderer;
import com.arnav.csa_custom_boss_mod.registry.ModEntities;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = CSACustomBossMod.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(
                ModEntities.THE_VILLAIN.get(),
                BossRenderer::new
        );

        event.registerEntityRenderer(
                ModEntities.GREEN_BLAZE_ROD_ENTITY.get(),
                ThrownItemRenderer::new
        );
    }
}