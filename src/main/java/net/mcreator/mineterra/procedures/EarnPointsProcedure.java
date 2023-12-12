package net.mcreator.mineterra.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerXpEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.network.MineterraModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EarnPointsProcedure {
	@SubscribeEvent
	public static void onPlayerXPLevelChange(PlayerXpEvent.LevelChange event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).attributePoints + 1;
			entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.attributePoints = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
