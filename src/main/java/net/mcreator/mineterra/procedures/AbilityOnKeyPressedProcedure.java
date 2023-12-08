package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;

public class AbilityOnKeyPressedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.DASH.get(), lv).isPresent() : false) {
			DashAbilityProcedure.execute(entity, itemstack);
		}
	}
}
