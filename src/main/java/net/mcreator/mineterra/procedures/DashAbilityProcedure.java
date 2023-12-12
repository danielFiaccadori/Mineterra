package net.mcreator.mineterra.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

public class DashAbilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _player ? _player.getCooldowns().isOnCooldown(MineterraModItems.DASH.get()) : false)) {
			if (entity.onGround()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_pearl.throw")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_pearl.throw")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 10, 1, 1, 1, 1);
				entity.setDeltaMovement(
						new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * 0.75), (entity.getDeltaMovement().y() + 0.25 + entity.getLookAngle().y * 0.125), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 0.75)));
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(MineterraModItems.DASH.get(), (int) (200 - (((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).getValue() / 2) * 20));
		}
	}
}
