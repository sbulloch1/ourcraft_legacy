package net.mcreator.ourcraft_legacy.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ourcraft_legacy.network.OurcraftLegacyModVariables;

public class LevelupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level < 1) {
			{
				double _setval = 1;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp < 0) {
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 1
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 500) {
			{
				double _setval = 2;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 2\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 2\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 2
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 800) {
			{
				double _setval = 3;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 3\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 3\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 3
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1250) {
			{
				double _setval = 4;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 4\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 4\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 4
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1750) {
			{
				double _setval = 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 5\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 5\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 5
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 2800) {
			{
				double _setval = 6;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 6\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 6\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 6
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 5000) {
			{
				double _setval = 7;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 7\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 7\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 7
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 7500) {
			{
				double _setval = 8;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 8\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 8\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 8
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 12800) {
			{
				double _setval = 9;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 9\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 9\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 9
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 15000) {
			{
				double _setval = 10;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 10\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 10\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 10
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 17500) {
			{
				double _setval = 11;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 11\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 11\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 11
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 20000) {
			{
				double _setval = 12;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 12\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 12\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 12
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 25000) {
			{
				double _setval = 13;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 13\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 13\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 13
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 32500) {
			{
				double _setval = 14;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 14\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 14\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 14
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 40000) {
			{
				double _setval = 15;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 15\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 15\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 15
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 50000) {
			{
				double _setval = 16;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 16\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 16\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 16
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 60000) {
			{
				double _setval = 17;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 17\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 17\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 17
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 72500) {
			{
				double _setval = 18;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 18\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 18\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 18
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 85000) {
			{
				double _setval = 19;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 19\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 19\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 19
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 100000) {
			{
				double _setval = 20;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 20\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 20\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 20
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 115000) {
			{
				double _setval = 21;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 21\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 21\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 21
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 135000) {
			{
				double _setval = 22;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 22\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 22\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 22
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 155000) {
			{
				double _setval = 23;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 23\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 23\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 23
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 180000) {
			{
				double _setval = 24;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 24\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 24\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 24
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 205000) {
			{
				double _setval = 25;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.exp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 25\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 25\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.MASTER, 100000, 1, false);
				}
			}
		}
	}
}
