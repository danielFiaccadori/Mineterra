package net.mcreator.mineterra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mineterra.world.inventory.GameStartCharacterCreationMenu;
import net.mcreator.mineterra.network.GameStartCharacterCreationButtonMessage;
import net.mcreator.mineterra.MineterraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GameStartCharacterCreationScreen extends AbstractContainerScreen<GameStartCharacterCreationMenu> {
	private final static HashMap<String, Object> guistate = GameStartCharacterCreationMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_human;
	Button button_human1;
	Button button_human2;
	Button button_human3;
	Button button_human4;
	Button button_human5;
	Button button_human6;
	Button button_human7;
	Button button_human8;
	Button button_human9;

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
		if (mouseX > leftPos + 0 && mouseX < leftPos + 24 && mouseY > topPos + 146 && mouseY < topPos + 170)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mineterra.game_start_character_creation.tooltip_offsprings_are_the_races_the"), mouseX, mouseY);
		if (mouseX > leftPos + 43 && mouseX < leftPos + 67 && mouseY > topPos + 58 && mouseY < topPos + 82)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mineterra.game_start_character_creation.tooltip_mainly_composed_by_humans_imper"), mouseX, mouseY);
		if (mouseX > leftPos + 97 && mouseX < leftPos + 121 && mouseY > topPos + 58 && mouseY < topPos + 82)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mineterra.game_start_character_creation.tooltip_good_at_mining_dwarfen_are_peop"), mouseX, mouseY);
		if (mouseX > leftPos + 151 && mouseX < leftPos + 175 && mouseY > topPos + 58 && mouseY < topPos + 82)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mineterra.game_start_character_creation.tooltip_brute"), mouseX, mouseY);
		if (mouseX > leftPos + 43 && mouseX < leftPos + 67 && mouseY > topPos + 83 && mouseY < topPos + 107)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mineterra.game_start_character_creation.tooltip_people_with_haerean_offspring_ar"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/ezgif.com-webp-to-png.png"), this.leftPos + -132, this.topPos + -62, 0, 0, 500, 281, 500, 281);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.game_start_character_creation.label_pick_an_race"), 10, 11, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.game_start_character_creation.label_about_you_to_let_you_enter_in_ou"), 10, 22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.game_start_character_creation.label_first_tell_me_your_starting_fun"), 48, 42, -10066330, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.game_start_character_creation.label_empty"), 9, 153, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_human = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(0, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 61, 51, 20).build();
		guistate.put("button:button_human", button_human);
		this.addRenderableWidget(button_human);
		button_human1 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human1"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(1, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 84, 51, 20).build();
		guistate.put("button:button_human1", button_human1);
		this.addRenderableWidget(button_human1);
		button_human2 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human2"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(2, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 177, this.topPos + 61, 51, 20).build();
		guistate.put("button:button_human2", button_human2);
		this.addRenderableWidget(button_human2);
		button_human3 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human3"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(3, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 107, 51, 20).build();
		guistate.put("button:button_human3", button_human3);
		this.addRenderableWidget(button_human3);
		button_human4 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human4"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(4, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 61, 51, 20).build();
		guistate.put("button:button_human4", button_human4);
		this.addRenderableWidget(button_human4);
		button_human5 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human5"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(5, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 84, 51, 20).build();
		guistate.put("button:button_human5", button_human5);
		this.addRenderableWidget(button_human5);
		button_human6 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human6"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(6, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 177, this.topPos + 84, 51, 20).build();
		guistate.put("button:button_human6", button_human6);
		this.addRenderableWidget(button_human6);
		button_human7 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human7"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(7, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 107, 51, 20).build();
		guistate.put("button:button_human7", button_human7);
		this.addRenderableWidget(button_human7);
		button_human8 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human8"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(8, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 61, 51, 20).build();
		guistate.put("button:button_human8", button_human8);
		this.addRenderableWidget(button_human8);
		button_human9 = Button.builder(Component.translatable("gui.mineterra.game_start_character_creation.button_human9"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new GameStartCharacterCreationButtonMessage(9, x, y, z));
				GameStartCharacterCreationButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 84, 51, 20).build();
		guistate.put("button:button_human9", button_human9);
		this.addRenderableWidget(button_human9);
	}
}
