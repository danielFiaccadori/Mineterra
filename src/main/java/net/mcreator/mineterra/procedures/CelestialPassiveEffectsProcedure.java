package net.mcreator.mineterra.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CelestialPassiveEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("race")).equals("celestial")) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		}
	}
}
