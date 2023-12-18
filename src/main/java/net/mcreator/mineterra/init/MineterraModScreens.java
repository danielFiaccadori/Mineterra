
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
import net.mcreator.mineterra.client.gui.BaseScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderWisdomScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderStrengthScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderIntelligenceScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderDexterityScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderConstituitionScreen;
import net.mcreator.mineterra.client.gui.AttributeUpgraderCharismaScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineterraModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MineterraModMenus.GAME_START_CHARACTER_CREATION.get(), GameStartCharacterCreationScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER.get(), AttributeUpgraderScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER_CONSTITUITION.get(), AttributeUpgraderConstituitionScreen::new);
			MenuScreens.register(MineterraModMenus.BASE.get(), BaseScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER_DEXTERITY.get(), AttributeUpgraderDexterityScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER_INTELLIGENCE.get(), AttributeUpgraderIntelligenceScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER_WISDOM.get(), AttributeUpgraderWisdomScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER_STRENGTH.get(), AttributeUpgraderStrengthScreen::new);
			MenuScreens.register(MineterraModMenus.ATTRIBUTE_UPGRADER_CHARISMA.get(), AttributeUpgraderCharismaScreen::new);
		});
	}
}
