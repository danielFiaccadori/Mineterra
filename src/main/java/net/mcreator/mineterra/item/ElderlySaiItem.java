
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

import net.mcreator.mineterra.procedures.ElderlySaiTpProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class ElderlySaiItem extends SwordItem {
	public ElderlySaiItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.ELDERLY_RAPIER_SAI.get()));
			}
		}, 3, -2.5f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ElderlySaiTpProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cPersegui\u00E7\u00E3o do Enderman"));
		list.add(Component.literal("\u00A78Ao clicar com o bot\u00E3o direito em uma entidade, o jogador \u00E9 teletransportado para a sua posi\u00E7\u00E3o, causando \u00A7ddano m\u00E1gico\u00A7r."));
	}
}
