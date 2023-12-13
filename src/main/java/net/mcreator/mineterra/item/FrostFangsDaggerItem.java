
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

import net.mcreator.mineterra.procedures.FrostbiteSwordLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class FrostFangsDaggerItem extends SwordItem {
	public FrostFangsDaggerItem() {
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
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FrostbiteSwordLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7Glacial Laceration"));
		list.add(Component.literal("\u00A78\u00A7oCarrying elemental power of the ancient ice, the first attack with this dagger stuns a target. While stunned, your next attack will inflict \u00A76\u00A7oFocus Blade\u00A78\u00A7o bonus damage."));
		list.add(Component
				.literal("\u00A78\u00A7oFocus blade deals bonus on hit damage based on your base \u00A76AD\u00A78\u00A7o(+ your bonus \u00A75MD\u00A78\u00A7o + \u00A78\u00A7oyour bonus \u00A76\u00A7oAD\u00A78\u00A7o * 0,5) until a maximum of 5."));
	}
}
