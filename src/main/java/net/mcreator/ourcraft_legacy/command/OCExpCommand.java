
package net.mcreator.ourcraft_legacy.command;

@Mod.EventBusSubscriber
public class OCExpCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("ocexp").requires(s -> s.hasPermission(4)).then(Commands.argument("target", EntityArgument.player()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);

			Direction direction = entity.getDirection();

			CommandGetExpProcedure.execute(arguments, entity);
			return 0;
		})).then(Commands.argument("action", StringArgumentType.word()).then(Commands.argument("target", EntityArgument.player()).then(Commands.argument("exp", DoubleArgumentType.doubleArg(0)))))
				.then(Commands.argument("action", StringArgumentType.word()).then(Commands.argument("target", EntityArgument.player()).then(Commands.argument("exp", DoubleArgumentType.doubleArg(0))))).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					LevelupProcedure.execute(world, x, y, z, entity);
					return 0;
				}));
	}

}
