
package net.mcreator.mineterra.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.mineterra.procedures.ChaosBarDisplayOverlayIngameConditionProcedure;
import net.mcreator.mineterra.procedures.ChaosAmountProcedure;
import net.mcreator.mineterra.procedures.ChaosAmount90Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount80Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount70Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount60Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount50Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount40Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount30Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount20Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount10Procedure;
import net.mcreator.mineterra.procedures.ChaosAmount100Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ChaosBarOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ChaosBarDisplayOverlayIngameConditionProcedure.execute(entity)) {
			if (ChaosAmountProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/no_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/1_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/2_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount30Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/3_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount40Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/4_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount50Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/5_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount60Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/6_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount70Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/7_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount80Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/8_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount90Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/9_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
			if (ChaosAmount100Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mineterra:textures/screens/10_chaos.png"), posX + 108, posY + 104, 0, 0, 90, 9, 90, 9);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
