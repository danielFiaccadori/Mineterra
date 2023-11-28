
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.SoulStealOnEffectActiveTickProcedure;
import net.mcreator.mineterra.procedures.SoulStealEffectStartedappliedProcedure;
import net.mcreator.mineterra.procedures.SoulStealActiveTickConditionProcedure;

public class SoulStealMobEffect extends MobEffect {
	public SoulStealMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.soul_steal";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SoulStealEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SoulStealOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return SoulStealActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
