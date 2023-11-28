
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.mineterra.potion.TideBlessingMobEffect;
import net.mcreator.mineterra.potion.SunBlessingMobEffect;
import net.mcreator.mineterra.potion.SoulStealMobEffect;
import net.mcreator.mineterra.potion.SoulHealMobEffect;
import net.mcreator.mineterra.potion.SmallAndEfficientMobEffect;
import net.mcreator.mineterra.potion.SangramentoMobEffect;
import net.mcreator.mineterra.potion.InsatableHungerMobEffect;
import net.mcreator.mineterra.potion.ForestBlessingMobEffect;
import net.mcreator.mineterra.potion.FerocityMobEffect;
import net.mcreator.mineterra.potion.DarkRitualMobEffect;
import net.mcreator.mineterra.potion.BestialDomainMobEffect;
import net.mcreator.mineterra.MineterraMod;

public class MineterraModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MineterraMod.MODID);
	public static final RegistryObject<MobEffect> SUN_BLESSING = REGISTRY.register("sun_blessing", () -> new SunBlessingMobEffect());
	public static final RegistryObject<MobEffect> INSATABLE_HUNGER = REGISTRY.register("insatable_hunger", () -> new InsatableHungerMobEffect());
	public static final RegistryObject<MobEffect> TIDE_BLESSING = REGISTRY.register("tide_blessing", () -> new TideBlessingMobEffect());
	public static final RegistryObject<MobEffect> SMALL_AND_EFFICIENT = REGISTRY.register("small_and_efficient", () -> new SmallAndEfficientMobEffect());
	public static final RegistryObject<MobEffect> FOREST_BLESSING = REGISTRY.register("forest_blessing", () -> new ForestBlessingMobEffect());
	public static final RegistryObject<MobEffect> FEROCITY = REGISTRY.register("ferocity", () -> new FerocityMobEffect());
	public static final RegistryObject<MobEffect> BESTIAL_DOMAIN = REGISTRY.register("bestial_domain", () -> new BestialDomainMobEffect());
	public static final RegistryObject<MobEffect> SANGRAMENTO = REGISTRY.register("sangramento", () -> new SangramentoMobEffect());
	public static final RegistryObject<MobEffect> DARK_RITUAL = REGISTRY.register("dark_ritual", () -> new DarkRitualMobEffect());
	public static final RegistryObject<MobEffect> SOUL_STEAL = REGISTRY.register("soul_steal", () -> new SoulStealMobEffect());
	public static final RegistryObject<MobEffect> SOUL_HEAL = REGISTRY.register("soul_heal", () -> new SoulHealMobEffect());
}
