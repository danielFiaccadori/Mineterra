
package net.mcreator.mineterra.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.mineterra.init.MineterraModItems;

public class SunstoneAxeItem extends AxeItem {
	public SunstoneAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 569;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.SUNSTONE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
