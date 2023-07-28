
package net.mcreator.ourcraft_legacy.command;

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
