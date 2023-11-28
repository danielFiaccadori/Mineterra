
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
				tabData.accept(MineterraModBlocks.CITRINE_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.CITRINE_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.GARNET_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.GARNET_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.ZIRCON_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.ZIRCON_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.TOPAZ_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.TOPAZ_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.TANZANITE_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.TANZANITE_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.SAPPHIRE_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.SAPPHIRE_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.SAPPHIRE.get());
				tabData.accept(MineterraModBlocks.SUNSTONE_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.SUNSTONE_BLOCK.get().asItem());
				tabData.accept(MineterraModBlocks.TOURMALINE_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.TOURMALINE_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.DEMONITA.get());
				tabData.accept(MineterraModItems.RUBY.get());
				tabData.accept(MineterraModItems.CITRINE.get());
				tabData.accept(MineterraModItems.SUNSTONE.get());
				tabData.accept(MineterraModItems.TOURMALINE.get());
				tabData.accept(MineterraModItems.GARNET.get());
				tabData.accept(MineterraModItems.ZIRCON.get());
				tabData.accept(MineterraModItems.TOPAZ.get());
				tabData.accept(MineterraModItems.TANZANITE.get());
				tabData.accept(MineterraModBlocks.TITANIUM_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.TITANIUM_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.TITANIUM_INGOT.get());
				tabData.accept(MineterraModItems.MAGICAL_CASING.get());
				tabData.accept(MineterraModBlocks.ARCANITE_ORE.get().asItem());
				tabData.accept(MineterraModBlocks.ARCANITE_BLOCK.get().asItem());
				tabData.accept(MineterraModItems.ARCANITE.get());
				tabData.accept(MineterraModItems.ARCANITE_CATALYZER.get());
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
			tabData.accept(MineterraModItems.UNACTIVE_RITUAL_DAGGER.get());
			tabData.accept(MineterraModItems.RITUAL_DAGGER.get());
			tabData.accept(MineterraModItems.IRON_SAI_RAPIER.get());
			tabData.accept(MineterraModItems.ELDERLY_RAPIER_SAI.get());
			tabData.accept(MineterraModItems.IRON_CLAYMORE.get());
			tabData.accept(MineterraModItems.GOLDEN_CLAYMORE.get());
			tabData.accept(MineterraModItems.DIAMOND_CLAYMORE.get());
			tabData.accept(MineterraModItems.NETHERITE_CLAYMORE.get());
			tabData.accept(MineterraModItems.IMPERIAL_GOLD_CLAYMORE.get());
			tabData.accept(MineterraModItems.SPIRITUAL_CLAYMORE.get());
			tabData.accept(MineterraModItems.SPIRITUAL_CATACLYSM_CLAYMORE.get());
			tabData.accept(MineterraModItems.RAPIER.get());
			tabData.accept(MineterraModItems.GOLD_SAI.get());
			tabData.accept(MineterraModItems.DIAMOND_SAI.get());
			tabData.accept(MineterraModItems.NETHERITE_SAI.get());
			tabData.accept(MineterraModItems.SILVER_SWORD.get());
			tabData.accept(MineterraModItems.DEMONITA_SWORD.get());
			tabData.accept(MineterraModItems.WOOD_KATANA.get());
			tabData.accept(MineterraModItems.STONE_KATANA.get());
			tabData.accept(MineterraModItems.GOLD_KATANA.get());
			tabData.accept(MineterraModItems.IRON_KATANA.get());
			tabData.accept(MineterraModItems.DIAMOND_KATANA.get());
			tabData.accept(MineterraModItems.NETHERITE_KATANA.get());
			tabData.accept(MineterraModItems.SILVER_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.SILVER_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.SILVER_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.SILVER_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.DEMONITA_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.DEMONITA_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.DEMONITA_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.DEMONITA_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.COPPER_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.CITRINE_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.CITRINE_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.CITRINE_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.CITRINE_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.COPPER_SWORD.get());
			tabData.accept(MineterraModItems.CITRINE_SWORD.get());
			tabData.accept(MineterraModItems.AMETHYST_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.AMETHYST_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.AMETHYST_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.AMETHYST_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.RUBY_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.AMETHYST_SWORD.get());
			tabData.accept(MineterraModItems.RUBY_SWORD.get());
			tabData.accept(MineterraModItems.GARNET_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.GARNET_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.GARNET_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.GARNET_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.GARNET_SWORD.get());
			tabData.accept(MineterraModItems.ZIRCON_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.ZIRCON_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.ZIRCON_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.ZIRCON_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.ZIRCON_SWORD.get());
			tabData.accept(MineterraModItems.TOPAZ_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.TOPAZ_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.TOPAZ_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.TOPAZ_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.TOPAZ_SWORD.get());
			tabData.accept(MineterraModItems.TANZANITE_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.TANZANITE_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.TANZANITE_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.TANZANITE_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.TANZANITE_SWORD.get());
			tabData.accept(MineterraModItems.SAPPHIRE_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.SAPPHIRE_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.SAPPHIRE_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.SAPPHIRE_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.SAPPHIRE_SWORD.get());
			tabData.accept(MineterraModItems.SUNSTONE_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.SUNSTONE_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.SUNSTONE_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.SUNSTONE_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.SUNSTONE_SWORD.get());
			tabData.accept(MineterraModItems.TOURMALINE_SWORD.get());
			tabData.accept(MineterraModItems.TOURMALINE_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.TOURMALINE_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.TOURMALINE_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.TOURMALINE_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_HELMET.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(MineterraModItems.TITANIUM_ARMOR_BOOTS.get());
			tabData.accept(MineterraModItems.TITANIUM_SWORD.get());
			tabData.accept(MineterraModItems.WOOD_STAFF.get());
			tabData.accept(MineterraModItems.ARCANITE_STAFF.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MineterraModItems.SILVER_PICKAXE.get());
			tabData.accept(MineterraModItems.SILVER_AXE.get());
			tabData.accept(MineterraModItems.SILVER_SHOVEL.get());
			tabData.accept(MineterraModItems.SILVER_HOE.get());
			tabData.accept(MineterraModItems.DEMONITA_PICKAXE.get());
			tabData.accept(MineterraModItems.DEMONITA_AXE.get());
			tabData.accept(MineterraModItems.DEMONITA_SHOVEL.get());
			tabData.accept(MineterraModItems.DEMONITA_HOE.get());
			tabData.accept(MineterraModItems.FORGE_HAMMER.get());
			tabData.accept(MineterraModItems.COPPER_PICKAXE.get());
			tabData.accept(MineterraModItems.COPPER_AXE.get());
			tabData.accept(MineterraModItems.COPPER_SHOVEL.get());
			tabData.accept(MineterraModItems.COPPER_HOE.get());
			tabData.accept(MineterraModItems.CITRINE_PICKAXE.get());
			tabData.accept(MineterraModItems.CITRINE_AXE.get());
			tabData.accept(MineterraModItems.CITRINE_SHOVEL.get());
			tabData.accept(MineterraModItems.CITRINE_HOE.get());
			tabData.accept(MineterraModItems.AMETHYST_PICKAXE.get());
			tabData.accept(MineterraModItems.AMETHYST_AXE.get());
			tabData.accept(MineterraModItems.AMETHYST_SHOVEL.get());
			tabData.accept(MineterraModItems.AMETHYST_HOE.get());
			tabData.accept(MineterraModItems.RUBY_PICKAXE.get());
			tabData.accept(MineterraModItems.RUBY_AXE.get());
			tabData.accept(MineterraModItems.RUBY_SHOVEL.get());
			tabData.accept(MineterraModItems.RUBY_HOE.get());
			tabData.accept(MineterraModItems.GARNET_PICKAXE.get());
			tabData.accept(MineterraModItems.GARNET_AXE.get());
			tabData.accept(MineterraModItems.GARNET_SHOVEL.get());
			tabData.accept(MineterraModItems.GARNET_HOE.get());
			tabData.accept(MineterraModItems.ZIRCON_PICKAXE.get());
			tabData.accept(MineterraModItems.ZIRCON_AXE.get());
			tabData.accept(MineterraModItems.ZIRCON_SHOVEL.get());
			tabData.accept(MineterraModItems.ZIRCON_HOE.get());
			tabData.accept(MineterraModItems.TOPAZ_PICKAXE.get());
			tabData.accept(MineterraModItems.TOPAZ_AXE.get());
			tabData.accept(MineterraModItems.TOPAZ_SHOVEL.get());
			tabData.accept(MineterraModItems.TOPAZ_HOE.get());
			tabData.accept(MineterraModItems.TANZANITE_PICKAXE.get());
			tabData.accept(MineterraModItems.TANZANITE_AXE.get());
			tabData.accept(MineterraModItems.TANZANITE_SHOVEL.get());
			tabData.accept(MineterraModItems.TANZANITE_HOE.get());
			tabData.accept(MineterraModItems.SAPPHIRE_PICKAXE.get());
			tabData.accept(MineterraModItems.SAPPHIRE_AXE.get());
			tabData.accept(MineterraModItems.SAPPHIRE_SHOVEL.get());
			tabData.accept(MineterraModItems.SAPPHIRE_HOE.get());
			tabData.accept(MineterraModItems.SUNSTONE_PICKAXE.get());
			tabData.accept(MineterraModItems.SUNSTONE_AXE.get());
			tabData.accept(MineterraModItems.SUNSTONE_SHOVEL.get());
			tabData.accept(MineterraModItems.SUNSTONE_HOE.get());
			tabData.accept(MineterraModItems.TOURMALINE_PICKAXE.get());
			tabData.accept(MineterraModItems.TOURMALINE_AXE.get());
			tabData.accept(MineterraModItems.TOURMALINE_SHOVEL.get());
			tabData.accept(MineterraModItems.TOURMALINE_HOE.get());
			tabData.accept(MineterraModItems.TITANIUM_PICKAXE.get());
			tabData.accept(MineterraModItems.TITANIUM_AXE.get());
			tabData.accept(MineterraModItems.TITANIUM_SHOVEL.get());
			tabData.accept(MineterraModItems.TITANIUM_HOE.get());
		}
	}
}