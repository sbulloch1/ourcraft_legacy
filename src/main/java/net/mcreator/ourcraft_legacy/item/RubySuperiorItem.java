
package net.mcreator.ourcraft_legacy.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class RubySuperiorItem extends Item {
	public RubySuperiorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\"Tier MMM Gemstone\""));
		list.add(Component.literal("\"\""));
		list.add(Component.literal("\"This high-quality gemstone\""));
		list.add(Component.literal("\"houses a rare power.\""));
	}
}