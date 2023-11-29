package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class LightStaffProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)),
				(float) (3 + ((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).getValue() / 3.33 + (sourceentity instanceof Player _plr ? _plr.experienceLevel : 0) / 3.33));
		world.addParticle(ParticleTypes.FLASH, x, y, z, 0, 0, 0);
	}
}
