package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class HighElfPassiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("race")).equals("highElf")) {
			((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get())
					.setBaseValue((((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).getValue() + ((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).getValue() / 10));
		}
	}
}
