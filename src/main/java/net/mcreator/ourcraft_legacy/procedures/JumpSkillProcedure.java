package net.mcreator.ourcraft_legacy.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class JumpSkillProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("MobState") >= 100) {
			entity.getPersistentData().putDouble("MobState", 0);
			if (entity instanceof Mob _entity)
				_entity.getNavigation().stop();
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 10), (entity.getDeltaMovement().y() + 0.5), (entity.getDeltaMovement().z() * 10)));
		}
	}
}
