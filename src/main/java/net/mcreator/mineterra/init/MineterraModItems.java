
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mineterra.item.ZirconSwordItem;
import net.mcreator.mineterra.item.ZirconShovelItem;
import net.mcreator.mineterra.item.ZirconPickaxeItem;
import net.mcreator.mineterra.item.ZirconItem;
import net.mcreator.mineterra.item.ZirconHoeItem;
import net.mcreator.mineterra.item.ZirconAxeItem;
import net.mcreator.mineterra.item.ZirconArmorItem;
import net.mcreator.mineterra.item.WoodStaffItem;
import net.mcreator.mineterra.item.WoodKatanaItem;
import net.mcreator.mineterra.item.UnactiveRitualDaggerItem;
import net.mcreator.mineterra.item.TourmalineSwordItem;
import net.mcreator.mineterra.item.TourmalineShovelItem;
import net.mcreator.mineterra.item.TourmalinePickaxeItem;
import net.mcreator.mineterra.item.TourmalineItem;
import net.mcreator.mineterra.item.TourmalineHoeItem;
import net.mcreator.mineterra.item.TourmalineAxeItem;
import net.mcreator.mineterra.item.TourmalineArmorItem;
import net.mcreator.mineterra.item.TopazSwordItem;
import net.mcreator.mineterra.item.TopazShovelItem;
import net.mcreator.mineterra.item.TopazPickaxeItem;
import net.mcreator.mineterra.item.TopazItem;
import net.mcreator.mineterra.item.TopazHoeItem;
import net.mcreator.mineterra.item.TopazAxeItem;
import net.mcreator.mineterra.item.TopazArmorItem;
import net.mcreator.mineterra.item.TitaniumSwordItem;
import net.mcreator.mineterra.item.TitaniumShovelItem;
import net.mcreator.mineterra.item.TitaniumPickaxeItem;
import net.mcreator.mineterra.item.TitaniumIngotItem;
import net.mcreator.mineterra.item.TitaniumHoeItem;
import net.mcreator.mineterra.item.TitaniumAxeItem;
import net.mcreator.mineterra.item.TitaniumArmorItem;
import net.mcreator.mineterra.item.TanzaniteSwordItem;
import net.mcreator.mineterra.item.TanzaniteShovelItem;
import net.mcreator.mineterra.item.TanzanitePickaxeItem;
import net.mcreator.mineterra.item.TanzaniteItem;
import net.mcreator.mineterra.item.TanzaniteHoeItem;
import net.mcreator.mineterra.item.TanzaniteAxeItem;
import net.mcreator.mineterra.item.TanzaniteArmorItem;
import net.mcreator.mineterra.item.SunstoneSwordItem;
import net.mcreator.mineterra.item.SunstoneShovelItem;
import net.mcreator.mineterra.item.SunstonePickaxeItem;
import net.mcreator.mineterra.item.SunstoneItem;
import net.mcreator.mineterra.item.SunstoneHoeItem;
import net.mcreator.mineterra.item.SunstoneAxeItem;
import net.mcreator.mineterra.item.SunstoneArmorItem;
import net.mcreator.mineterra.item.StoneKatanaItem;
import net.mcreator.mineterra.item.StoneDaggerItem;
import net.mcreator.mineterra.item.StaffOfLesserMagicItem;
import net.mcreator.mineterra.item.SpiritualLongswordItem;
import net.mcreator.mineterra.item.SpiritualCataclysmItem;
import net.mcreator.mineterra.item.SilverSwordItem;
import net.mcreator.mineterra.item.SilverShovelItem;
import net.mcreator.mineterra.item.SilverPickaxeItem;
import net.mcreator.mineterra.item.SilverIngotItem;
import net.mcreator.mineterra.item.SilverHoeItem;
import net.mcreator.mineterra.item.SilverDaggerItem;
import net.mcreator.mineterra.item.SilverAxeItem;
import net.mcreator.mineterra.item.SilverArmorItem;
import net.mcreator.mineterra.item.SapphireSwordItem;
import net.mcreator.mineterra.item.SapphireShovelItem;
import net.mcreator.mineterra.item.SapphirePickaxeItem;
import net.mcreator.mineterra.item.SapphireItem;
import net.mcreator.mineterra.item.SapphireHoeItem;
import net.mcreator.mineterra.item.SapphireAxeItem;
import net.mcreator.mineterra.item.SapphireArmorItem;
import net.mcreator.mineterra.item.SacrificeDaggerItem;
import net.mcreator.mineterra.item.RubySwordItem;
import net.mcreator.mineterra.item.RubyShovelItem;
import net.mcreator.mineterra.item.RubyPickaxeItem;
import net.mcreator.mineterra.item.RubyItem;
import net.mcreator.mineterra.item.RubyHoeItem;
import net.mcreator.mineterra.item.RubyAxeItem;
import net.mcreator.mineterra.item.RubyArmorItem;
import net.mcreator.mineterra.item.RitualDaggerItem;
import net.mcreator.mineterra.item.NetheriteSaiItem;
import net.mcreator.mineterra.item.NetheriteKatanaItem;
import net.mcreator.mineterra.item.NetheriteDaggerItem;
import net.mcreator.mineterra.item.NetheriteClaymoreItem;
import net.mcreator.mineterra.item.MagicalCasingItem;
import net.mcreator.mineterra.item.IronSaiItem;
import net.mcreator.mineterra.item.IronRapierItem;
import net.mcreator.mineterra.item.IronKatanaItem;
import net.mcreator.mineterra.item.IronDaggerItem;
import net.mcreator.mineterra.item.IronClaymoreItem;
import net.mcreator.mineterra.item.ImperialGoldClaymoreItem;
import net.mcreator.mineterra.item.GoldenClaymoreItem;
import net.mcreator.mineterra.item.GoldSaiItem;
import net.mcreator.mineterra.item.GoldKatanaItem;
import net.mcreator.mineterra.item.GoldDaggerItem;
import net.mcreator.mineterra.item.GarnetSwordItem;
import net.mcreator.mineterra.item.GarnetShovelItem;
import net.mcreator.mineterra.item.GarnetPickaxeItem;
import net.mcreator.mineterra.item.GarnetItem;
import net.mcreator.mineterra.item.GarnetHoeItem;
import net.mcreator.mineterra.item.GarnetAxeItem;
import net.mcreator.mineterra.item.GarnetArmorItem;
import net.mcreator.mineterra.item.ForgeHammerItem;
import net.mcreator.mineterra.item.FlintDaggerItem;
import net.mcreator.mineterra.item.EmptyItem;
import net.mcreator.mineterra.item.ElderlySaiItem;
import net.mcreator.mineterra.item.DiamondSaiItem;
import net.mcreator.mineterra.item.DiamondKatanaItem;
import net.mcreator.mineterra.item.DiamondDaggerItem;
import net.mcreator.mineterra.item.DiamondClaymoreItem;
import net.mcreator.mineterra.item.DemonitaSwordItem;
import net.mcreator.mineterra.item.DemonitaShovelItem;
import net.mcreator.mineterra.item.DemonitaPickaxeItem;
import net.mcreator.mineterra.item.DemonitaItem;
import net.mcreator.mineterra.item.DemonitaHoeItem;
import net.mcreator.mineterra.item.DemonitaAxeItem;
import net.mcreator.mineterra.item.DemonitaArmorItem;
import net.mcreator.mineterra.item.CopperSwordItem;
import net.mcreator.mineterra.item.CopperShovelItem;
import net.mcreator.mineterra.item.CopperPickaxeItem;
import net.mcreator.mineterra.item.CopperHoeItem;
import net.mcreator.mineterra.item.CopperAxeItem;
import net.mcreator.mineterra.item.CopperArmorItem;
import net.mcreator.mineterra.item.CitrineSwordItem;
import net.mcreator.mineterra.item.CitrineShovelItem;
import net.mcreator.mineterra.item.CitrinePickaxeItem;
import net.mcreator.mineterra.item.CitrineItem;
import net.mcreator.mineterra.item.CitrineHoeItem;
import net.mcreator.mineterra.item.CitrineAxeItem;
import net.mcreator.mineterra.item.CitrineArmorItem;
import net.mcreator.mineterra.item.ArcaniteItem;
import net.mcreator.mineterra.item.ArcaniteCatalyzerItem;
import net.mcreator.mineterra.item.AmethystSwordItem;
import net.mcreator.mineterra.item.AmethystShovelItem;
import net.mcreator.mineterra.item.AmethystPickaxeItem;
import net.mcreator.mineterra.item.AmethystHoeItem;
import net.mcreator.mineterra.item.AmethystAxeItem;
import net.mcreator.mineterra.item.AmethystArmorItem;
import net.mcreator.mineterra.MineterraMod;

