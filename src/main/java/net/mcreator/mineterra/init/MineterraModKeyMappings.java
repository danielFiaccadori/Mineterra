
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mineterra.network.AttributeUpgraderOpenMessage;
import net.mcreator.mineterra.network.AbilityMessage;
import net.mcreator.mineterra.MineterraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MineterraModKeyMappings {
	public static final KeyMapping ABILITY = new KeyMapping("key.mineterra.ability", GLFW.GLFW_KEY_Q, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AbilityMessage(0, 0));
				AbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ATTRIBUTE_UPGRADER_OPEN = new KeyMapping("key.mineterra.attribute_upgrader_open", GLFW.GLFW_KEY_P, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderOpenMessage(0, 0));
				AttributeUpgraderOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ABILITY);
		event.register(ATTRIBUTE_UPGRADER_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ABILITY.consumeClick();
				ATTRIBUTE_UPGRADER_OPEN.consumeClick();
			}
		}
	}
}
