
package net.mcreator.mineterra.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mineterra.init.MineterraModItems;

public class CelestiumSwordItem extends SwordItem {
	public CelestiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4432;
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
}
