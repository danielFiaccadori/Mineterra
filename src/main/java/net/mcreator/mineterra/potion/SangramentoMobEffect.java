
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.SangramentoOnEffectActiveTickProcedure;
import net.mcreator.mineterra.procedures.SangramentoEffectStartedappliedProcedure;
import net.mcreator.mineterra.procedures.SangramentoActiveTickConditionProcedure;

public class SangramentoMobEffect extends MobEffect {
	public SangramentoMobEffect() {
		super(MobEffectCategory.HARMFUL, -2097152);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.sangramento";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SangramentoEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SangramentoOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return SangramentoActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
