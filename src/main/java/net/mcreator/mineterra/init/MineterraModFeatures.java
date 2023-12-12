
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mineterra.world.features.ores.TitaniumOreFeature;
import net.mcreator.mineterra.world.features.ores.SilverOreFeature;
import net.mcreator.mineterra.world.features.ores.DemonitaOreFeature;
import net.mcreator.mineterra.world.features.ores.CelestiumOreFeature;
import net.mcreator.mineterra.world.features.ores.ArcanitiumOreFeature;
import net.mcreator.mineterra.MineterraMod;

@Mod.EventBusSubscriber
public class MineterraModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MineterraMod.MODID);
	public static final RegistryObject<Feature<?>> DEMONITA_ORE = REGISTRY.register("demonita_ore", DemonitaOreFeature::new);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::new);
	public static final RegistryObject<Feature<?>> ARCANITIUM_ORE = REGISTRY.register("arcanitium_ore", ArcanitiumOreFeature::new);
	public static final RegistryObject<Feature<?>> CELESTIUM_ORE = REGISTRY.register("celestium_ore", CelestiumOreFeature::new);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
}
