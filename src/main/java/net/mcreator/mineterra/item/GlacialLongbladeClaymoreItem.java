
package net.mcreator.mineterra.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.GlacialLongbladeClaymoreLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class GlacialLongbladeClaymoreItem extends SwordItem {
	public GlacialLongbladeClaymoreItem() {
		super(new Tier() {
			public int getUses() {
				return 4612;
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
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.PACKED_ICE));
			}
		}, 3, -3.5f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GlacialLongbladeClaymoreLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7bWinter's Wrath"));
		list.add(Component.literal("\u00A78\u00A7oCarrying elemental power of the ancient ice, each 9 attacks \u00A7b\u00A7oFreeze\u00A78\u00A7o the target for 5 seconds, disarming enemies if they're using a weapon."));
		list.add(Component.literal("\u00A78\u00A7o(Frozen targets suffer 5 additional damage when the ice is broken)"));
	}
}
