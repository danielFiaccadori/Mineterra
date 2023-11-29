package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mineterra.init.MineterraModParticleTypes;

public class LightStaffWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.LIGHT_ORB_PARTICLE.get()), x, y, z, 10, 1, 1, 1, 0.5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, x, y, z, 5, 0.5, 0.5, 0.5, 0.5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.LIGHT_FLASH.get()), x, y, z, 10, 0.5, 0.5, 0.5, 0.5);
	}
}
