
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.FerocityEffectStartedappliedProcedure;

public class FerocityMobEffect extends MobEffect {
	public FerocityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407872);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.ferocity";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FerocityEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
