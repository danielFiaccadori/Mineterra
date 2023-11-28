package net.mcreator.mineterra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mineterra.world.inventory.GameStartCharacterCreationMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GameStartCharacterCreationScreen extends AbstractContainerScreen<GameStartCharacterCreationMenu> {
	private final static HashMap<String, Object> guistate = GameStartCharacterCreationMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox Human;
	Checkbox Celestial;
	Checkbox Abyssal;
	Checkbox SonOfTheTide;
	Checkbox Orc;
	Checkbox Feralit;
	Checkbox Gnome;
	Checkbox Dwarf;
	Checkbox HighElf;
	Checkbox ForestElf;
	Button button_next;
	Button button_prev;
	Button button_select;

	public GameStartCharacterCreationScreen(GameStartCharacterCreationMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 246;
		this.imageHeight = 172;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("mineterra:textures/screens/game_start_character_creation.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/ezgif.com-webp-to-png.png"), this.leftPos + -132, this.topPos + -63, 0, 0, 500, 281, 500, 281);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/game_start_character_creation.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 246, 172, 246, 172);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.game_start_character_creation.label_human"), 87, 15, -3355648, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_next = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_next"), e -> {
		}).bounds(this.leftPos + 189, this.topPos + 141, 46, 20).build();
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
		button_prev = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_prev"), e -> {
		}).bounds(this.leftPos + 9, this.topPos + 141, 51, 20).build();
		guistate.put("button:button_prev", button_prev);
		this.addRenderableWidget(button_prev);
		button_select = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_select"), e -> {
		}).bounds(this.leftPos + 95, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		Human = new Checkbox(this.leftPos + 14, this.topPos + 36, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Human"), false);
		guistate.put("checkbox:Human", Human);
		this.addRenderableWidget(Human);
		Celestial = new Checkbox(this.leftPos + 14, this.topPos + 59, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Celestial"), false);
		guistate.put("checkbox:Celestial", Celestial);
		this.addRenderableWidget(Celestial);
		Abyssal = new Checkbox(this.leftPos + 14, this.topPos + 82, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Abyssal"), false);
		guistate.put("checkbox:Abyssal", Abyssal);
		this.addRenderableWidget(Abyssal);
		SonOfTheTide = new Checkbox(this.leftPos + 14, this.topPos + 105, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.SonOfTheTide"), false);
		guistate.put("checkbox:SonOfTheTide", SonOfTheTide);
		this.addRenderableWidget(SonOfTheTide);
		Orc = new Checkbox(this.leftPos + 88, this.topPos + 36, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Orc"), false);
		guistate.put("checkbox:Orc", Orc);
		this.addRenderableWidget(Orc);
		Feralit = new Checkbox(this.leftPos + 88, this.topPos + 59, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Feralit"), false);
		guistate.put("checkbox:Feralit", Feralit);
		this.addRenderableWidget(Feralit);
		Gnome = new Checkbox(this.leftPos + 88, this.topPos + 82, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Gnome"), false);
		guistate.put("checkbox:Gnome", Gnome);
		this.addRenderableWidget(Gnome);
		Dwarf = new Checkbox(this.leftPos + 88, this.topPos + 105, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.Dwarf"), false);
		guistate.put("checkbox:Dwarf", Dwarf);
		this.addRenderableWidget(Dwarf);
		HighElf = new Checkbox(this.leftPos + 164, this.topPos + 36, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.HighElf"), false);
		guistate.put("checkbox:HighElf", HighElf);
		this.addRenderableWidget(HighElf);
		ForestElf = new Checkbox(this.leftPos + 164, this.topPos + 59, 20, 20, Component.translatable("gui.mineterra.game_start_character_creation.ForestElf"), false);
		guistate.put("checkbox:ForestElf", ForestElf);
		this.addRenderableWidget(ForestElf);
	}
}
