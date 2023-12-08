package net.mcreator.mineterra.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class LightStaffCanUseRangedItemProcedure {
	public static boolean execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		if (!(entity instanceof Player _player ? _player.getCooldowns().isOnCooldown(itemstack.getItem()) : false)) {
			if (!((entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 2)) {
				return true;
			}
		}
		return false;
	}
}
