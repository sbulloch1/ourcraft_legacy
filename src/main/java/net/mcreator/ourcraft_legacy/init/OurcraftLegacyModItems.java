
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ourcraft_legacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.ourcraft_legacy.item.Zombie2Item;
import net.mcreator.ourcraft_legacy.item.Zombie1Item;
import net.mcreator.ourcraft_legacy.item.Skeleton2Item;
import net.mcreator.ourcraft_legacy.item.Skeleton1Item;
import net.mcreator.ourcraft_legacy.item.BloodstoneCrackedItem;
import net.mcreator.ourcraft_legacy.item.AmethystSuperiorItem;
import net.mcreator.ourcraft_legacy.item.AmethystMundaneItem;
import net.mcreator.ourcraft_legacy.item.AmethystCrackedItem;
import net.mcreator.ourcraft_legacy.item.AmethystAdamantItem;
import net.mcreator.ourcraft_legacy.OurcraftLegacyMod;

public class OurcraftLegacyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OurcraftLegacyMod.MODID);
	public static final RegistryObject<Item> ZOMBIE_1 = REGISTRY.register("zombie_1", () -> new Zombie1Item());
	public static final RegistryObject<Item> SKELETON_1 = REGISTRY.register("skeleton_1", () -> new Skeleton1Item());
	public static final RegistryObject<Item> SKELETON_2 = REGISTRY.register("skeleton_2", () -> new Skeleton2Item());
	public static final RegistryObject<Item> ZOMBIE_2 = REGISTRY.register("zombie_2", () -> new Zombie2Item());
	public static final RegistryObject<Item> DARK_KNIGHT_SPAWN_EGG = REGISTRY.register("dark_knight_spawn_egg", () -> new ForgeSpawnEggItem(OurcraftLegacyModEntities.DARK_KNIGHT, -13434829, -10092340, new Item.Properties()));
	public static final RegistryObject<Item> AMETHYST_CRACKED = REGISTRY.register("amethyst_cracked", () -> new AmethystCrackedItem());
	public static final RegistryObject<Item> AMETHYST_MUNDANE = REGISTRY.register("amethyst_mundane", () -> new AmethystMundaneItem());
	public static final RegistryObject<Item> AMETHYST_SUPERIOR = REGISTRY.register("amethyst_superior", () -> new AmethystSuperiorItem());
	public static final RegistryObject<Item> AMETHYST_ADAMANT = REGISTRY.register("amethyst_adamant", () -> new AmethystAdamantItem());
	public static final RegistryObject<Item> BLOODSTONE_CRACKED = REGISTRY.register("bloodstone_cracked", () -> new BloodstoneCrackedItem());
}
