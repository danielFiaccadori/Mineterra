
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.RunicStoneDuelingBaubleIsEquippedProcedure;

import java.util.List;

public class RunicStoneDuelingItem extends Item implements ICurioItem {
	public RunicStoneDuelingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76Duelling Nv.1"));
		list.add(Component.literal("- \u00A77+1 Lifesteal"));
		list.add(Component.literal("- \u00A77+1 Constituition"));
		list.add(Component.literal(
				"\u00A78\u00A7oThe subject of this rune is to give the player an slight augment of lifesteal and constituition, giving the player a higher durability during long fights. (Each runic stone can be upgraded using a runic upgrader in a smithing table)"));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		RunicStoneDuelingBaubleIsEquippedProcedure.execute(slotContext.entity());
	}
}
