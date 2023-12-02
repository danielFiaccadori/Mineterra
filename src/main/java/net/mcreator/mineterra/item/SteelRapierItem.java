
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

import net.mcreator.mineterra.procedures.RapierProcedureProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class SteelRapierItem extends SwordItem {
	public SteelRapierItem() {
		super(new Tier() {
			public int getUses() {
				return 360;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -0.3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.STEEL_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RapierProcedureProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cPiercing"));
		list.add(Component.literal("\u00A78Attacks with rapiers have 20% of chance of inflicting bleeding for 2s, and have a \u00A7clifesteal\u00A78 value augment of 50%."));
	}
}
