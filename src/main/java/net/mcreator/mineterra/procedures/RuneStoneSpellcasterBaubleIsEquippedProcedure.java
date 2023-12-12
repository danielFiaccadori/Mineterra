package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class RuneStoneSpellcasterBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier MageAugment1 = null;
		MageAugment1 = new AttributeModifier(UUID.fromString("2b4c96b0-665d-4f73-a773-62292f6dfc71"), "Mageaugment", 1.1, AttributeModifier.Operation.MULTIPLY_TOTAL);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNE_STONE_SPELLCASTER.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).hasModifier(MageAugment1)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).addTransientModifier(MageAugment1);
			} else {
				((LivingEntity) entity).getAttribute(MineterraModAttributes.MAGICDAMAGE.get()).removeModifier(MageAugment1);
			}
		}
	}
}
