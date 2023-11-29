
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mineterra.client.particle.BloodParticle;
import net.mcreator.mineterra.client.particle.ArcaniteParticleParticle;
import net.mcreator.mineterra.client.particle.ArcaniteParticle2Particle;
import net.mcreator.mineterra.client.particle.ArcanitePArticle3Particle;
import net.mcreator.mineterra.client.particle.ArcaniteAshTranslucnetParticle;
import net.mcreator.mineterra.client.particle.ArcaniteAshParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineterraModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MineterraModParticleTypes.BLOOD.get(), BloodParticle::provider);
		event.registerSpriteSet(MineterraModParticleTypes.ARCANITE_PARTICLE.get(), ArcaniteParticleParticle::provider);
		event.registerSpriteSet(MineterraModParticleTypes.ARCANITE_PARTICLE_2.get(), ArcaniteParticle2Particle::provider);
		event.registerSpriteSet(MineterraModParticleTypes.ARCANITE_P_ARTICLE_3.get(), ArcanitePArticle3Particle::provider);
		event.registerSpriteSet(MineterraModParticleTypes.ARCANITE_ASH.get(), ArcaniteAshParticle::provider);
		event.registerSpriteSet(MineterraModParticleTypes.ARCANITE_ASH_TRANSLUCNET.get(), ArcaniteAshTranslucnetParticle::provider);
	}
}
