
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ourcraft_legacy.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ourcraft_legacy.client.gui.Pouch1Screen;
import net.mcreator.ourcraft_legacy.client.gui.AbilityInventoryScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OurcraftLegacyModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OurcraftLegacyModMenus.POUCH_1.get(), Pouch1Screen::new);
			MenuScreens.register(OurcraftLegacyModMenus.ABILITY_INVENTORY.get(), AbilityInventoryScreen::new);
		});
	}
}
