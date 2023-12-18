
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mineterra.world.inventory.GameStartCharacterCreationMenu;
import net.mcreator.mineterra.world.inventory.BaseMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderWisdomMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderStrengthMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderIntelligenceMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderDexterityMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderConstituitionMenu;
import net.mcreator.mineterra.world.inventory.AttributeUpgraderCharismaMenu;
import net.mcreator.mineterra.MineterraMod;

public class MineterraModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MineterraMod.MODID);
	public static final RegistryObject<MenuType<GameStartCharacterCreationMenu>> GAME_START_CHARACTER_CREATION = REGISTRY.register("game_start_character_creation", () -> IForgeMenuType.create(GameStartCharacterCreationMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderMenu>> ATTRIBUTE_UPGRADER = REGISTRY.register("attribute_upgrader", () -> IForgeMenuType.create(AttributeUpgraderMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderConstituitionMenu>> ATTRIBUTE_UPGRADER_CONSTITUITION = REGISTRY.register("attribute_upgrader_constituition", () -> IForgeMenuType.create(AttributeUpgraderConstituitionMenu::new));
	public static final RegistryObject<MenuType<BaseMenu>> BASE = REGISTRY.register("base", () -> IForgeMenuType.create(BaseMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderDexterityMenu>> ATTRIBUTE_UPGRADER_DEXTERITY = REGISTRY.register("attribute_upgrader_dexterity", () -> IForgeMenuType.create(AttributeUpgraderDexterityMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderIntelligenceMenu>> ATTRIBUTE_UPGRADER_INTELLIGENCE = REGISTRY.register("attribute_upgrader_intelligence", () -> IForgeMenuType.create(AttributeUpgraderIntelligenceMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderWisdomMenu>> ATTRIBUTE_UPGRADER_WISDOM = REGISTRY.register("attribute_upgrader_wisdom", () -> IForgeMenuType.create(AttributeUpgraderWisdomMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderStrengthMenu>> ATTRIBUTE_UPGRADER_STRENGTH = REGISTRY.register("attribute_upgrader_strength", () -> IForgeMenuType.create(AttributeUpgraderStrengthMenu::new));
	public static final RegistryObject<MenuType<AttributeUpgraderCharismaMenu>> ATTRIBUTE_UPGRADER_CHARISMA = REGISTRY.register("attribute_upgrader_charisma", () -> IForgeMenuType.create(AttributeUpgraderCharismaMenu::new));
}
