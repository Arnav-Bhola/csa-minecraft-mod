package com.arnav.csa_custom_boss_mod.entity.boss;

import com.arnav.csa_custom_boss_mod.registry.ModItems;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class GreenBlazeRodEntity extends ThrowableItemProjectile {

public GreenBlazeRodEntity(EntityType<? extends GreenBlazeRodEntity> type, Level level) {
    super(type, level);
}

public GreenBlazeRodEntity(EntityType<? extends GreenBlazeRodEntity> type, double x, double y, double z, Level level) {
    super(type, x, y, z, level);
}

public GreenBlazeRodEntity(EntityType<? extends GreenBlazeRodEntity> type, LivingEntity shooter, Level level) {
    super(type, shooter, level);
}

@Override
protected Item getDefaultItem() {
    return ModItems.GREEN_BLAZE_ROD.get();
}

@Override
public ItemStack getItem() {
    return new ItemStack(this.getDefaultItem());
}

@Override
protected void onHitEntity(EntityHitResult result) {
    super.onHitEntity(result);

    if (!this.level().isClientSide) {

        result.getEntity().hurt(
                this.damageSources().mobProjectile(this, (LivingEntity) this.getOwner()),
                8.0F
        );

        this.discard();
    }
}
}
