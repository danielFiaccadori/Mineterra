package net.mcreator.mineterra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mineterra.world.inventory.AttributeUpgraderMenu;
import net.mcreator.mineterra.network.AttributeUpgraderButtonMessage;
import net.mcreator.mineterra.MineterraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AttributeUpgraderScreen extends AbstractContainerScreen<AttributeUpgraderMenu> {
	private final static HashMap<String, Object> guistate = AttributeUpgraderMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_constituition;
	ImageButton imagebutton_dexterity;
	ImageButton imagebutton_intelligence;
	ImageButton imagebutton_wisdom;
	ImageButton imagebutton_strength;
	ImageButton imagebutton_charisma;

	public AttributeUpgraderScreen(AttributeUpgraderMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
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

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/pixil-frame-0_2.png"), this.leftPos + -154, this.topPos + -44, 0, 0, 500, 281, 500, 281);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader.label_constituition"), -73, 57, -3355444, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader.label_dexterity"), -94, 166, -6710887, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader.label_intelligra"), 210, 40, -6710887, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader.label_wisdomeon"), 21, 52, -6710887, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader.label_stellarnox"), 71, 148, -6710887, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader.label_luminaryxion"), 191, 155, -6710887, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_constituition = new ImageButton(this.leftPos + -89, this.topPos + -5, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_constituition.png"), 64, 128, e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(0, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_constituition", imagebutton_constituition);
		this.addRenderableWidget(imagebutton_constituition);
		imagebutton_dexterity = new ImageButton(this.leftPos + -102, this.topPos + 107, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_dexterity.png"), 64, 128, e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(1, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dexterity", imagebutton_dexterity);
		this.addRenderableWidget(imagebutton_dexterity);
		imagebutton_intelligence = new ImageButton(this.leftPos + 210, this.topPos + -21, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_intelligence.png"), 64, 128, e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(2, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_intelligence", imagebutton_intelligence);
		this.addRenderableWidget(imagebutton_intelligence);
		imagebutton_wisdom = new ImageButton(this.leftPos + 11, this.topPos + -9, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_wisdom.png"), 64, 128, e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(3, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wisdom", imagebutton_wisdom);
		this.addRenderableWidget(imagebutton_wisdom);
		imagebutton_strength = new ImageButton(this.leftPos + 68, this.topPos + 84, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_strength.png"), 64, 128, e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(4, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_strength", imagebutton_strength);
		this.addRenderableWidget(imagebutton_strength);
		imagebutton_charisma = new ImageButton(this.leftPos + 190, this.topPos + 104, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_charisma.png"), 64, 128, e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderButtonMessage(5, x, y, z));
				AttributeUpgraderButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_charisma", imagebutton_charisma);
		this.addRenderableWidget(imagebutton_charisma);
	}
}
