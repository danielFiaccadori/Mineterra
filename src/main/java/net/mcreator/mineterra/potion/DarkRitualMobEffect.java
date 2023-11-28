
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.DarkRitualEffectStartedappliedProcedure;

public class DarkRitualMobEffect extends MobEffect {
	public DarkRitualMobEffect() {
		super(MobEffectCategory.HARMFUL, -2686976);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.dark_ritual";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DarkRitualEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
