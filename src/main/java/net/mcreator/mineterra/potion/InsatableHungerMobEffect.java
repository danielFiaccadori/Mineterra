
package net.mcreator.mineterra.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.procedures.InsatableHungerEffectStartedappliedProcedure;

public class InsatableHungerMobEffect extends MobEffect {
	public InsatableHungerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52480);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mineterra.insatable_hunger";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		InsatableHungerEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
