
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.OnFireEffectStartedappliedProcedure;

public class OnFireMobEffect extends MobEffect {
	public OnFireMobEffect() {
		super(MobEffectCategory.HARMFUL, -3381760);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.on_fire";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		OnFireEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
