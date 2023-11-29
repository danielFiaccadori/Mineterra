package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mineterra.init.MineterraModParticleTypes;

public class StaffOfLesserMagicWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_PARTICLE.get()), x, y, z, 50, 0.5, 0.5, 0.5, 1);
		immediatesourceentity.setNoGravity(true);
	}
}
