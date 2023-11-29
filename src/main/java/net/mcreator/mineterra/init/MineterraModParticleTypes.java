
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.mineterra.MineterraMod;

public class MineterraModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MineterraMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLOOD = REGISTRY.register("blood", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ARCANITE_PARTICLE = REGISTRY.register("arcanite_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ARCANITE_PARTICLE_2 = REGISTRY.register("arcanite_particle_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ARCANITE_P_ARTICLE_3 = REGISTRY.register("arcanite_p_article_3", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ARCANITE_ASH = REGISTRY.register("arcanite_ash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> ARCANITE_ASH_TRANSLUCNET = REGISTRY.register("arcanite_ash_translucnet", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> LIGHT_ORB_PARTICLE = REGISTRY.register("light_orb_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LIGHT_FLASH = REGISTRY.register("light_flash", () -> new SimpleParticleType(false));
}
