
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mineterra.MineterraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineterraModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineterraMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINETERRA = REGISTRY.register("mineterra",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mineterra.mineterra")).icon(() -> new ItemStack(Blocks.DIAMOND_ORE)).displayItems((parameters, tabData) -> {
				tabData.accept(MineterraModBlocks.DEMONITA_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.DEMONITA_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.DEMONITA.get());
				tabData.accept(MineterraModBlocks.TITANIUM_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.TITANIUM_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.TITANIUM_INGOT.get());
				tabData.accept(MineterraModItems.MAGICAL_CASING.get());
				tabData.accept(MineterraModItems.EMPTY.get());
				tabData.accept(MineterraModBlocks.ARCANITIUM_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.ARCANITIUM_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.ARCANITIUM.get());
				tabData.accept(MineterraModItems.ARCANITE.get());
				tabData.accept(MineterraModItems.ARCANE_TOPAZ.get());
				tabData.accept(MineterraModItems.ARCANITE_GEMSTONE.get());
				tabData.accept(MineterraModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.STEEL_INGOT.get());
				tabData.accept(MineterraModItems.RUNIC_STONE_PRECISION.get());
				tabData.accept(MineterraModItems.RUNIC_STONE_DUELING.get());
				tabData.accept(MineterraModItems.RUNIC_STONE_RESISTENCE.get());
				tabData.accept(MineterraModItems.RUNIC_STONE_FATALITY.get());
				tabData.accept(MineterraModItems.RUNIC_STONE_BRUTALITY.get());
				tabData.accept(MineterraModItems.RUNE_STONE_SPELLCASTER.get());
				tabData.accept(MineterraModBlocks.CELESTIUM_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.CELESTIUM_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.CELESTIUM_INGOT.get());
				tabData.accept(MineterraModItems.DASH.get());
				tabData.accept(MineterraModItems.FOCUS_BLADE.get());
				tabData.accept(MineterraModItems.VAMPIRIC_INSTINCT.get());
				tabData.accept(MineterraModItems.SUDDEN_BURST.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MineterraModItems.STONE_DAGGER.get());
			tabData.accept(MineterraModItems.IRON_DAGGER.get());
			tabData.accept(MineterraModItems.SILVER_DAGGER.get());
			tabData.accept(MineterraModItems.GOLD_DAGGER.get());
			tabData.accept(MineterraModItems.DIAMOND_DAGGER.get());
			tabData.accept(MineterraModItems.NETHERITE_DAGGER.get());
			tabData.accept(MineterraModItems.SACRIFICE_DAGGER.get());
			tabData.accept(MineterraModItems.FLINT_DAGGER.get());
			tabData.accept(MineterraModItems.NEBULOUS_VEIL_DAGGER.get());
			tabData.accept(MineterraModItems.DRAGON_BITE_DAGGER.get());
			tabData.accept(MineterraModItems.IRON_SAI_RAPIER.get());
			tabData.accept(MineterraModItems.ELDERLY_RAPIER_SAI.get());
			tabData.accept(MineterraModItems.GOLD_SAI_RAPIER.get());
			tabData.accept(MineterraModItems.DIAMOND_SAI_RAPIER.get());
			tabData.accept(MineterraModItems.NETHERITE_SAI_RAPIER.get());
			tabData.accept(MineterraModItems.IRON_CLAYMORE.get());
			tabData.accept(MineterraModItems.GOLDEN_CLAYMORE.get());
			tabData.accept(MineterraModItems.DIAMOND_CLAYMORE.get());
			tabData.accept(MineterraModItems.CREPITARS_BLADE_SWORD.get());
			tabData.accept(MineterraModItems.NETHERITE_CLAYMORE.get());
			tabData.accept(MineterraModItems.IMPERIAL_GOLD_CLAYMORE.get());
			tabData.accept(MineterraModItems.SPIRITUAL_CLAYMORE.get());
			tabData.accept(MineterraModItems.RAPIER.get());
			tabData.accept(MineterraModItems.WOOD_KATANA.get());
			tabData.accept(MineterraModItems.STORMRAZOR_KATANA.get());
			tabData.accept(MineterraModItems.STONE_KATANA.get());
			tabData.accept(MineterraModItems.GOLD_KATANA.get());
			tabData.accept(MineterraModItems.IRON_KATANA.get());
			tabData.accept(MineterraModItems.DIAMOND_KATANA.get());
			tabData.accept(MineterraModItems.NETHERITE_KATANA.get());
			tabData.accept(MineterraModItems.TITANIUM_SWORD.get());
			tabData.accept(MineterraModItems.WOOD_STAFF.get());
			tabData.accept(MineterraModItems.ARCANITE_STAFF_WAND.get());
			tabData.accept(MineterraModItems.LIGHT_STAFF_WAND.get());
			tabData.accept(MineterraModItems.FIRE_STAFF_WAND.get());
			tabData.accept(MineterraModItems.LIGHT_IRON_DAGGER.get());
			tabData.accept(MineterraModItems.CELESTIUM_SWORD.get());
			tabData.accept(MineterraModItems.ARCANITE_SWORD.get());
			tabData.accept(MineterraModItems.BLADE_OF_BANISHED_QUEEN.get());
			tabData.accept(MineterraModItems.STEEL_SWORD.get());
			tabData.accept(MineterraModItems.DEMONITA_SWORD.get());
			tabData.accept(MineterraModItems.SILVER_SWORD.get());
			tabData.accept(MineterraModItems.COPPER_SWORD.get());
			tabData.accept(MineterraModItems.SURADIIRS_SCYTHE.get());
			tabData.accept(MineterraModItems.IRON_SCYTHE.get());
			tabData.accept(MineterraModItems.STEEL_SCYTHE.get());
			tabData.accept(MineterraModItems.RUSTED_IRON_SCYTHE.get());
			tabData.accept(MineterraModItems.GOLD_RAPIER.get());
			tabData.accept(MineterraModItems.DIAMOND_RAPIER.get());
			tabData.accept(MineterraModItems.STEEL_RAPIER.get());
			tabData.accept(MineterraModItems.BALSADUR_GREATSWORD_CLAYMORE.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.STEEL_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.STEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.STEEL_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.STEEL_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.AMETHYST_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MineterraModItems.FORGE_HAMMER.get());
			tabData.accept(MineterraModItems.TITANIUM_PICKAXE.get());
			tabData.accept(MineterraModItems.TITANIUM_AXE.get());
			tabData.accept(MineterraModItems.TITANIUM_SHOVEL.get());
			tabData.accept(MineterraModItems.TITANIUM_HOE.get());
			tabData.accept(MineterraModItems.STEEL_PICKAXE.get());
			tabData.accept(MineterraModItems.STEEL_AXE.get());
			tabData.accept(MineterraModItems.STEEL_SHOVEL.get());
			tabData.accept(MineterraModItems.STEEL_HOE.get());
		}
	}
}
