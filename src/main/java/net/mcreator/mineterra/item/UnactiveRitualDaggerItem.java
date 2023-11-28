
package net.mcreator.mineterra.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class UnactiveRitualDaggerItem extends SwordItem {
	public UnactiveRitualDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 1242;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.DEMONITA.get()));
			}
		}, 3, 0f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cB\u00F4nus de dano"));
		list.add(Component.literal("\u00A78Adagas causam dano adicional equivalente a \u00A76+1% do dano de ataque do usu\u00E1rio\u00A7r."));
		list.add(Component.literal("\u00A7cRitual Sombrio"));
		list.add(Component.literal(
				"\u00A78Ao clicar com o bot\u00E3o direito em um alvo, ele \u00E9 marcado com \u00A7cSacrif\u00EDcio\u00A78 por 10 segundos (possui um tempo de recarga de 2 minutos). Se ele for atingido enquanto estiver marcado pela arma, ele \u00A74sangrar\u00E1 \u00A78rapidamente at\u00E9 a morte.."));
	}
}
