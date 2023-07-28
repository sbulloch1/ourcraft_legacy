
package net.mcreator.ourcraft_legacy.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.ourcraft_legacy.procedures.CommandGiveStatsProcedure;
import net.mcreator.ourcraft_legacy.procedures.CommandGetStatsProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class OCStatCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("ocstats").requires(s -> s.hasPermission(4)).then(Commands.argument("list", StringArgumentType.word()).then(Commands.argument("target", EntityArgument.player()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CommandGetStatsProcedure.execute(world, x, y, z, arguments, entity);
			return 0;
		}))).then(Commands.argument("action", StringArgumentType.word())
				.then(Commands.argument("target", EntityArgument.player()).then(Commands.argument("stat", StringArgumentType.word()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(0)).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					CommandGiveStatsProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))))));
	}
}
