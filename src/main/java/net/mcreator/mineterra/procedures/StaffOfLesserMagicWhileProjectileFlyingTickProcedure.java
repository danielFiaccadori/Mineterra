package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.Entity;

public class StaffOfLesserMagicWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
	}
}
