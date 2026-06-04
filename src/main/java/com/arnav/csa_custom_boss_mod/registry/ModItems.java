package com.arnav.csa_custom_boss_mod.registry;

import com.arnav.csa_custom_boss_mod.CSACustomBossMod;
import com.arnav.csa_custom_boss_mod.item.CustomBossDroplet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CSACustomBossMod.MODID);

   public static final RegistryObject<Item> CUSTOM_BOSS_DROPLET =
    ITEMS.register("minecoin", CustomBossDroplet::new);
}

