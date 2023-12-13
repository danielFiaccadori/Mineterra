
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

import net.mcreator.mineterra.procedures.RubySwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class AwakenRubySwordItem extends SwordItem {
	public AwakenRubySwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2140;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.RUBY.get()));
			}
		}, 3, -2.5f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RubySwordLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Inferno Blaze"));
		list.add(Component.literal(
				"\u00A78\u00A7oInfused with the fervor of blazing rubies, this sword channels searing power. Strikes with this blade not only deal damage but also have a chance to create a burst of intense heat, briefly igniting enemies in proximity and dealing 3 damage."));
	}
}
