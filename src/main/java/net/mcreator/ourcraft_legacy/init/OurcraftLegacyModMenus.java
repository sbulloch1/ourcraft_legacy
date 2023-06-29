
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ourcraft_legacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ourcraft_legacy.world.inventory.Pouch1Menu;
import net.mcreator.ourcraft_legacy.world.inventory.AbilityInventoryMenu;
import net.mcreator.ourcraft_legacy.OurcraftLegacyMod;

public class OurcraftLegacyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OurcraftLegacyMod.MODID);
	public static final RegistryObject<MenuType<Pouch1Menu>> POUCH_1 = REGISTRY.register("pouch_1", () -> IForgeMenuType.create(Pouch1Menu::new));
	public static final RegistryObject<MenuType<AbilityInventoryMenu>> ABILITY_INVENTORY = REGISTRY.register("ability_inventory", () -> IForgeMenuType.create(AbilityInventoryMenu::new));
}
