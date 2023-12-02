package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class RunicStoneDuelingBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier DuellingLvlOneModifier = null;
		DuellingLvlOneModifier = new AttributeModifier(UUID.fromString("40e4eb95-049a-4210-b657-59e1dc4dc76d"), "DuellingAugment(1)", 1, AttributeModifier.Operation.ADDITION);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNIC_STONE_DUELING.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).hasModifier(DuellingLvlOneModifier)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).addTransientModifier(DuellingLvlOneModifier);
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).hasModifier(DuellingLvlOneModifier)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).addTransientModifier(DuellingLvlOneModifier);
			} else {
				((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).removeModifier(DuellingLvlOneModifier);
				((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).removeModifier(DuellingLvlOneModifier);
			}
		}
	}
}
