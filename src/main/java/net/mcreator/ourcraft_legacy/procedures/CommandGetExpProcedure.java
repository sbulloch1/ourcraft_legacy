package net.mcreator.ourcraft_legacy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CommandGetExpProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
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
					_player.displayClientMessage(Component.literal(((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level + ""
							+ (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp)), false);
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
