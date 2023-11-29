package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mineterra.init.MineterraModParticleTypes;

public class StaffOfLesserMagicWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_PARTICLE.get()), x, y, z, 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_PARTICLE_2.get()), x, y, z, 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_P_ARTICLE_3.get()), x, y, z, 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_ASH.get()), x, y, z, 10, 0.1, 0.1, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_ASH_TRANSLUCNET.get()), x, y, z, 15, 0.5, 0.5, 0.5, 1);
	}
}
