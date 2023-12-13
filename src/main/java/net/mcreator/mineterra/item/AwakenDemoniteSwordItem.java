
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

import net.mcreator.mineterra.procedures.DemonitaSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class AwakenDemoniteSwordItem extends SwordItem {
	public AwakenDemoniteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4332;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.DEMONITA.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DemonitaSwordLivingEntityIsHitWithToolProcedure.execute(entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cDemon Blaze"));
		list.add(Component.literal("\u00A78The blazing energy of the demonic gem infuses this sword, granting it the ability to deal additional fire damage each 3 attacks during 2 seconds."));
	}
}
