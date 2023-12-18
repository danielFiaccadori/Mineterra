package net.mcreator.mineterra.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModAttributes;

import java.util.UUID;

public class RunicStoneFatalityBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier FatalityNv1 = null;
		AttributeModifier MovespeedPercentual = null;
		AttributeModifier criticalChance = null;
		FatalityNv1 = new AttributeModifier(UUID.fromString("ac18673f-65f1-400f-ad2b-10cf8f956237"), "AdAndDxtAugment1", 1.1, AttributeModifier.Operation.MULTIPLY_TOTAL);
		MovespeedPercentual = new AttributeModifier(UUID.fromString("5c1aac4c-c399-4a0d-8462-4e1553dc57d6"), "MovespeedPercentualAugment", 1.01, AttributeModifier.Operation.MULTIPLY_TOTAL);
		criticalChance = new AttributeModifier(UUID.fromString("ba0d1260-a07c-4068-b87d-3d69fc014f64"), "CriticalHitChance", 0.1, AttributeModifier.Operation.ADDITION);
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MineterraModItems.RUNIC_STONE_FATALITY.get(), lv).isPresent() : false) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier(FatalityNv1)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).addTransientModifier(FatalityNv1);
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).hasModifier(MovespeedPercentual)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).addTransientModifier(MovespeedPercentual);
				if (!(((LivingEntity) entity).getAttribute(MineterraModAttributes.MEELECRITICALCHANCE.get()).hasModifier(criticalChance)))
					((LivingEntity) entity).getAttribute(MineterraModAttributes.MEELECRITICALCHANCE.get()).addTransientModifier(criticalChance);
			} else {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(FatalityNv1);
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(MovespeedPercentual);
				((LivingEntity) entity).getAttribute(MineterraModAttributes.MEELECRITICALCHANCE.get()).removeModifier(criticalChance);
			}
		}
	}
}
