package com.arnav.csa_custom_boss_mod.registry;

import com.arnav.csa_custom_boss_mod.CSACustomBossMod;
import com.arnav.csa_custom_boss_mod.entity.boss.CustomBossEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CSACustomBossMod.MODID);

    public static final RegistryObject<EntityType<CustomBossEntity>> CUSTOM_BOSS =
            ENTITIES.register("custom_boss",
                    () -> EntityType.Builder.of(CustomBossEntity::new, MobCategory.MONSTER)
                            .sized(1.4f, 3.2f)
                            .clientTrackingRange(10)
                            .build("custom_boss")
            );
    
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(CUSTOM_BOSS.get(), CustomBossEntity.createAttributes().build());
    }
}