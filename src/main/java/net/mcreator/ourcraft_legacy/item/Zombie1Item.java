
package net.mcreator.ourcraft_legacy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class Zombie1Item extends Item {
	public Zombie1Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Tier II Material"));
		list.add(Component.literal("Zombies sometimes yield this item."));
		list.add(Component.literal("Covered in blood and bile and"));
		list.add(Component.literal("kept sharp by repeated use."));
	}
}
