package net.mcreator.ourcraft_legacy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CommandGiveExpProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "action")).equals("give")) {
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp + DoubleArgumentType.getDouble(arguments, "exp");
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "target");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity() + " has gained " + DoubleArgumentType.getDouble(arguments, "exp") + " exp!")), false);
		}
		if ((StringArgumentType.getString(arguments, "action")).equals("set")) {
			{
				double _setval = DoubleArgumentType.getDouble(arguments, "exp");
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "target");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity() + "'s exp has been set to " + DoubleArgumentType.getDouble(arguments, "exp") + "!")), false);
		}
	}
}
