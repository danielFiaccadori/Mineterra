package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class SpiritualLongswordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 0.5 + ((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).getValue() / 2));
	}
}
