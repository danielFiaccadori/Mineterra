package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mineterra.init.MineterraModParticleTypes;

public class FireStaffWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 100, 0.75, 0.75, 0.75, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.FIRE_ASH.get()), x, y, z, 15, 1, 1, 1, 0.5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.FIRE_ASH_2.get()), x, y, z, 15, 1, 1, 1, 0.5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.FIRE_ASH_3.get()), x, y, z, 15, 1, 1, 1, 0.5);
	}
}
