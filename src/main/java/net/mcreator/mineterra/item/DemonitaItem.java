
package net.mcreator.mineterra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DemonitaItem extends Item {
	public DemonitaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
