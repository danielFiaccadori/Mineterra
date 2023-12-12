package net.mcreator.mineterra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mineterra.world.inventory.AttributeUpgraderMenu;
import net.mcreator.mineterra.procedures.DisplayWisdomProcedure;
import net.mcreator.mineterra.procedures.DisplayStrenghtProcedure;
import net.mcreator.mineterra.procedures.DisplayPointsProcedure;
import net.mcreator.mineterra.procedures.DisplayIntelligenceProcedure;
import net.mcreator.mineterra.procedures.DisplayDexterityProcedure;
import net.mcreator.mineterra.procedures.DisplayConstituitionProcedure;
import net.mcreator.mineterra.procedures.DisplayCharismaProcedure;
import net.mcreator.mineterra.network.AttributeUpgraderButtonMessage;
import net.mcreator.mineterra.MineterraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AttributeUpgraderScreen extends AbstractContainerScreen<AttributeUpgraderMenu> {
	private final static HashMap<String, Object> guistate = AttributeUpgraderMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;

	public AttributeUpgraderScreen(AttributeUpgraderMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 265;
		this.imageHeight = 194;
	}

	private static final ResourceLocation texture = new ResourceLocation("mineterra:textures/screens/attribute_upgrader.png");

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

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile095.png"), this.leftPos + 36, this.topPos + 65, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile275.png"), this.leftPos + -16, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile109.png"), this.leftPos + 99, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile047.png"), this.leftPos + 156, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile143.png"), this.leftPos + 273, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile380.png"), this.leftPos + 210, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/pixil-frame-0_1.png"), this.leftPos + -119, this.topPos + -58, 0, 0, 500, 281, 500, 281);

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
		guiGraphics.drawString(this.font,

				DisplayConstituitionProcedure.execute(entity), 26, 86, -1, false);
		guiGraphics.drawString(this.font,

				DisplayStrenghtProcedure.execute(entity), 233, 86, -1, false);
		guiGraphics.drawString(this.font,

				DisplayDexterityProcedure.execute(entity), 202, 164, -1, false);
		guiGraphics.drawString(this.font,

				DisplayIntelligenceProcedure.execute(entity), 207, 13, -1, false);
		guiGraphics.drawString(this.font,

				DisplayCharismaProcedure.execute(entity), 53, 169, -1, false);
		guiGraphics.drawString(this.font,

				DisplayWisdomProcedure.execute(entity), 45, 13, -1, false);
		guiGraphics.drawString(this.font,

				DisplayPointsProcedure.execute(entity), 129, 85, -13312, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader.button_empty"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(0, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -3, this.topPos + 9, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader.button_empty1"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(1, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 227, this.topPos + 8, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader.button_empty2"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(2, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 254, this.topPos + 81, 30, 20).build();
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader.button_empty3"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(3, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -23, this.topPos + 81, 30, 20).build();
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader.button_empty4"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(4, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 221, this.topPos + 159, 30, 20).build();
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
		button_empty5 = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader.button_empty5"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(5, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 164, 30, 20).build();
		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);
	}
}
