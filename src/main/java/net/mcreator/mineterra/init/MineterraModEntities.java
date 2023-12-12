
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineterra.entity.StaffOfLesserMagicEntity;
import net.mcreator.mineterra.entity.LightStaffEntity;
import net.mcreator.mineterra.entity.FireStaffEntity;
import net.mcreator.mineterra.MineterraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineterraModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MineterraMod.MODID);
	public static final RegistryObject<EntityType<StaffOfLesserMagicEntity>> ARCANITE_STAFF_WAND = register("projectile_arcanite_staff_wand", EntityType.Builder.<StaffOfLesserMagicEntity>of(StaffOfLesserMagicEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StaffOfLesserMagicEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightStaffEntity>> LIGHT_STAFF_WAND = register("projectile_light_staff_wand",
			EntityType.Builder.<LightStaffEntity>of(LightStaffEntity::new, MobCategory.MISC).setCustomClientFactory(LightStaffEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireStaffEntity>> FIRE_STAFF_WAND = register("projectile_fire_staff_wand",
			EntityType.Builder.<FireStaffEntity>of(FireStaffEntity::new, MobCategory.MISC).setCustomClientFactory(FireStaffEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
