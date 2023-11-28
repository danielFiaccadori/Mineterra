
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.ForestBlessingEffectStartedappliedProcedure;

public class ForestBlessingMobEffect extends MobEffect {
	public ForestBlessingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737997);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.forest_blessing";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		ForestBlessingEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
