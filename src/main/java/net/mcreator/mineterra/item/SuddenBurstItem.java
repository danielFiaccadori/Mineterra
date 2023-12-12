
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SuddenBurstItem extends Item implements ICurioItem {
	public SuddenBurstItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Ability (Q) - Sudden Burst"));
		list.add(Component.literal("\u00A78\u00A7oYour next attack in the next 5 seconds causes 50% of your \u00A76AD\u00A78 as bonus damage that ignores armor, and slows the target for 2 seconds.(\u00A78\u00A7oCooldown of 20 seconds)"));
	}
}
