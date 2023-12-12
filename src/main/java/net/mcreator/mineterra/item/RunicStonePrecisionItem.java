
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class RunicStonePrecisionItem extends Item implements ICurioItem {
	public RunicStonePrecisionItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76Precision Nv.1"));
		list.add(Component.literal("- \u00A77+2 Ranged Attack Damage"));
		list.add(Component.literal("\u00A7710% Ranged Critical Hit Chance"));
		list.add(Component.literal("\u00A78\u00A7oThe subject of this rune is to increase the damage of ranged items. (Each runic stone can be upgraded using a runic upgrader in a smithing table)"));
	}
}
