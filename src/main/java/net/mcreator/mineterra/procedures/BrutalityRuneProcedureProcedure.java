package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class BrutalityRuneProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier brutality1 = null;
		AttributeModifier percentualattackspeed = null;
		brutality1 = new AttributeModifier(UUID.fromString("8ca5c292-a5f7-48da-a686-b2908757a834"), "AdAndLifestealAugment1", 1, AttributeModifier.Operation.ADDITION);
		percentualattackspeed = new AttributeModifier(UUID.fromString("22571dfa-5a34-4b90-838f-816eaa46a531"), "AttackpeedPercentualAugment",
				(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).getValue() / 10), AttributeModifier.Operation.ADDITION);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNIC_STONE_BRUTALITY.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier(brutality1)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).addTransientModifier(brutality1);
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).hasModifier(brutality1)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).addTransientModifier(brutality1);
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).hasModifier(percentualattackspeed)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).addTransientModifier(percentualattackspeed);
				if (true) {
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(brutality1);
					((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).removeModifier(brutality1);
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).removeModifier(percentualattackspeed);
				}
			}
		}
	}
}
