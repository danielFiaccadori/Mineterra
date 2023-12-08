
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

import net.mcreator.mineterra.procedures.FireStaffRangedItemIsUsedProcedure;
import net.mcreator.mineterra.procedures.FireStaffCanUseRangedItemProcedure;
import net.mcreator.mineterra.entity.FireStaffEntity;

import java.util.List;

public class FireStaffItem extends Item {
	public FireStaffItem() {
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
		list.add(Component.literal("\u00A7dIgnite"));
		list.add(Component.literal("\u00A78Throws a fire rune into a target, dealing \u00A752\u00A78 + \u00A7510%(+ total XP level) Magical Damage\u00A78"));
		list.add(Component.literal("setting the target on fire for a amount of time based on the intelligence of the caster."));
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
			if (FireStaffCanUseRangedItemProcedure.execute(entity, itemstack)) {
				FireStaffEntity entityarrow = FireStaffEntity.shoot(world, entity, world.getRandom(), 1f, 0, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				FireStaffRangedItemIsUsedProcedure.execute(entity, itemstack);
			}
		}
	}
}
