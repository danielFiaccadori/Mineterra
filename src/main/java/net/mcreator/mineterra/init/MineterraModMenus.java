
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
import net.mcreator.mineterra.MineterraMod;

public class MineterraModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MineterraMod.MODID);
	public static final RegistryObject<MenuType<GameStartCharacterCreationMenu>> GAME_START_CHARACTER_CREATION = REGISTRY.register("game_start_character_creation", () -> IForgeMenuType.create(GameStartCharacterCreationMenu::new));
}
