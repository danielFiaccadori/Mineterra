package net.mcreator.mineterra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class RapierLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		LifestealProcedureProcedure.execute(world, entity, sourceentity);
	}
}
