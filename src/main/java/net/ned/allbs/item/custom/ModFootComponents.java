package net.ned.allbs.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFootComponents {
    public static final FoodComponent RAW_URANIUM = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1600, 2),1f).build();
}
