
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DashItem extends Item implements ICurioItem {
	public DashItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A78\u00A7oWhen the special ability button is pressed, dashes the player to a short direction he is looking at."));
		list.add(Component.literal("\u00A78\u00A7oCooldown of 10 seconds(-20% of your \u00A7ddexterity\u00A78)."));
	}
}
