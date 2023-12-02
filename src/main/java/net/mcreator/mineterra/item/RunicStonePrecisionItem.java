
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.PrecisionRunicStoneProcedure;

import java.util.List;

public class RunicStonePrecisionItem extends Item implements ICurioItem {
	public RunicStonePrecisionItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76Precision Nv.1"));
		list.add(Component.literal("- \u00A77+1 Dexterity"));
		list.add(Component.literal("- \u00A77+1 Inteligence"));
		list.add(Component.literal(
				"\u00A78\u00A7oThe subject of this rune is to give the player an slight augment of dexterity and inteligence, the main attributes of ranged physical damage items. (Each runic stone can be upgraded using a runic upgrader in a smithing table)"));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		PrecisionRunicStoneProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		PrecisionRunicStoneProcedure.execute(slotContext.entity());
	}
}
