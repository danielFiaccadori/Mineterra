package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.network.MineterraModVariables;
import net.mcreator.mineterra.init.MineterraModAttributes;

public class IncreaseCharismaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 0) {
			if ((entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).attributePoints >= 1) {
				{
					double _setval = (entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).attributePoints - 1;
					entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.attributePoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				((LivingEntity) entity).getAttribute(MineterraModAttributes.CHARISMA.get()).setBaseValue((((LivingEntity) entity).getAttribute(MineterraModAttributes.CHARISMA.get()).getBaseValue() + 1));
			}
		}
	}
}
