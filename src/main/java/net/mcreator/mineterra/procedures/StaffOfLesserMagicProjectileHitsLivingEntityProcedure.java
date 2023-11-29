package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class StaffOfLesserMagicProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), (float) (1 + ((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).getValue()));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 50, 1, 1, 1, 1);
	}
}
