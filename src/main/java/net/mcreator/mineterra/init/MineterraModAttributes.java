/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import net.mcreator.mineterra.MineterraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineterraModAttributes {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, MineterraMod.MODID);
	public static final RegistryObject<Attribute> CHAOS = ATTRIBUTES.register("chaos", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".chaos", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> MAGICDAMAGE = ATTRIBUTES.register("magic_damage", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".magic_damage", 0, 0, 2048)).setSyncable(true));
	public static final RegistryObject<Attribute> LIFESTEAL = ATTRIBUTES.register("life_steal", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".life_steal", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> STRENGTH = ATTRIBUTES.register("strength", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".strength", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> DEXTERITY = ATTRIBUTES.register("dexterity", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".dexterity", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> CONSTITUITION = ATTRIBUTES.register("constituition", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".constituition", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> INTELLIGENCE = ATTRIBUTES.register("intelligence", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".intelligence", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> CHARISMA = ATTRIBUTES.register("charisma", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".charisma", 0, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> WISDOM = ATTRIBUTES.register("wisdom", () -> (new RangedAttribute("attribute." + MineterraMod.MODID + ".wisdom", 0, 0, 100)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, CHAOS.get());
		event.add(EntityType.PLAYER, MAGICDAMAGE.get());
		event.add(EntityType.PLAYER, STRENGTH.get());
		event.add(EntityType.PLAYER, DEXTERITY.get());
		event.add(EntityType.PLAYER, CONSTITUITION.get());
		event.add(EntityType.PLAYER, INTELLIGENCE.get());
		event.add(EntityType.PLAYER, CHARISMA.get());
		event.add(EntityType.PLAYER, WISDOM.get());
	}

	@Mod.EventBusSubscriber
	private class Utils {
		@SubscribeEvent
		public static void persistAttributes(PlayerEvent.Clone event) {
			Player oldP = event.getOriginal();
			Player newP = (Player) event.getEntity();
			newP.getAttribute(MAGICDAMAGE.get()).setBaseValue(oldP.getAttribute(MAGICDAMAGE.get()).getBaseValue());
			newP.getAttribute(STRENGTH.get()).setBaseValue(oldP.getAttribute(STRENGTH.get()).getBaseValue());
			newP.getAttribute(DEXTERITY.get()).setBaseValue(oldP.getAttribute(DEXTERITY.get()).getBaseValue());
			newP.getAttribute(CONSTITUITION.get()).setBaseValue(oldP.getAttribute(CONSTITUITION.get()).getBaseValue());
			newP.getAttribute(INTELLIGENCE.get()).setBaseValue(oldP.getAttribute(INTELLIGENCE.get()).getBaseValue());
			newP.getAttribute(CHARISMA.get()).setBaseValue(oldP.getAttribute(CHARISMA.get()).getBaseValue());
			newP.getAttribute(WISDOM.get()).setBaseValue(oldP.getAttribute(WISDOM.get()).getBaseValue());
		}
	}
}
