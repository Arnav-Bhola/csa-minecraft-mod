package com.arnav.csa_custom_boss_mod.registry;

import com.arnav.csa_custom_boss_mod.CSACustomBossMod;
import com.arnav.csa_custom_boss_mod.entity.boss.CustomBossEntity;
import com.arnav.csa_custom_boss_mod.entity.boss.GreenBlazeRodEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CSACustomBossMod.MODID);

    public static final RegistryObject<EntityType<CustomBossEntity>> THE_VILLAIN =
        ENTITIES.register("the_villain",
                () -> EntityType.Builder.of(CustomBossEntity::new, MobCategory.MONSTER)
                        .sized(1.4f, 3.2f)
                        .clientTrackingRange(10)
                        .build("the_villain")
        );

    public static final RegistryObject<EntityType<GreenBlazeRodEntity>> GREEN_BLAZE_ROD_ENTITY =
        ENTITIES.register("green_blaze_rod",
                () -> EntityType.Builder.<GreenBlazeRodEntity>of(GreenBlazeRodEntity::new, MobCategory.MISC)
                        .sized(0.25f, 0.25f)
                        .clientTrackingRange(4)
                        .updateInterval(10)
                        .build("green_blaze_rod")
        );

public static void registerAttributes(EntityAttributeCreationEvent event) {
    event.put(THE_VILLAIN.get(), CustomBossEntity.createAttributes().build());
}
}