package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.network.MineterraModVariables;

public class DisplayPointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format((entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).attributePoints);
	}
}
