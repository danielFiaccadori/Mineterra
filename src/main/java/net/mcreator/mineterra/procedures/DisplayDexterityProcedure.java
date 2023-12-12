package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class DisplayDexterityProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format(((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).getValue());
	}
}
