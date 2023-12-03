
package net.mcreator.mineterra.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.BrutalityRuneProcedureProcedure;

import java.util.List;

public class RunicStoneBrutalityItem extends Item implements ICurioItem {
	public RunicStoneBrutalityItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76Berserker Nv.1"));
		list.add(Component.literal("- \u00A77+1 Lifesteal"));
		list.add(Component.literal("- \u00A77+1 Attack Damage"));
		list.add(Component.literal("- \u00A77 +10% Attack Speed"));
		list.add(Component.literal(
				"\u00A78\u00A7oSimilar to the Fatality rune, this one focus on the ability of brutal high speed attacks to enemies, and a slight durability during single target fights due to lifesteal. (Each runic stone can be upgraded using a runic upgrader in a smithing table)"));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		BrutalityRuneProcedureProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		BrutalityRuneProcedureProcedure.execute(slotContext.entity());
	}
}
