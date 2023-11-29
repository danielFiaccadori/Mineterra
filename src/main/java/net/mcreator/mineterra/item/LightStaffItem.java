
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

import net.mcreator.mineterra.procedures.LightStaffRangedItemIsUsedProcedure;
import net.mcreator.mineterra.procedures.LightStaffCanUseRangedItemProcedure;
import net.mcreator.mineterra.entity.LightStaffEntity;

import java.util.List;

public class LightStaffItem extends Item {
	public LightStaffItem() {
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
		list.add(Component.literal("\u00A7dIlluminate"));
		list.add(Component.literal("\u00A78Conjures a light orb into a target, dealing \u00A753\u00A78 + \u00A7530%(+ total XP level) Magical Damage\u00A78."));
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
			if (LightStaffCanUseRangedItemProcedure.execute(entity, itemstack)) {
				LightStaffEntity entityarrow = LightStaffEntity.shoot(world, entity, world.getRandom(), 2f, 0, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				LightStaffRangedItemIsUsedProcedure.execute(entity, itemstack);
			}
		}
	}
}
