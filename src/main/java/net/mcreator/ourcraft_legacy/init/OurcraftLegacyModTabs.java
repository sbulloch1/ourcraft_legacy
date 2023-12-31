
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ourcraft_legacy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OurcraftLegacyModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(OurcraftLegacyModItems.DARK_KNIGHT_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("ourcraft_legacy", "ourcraft_materials"),
				builder -> builder.title(Component.translatable("item_group.ourcraft_legacy.ourcraft_materials")).icon(() -> new ItemStack(OurcraftLegacyModItems.ZOMBIE_1.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OurcraftLegacyModItems.ZOMBIE_1.get());
					tabData.accept(OurcraftLegacyModItems.SKELETON_1.get());
					tabData.accept(OurcraftLegacyModItems.SKELETON_2.get());
					tabData.accept(OurcraftLegacyModItems.ZOMBIE_2.get());
					tabData.accept(OurcraftLegacyModItems.AMETHYST_CRACKED.get());
					tabData.accept(OurcraftLegacyModItems.AMETHYST_MUNDANE.get());
					tabData.accept(OurcraftLegacyModItems.AMETHYST_SUPERIOR.get());
					tabData.accept(OurcraftLegacyModItems.AMETHYST_ADAMANT.get());
					tabData.accept(OurcraftLegacyModItems.BLOODSTONE_CRACKED.get());
					tabData.accept(OurcraftLegacyModItems.BLOODSTONE_MUNDANE.get());
					tabData.accept(OurcraftLegacyModItems.BLOODSTONE_SUPERIOR.get());
					tabData.accept(OurcraftLegacyModItems.BLOODSTONE_ADAMANT.get());
					tabData.accept(OurcraftLegacyModItems.RUBY_CRACKED.get());
					tabData.accept(OurcraftLegacyModItems.RUBY_MUNDANE.get());
					tabData.accept(OurcraftLegacyModItems.RUBY_SUPERIOR.get());
					tabData.accept(OurcraftLegacyModItems.RUBY_ADAMANT.get());
					tabData.accept(OurcraftLegacyModItems.SAPPHIRE_CRACKED.get());
					tabData.accept(OurcraftLegacyModItems.SAPPHIRE_MUNDANE.get());
					tabData.accept(OurcraftLegacyModItems.SAPPHIRE_SUPERIOR.get());
					tabData.accept(OurcraftLegacyModItems.SAPPHIRE_ADAMANT.get());
					tabData.accept(OurcraftLegacyModItems.DIAMOND_CRACKED.get());
					tabData.accept(OurcraftLegacyModItems.DIAMOND_MUNDANE.get());
					tabData.accept(OurcraftLegacyModItems.DIAMOND_SUPERIOR.get());
					tabData.accept(OurcraftLegacyModItems.DIAMOND_ADAMANT.get());
					tabData.accept(OurcraftLegacyModItems.CORUNDUM_ADAMANT.get());
					tabData.accept(OurcraftLegacyModItems.CORUNDUM_CRACKED.get());
					tabData.accept(OurcraftLegacyModItems.CORUNDUM_MUNDANE.get());
					tabData.accept(OurcraftLegacyModItems.CORUNDUM_SUPERIOR.get());
				}).withSearchBar());
	}
}
