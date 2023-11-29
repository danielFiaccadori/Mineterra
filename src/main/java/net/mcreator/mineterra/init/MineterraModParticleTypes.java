
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
	public static final RegistryObject<SimpleParticleType> ARCANITE_RAY = REGISTRY.register("arcanite_ray", () -> new SimpleParticleType(true));
}
