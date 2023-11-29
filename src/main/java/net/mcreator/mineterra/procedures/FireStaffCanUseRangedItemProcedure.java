package net.mcreator.mineterra.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class FireStaffCanUseRangedItemProcedure {
	public static boolean execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		if (!(entity instanceof Player _player ? _player.getCooldowns().isOnCooldown(itemstack.getItem()) : false)) {
			return true;
		}
		return false;
	}
}
