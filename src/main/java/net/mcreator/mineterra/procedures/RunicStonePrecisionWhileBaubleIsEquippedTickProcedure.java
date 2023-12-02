package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class RunicStonePrecisionWhileBaubleIsEquippedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier PrecisionLvlOneModifier = null;
		PrecisionLvlOneModifier = new AttributeModifier(UUID.fromString("c5d32308-532e-4be7-aa88-0e7b977b9661"), "DexterityAugment(1)", 2, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).hasModifier(PrecisionLvlOneModifier)))
			((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).addTransientModifier(PrecisionLvlOneModifier);
	}
}
