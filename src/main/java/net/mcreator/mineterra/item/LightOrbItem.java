
package net.mcreator.mineterra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightOrbItem extends Item {
	public LightOrbItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
