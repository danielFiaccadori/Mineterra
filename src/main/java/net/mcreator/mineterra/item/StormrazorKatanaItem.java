
package net.mcreator.mineterra.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.StormrazorKatanaLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class StormrazorKatanaItem extends SwordItem {
	public StormrazorKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 789;
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
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -2f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		StormrazorKatanaLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cThunder"));
		list.add(Component.literal("\u00A78Stormrazor attacks scale effects each 3 attacks, to a maximum of 9 attacks:"));
		list.add(Component.literal("- 3rd to 6th attack: gives haste I (3s)"));
		list.add(Component.literal("- 6th to 8th attack: gives haste II(3s)"));
		list.add(Component.literal("- 9th attack: gives Haste 3(3s) and strike a lightning on the target, that deals 3 damage."));
	}
}
