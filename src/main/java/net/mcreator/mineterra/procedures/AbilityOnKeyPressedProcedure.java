package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;

public class AbilityOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.DASH.get(), lv).isPresent() : false) {
			DashAbilityProcedure.execute(world, x, y, z, entity);
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.FOCUS_BLADE.get(), lv).isPresent() : false) {
			FocusBladeAbilityProcedure.execute(entity);
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.VAMPIRIC_INSTINCT.get(), lv).isPresent() : false) {
			VampiricInstinctAbilityProcedure.execute(entity);
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.SUDDEN_BURST.get(), lv).isPresent() : false) {
			SuddenBurstAbilityProcedure.execute(entity);
		}
	}
}
