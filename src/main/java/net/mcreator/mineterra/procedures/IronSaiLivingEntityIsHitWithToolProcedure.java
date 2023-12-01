package net.mcreator.mineterra.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineterra.init.MineterraModAttributes;

public class IronSaiLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if (!(sourceentity instanceof Player _player ? _player.getCooldowns().isOnCooldown(itemstack.getItem()) : false)) {
			if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60,
						(int) (((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.INTELLIGENCE.get()).getValue() + ((LivingEntity) sourceentity).getAttribute(MineterraModAttributes.DEXTERITY.get()).getValue()), false, false));
		}
		if (sourceentity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 200);
	}
}
