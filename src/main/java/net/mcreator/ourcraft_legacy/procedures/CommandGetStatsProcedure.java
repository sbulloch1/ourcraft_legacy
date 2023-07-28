package net.mcreator.ourcraft_legacy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CommandGetStatsProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "list")).equals("list")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "target")) {
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
						}.getEntity()).getDisplayName().getString() + "'s Stats:")), false);
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
						_player.displayClientMessage(Component.literal(("level - " + (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level)), false);
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
						_player.displayClientMessage(Component.literal(("exp - " + (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp)), false);
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
						_player.displayClientMessage(Component.literal(("abp - " + (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp)), false);
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
