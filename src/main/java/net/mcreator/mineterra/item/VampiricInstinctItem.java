
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class VampiricInstinctItem extends Item implements ICurioItem {
	public VampiricInstinctItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Ability (Q) - Vampiric Instinct"));
		list.add(Component.literal("\u00A78\u00A7oYour next attack in the next 5 seconds heals you in 5 (+50% of your \u00A7dconstituition\u00A78). (\u00A78\u00A7oCooldown of 10 seconds)"));
	}
}
