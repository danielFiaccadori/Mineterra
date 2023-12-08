
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

import net.mcreator.mineterra.procedures.SpiritualLongswordLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class SpiritualLongswordItem extends SwordItem {
	public SpiritualLongswordItem() {
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
		SpiritualLongswordLivingEntityIsHitWithToolProcedure.execute(sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74\u00A7lBanquete Espiritual"));
		list.add(Component.literal(
				"\u00A7r\u00A78Se o jogador clicar com o bot\u00E3o direito em uma entidade, ela ser\u00E1 banida para o reino espiritual por 10 segundos, fazendo com que ela fique inalvej\u00E1vel e sofra dano das entidades espirituais. Durante esse tempo, o portador \u00A72drena a sua vida\u00A78 e se \u00A72cura\u00A78 at\u00E9 que ela retorne ao plano superior. Se a entidade morrer estando no reino espiritual, a espada consome a sua alma, dando ao portador uma parcela da \u00A7cvida\u00A78 do alvo como \u00A72vida m\u00E1xima adicional\u00A78, em uma quantidade de tempo baseada na \u00A72vida m\u00E1xima base\u00A78 do portador (Tempo de recarga de 10 segundos)."));
		list.add(Component.literal("\u00A78Each cast costs 10XP."));
	}
}
