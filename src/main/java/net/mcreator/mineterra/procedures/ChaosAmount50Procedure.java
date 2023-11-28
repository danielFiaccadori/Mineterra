package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.network.MineterraModVariables;

public class ChaosAmount50Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).SoulNumber == 5) {
			return true;
		}
		return false;
	}
}
