
package net.mcreator.mineterra.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.CelestiumSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class AwakenCelestiumSwordItem extends SwordItem {
	public AwakenCelestiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3221;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 29;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.CELESTIUM_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CelestiumSwordLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Fage"));
		list.add(Component.literal("\u00A78\u00A7oInfused with celestial energy, attacks causes a crescent amount of movespeed boost:"));
		list.add(Component.literal("- 5 attacks (speed I)"));
		list.add(Component.literal("- 10 attacks (speed II)"));
		list.add(Component.literal("- 15 attacks (speed III for 1 minute))"));
	}
}