public class MineterraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineterraMod.MODID);
	public static final RegistryObject<Item> STONE_DAGGER = REGISTRY.register("stone_dagger", () -> new StoneDaggerItem());
	public static final RegistryObject<Item> IRON_DAGGER = REGISTRY.register("iron_dagger", () -> new IronDaggerItem());
	public static final RegistryObject<Item> SILVER_DAGGER = REGISTRY.register("silver_dagger", () -> new SilverDaggerItem());
	public static final RegistryObject<Item> GOLD_DAGGER = REGISTRY.register("gold_dagger", () -> new GoldDaggerItem());
	public static final RegistryObject<Item> DIAMOND_DAGGER = REGISTRY.register("diamond_dagger", () -> new DiamondDaggerItem());
	public static final RegistryObject<Item> NETHERITE_DAGGER = REGISTRY.register("netherite_dagger", () -> new NetheriteDaggerItem());
	public static final RegistryObject<Item> SACRIFICE_DAGGER = REGISTRY.register("sacrifice_dagger", () -> new SacrificeDaggerItem());
	public static final RegistryObject<Item> FLINT_DAGGER = REGISTRY.register("flint_dagger", () -> new FlintDaggerItem());
	public static final RegistryObject<Item> UNACTIVE_RITUAL_DAGGER = REGISTRY.register("unactive_ritual_dagger", () -> new UnactiveRitualDaggerItem());
	public static final RegistryObject<Item> RITUAL_DAGGER = REGISTRY.register("ritual_dagger", () -> new RitualDaggerItem());
	public static final RegistryObject<Item> IRON_SAI_RAPIER = REGISTRY.register("iron_sai_rapier", () -> new IronSaiItem());
	public static final RegistryObject<Item> ELDERLY_RAPIER_SAI = REGISTRY.register("elderly_rapier_sai", () -> new ElderlySaiItem());
	public static final RegistryObject<Item> IRON_CLAYMORE = REGISTRY.register("iron_claymore", () -> new IronClaymoreItem());
	public static final RegistryObject<Item> GOLDEN_CLAYMORE = REGISTRY.register("golden_claymore", () -> new GoldenClaymoreItem());
	public static final RegistryObject<Item> DIAMOND_CLAYMORE = REGISTRY.register("diamond_claymore", () -> new DiamondClaymoreItem());
	public static final RegistryObject<Item> NETHERITE_CLAYMORE = REGISTRY.register("netherite_claymore", () -> new NetheriteClaymoreItem());
	public static final RegistryObject<Item> IMPERIAL_GOLD_CLAYMORE = REGISTRY.register("imperial_gold_claymore", () -> new ImperialGoldClaymoreItem());
	public static final RegistryObject<Item> SPIRITUAL_CLAYMORE = REGISTRY.register("spiritual_claymore", () -> new SpiritualLongswordItem());
	public static final RegistryObject<Item> SPIRITUAL_CATACLYSM_CLAYMORE = REGISTRY.register("spiritual_cataclysm_claymore", () -> new SpiritualCataclysmItem());
	public static final RegistryObject<Item> RAPIER = REGISTRY.register("rapier", () -> new IronRapierItem());
	public static final RegistryObject<Item> GOLD_SAI = REGISTRY.register("gold_sai", () -> new GoldSaiItem());
	public static final RegistryObject<Item> DIAMOND_SAI = REGISTRY.register("diamond_sai", () -> new DiamondSaiItem());
	public static final RegistryObject<Item> NETHERITE_SAI = REGISTRY.register("netherite_sai", () -> new NetheriteSaiItem());
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> DEMONITA_SWORD = REGISTRY.register("demonita_sword", () -> new DemonitaSwordItem());
	public static final RegistryObject<Item> WOOD_KATANA = REGISTRY.register("wood_katana", () -> new WoodKatanaItem());
	public static final RegistryObject<Item> STONE_KATANA = REGISTRY.register("stone_katana", () -> new StoneKatanaItem());
	public static final RegistryObject<Item> GOLD_KATANA = REGISTRY.register("gold_katana", () -> new GoldKatanaItem());
	public static final RegistryObject<Item> IRON_KATANA = REGISTRY.register("iron_katana", () -> new IronKatanaItem());
	public static final RegistryObject<Item> DIAMOND_KATANA = REGISTRY.register("diamond_katana", () -> new DiamondKatanaItem());
	public static final RegistryObject<Item> NETHERITE_KATANA = REGISTRY.register("netherite_katana", () -> new NetheriteKatanaItem());
	public static final RegistryObject<Item> SILVER_ARMOR_HELMET = REGISTRY.register("silver_armor_helmet", () -> new SilverArmorItem.Helmet());
	public static final RegistryObject<Item> SILVER_ARMOR_CHESTPLATE = REGISTRY.register("silver_armor_chestplate", () -> new SilverArmorItem.Chestplate());
	public static final RegistryObject<Item> SILVER_ARMOR_LEGGINGS = REGISTRY.register("silver_armor_leggings", () -> new SilverArmorItem.Leggings());
	public static final RegistryObject<Item> SILVER_ARMOR_BOOTS = REGISTRY.register("silver_armor_boots", () -> new SilverArmorItem.Boots());
	public static final RegistryObject<Item> DEMONITA_ARMOR_HELMET = REGISTRY.register("demonita_armor_helmet", () -> new DemonitaArmorItem.Helmet());
	public static final RegistryObject<Item> DEMONITA_ARMOR_CHESTPLATE = REGISTRY.register("demonita_armor_chestplate", () -> new DemonitaArmorItem.Chestplate());
	public static final RegistryObject<Item> DEMONITA_ARMOR_LEGGINGS = REGISTRY.register("demonita_armor_leggings", () -> new DemonitaArmorItem.Leggings());
	public static final RegistryObject<Item> DEMONITA_ARMOR_BOOTS = REGISTRY.register("demonita_armor_boots", () -> new DemonitaArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> CITRINE_ARMOR_HELMET = REGISTRY.register("citrine_armor_helmet", () -> new CitrineArmorItem.Helmet());
	public static final RegistryObject<Item> CITRINE_ARMOR_CHESTPLATE = REGISTRY.register("citrine_armor_chestplate", () -> new CitrineArmorItem.Chestplate());
	public static final RegistryObject<Item> CITRINE_ARMOR_LEGGINGS = REGISTRY.register("citrine_armor_leggings", () -> new CitrineArmorItem.Leggings());
	public static final RegistryObject<Item> CITRINE_ARMOR_BOOTS = REGISTRY.register("citrine_armor_boots", () -> new CitrineArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> CITRINE_SWORD = REGISTRY.register("citrine_sword", () -> new CitrineSwordItem());
	public static final RegistryObject<Item> AMETHYST_ARMOR_HELMET = REGISTRY.register("amethyst_armor_helmet", () -> new AmethystArmorItem.Helmet());
	public static final RegistryObject<Item> AMETHYST_ARMOR_CHESTPLATE = REGISTRY.register("amethyst_armor_chestplate", () -> new AmethystArmorItem.Chestplate());
	public static final RegistryObject<Item> AMETHYST_ARMOR_LEGGINGS = REGISTRY.register("amethyst_armor_leggings", () -> new AmethystArmorItem.Leggings());
	public static final RegistryObject<Item> AMETHYST_ARMOR_BOOTS = REGISTRY.register("amethyst_armor_boots", () -> new AmethystArmorItem.Boots());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> AMETHYST_SWORD = REGISTRY.register("amethyst_sword", () -> new AmethystSwordItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> GARNET_ARMOR_HELMET = REGISTRY.register("garnet_armor_helmet", () -> new GarnetArmorItem.Helmet());
	public static final RegistryObject<Item> GARNET_ARMOR_CHESTPLATE = REGISTRY.register("garnet_armor_chestplate", () -> new GarnetArmorItem.Chestplate());
	public static final RegistryObject<Item> GARNET_ARMOR_LEGGINGS = REGISTRY.register("garnet_armor_leggings", () -> new GarnetArmorItem.Leggings());
	public static final RegistryObject<Item> GARNET_ARMOR_BOOTS = REGISTRY.register("garnet_armor_boots", () -> new GarnetArmorItem.Boots());
	public static final RegistryObject<Item> GARNET_SWORD = REGISTRY.register("garnet_sword", () -> new GarnetSwordItem());
	public static final RegistryObject<Item> ZIRCON_ARMOR_HELMET = REGISTRY.register("zircon_armor_helmet", () -> new ZirconArmorItem.Helmet());
	public static final RegistryObject<Item> ZIRCON_ARMOR_CHESTPLATE = REGISTRY.register("zircon_armor_chestplate", () -> new ZirconArmorItem.Chestplate());
	public static final RegistryObject<Item> ZIRCON_ARMOR_LEGGINGS = REGISTRY.register("zircon_armor_leggings", () -> new ZirconArmorItem.Leggings());
	public static final RegistryObject<Item> ZIRCON_ARMOR_BOOTS = REGISTRY.register("zircon_armor_boots", () -> new ZirconArmorItem.Boots());
	public static final RegistryObject<Item> ZIRCON_SWORD = REGISTRY.register("zircon_sword", () -> new ZirconSwordItem());
	public static final RegistryObject<Item> TOPAZ_ARMOR_HELMET = REGISTRY.register("topaz_armor_helmet", () -> new TopazArmorItem.Helmet());
	public static final RegistryObject<Item> TOPAZ_ARMOR_CHESTPLATE = REGISTRY.register("topaz_armor_chestplate", () -> new TopazArmorItem.Chestplate());
	public static final RegistryObject<Item> TOPAZ_ARMOR_LEGGINGS = REGISTRY.register("topaz_armor_leggings", () -> new TopazArmorItem.Leggings());
	public static final RegistryObject<Item> TOPAZ_ARMOR_BOOTS = REGISTRY.register("topaz_armor_boots", () -> new TopazArmorItem.Boots());
	public static final RegistryObject<Item> TOPAZ_SWORD = REGISTRY.register("topaz_sword", () -> new TopazSwordItem());
	public static final RegistryObject<Item> TANZANITE_ARMOR_HELMET = REGISTRY.register("tanzanite_armor_helmet", () -> new TanzaniteArmorItem.Helmet());
	public static final RegistryObject<Item> TANZANITE_ARMOR_CHESTPLATE = REGISTRY.register("tanzanite_armor_chestplate", () -> new TanzaniteArmorItem.Chestplate());
	public static final RegistryObject<Item> TANZANITE_ARMOR_LEGGINGS = REGISTRY.register("tanzanite_armor_leggings", () -> new TanzaniteArmorItem.Leggings());
	public static final RegistryObject<Item> TANZANITE_ARMOR_BOOTS = REGISTRY.register("tanzanite_armor_boots", () -> new TanzaniteArmorItem.Boots());
	public static final RegistryObject<Item> TANZANITE_SWORD = REGISTRY.register("tanzanite_sword", () -> new TanzaniteSwordItem());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_HELMET = REGISTRY.register("sapphire_armor_helmet", () -> new SapphireArmorItem.Helmet());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_CHESTPLATE = REGISTRY.register("sapphire_armor_chestplate", () -> new SapphireArmorItem.Chestplate());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_LEGGINGS = REGISTRY.register("sapphire_armor_leggings", () -> new SapphireArmorItem.Leggings());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_BOOTS = REGISTRY.register("sapphire_armor_boots", () -> new SapphireArmorItem.Boots());
	public static final RegistryObject<Item> SAPPHIRE_SWORD = REGISTRY.register("sapphire_sword", () -> new SapphireSwordItem());
	public static final RegistryObject<Item> SUNSTONE_ARMOR_HELMET = REGISTRY.register("sunstone_armor_helmet", () -> new SunstoneArmorItem.Helmet());
	public static final RegistryObject<Item> SUNSTONE_ARMOR_CHESTPLATE = REGISTRY.register("sunstone_armor_chestplate", () -> new SunstoneArmorItem.Chestplate());
	public static final RegistryObject<Item> SUNSTONE_ARMOR_LEGGINGS = REGISTRY.register("sunstone_armor_leggings", () -> new SunstoneArmorItem.Leggings());
	public static final RegistryObject<Item> SUNSTONE_ARMOR_BOOTS = REGISTRY.register("sunstone_armor_boots", () -> new SunstoneArmorItem.Boots());
	public static final RegistryObject<Item> SUNSTONE_SWORD = REGISTRY.register("sunstone_sword", () -> new SunstoneSwordItem());
	public static final RegistryObject<Item> TOURMALINE_SWORD = REGISTRY.register("tourmaline_sword", () -> new TourmalineSwordItem());
	public static final RegistryObject<Item> TOURMALINE_ARMOR_HELMET = REGISTRY.register("tourmaline_armor_helmet", () -> new TourmalineArmorItem.Helmet());
	public static final RegistryObject<Item> TOURMALINE_ARMOR_CHESTPLATE = REGISTRY.register("tourmaline_armor_chestplate", () -> new TourmalineArmorItem.Chestplate());
	public static final RegistryObject<Item> TOURMALINE_ARMOR_LEGGINGS = REGISTRY.register("tourmaline_armor_leggings", () -> new TourmalineArmorItem.Leggings());
	public static final RegistryObject<Item> TOURMALINE_ARMOR_BOOTS = REGISTRY.register("tourmaline_armor_boots", () -> new TourmalineArmorItem.Boots());
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SilverPickaxeItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final RegistryObject<Item> DEMONITA_PICKAXE = REGISTRY.register("demonita_pickaxe", () -> new DemonitaPickaxeItem());
	public static final RegistryObject<Item> DEMONITA_AXE = REGISTRY.register("demonita_axe", () -> new DemonitaAxeItem());
	public static final RegistryObject<Item> DEMONITA_SHOVEL = REGISTRY.register("demonita_shovel", () -> new DemonitaShovelItem());
	public static final RegistryObject<Item> DEMONITA_HOE = REGISTRY.register("demonita_hoe", () -> new DemonitaHoeItem());
	public static final RegistryObject<Item> FORGE_HAMMER = REGISTRY.register("forge_hammer", () -> new ForgeHammerItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> CITRINE_PICKAXE = REGISTRY.register("citrine_pickaxe", () -> new CitrinePickaxeItem());
	public static final RegistryObject<Item> CITRINE_AXE = REGISTRY.register("citrine_axe", () -> new CitrineAxeItem());
	public static final RegistryObject<Item> CITRINE_SHOVEL = REGISTRY.register("citrine_shovel", () -> new CitrineShovelItem());
	public static final RegistryObject<Item> CITRINE_HOE = REGISTRY.register("citrine_hoe", () -> new CitrineHoeItem());
	public static final RegistryObject<Item> AMETHYST_PICKAXE = REGISTRY.register("amethyst_pickaxe", () -> new AmethystPickaxeItem());
	public static final RegistryObject<Item> AMETHYST_AXE = REGISTRY.register("amethyst_axe", () -> new AmethystAxeItem());
	public static final RegistryObject<Item> AMETHYST_SHOVEL = REGISTRY.register("amethyst_shovel", () -> new AmethystShovelItem());
	public static final RegistryObject<Item> AMETHYST_HOE = REGISTRY.register("amethyst_hoe", () -> new AmethystHoeItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> GARNET_PICKAXE = REGISTRY.register("garnet_pickaxe", () -> new GarnetPickaxeItem());
	public static final RegistryObject<Item> GARNET_AXE = REGISTRY.register("garnet_axe", () -> new GarnetAxeItem());
	public static final RegistryObject<Item> GARNET_SHOVEL = REGISTRY.register("garnet_shovel", () -> new GarnetShovelItem());
	public static final RegistryObject<Item> GARNET_HOE = REGISTRY.register("garnet_hoe", () -> new GarnetHoeItem());
	public static final RegistryObject<Item> ZIRCON_PICKAXE = REGISTRY.register("zircon_pickaxe", () -> new ZirconPickaxeItem());
	public static final RegistryObject<Item> ZIRCON_AXE = REGISTRY.register("zircon_axe", () -> new ZirconAxeItem());
	public static final RegistryObject<Item> ZIRCON_SHOVEL = REGISTRY.register("zircon_shovel", () -> new ZirconShovelItem());
	public static final RegistryObject<Item> ZIRCON_HOE = REGISTRY.register("zircon_hoe", () -> new ZirconHoeItem());
	public static final RegistryObject<Item> TOPAZ_PICKAXE = REGISTRY.register("topaz_pickaxe", () -> new TopazPickaxeItem());
	public static final RegistryObject<Item> TOPAZ_AXE = REGISTRY.register("topaz_axe", () -> new TopazAxeItem());
	public static final RegistryObject<Item> TOPAZ_SHOVEL = REGISTRY.register("topaz_shovel", () -> new TopazShovelItem());
	public static final RegistryObject<Item> TOPAZ_HOE = REGISTRY.register("topaz_hoe", () -> new TopazHoeItem());
	public static final RegistryObject<Item> TANZANITE_PICKAXE = REGISTRY.register("tanzanite_pickaxe", () -> new TanzanitePickaxeItem());
	public static final RegistryObject<Item> TANZANITE_AXE = REGISTRY.register("tanzanite_axe", () -> new TanzaniteAxeItem());
	public static final RegistryObject<Item> TANZANITE_SHOVEL = REGISTRY.register("tanzanite_shovel", () -> new TanzaniteShovelItem());
	public static final RegistryObject<Item> TANZANITE_HOE = REGISTRY.register("tanzanite_hoe", () -> new TanzaniteHoeItem());
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = REGISTRY.register("sapphire_pickaxe", () -> new SapphirePickaxeItem());
	public static final RegistryObject<Item> SAPPHIRE_AXE = REGISTRY.register("sapphire_axe", () -> new SapphireAxeItem());
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = REGISTRY.register("sapphire_shovel", () -> new SapphireShovelItem());
	public static final RegistryObject<Item> SAPPHIRE_HOE = REGISTRY.register("sapphire_hoe", () -> new SapphireHoeItem());
	public static final RegistryObject<Item> SUNSTONE_PICKAXE = REGISTRY.register("sunstone_pickaxe", () -> new SunstonePickaxeItem());
	public static final RegistryObject<Item> SUNSTONE_AXE = REGISTRY.register("sunstone_axe", () -> new SunstoneAxeItem());
	public static final RegistryObject<Item> SUNSTONE_SHOVEL = REGISTRY.register("sunstone_shovel", () -> new SunstoneShovelItem());
	public static final RegistryObject<Item> SUNSTONE_HOE = REGISTRY.register("sunstone_hoe", () -> new SunstoneHoeItem());
	public static final RegistryObject<Item> TOURMALINE_PICKAXE = REGISTRY.register("tourmaline_pickaxe", () -> new TourmalinePickaxeItem());
	public static final RegistryObject<Item> TOURMALINE_AXE = REGISTRY.register("tourmaline_axe", () -> new TourmalineAxeItem());
	public static final RegistryObject<Item> TOURMALINE_SHOVEL = REGISTRY.register("tourmaline_shovel", () -> new TourmalineShovelItem());
	public static final RegistryObject<Item> TOURMALINE_HOE = REGISTRY.register("tourmaline_hoe", () -> new TourmalineHoeItem());
	public static final RegistryObject<Item> DEMONITA_ORE = block(MineterraModBlocks.DEMONITA_ORE);
	public static final RegistryObject<Item> DEMONITA_BLOCK = block(MineterraModBlocks.DEMONITA_BLOCK);
	public static final RegistryObject<Item> CITRINE_ORE = block(MineterraModBlocks.CITRINE_ORE);
	public static final RegistryObject<Item> CITRINE_BLOCK = block(MineterraModBlocks.CITRINE_BLOCK);
	public static final RegistryObject<Item> RUBY_ORE = block(MineterraModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_BLOCK = block(MineterraModBlocks.RUBY_BLOCK);
	public static final RegistryObject<Item> GARNET_ORE = block(MineterraModBlocks.GARNET_ORE);
	public static final RegistryObject<Item> GARNET_BLOCK = block(MineterraModBlocks.GARNET_BLOCK);
	public static final RegistryObject<Item> ZIRCON_ORE = block(MineterraModBlocks.ZIRCON_ORE);
	public static final RegistryObject<Item> ZIRCON_BLOCK = block(MineterraModBlocks.ZIRCON_BLOCK);
	public static final RegistryObject<Item> TOPAZ_ORE = block(MineterraModBlocks.TOPAZ_ORE);
	public static final RegistryObject<Item> TOPAZ_BLOCK = block(MineterraModBlocks.TOPAZ_BLOCK);
	public static final RegistryObject<Item> TANZANITE_ORE = block(MineterraModBlocks.TANZANITE_ORE);
	public static final RegistryObject<Item> TANZANITE_BLOCK = block(MineterraModBlocks.TANZANITE_BLOCK);
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(MineterraModBlocks.SAPPHIRE_ORE);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(MineterraModBlocks.SAPPHIRE_BLOCK);
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> SUNSTONE_ORE = block(MineterraModBlocks.SUNSTONE_ORE);
	public static final RegistryObject<Item> SUNSTONE_BLOCK = block(MineterraModBlocks.SUNSTONE_BLOCK);
	public static final RegistryObject<Item> TOURMALINE_ORE = block(MineterraModBlocks.TOURMALINE_ORE);
	public static final RegistryObject<Item> TOURMALINE_BLOCK = block(MineterraModBlocks.TOURMALINE_BLOCK);
	public static final RegistryObject<Item> DEMONITA = REGISTRY.register("demonita", () -> new DemonitaItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> CITRINE = REGISTRY.register("citrine", () -> new CitrineItem());
	public static final RegistryObject<Item> SUNSTONE = REGISTRY.register("sunstone", () -> new SunstoneItem());
	public static final RegistryObject<Item> TOURMALINE = REGISTRY.register("tourmaline", () -> new TourmalineItem());
	public static final RegistryObject<Item> GARNET = REGISTRY.register("garnet", () -> new GarnetItem());
	public static final RegistryObject<Item> ZIRCON = REGISTRY.register("zircon", () -> new ZirconItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> TANZANITE = REGISTRY.register("tanzanite", () -> new TanzaniteItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_ORE = block(MineterraModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> SILVER_BLOCK = block(MineterraModBlocks.SILVER_BLOCK);
	public static final RegistryObject<Item> TITANIUM_ARMOR_HELMET = REGISTRY.register("titanium_armor_helmet", () -> new TitaniumArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_ARMOR_CHESTPLATE = REGISTRY.register("titanium_armor_chestplate", () -> new TitaniumArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_ARMOR_LEGGINGS = REGISTRY.register("titanium_armor_leggings", () -> new TitaniumArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_ARMOR_BOOTS = REGISTRY.register("titanium_armor_boots", () -> new TitaniumArmorItem.Boots());
	public static final RegistryObject<Item> TITANIUM_ORE = block(MineterraModBlocks.TITANIUM_ORE);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(MineterraModBlocks.TITANIUM_BLOCK);
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> WOOD_STAFF = REGISTRY.register("wood_staff", () -> new WoodStaffItem());
	public static final RegistryObject<Item> MAGICAL_CASING = REGISTRY.register("magical_casing", () -> new MagicalCasingItem());
	public static final RegistryObject<Item> ARCANITE_STAFF = REGISTRY.register("arcanite_staff", () -> new StaffOfLesserMagicItem());
	public static final RegistryObject<Item> ARCANITE_ORE = block(MineterraModBlocks.ARCANITE_ORE);
	public static final RegistryObject<Item> ARCANITE_BLOCK = block(MineterraModBlocks.ARCANITE_BLOCK);
	public static final RegistryObject<Item> ARCANITE = REGISTRY.register("arcanite", () -> new ArcaniteItem());
	public static final RegistryObject<Item> ARCANITE_CATALYZER = REGISTRY.register("arcanite_catalyzer", () -> new ArcaniteCatalyzerItem());
	public static final RegistryObject<Item> EMPTY = REGISTRY.register("empty", () -> new EmptyItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
