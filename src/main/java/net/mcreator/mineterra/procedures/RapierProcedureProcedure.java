package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineterra.init.MineterraModMobEffects;

public class RapierProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		RapierLivingEntityIsHitWithToolProcedure.execute(world, entity, sourceentity);
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MineterraModMobEffects.SANGRAMENTO.get(), 40, 1, false, false));
		}
	}
}
