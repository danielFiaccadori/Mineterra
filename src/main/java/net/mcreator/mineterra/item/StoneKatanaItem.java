
package net.mcreator.mineterra.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.KatanaProcedureProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class StoneKatanaItem extends SwordItem {
	public StoneKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 131;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.STONE_KATANA.get()));
			}
		}, 3, 0f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		KatanaProcedureProcedure.execute(entity.level(), entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Golpe Cortante"));
		list.add(Component.literal("\u00A78O primeiro ataque desferido por Katanas, causam \u00A76100%\u2666\u00A78 de dano adicional."));
		list.add(Component.literal("\u00A78\u00A7cGolpe Cortante possui um tempo de recarga r\u00E1pido antes que possa ser ativado novamente."));
	}
}
