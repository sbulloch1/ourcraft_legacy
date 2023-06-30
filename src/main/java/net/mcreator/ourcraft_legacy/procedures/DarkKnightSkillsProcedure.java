package net.mcreator.ourcraft_legacy.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class DarkKnightSkillsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double SkillRNG = 0;
		MobAggroProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("MobAggro") == 1) {
			entity.getPersistentData().putDouble("MobState", (entity.getPersistentData().getDouble("MobState") + 1));
		}
		if (entity.getPersistentData().getDouble("MobState") >= 100) {
			SkillRNG = Mth.nextInt(RandomSource.create(), 1, 4);
		}
		if (SkillRNG == 1) {
			JumpSkillProcedure.execute(entity);
		} else if (SkillRNG == 2) {
			entity.getPersistentData().putDouble("MobState", 0);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "/say bing");
				}
			}
		} else if (SkillRNG == 3) {
			entity.getPersistentData().putDouble("MobState", 0);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "/say ryozo");
				}
			}
		} else if (SkillRNG == 4) {
			entity.getPersistentData().putDouble("MobState", 0);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "/say belly");
				}
			}
		}
	}
}
