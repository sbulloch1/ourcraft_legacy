
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
import net.mcreator.ourcraft_legacy.item.SapphireSuperiorItem;
import net.mcreator.ourcraft_legacy.item.SapphireMundaneItem;
import net.mcreator.ourcraft_legacy.item.SapphireCrackedItem;
import net.mcreator.ourcraft_legacy.item.SapphireAdamantItem;
import net.mcreator.ourcraft_legacy.item.RubySuperiorItem;
import net.mcreator.ourcraft_legacy.item.RubyMundaneItem;
import net.mcreator.ourcraft_legacy.item.RubyCrackedItem;
import net.mcreator.ourcraft_legacy.item.RubyAdamantItem;
import net.mcreator.ourcraft_legacy.item.DiamondSuperiorItem;
import net.mcreator.ourcraft_legacy.item.DiamondMundaneItem;
import net.mcreator.ourcraft_legacy.item.DiamondCrackedItem;
import net.mcreator.ourcraft_legacy.item.DiamondAdamantItem;
import net.mcreator.ourcraft_legacy.item.CorundumSuperiorItem;
import net.mcreator.ourcraft_legacy.item.CorundumMundaneItem;
import net.mcreator.ourcraft_legacy.item.CorundumCrackedItem;
import net.mcreator.ourcraft_legacy.item.CorundumAdamantItem;
import net.mcreator.ourcraft_legacy.item.BloodstoneSuperiorItem;
import net.mcreator.ourcraft_legacy.item.BloodstoneMundaneItem;
import net.mcreator.ourcraft_legacy.item.BloodstoneCrackedItem;
import net.mcreator.ourcraft_legacy.item.BloodstoneAdamantItem;
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
	public static final RegistryObject<Item> BLOODSTONE_MUNDANE = REGISTRY.register("bloodstone_mundane", () -> new BloodstoneMundaneItem());
	public static final RegistryObject<Item> BLOODSTONE_SUPERIOR = REGISTRY.register("bloodstone_superior", () -> new BloodstoneSuperiorItem());
	public static final RegistryObject<Item> BLOODSTONE_ADAMANT = REGISTRY.register("bloodstone_adamant", () -> new BloodstoneAdamantItem());
	public static final RegistryObject<Item> RUBY_CRACKED = REGISTRY.register("ruby_cracked", () -> new RubyCrackedItem());
	public static final RegistryObject<Item> RUBY_MUNDANE = REGISTRY.register("ruby_mundane", () -> new RubyMundaneItem());
	public static final RegistryObject<Item> RUBY_SUPERIOR = REGISTRY.register("ruby_superior", () -> new RubySuperiorItem());
	public static final RegistryObject<Item> RUBY_ADAMANT = REGISTRY.register("ruby_adamant", () -> new RubyAdamantItem());
	public static final RegistryObject<Item> SAPPHIRE_CRACKED = REGISTRY.register("sapphire_cracked", () -> new SapphireCrackedItem());
	public static final RegistryObject<Item> SAPPHIRE_MUNDANE = REGISTRY.register("sapphire_mundane", () -> new SapphireMundaneItem());
	public static final RegistryObject<Item> SAPPHIRE_SUPERIOR = REGISTRY.register("sapphire_superior", () -> new SapphireSuperiorItem());
	public static final RegistryObject<Item> SAPPHIRE_ADAMANT = REGISTRY.register("sapphire_adamant", () -> new SapphireAdamantItem());
	public static final RegistryObject<Item> DIAMOND_CRACKED = REGISTRY.register("diamond_cracked", () -> new DiamondCrackedItem());
	public static final RegistryObject<Item> DIAMOND_MUNDANE = REGISTRY.register("diamond_mundane", () -> new DiamondMundaneItem());
	public static final RegistryObject<Item> DIAMOND_SUPERIOR = REGISTRY.register("diamond_superior", () -> new DiamondSuperiorItem());
	public static final RegistryObject<Item> DIAMOND_ADAMANT = REGISTRY.register("diamond_adamant", () -> new DiamondAdamantItem());
	public static final RegistryObject<Item> CORUNDUM_ADAMANT = REGISTRY.register("corundum_adamant", () -> new CorundumAdamantItem());
	public static final RegistryObject<Item> CORUNDUM_CRACKED = REGISTRY.register("corundum_cracked", () -> new CorundumCrackedItem());
	public static final RegistryObject<Item> CORUNDUM_MUNDANE = REGISTRY.register("corundum_mundane", () -> new CorundumMundaneItem());
	public static final RegistryObject<Item> CORUNDUM_SUPERIOR = REGISTRY.register("corundum_superior", () -> new CorundumSuperiorItem());
}
