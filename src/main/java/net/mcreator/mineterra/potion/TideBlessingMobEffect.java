
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.TideBlessingEffectStartedappliedProcedure;

public class TideBlessingMobEffect extends MobEffect {
	public TideBlessingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -9334868);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.tide_blessing";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TideBlessingEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
