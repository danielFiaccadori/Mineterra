
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class FocusBladeItem extends Item implements ICurioItem {
	public FocusBladeItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Ability (Q) - Focus Blade"));
		list.add(Component.literal(
				"\u00A78\u00A7oYour next attack upon 5 seconds deals bonus on hit damage based on your base \u00A76AD\u00A78 (+ your bonus \u00A75MD\u00A78 + \u00A78your bonus \u00A76AD\u00A78 * 0,5) until a maximum of 5. (This effect only applies to items in main hand)"));
		list.add(Component.literal("\u00A78\u00A7oCooldown of 10 seconds."));
	}
}
