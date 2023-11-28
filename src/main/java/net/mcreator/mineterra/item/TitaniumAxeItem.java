
package net.mcreator.mineterra.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.mineterra.init.MineterraModItems;

public class TitaniumAxeItem extends AxeItem {
	public TitaniumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2564;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.TITANIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
