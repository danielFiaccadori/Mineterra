package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineterra.init.MineterraModMobEffects;
import net.mcreator.mineterra.init.MineterraModItems;

public class VampiricInstinctAbilityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _player ? _player.getCooldowns().isOnCooldown(MineterraModItems.VAMPIRIC_INSTINCT.get()) : false)) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MineterraModMobEffects.VAMPIRIC_INSTINCT_EFFECT.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MineterraModMobEffects.VAMPIRIC_INSTINCT_EFFECT.get(), 100, 1, false, false));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(MineterraModItems.VAMPIRIC_INSTINCT.get(), 200);
			}
		}
	}
}
