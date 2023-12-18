package net.mcreator.mineterra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mineterra.world.inventory.BaseMenu;
import net.mcreator.mineterra.procedures.DisplayWisdomProcedure;
import net.mcreator.mineterra.procedures.DisplayStrenghtProcedure;
import net.mcreator.mineterra.procedures.DisplayPointsProcedure;
import net.mcreator.mineterra.procedures.DisplayIntelligenceProcedure;
import net.mcreator.mineterra.procedures.DisplayDexterityProcedure;
import net.mcreator.mineterra.procedures.DisplayConstituitionProcedure;
import net.mcreator.mineterra.procedures.DisplayCharismaProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BaseScreen extends AbstractContainerScreen<BaseMenu> {
	private final static HashMap<String, Object> guistate = BaseMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_constituition;
	ImageButton imagebutton_dexterity;
	ImageButton imagebutton_intelligence;
	ImageButton imagebutton_wisdom;
	ImageButton imagebutton_strength;
	ImageButton imagebutton_charisma;

	public BaseScreen(BaseMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
		this.imageHeight = 194;
	}

	private static final ResourceLocation texture = new ResourceLocation("mineterra:textures/screens/base.png");

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

		guiGraphics.blit(new ResourceLocation("mineterra:textures/screens/pixil-frame-0_2.png"), this.leftPos + -145, this.topPos + -40, 0, 0, 500, 281, 500, 281);

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

				DisplayConstituitionProcedure.execute(entity), 16, 50, -1, false);
		guiGraphics.drawString(this.font,

				DisplayStrenghtProcedure.execute(entity), 82, 175, -1, false);
		guiGraphics.drawString(this.font,

				DisplayDexterityProcedure.execute(entity), 99, 50, -1, false);
		guiGraphics.drawString(this.font,

				DisplayIntelligenceProcedure.execute(entity), 174, 50, -1, false);
		guiGraphics.drawString(this.font,

				DisplayCharismaProcedure.execute(entity), 161, 175, -1, false);
		guiGraphics.drawString(this.font,

				DisplayWisdomProcedure.execute(entity), 16, 175, -1, false);
		guiGraphics.drawString(this.font,

				DisplayPointsProcedure.execute(entity), 53, 82, -13312, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_constituition = new ImageButton(this.leftPos + -11, this.topPos + -11, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_constituition.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_constituition", imagebutton_constituition);
		this.addRenderableWidget(imagebutton_constituition);
		imagebutton_dexterity = new ImageButton(this.leftPos + 66, this.topPos + -10, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_dexterity.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_dexterity", imagebutton_dexterity);
		this.addRenderableWidget(imagebutton_dexterity);
		imagebutton_intelligence = new ImageButton(this.leftPos + 145, this.topPos + -13, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_intelligence.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_intelligence", imagebutton_intelligence);
		this.addRenderableWidget(imagebutton_intelligence);
		imagebutton_wisdom = new ImageButton(this.leftPos + -10, this.topPos + 112, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_wisdom.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_wisdom", imagebutton_wisdom);
		this.addRenderableWidget(imagebutton_wisdom);
		imagebutton_strength = new ImageButton(this.leftPos + 69, this.topPos + 113, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_strength.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_strength", imagebutton_strength);
		this.addRenderableWidget(imagebutton_strength);
		imagebutton_charisma = new ImageButton(this.leftPos + 136, this.topPos + 110, 64, 64, 0, 0, 64, new ResourceLocation("mineterra:textures/screens/atlas/imagebutton_charisma.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_charisma", imagebutton_charisma);
		this.addRenderableWidget(imagebutton_charisma);
	}
}
