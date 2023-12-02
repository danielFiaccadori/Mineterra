package net.mcreator.mineterra.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerXpEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HumanAttributesProcedure {
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
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue((20 + (entity instanceof Player _plr ? _plr.experienceLevel : 0) / 10));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(0);
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(2);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.LIFESTEAL.get()).setBaseValue(0);
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).setBaseValue(4);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).setBaseValue(1);
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).setBaseValue(0);
		((LivingEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(0.10000000149011612);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.CHARISMA.get()).setBaseValue(0);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).setBaseValue(0);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).setBaseValue(0);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).setBaseValue(0);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.STRENGTH.get()).setBaseValue(0);
		((LivingEntity) entity).getAttribute(MineterraModAttributes.WISDOM.get()).setBaseValue(0);
	}
}
