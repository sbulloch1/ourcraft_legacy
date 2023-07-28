package net.mcreator.ourcraft_legacy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CommandGiveStatsProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "action")).equals("add") && (StringArgumentType.getString(arguments, "stat")).equals("exp")) {
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp + DoubleArgumentType.getDouble(arguments, "amount");
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
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + " has gained " + DoubleArgumentType.getDouble(arguments, "amount") + " exp!")), false);
		}
		if ((StringArgumentType.getString(arguments, "action")).equals("set") && (StringArgumentType.getString(arguments, "stat")).equals("exp")) {
			{
				double _setval = DoubleArgumentType.getDouble(arguments, "amount");
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
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + "'s exp has been set to " + DoubleArgumentType.getDouble(arguments, "amount") + "!")), false);
		}
		if ((StringArgumentType.getString(arguments, "action")).equals("add") && (StringArgumentType.getString(arguments, "stat")).equals("level")) {
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level + DoubleArgumentType.getDouble(arguments, "amount");
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
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
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + " has gained " + DoubleArgumentType.getDouble(arguments, "amount") + " levels!")), false);
		}
		if ((StringArgumentType.getString(arguments, "action")).equals("set") && (StringArgumentType.getString(arguments, "stat")).equals("level")) {
			{
				double _setval = DoubleArgumentType.getDouble(arguments, "amount");
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
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
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + "'s level has been set to " + DoubleArgumentType.getDouble(arguments, "amount") + "!")), false);
		}
		if ((StringArgumentType.getString(arguments, "action")).equals("add") && (StringArgumentType.getString(arguments, "stat")).equals("abp")) {
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level + DoubleArgumentType.getDouble(arguments, "amount");
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
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
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + " has gained " + DoubleArgumentType.getDouble(arguments, "amount") + " abp!")), false);
		}
		if ((StringArgumentType.getString(arguments, "action")).equals("set") && (StringArgumentType.getString(arguments, "stat")).equals("abp")) {
			{
				double _setval = DoubleArgumentType.getDouble(arguments, "amount");
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
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
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "target");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + "'s abp has been set to " + DoubleArgumentType.getDouble(arguments, "amount") + "!")), false);
		}
	}
}
