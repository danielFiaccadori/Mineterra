package net.mcreator.mineterra.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineterra.network.MineterraModVariables;
import net.mcreator.mineterra.init.MineterraModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class COTTPassiveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MineterraModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineterraModVariables.PlayerVariables())).race == 4) {
			if (entity.isInWaterRainOrBubble()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MineterraModMobEffects.TIDE_BLESSING.get(), 60, 1, false, false));
			}
		}
	}
}
