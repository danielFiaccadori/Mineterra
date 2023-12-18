package net.mcreator.mineterra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mineterra.world.inventory.AttributeUpgraderStrengthMenu;
import net.mcreator.mineterra.procedures.DisplayStrenghtProcedure;
import net.mcreator.mineterra.procedures.DisplayPointsProcedure;
import net.mcreator.mineterra.network.AttributeUpgraderStrengthButtonMessage;
import net.mcreator.mineterra.MineterraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AttributeUpgraderStrengthScreen extends AbstractContainerScreen<AttributeUpgraderStrengthMenu> {
	private final static HashMap<String, Object> guistate = AttributeUpgraderStrengthMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	ImageButton imagebutton_constituition;

	public AttributeUpgraderStrengthScreen(AttributeUpgraderStrengthMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
		this.imageHeight = 194;
	}

	private static final ResourceLocation texture = new ResourceLocation("mineterra:textures/screens/attribute_upgrader_strength.png");

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

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile095.png"), this.leftPos + -7, this.topPos + 65, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile275.png"), this.leftPos + -59, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile109.png"), this.leftPos + 56, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile047.png"), this.leftPos + 113, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile143.png"), this.leftPos + 230, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/tile380.png"), this.leftPos + 167, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/pixil-frame-0_2.png"), this.leftPos + -150, this.topPos + -44, 0, 0, 500, 281, 500, 281);

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

				DisplayStrenghtProcedure.execute(entity), 69, 109, -1, false);
		guiGraphics.drawString(this.font,

				DisplayPointsProcedure.execute(entity), 61, -12, -13312, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader_strength.label_available_attribute_points"), -82, -12, -3355444, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader_strength.label_this_attribute_is_mostly_recomme"), -96, 195, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mineterra.attribute_upgrader_strength.label_constituition"), 74, 35, -256, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader_strength.button_empty"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderStrengthButtonMessage(0, x, y, z));
				AttributeUpgraderStrengthButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 98, this.topPos + 104, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.mineterra.attribute_upgrader_strength.button_empty1"), e -> {
			if (true) {
				MineterraMod.PACKET_HANDLER.sendToServer(new AttributeUpgraderStrengthButtonMessage(1, x, y, z));
				AttributeUpgraderStrengthButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -118, this.topPos + -17, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		imagebutton_constituition = new ImageButton(this.leftPos + 60, this.topPos + 47, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_constituition.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_constituition", imagebutton_constituition);
		this.addRenderableWidget(imagebutton_constituition);
	}
}
