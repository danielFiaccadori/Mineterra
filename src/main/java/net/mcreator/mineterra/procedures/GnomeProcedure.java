package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.Entity;

public class GnomeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("race", "gnome");
	}
}
