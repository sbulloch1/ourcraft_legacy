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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 500;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1250;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1750;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 2800;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 5000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 7500;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 12800;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 15000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 17500;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 20000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 25000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 32500;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 400000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 50000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 60000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 72500;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 85000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 100000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 115000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 135000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 155000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 180000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
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
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 205000;
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 25
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 250000) {
			{
				double _setval = 26;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 250000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 26\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 26\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 26
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 300000) {
			{
				double _setval = 27;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 300000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 27\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 27\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 27
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 350000) {
			{
				double _setval = 28;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 350000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 28\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 28\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 28
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 400000) {
			{
				double _setval = 29;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 400000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 29\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 29\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 29
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 450000) {
			{
				double _setval = 30;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 450000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 30\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 30\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 30
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 500000) {
			{
				double _setval = 31;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 500000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 31\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 31\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 31
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 550000) {
			{
				double _setval = 32;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 550000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 32\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 32\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 32
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 600000) {
			{
				double _setval = 33;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 600000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 33\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 33\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 33
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 650000) {
			{
				double _setval = 34;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 650000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 34\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 34\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 34
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 700000) {
			{
				double _setval = 35;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 700000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 35\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 35\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 35
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 750000) {
			{
				double _setval = 36;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 750000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 36\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 36\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 36
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 800000) {
			{
				double _setval = 37;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 800000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 37\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 37\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 37
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 850000) {
			{
				double _setval = 38;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 850000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 38\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 38\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 38
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 900000) {
			{
				double _setval = 39;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 900000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 39\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 39\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 39
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 950000) {
			{
				double _setval = 40;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 950000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 40\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 40\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 40
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1000000) {
			{
				double _setval = 41;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1000000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 41\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 41\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 41
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1050000) {
			{
				double _setval = 42;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1050000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 42\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 42\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 42
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1100000) {
			{
				double _setval = 43;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1100000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 43\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 43\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 43
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1150000) {
			{
				double _setval = 44;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1150000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 44\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 44\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 44
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1200000) {
			{
				double _setval = 45;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1200000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 45\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 45\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 45
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1250000) {
			{
				double _setval = 46;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1250000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 46\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 46\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 46
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1300000) {
			{
				double _setval = 47;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1300000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 47\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 47\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 47
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1350000) {
			{
				double _setval = 48;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1350000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 48\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 48\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 48
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1400000) {
			{
				double _setval = 49;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1400000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 49\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 49\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
		if ((entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).level == 49
				&& (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp >= 1500000) {
			{
				double _setval = 50;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).exp - 1500000;
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
							"/tellraw @a [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"color\":\"gray\"},{\"text\":\" is now\",\"color\":\"gray\"},{\"text\":\" Level 50\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"] \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"You are now\",\"color\":\"gray\"},{\"text\":\" Level 50\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You are now at \",\"color\":\"gray\"},{\"text\":\"Maximum Level\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.MASTER, 100000, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OurcraftLegacyModVariables.PlayerVariables())).abp + 5;
				entity.getCapability(OurcraftLegacyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.abp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"/tellraw @p [\"\",{\"text\":\"[\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Server\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" You have gained\",\"color\":\"gray\"},{\"text\":\" 5 Ability Points\",\"bold\":true,\"color\":\"green\"},{\"text\":\"!\",\"color\":\"gray\"}]");
				}
			}
		}
	}
}
