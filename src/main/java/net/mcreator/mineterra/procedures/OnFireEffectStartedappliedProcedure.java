package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.Entity;

public class OnFireEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
