
package net.mcreator.ourcraft_legacy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BloodstoneMundaneItem extends Item {
	public BloodstoneMundaneItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\"Tier MMM Gemstone\""));
		list.add(Component.literal("\"\""));
		list.add(Component.literal("\"This mid-quality gemstone\""));
		list.add(Component.literal("\"houses a uncommon power.\""));
	}
}