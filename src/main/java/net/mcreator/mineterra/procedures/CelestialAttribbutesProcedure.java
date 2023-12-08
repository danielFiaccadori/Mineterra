package net.mcreator.mineterra.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.network.MineterraModVariables;
import net.mcreator.mineterra.init.MineterraModAttributes;

public class CelestialAttribbutesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).race == 2) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
			entity.setSprinting(false);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue(24);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(2);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).setBaseValue(3);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).setBaseValue(2);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.10000000129011612);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).setBaseValue(0);
			((LivingEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(0.10000000118011612);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.CHARISMA.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).setBaseValue(2);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.STRENGTH.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.WISDOM.get()).setBaseValue(0);
		}
	}
}
