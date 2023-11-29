
package net.mcreator.mineterra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ArcaniteRuneItem extends Item {
	public ArcaniteRuneItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
