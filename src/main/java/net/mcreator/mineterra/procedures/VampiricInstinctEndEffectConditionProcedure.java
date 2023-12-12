package net.mcreator.mineterra.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModMobEffects;
import net.mcreator.mineterra.init.MineterraModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VampiricInstinctEndEffectConditionProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MineterraModMobEffects.VAMPIRIC_INSTINCT_EFFECT.get())) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 5 + ((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).getValue()));
			if (sourceentity instanceof LivingEntity _entity)
				_entity.removeEffect(MineterraModMobEffects.VAMPIRIC_INSTINCT_EFFECT.get());
		}
	}
}
