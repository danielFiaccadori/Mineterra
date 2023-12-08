
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mineterra.world.features.ores.ZirconOreFeature;
import net.mcreator.mineterra.world.features.ores.TourmalineOreFeature;
import net.mcreator.mineterra.world.features.ores.TopazOreFeature;
import net.mcreator.mineterra.world.features.ores.TitaniumOreFeature;
import net.mcreator.mineterra.world.features.ores.TanzaniteOreFeature;
import net.mcreator.mineterra.world.features.ores.SunstoneOreFeature;
import net.mcreator.mineterra.world.features.ores.SilverOreFeature;
import net.mcreator.mineterra.world.features.ores.SapphireOreFeature;
import net.mcreator.mineterra.world.features.ores.RubyOreFeature;
import net.mcreator.mineterra.world.features.ores.GarnetOreFeature;
import net.mcreator.mineterra.world.features.ores.DemonitaOreFeature;
import net.mcreator.mineterra.world.features.ores.CitrineOreFeature;
import net.mcreator.mineterra.world.features.ores.CelestiumOreFeature;
import net.mcreator.mineterra.world.features.ores.ArcanitiumOreFeature;
import net.mcreator.mineterra.MineterraMod;

@Mod.EventBusSubscriber
public class MineterraModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MineterraMod.MODID);
	public static final RegistryObject<Feature<?>> DEMONITA_ORE = REGISTRY.register("demonita_ore", DemonitaOreFeature::new);
	public static final RegistryObject<Feature<?>> CITRINE_ORE = REGISTRY.register("citrine_ore", CitrineOreFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> GARNET_ORE = REGISTRY.register("garnet_ore", GarnetOreFeature::new);
	public static final RegistryObject<Feature<?>> ZIRCON_ORE = REGISTRY.register("zircon_ore", ZirconOreFeature::new);
	public static final RegistryObject<Feature<?>> TOPAZ_ORE = REGISTRY.register("topaz_ore", TopazOreFeature::new);
	public static final RegistryObject<Feature<?>> TANZANITE_ORE = REGISTRY.register("tanzanite_ore", TanzaniteOreFeature::new);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::new);
	public static final RegistryObject<Feature<?>> SUNSTONE_ORE = REGISTRY.register("sunstone_ore", SunstoneOreFeature::new);
	public static final RegistryObject<Feature<?>> TOURMALINE_ORE = REGISTRY.register("tourmaline_ore", TourmalineOreFeature::new);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::new);
	public static final RegistryObject<Feature<?>> ARCANITIUM_ORE = REGISTRY.register("arcanitium_ore", ArcanitiumOreFeature::new);
	public static final RegistryObject<Feature<?>> CELESTIUM_ORE = REGISTRY.register("celestium_ore", CelestiumOreFeature::new);
}
