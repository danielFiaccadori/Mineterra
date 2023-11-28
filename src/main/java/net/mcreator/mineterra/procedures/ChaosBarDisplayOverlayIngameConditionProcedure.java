package net.mcreator.mineterra.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;

public class ChaosBarDisplayOverlayIngameConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MineterraModItems.SPIRITUAL_CLAYMORE.get()) {
			return true;
		}
		return false;
	}
}
