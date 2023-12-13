
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineterra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mineterra.block.TitaniumOreBlock;
import net.mcreator.mineterra.block.TitaniumBlockBlock;
import net.mcreator.mineterra.block.SteelBlockBlock;
import net.mcreator.mineterra.block.SilverOreBlock;
import net.mcreator.mineterra.block.SilverBlockBlock;
import net.mcreator.mineterra.block.RubyOreBlock;
import net.mcreator.mineterra.block.RubyBlockBlock;
import net.mcreator.mineterra.block.GarnetOreBlock;
import net.mcreator.mineterra.block.GarnetBlockBlock;
import net.mcreator.mineterra.block.DemonitaOreBlock;
import net.mcreator.mineterra.block.DemonitaBlockBlock;
import net.mcreator.mineterra.block.CitrineOreBlock;
import net.mcreator.mineterra.block.CitrineBlockBlock;
import net.mcreator.mineterra.block.CelestiumOreBlock;
import net.mcreator.mineterra.block.CelestiumBlockBlock;
import net.mcreator.mineterra.block.ArcanitiumOreBlock;
import net.mcreator.mineterra.block.ArcanitiumBlockBlock;
import net.mcreator.mineterra.MineterraMod;

public class MineterraModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineterraMod.MODID);
	public static final RegistryObject<Block> DEMONITA_ORE = REGISTRY.register("demonita_ore", () -> new DemonitaOreBlock());
	public static final RegistryObject<Block> DEMONITA_BLOCK = REGISTRY.register("demonita_block", () -> new DemonitaBlockBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> ARCANITIUM_ORE = REGISTRY.register("arcanitium_ore", () -> new ArcanitiumOreBlock());
	public static final RegistryObject<Block> ARCANITIUM_BLOCK = REGISTRY.register("arcanitium_block", () -> new ArcanitiumBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> CELESTIUM_ORE = REGISTRY.register("celestium_ore", () -> new CelestiumOreBlock());
	public static final RegistryObject<Block> CELESTIUM_BLOCK = REGISTRY.register("celestium_block", () -> new CelestiumBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> GARNET_ORE = REGISTRY.register("garnet_ore", () -> new GarnetOreBlock());
	public static final RegistryObject<Block> GARNET_BLOCK = REGISTRY.register("garnet_block", () -> new GarnetBlockBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> CITRINE_ORE = REGISTRY.register("citrine_ore", () -> new CitrineOreBlock());
	public static final RegistryObject<Block> CITRINE_BLOCK = REGISTRY.register("citrine_block", () -> new CitrineBlockBlock());
}
