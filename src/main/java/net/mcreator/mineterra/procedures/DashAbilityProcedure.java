package net.mcreator.mineterra.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

public class DashAbilityProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _player ? _player.getCooldowns().isOnCooldown(MineterraModItems.DASH.get()) : false)) {
			if (entity.onGround()) {
				entity.setDeltaMovement(
						new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * 0.125), (entity.getDeltaMovement().y() + 0.25 + entity.getLookAngle().y * 0.75), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 0.75)));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (200 - ((LivingEntity) entity).getAttribute(MineterraModAttributes.DEXTERITY.get()).getValue() / 20));
			}
		}
	}
}
