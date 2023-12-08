
package net.mcreator.mineterra.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.mineterra.world.inventory.GameStartCharacterCreationMenu;
import net.mcreator.mineterra.procedures.OrcProcedure;
import net.mcreator.mineterra.procedures.HumanProcedure;
import net.mcreator.mineterra.procedures.HighElfsProcedure;
import net.mcreator.mineterra.procedures.GnomeProcedure;
import net.mcreator.mineterra.procedures.ForestElfsProcedure;
import net.mcreator.mineterra.procedures.FeralitsProcedure;
import net.mcreator.mineterra.procedures.DwarfProcedure;
import net.mcreator.mineterra.procedures.ChildrenOfTheTideProcedure;
import net.mcreator.mineterra.procedures.CelestialProcedure;
import net.mcreator.mineterra.procedures.AbyssalProcedure;
import net.mcreator.mineterra.MineterraMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GameStartCharacterCreationButtonMessage {
	private final int buttonID, x, y, z;

	public GameStartCharacterCreationButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GameStartCharacterCreationButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GameStartCharacterCreationButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GameStartCharacterCreationButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = GameStartCharacterCreationMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			HumanProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			CelestialProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			AbyssalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ChildrenOfTheTideProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			DwarfProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ForestElfsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			HighElfsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			FeralitsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OrcProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			GnomeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MineterraMod.addNetworkMessage(GameStartCharacterCreationButtonMessage.class, GameStartCharacterCreationButtonMessage::buffer, GameStartCharacterCreationButtonMessage::new, GameStartCharacterCreationButtonMessage::handler);
	}
}
