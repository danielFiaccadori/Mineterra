
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.RuneStoneSpellcasterBaubleIsEquippedProcedure;

import java.util.List;

public class RuneStoneSpellcasterItem extends Item implements ICurioItem {
	public RuneStoneSpellcasterItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76Mage Nv.1"));
		list.add(Component.literal("- \u00A77+1 Magic Damage"));
		list.add(Component.literal("- \u00A77+1 Wisdom"));
		list.add(Component.literal("- \u00A77 +1 Intelligence"));
		list.add(Component.literal(
				"\u00A78\u00A7oThe subject of this rune is to increase the Magical Capacity of the user. All of the attributes are the ones responsible for damage or power of the magic skills from Mineterra. Earning XP grants 20 more XP. (Each runic stone can be upgraded using a runic upgrader in a smithing table)"));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		RuneStoneSpellcasterBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		RuneStoneSpellcasterBaubleIsEquippedProcedure.execute(slotContext.entity());
	}
}
