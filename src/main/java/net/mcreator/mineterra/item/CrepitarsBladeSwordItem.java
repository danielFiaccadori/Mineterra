
package net.mcreator.mineterra.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CrepitarsBladeSwordItem extends SwordItem {
	public CrepitarsBladeSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 534;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3.2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -1f, new Item.Properties().fireResistant());
	}
}
