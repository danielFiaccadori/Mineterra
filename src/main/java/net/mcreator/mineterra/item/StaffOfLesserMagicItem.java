
package net.mcreator.mineterra.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.StaffOfLesserMagicRangedItemUsedProcedure;
import net.mcreator.mineterra.procedures.StaffOfLesserMagicCanUseRangedItemProcedure;
import net.mcreator.mineterra.entity.StaffOfLesserMagicEntity;

import java.util.List;

public class StaffOfLesserMagicItem extends Item {
	public StaffOfLesserMagicItem() {
		super(new Item.Properties().durability(100));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7dArcane Ash"));
		list.add(Component.literal("\u00A78Focus all your arcane energy into a target, dealing damage based on \u00A75100% \u00A78of your \u00A75Magical Damage\u00A78."));
		list.add(Component.literal("\u00A78\u00A7oEach cast costs 3 XP."));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (StaffOfLesserMagicCanUseRangedItemProcedure.execute(entity, itemstack)) {
				StaffOfLesserMagicEntity entityarrow = StaffOfLesserMagicEntity.shoot(world, entity, world.getRandom(), 2f, 0, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				StaffOfLesserMagicRangedItemUsedProcedure.execute(entity, itemstack);
			}
		}
	}
}
