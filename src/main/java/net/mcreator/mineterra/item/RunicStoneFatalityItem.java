
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.RunicStoneFatalityBaubleIsEquippedProcedure;

import java.util.List;

public class RunicStoneFatalityItem extends Item implements ICurioItem {
	public RunicStoneFatalityItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76Lethal Nv.1"));
		list.add(Component.literal("- \u00A7710% Attack Damage"));
		list.add(Component.literal("- \u00A77 +10% Meele Critical Hit Chance"));
		list.add(Component.literal("- \u00A77 +1%  Movespeed"));
		list.add(Component.literal(
				"\u00A78\u00A7oThe subject of this rune is to give the player the capacity of executing enemies fastly, although at the cost of a weak durability during long fights. (Each runic stone can be upgraded using a runic upgrader in a smithing table)"));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		RunicStoneFatalityBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		RunicStoneFatalityBaubleIsEquippedProcedure.execute(slotContext.entity());
	}
}
