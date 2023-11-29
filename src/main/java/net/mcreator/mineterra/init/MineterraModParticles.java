
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mineterra.client.particle.BloodParticle;
import net.mcreator.mineterra.client.particle.ArcaniteRayParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineterraModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MineterraModParticleTypes.BLOOD.get(), BloodParticle::provider);
		event.registerSpriteSet(MineterraModParticleTypes.ARCANITE_RAY.get(), ArcaniteRayParticle::provider);
	}
}
