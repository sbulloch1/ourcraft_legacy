
package net.mcreator.ourcraft_legacy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class Skeleton2Item extends Item {
	public Skeleton2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Tier III Material"));
		list.add(Component.literal("Skeletons rarely yield this item."));
		list.add(Component.literal("This heart has long since"));
		list.add(Component.literal("been turned to stone."));
	}
}
