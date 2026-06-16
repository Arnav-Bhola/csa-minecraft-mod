package com.arnav.csa_custom_boss_mod.client.renderer;

import com.arnav.csa_custom_boss_mod.entity.boss.CustomBossEntity;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BossRenderer extends HumanoidMobRenderer<CustomBossEntity, HumanoidModel<CustomBossEntity>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation("csa_custom_boss_mod", "textures/entity/the_villain.png");

    public BossRenderer(EntityRendererProvider.Context context) {
        super(
                context,
                new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER)),
                0.8F
        );
    }

    @Override
    public ResourceLocation getTextureLocation(CustomBossEntity entity) {
        return TEXTURE;
    }
}