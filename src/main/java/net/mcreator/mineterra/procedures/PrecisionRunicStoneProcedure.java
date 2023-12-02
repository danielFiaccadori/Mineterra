package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class PrecisionRunicStoneProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier PrecisionLvlOneModifier = null;
		PrecisionLvlOneModifier = new AttributeModifier(UUID.fromString("c5d32308-532e-4be7-aa88-0e7b977b9661"), "DexterityAugment(1)", 1, AttributeModifier.Operation.ADDITION);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNIC_STONE_PRECISION.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).hasModifier(PrecisionLvlOneModifier)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).addTransientModifier(PrecisionLvlOneModifier);
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).hasModifier(PrecisionLvlOneModifier)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).addTransientModifier(PrecisionLvlOneModifier);
			} else {
				((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).removeModifier(PrecisionLvlOneModifier);
				((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).removeModifier(PrecisionLvlOneModifier);
			}
		}
	}
}
