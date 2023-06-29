
package net.mcreator.ourcraft_legacy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class Zombie2Item extends Item {
	public Zombie2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Tier III Material"));
		list.add(Component.literal("Zombies rarely yield this item."));
		list.add(Component.literal("Smooth"));
		list.add(Component.literal("\\ wrinkly"));
		list.add(Component.literal("\\ and"));
		list.add(Component.literal("drained of all its humors."));
	}
}
