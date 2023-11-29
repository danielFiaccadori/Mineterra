package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class StaffOfLesserMagicWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 100, 1, 1, 1, 1);
	}
}
