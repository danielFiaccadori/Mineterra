
package net.mcreator.mineterra.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.mineterra.procedures.SpiritualCataclysmLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class SpiritualCataclysmItem extends SwordItem {
	public SpiritualCataclysmItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SpiritualCataclysmLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Apocalipse Espectral"));
		list.add(Component.literal("\u00A78No terceiro ataque, Cataclisma Espiritual libera toda a sua for\u00E7a, libertando as entidades furiosas que esvaziam a arma, causando uma explos\u00E3o no reino espiritual"));
		list.add(Component.literal(
				"que aflinge a alma de todas as entidades em uma grande \u00E1rea com o mesmo dano causado por \u00A7Banquete Espiritual\u00A78 de uma s\u00F3 vez. \u00A78\u00A7oAp\u00F3s esvaziada, a arma volta ao seu estado inicial, perdendo todo os acumulos de alma de \u00A74Banquete Espiritual\u00A78."));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
