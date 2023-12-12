package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class DisplayIntelligenceProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format(((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).getValue());
	}
}
