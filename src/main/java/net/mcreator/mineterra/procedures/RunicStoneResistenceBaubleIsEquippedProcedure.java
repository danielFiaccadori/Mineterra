package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class RunicStoneResistenceBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Nv1Resistence_1 = null;
		AttributeModifier Nv1Resistence_2 = null;
		Nv1Resistence_1 = new AttributeModifier(UUID.fromString("046963b1-7da4-4918-98ed-2433d94dc537"), "MaxHealthPercentual", (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getValue() / 5),
				AttributeModifier.Operation.ADDITION);
		Nv1Resistence_2 = new AttributeModifier(UUID.fromString("86b28950-4bc0-496e-85ba-0a5c982f010e"), "ConstituitionAugment", 2, AttributeModifier.Operation.ADDITION);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNIC_STONE_RESISTENCE.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).hasModifier(Nv1Resistence_1)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).addTransientModifier(Nv1Resistence_1);
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).hasModifier(Nv1Resistence_2)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).addTransientModifier(Nv1Resistence_2);
			} else {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removeModifier(Nv1Resistence_1);
				((LivingEntity) entity).getAttribute(MineterraModAttributes.CONSTITUITION.get()).removeModifier(Nv1Resistence_2);
			}
		}
	}
}
