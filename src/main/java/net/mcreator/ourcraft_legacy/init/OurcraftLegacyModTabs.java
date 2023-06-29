
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ourcraft_legacy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OurcraftLegacyModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("ourcraft_legacy", "ourcraft_materials"),
				builder -> builder.title(Component.translatable("item_group.ourcraft_legacy.ourcraft_materials")).icon(() -> new ItemStack(OurcraftLegacyModItems.ZOMBIE_1.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OurcraftLegacyModItems.ZOMBIE_1.get());
					tabData.accept(OurcraftLegacyModItems.SKELETON_1.get());
					tabData.accept(OurcraftLegacyModItems.SKELETON_2.get());
					tabData.accept(OurcraftLegacyModItems.ZOMBIE_2.get());
				}).withSearchBar());
	}
}
