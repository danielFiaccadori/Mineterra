
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

import net.mcreator.mineterra.procedures.FroststeelShiverbladeKatanaLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class FroststeelShiverbladeKatanaItem extends SwordItem {
	public FroststeelShiverbladeKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 4612;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
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
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FroststeelShiverbladeKatanaLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7Frostbite Flourish"));
		list.add(Component.literal(
				"\u00A78\u00A7oCarrying elemental power of the ancient ice, consecutive attacks with this Katana inflicts crescent slowness until a maximum off 5. From that, the next attack shatters the ice and give you a sudden Attack Speed increase for 2 seconds."));
	}
}
