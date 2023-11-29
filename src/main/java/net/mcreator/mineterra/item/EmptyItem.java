
package net.mcreator.mineterra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyItem extends Item {
	public EmptyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
