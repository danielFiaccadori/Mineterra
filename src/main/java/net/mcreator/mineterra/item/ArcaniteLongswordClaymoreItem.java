
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

import net.mcreator.mineterra.procedures.ArcaniteLongswordClaymoreLivingEntityIsHitWithToolProcedure;
import net.mcreator.mineterra.init.MineterraModItems;

import java.util.List;

public class ArcaniteLongswordClaymoreItem extends SwordItem {
	public ArcaniteLongswordClaymoreItem() {
		super(new Tier() {
			public int getUses() {
				return 4123;
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
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MineterraModItems.ARCANITE_GEMSTONE.get()));
			}
		}, 3, -3.5f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ArcaniteLongswordClaymoreLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Aetheric Annihilation"));
		list.add(Component.literal(
				"\u00A78\u00A7oForged with Mineterran Arcanite, each 3rd attack is a \u00A75Magical Critical\u00A78\u00A7o that deals 30% of your \u00A75Magical Damage\u00A78\u00A7o as bonus damage. After some seconds, you recieve regeneration based on your \u00A7dConstituition\u00A78\u00A7o."));
	}
}
