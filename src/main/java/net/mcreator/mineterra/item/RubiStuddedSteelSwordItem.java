
package net.mcreator.mineterra.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mineterra.init.MineterraModItems;

public class RubiStuddedSteelSwordItem extends SwordItem {
	public RubiStuddedSteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 682;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1.2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.STEEL_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}
}
