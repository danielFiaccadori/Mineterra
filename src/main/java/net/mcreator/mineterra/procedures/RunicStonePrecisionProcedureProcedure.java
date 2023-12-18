package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class RunicStonePrecisionProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier criticalranged = null;
		criticalranged = new AttributeModifier(UUID.fromString("99a519e2-f952-4418-a5cd-f564096d066d"), "RangedCriticalHitChance", 0.1, AttributeModifier.Operation.ADDITION);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNIC_STONE_PRECISION.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.RANGEDCRITICALCHANCE.get()).hasModifier(criticalranged)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.RANGEDCRITICALCHANCE.get()).addTransientModifier(criticalranged);
			} else {
				((LivingEntity) entity).getAttribute(MineterraModAttributes.RANGEDCRITICALCHANCE.get()).removeModifier(criticalranged);
			}
		}
	}
}
