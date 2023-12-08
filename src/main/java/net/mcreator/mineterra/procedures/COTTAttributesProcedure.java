package net.mcreator.mineterra.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.network.MineterraModVariables;
import net.mcreator.mineterra.init.MineterraModAttributes;

public class COTTAttributesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).race == 1) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue(20);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(1);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).setBaseValue(3);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).setBaseValue(3);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.10000000123011613);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).setBaseValue(0);
			((LivingEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(0.1000000018411612);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.CHARISMA.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).setBaseValue(2);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.STRENGTH.get()).setBaseValue(0);
			((LivingEntity) entity).getAttribute(MineterraModAttributes.WISDOM.get()).setBaseValue(0);
		}
	}
}
