
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mineterra.client.gui.GameStartCharacterCreationScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineterraModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MineterraModMenus.GAME_START_CHARACTER_CREATION.get(), GameStartCharacterCreationScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER.get(), AttributeUpgraderScreen::new);
		});
	}
}
