package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineterra.init.MineterraModMobEffects;
import net.mcreator.mineterra.init.MineterraModItems;

public class SuddenBurstAbilityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _player ? _player.getCooldowns().isOnCooldown(MineterraModItems.SUDDEN_BURST.get()) : false)) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MineterraModMobEffects.SUDDEN_BURST_EFFECT.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MineterraModMobEffects.SUDDEN_BURST_EFFECT.get(), 100, 1, false, false));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(MineterraModItems.SUDDEN_BURST.get(), 200);
			}
		}
	}
}
