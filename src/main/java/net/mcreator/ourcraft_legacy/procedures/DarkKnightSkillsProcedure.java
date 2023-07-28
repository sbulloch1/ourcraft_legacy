package net.mcreator.ourcraft_legacy.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

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
		} else if (SkillRNG == 3) {
			entity.getPersistentData().putDouble("MobState", 0);
		} else if (SkillRNG == 4) {
			entity.getPersistentData().putDouble("MobState", 0);
		}
	}
}
