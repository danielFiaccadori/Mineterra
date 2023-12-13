
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

import net.mcreator.mineterra.procedures.CitrineSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class CitrineSwordItem extends SwordItem {
	public CitrineSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2671;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.CITRINE.get()));
			}
		}, 3, -2.5f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CitrineSwordLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Solar Flare"));
		list.add(Component.literal(
				"\u00A78\u00A7oForged with mineterran citrine, this sword harnesses the power of the sun. Strikes with this blade have a chance to emit a blinding burst of light, temporarily disorienting enemies and inflicting slowness for 5 seconds."));
	}
}
