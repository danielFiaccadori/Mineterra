
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.SoulHealOnEffectActiveTickProcedure;
import net.mcreator.mineterra.procedures.SoulHealActiveTickConditionProcedure;

public class SoulHealMobEffect extends MobEffect {
	public SoulHealMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.soul_heal";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SoulHealOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return SoulHealActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
