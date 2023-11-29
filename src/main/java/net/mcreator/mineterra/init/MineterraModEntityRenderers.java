
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineterraModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MineterraModEntities.ARCANITE_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineterraModEntities.LIGHT_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineterraModEntities.FIRE_STAFF.get(), ThrownItemRenderer::new);
	}
}
