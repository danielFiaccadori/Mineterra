package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class BowtwohandedlighticebowProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, (int) ((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.DEXTERITY.get()).getValue(), false, false));
		BowDamageProcedureProcedure.execute(world, entity, sourceentity);
	}
}
