package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mineterra.init.MineterraModParticleTypes;

public class StaffOfLesserMagicWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		world.addParticle((SimpleParticleType) (MineterraModParticleTypes.ARCANITE_DAMAGE_PARTICLE.get()), x, y, z, 0, 0, 0);
	}
}
