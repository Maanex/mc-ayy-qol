package de.maanex.ayy.items;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import de.maanex.ayy.Main;


public class Crafting {

	private Crafting() {
	}

	public static void registerRecipes() {
		disableDefaults();

		registerVanillaStuff();
		registerScythes();
		registerBackpacks();
		registerBattleaxes();
		registerHammers();
		// registerStoneWeapons();

		// new ExactChoice
		// new RecipeChoice.MaterialChoice(Tag.SAPLINGS)
	}

	public static void disableDefaults() {
		List<Material> disable = new ArrayList<>(Arrays.asList(
				Material.GOLDEN_HELMET,
				Material.GOLDEN_CHESTPLATE,
				Material.GOLDEN_LEGGINGS,
				Material.GOLDEN_BOOTS,
				Material.DIAMOND_HELMET,
				Material.DIAMOND_CHESTPLATE,
				Material.DIAMOND_LEGGINGS,
				Material.DIAMOND_BOOTS
		));

		List<Recipe> org = new ArrayList<>();

		Iterator<Recipe> i = Main.instance.getServer().recipeIterator();
		while (i.hasNext()) {
			org.add(i.next());
		}
		Main.instance.getServer().clearRecipes();
		
		for (Recipe r : org) {
			if (!disable.contains(r.getResult().getType()))
				Main.instance.getServer().addRecipe(r);
		}
	}

	public static void registerVanillaStuff() {
		NamespacedKey key;
		ShapedRecipe res;

		key = new NamespacedKey(Main.instance, "chainmail_helmet");
		res = new ShapedRecipe(key, new ItemStack(Material.CHAINMAIL_HELMET));
		res.shape("III", "ILI", "III");
		res.setIngredient('I', Material.IRON_NUGGET);
		res.setIngredient('L', Material.LEATHER_HELMET);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "chainmail_chestplate");
		res = new ShapedRecipe(key, new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		res.shape("III", "ILI", "III");
		res.setIngredient('I', Material.IRON_NUGGET);
		res.setIngredient('L', Material.LEATHER_CHESTPLATE);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "chainmail_leggings");
		res = new ShapedRecipe(key, new ItemStack(Material.CHAINMAIL_LEGGINGS));
		res.shape("III", "ILI", "III");
		res.setIngredient('I', Material.IRON_NUGGET);
		res.setIngredient('L', Material.LEATHER_LEGGINGS);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "chainmail_boots");
		res = new ShapedRecipe(key, new ItemStack(Material.CHAINMAIL_BOOTS));
		res.shape("III", "ILI", "III");
		res.setIngredient('I', Material.IRON_NUGGET);
		res.setIngredient('L', Material.LEATHER_BOOTS);
		Bukkit.addRecipe(res);
	}

	public static void registerScythes() {
		NamespacedKey key;
		ShapedRecipe res;

		key = new NamespacedKey(Main.instance, "wooden_scythe");
		res = new ShapedRecipe(key, Scythes.WOODEN_SCYTHE);
		res.shape("III", "00S", "00S");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.OAK_PLANKS);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "stone_scythe");
		res = new ShapedRecipe(key, Scythes.STONE_SCYTHE);
		res.shape("III", "00S", "00S");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.COBBLESTONE);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "golden_scythe");
		res = new ShapedRecipe(key, Scythes.GOLDEN_SCYTHE);
		res.shape("III", "00S", "00S");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.GOLD_INGOT);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "iron_scythe");
		res = new ShapedRecipe(key, Scythes.IRON_SCYTHE);
		res.shape("III", "00S", "00S");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.IRON_INGOT);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "diamond_scythe");
		res = new ShapedRecipe(key, Scythes.DIAMOND_SCYTHE);
		res.shape("III", "00S", "00S");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.DIAMOND);
		Bukkit.addRecipe(res);
	}

	public static void registerBackpacks() {
		NamespacedKey key;
		ShapedRecipe res;

		key = new NamespacedKey(Main.instance, "tiny_backpack");
		res = new ShapedRecipe(key, Backpacks.TINY_BACKPACK);
		res.shape("SLS", "LBL", "SLS");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('L', Material.LEATHER);
		res.setIngredient('B', Material.BARREL);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "small_backpack");
		res = new ShapedRecipe(key, Backpacks.SMALL_BACKPACK);
		res.shape("ILI", "LBL", "ILI");
		res.setIngredient('I', Material.IRON_INGOT);
		res.setIngredient('L', Material.LEATHER);
		res.setIngredient('B', Material.BARREL);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "normal_backpack");
		res = new ShapedRecipe(key, Backpacks.NORMAL_BACKPACK);
		res.shape("LGL", "DBD", "LDL");
		res.setIngredient('G', Material.GOLDEN_APPLE);
		res.setIngredient('D', Material.DIAMOND);
		res.setIngredient('L', Material.LEATHER);
		res.setIngredient('B', Material.BARREL);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "large_backpack");
		res = new ShapedRecipe(key, Backpacks.LARGE_BACKPACK);
		res.shape("LEL", "GBG", "LGL");
		res.setIngredient('E', Material.END_CRYSTAL);
		res.setIngredient('G', Material.GOLD_BLOCK);
		res.setIngredient('L', Material.LEATHER);
		res.setIngredient('B', Material.BARREL);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "huge_backpack");
		res = new ShapedRecipe(key, Backpacks.HUGE_BACKPACK);
		res.shape("LSL", "DBD", "LDL");
		res.setIngredient('S', Material.NETHER_STAR);
		res.setIngredient('D', Material.DIAMOND_BLOCK);
		res.setIngredient('L', Material.LEATHER);
		res.setIngredient('B', Material.BARREL);
		Bukkit.addRecipe(res);
	}

	public static void registerHammers() {
		NamespacedKey key;
		ShapedRecipe res;

		key = new NamespacedKey(Main.instance, "stone_hammer");
		res = new ShapedRecipe(key, Hammers.STONE_HAMMER);
		res.shape("IBI", "0S0", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.COBBLESTONE);
		res.setIngredient('B', Material.SMOOTH_STONE);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "iron_hammer");
		res = new ShapedRecipe(key, Hammers.IRON_HAMMER);
		res.shape("IBI", "0S0", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.IRON_INGOT);
		res.setIngredient('B', Material.IRON_BLOCK);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "diamond_hammer");
		res = new ShapedRecipe(key, Hammers.DIAMOND_HAMMER);
		res.shape("IBI", "0S0", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.DIAMOND);
		res.setIngredient('B', Material.DIAMOND_BLOCK);
		Bukkit.addRecipe(res);
	}

	public static void registerBattleaxes() {
		NamespacedKey key;
		ShapedRecipe res;

		key = new NamespacedKey(Main.instance, "wooden_battleaxe");
		res = new ShapedRecipe(key, Battleaxes.WOODEN_BATTLEAXE);
		res.shape("III", "ISI", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.OAK_PLANKS);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "stone_battleaxe");
		res = new ShapedRecipe(key, Battleaxes.STONE_BATTLEAXE);
		res.shape("III", "ISI", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.COBBLESTONE);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "golden_battleaxe");
		res = new ShapedRecipe(key, Battleaxes.GOLDEN_BATTLEAXE);
		res.shape("III", "ISI", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.GOLD_INGOT);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "iron_battleaxe");
		res = new ShapedRecipe(key, Battleaxes.IRON_BATTLEAXE);
		res.shape("III", "ISI", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.IRON_INGOT);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "diamond_battleaxe");
		res = new ShapedRecipe(key, Battleaxes.DIAMOND_BATTLEAXE);
		res.shape("III", "ISI", "0S0");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.DIAMOND);
		Bukkit.addRecipe(res);
	}

	public static void registerStoneWeapons() {
		NamespacedKey key;
		ShapedRecipe res;

		key = new NamespacedKey(Main.instance, "stone_spear");
		res = new ShapedRecipe(key, StoneWeapons.STONE_SPEAR);
		res.shape("00I", "0S0", "S00");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.COBBLESTONE);
		Bukkit.addRecipe(res);

		key = new NamespacedKey(Main.instance, "stone_glaive");
		res = new ShapedRecipe(key, StoneWeapons.STONE_GLAIVE);
		res.shape("0II", "0SI", "S00");
		res.setIngredient('S', Material.STICK);
		res.setIngredient('I', Material.COBBLESTONE);
		Bukkit.addRecipe(res);
	}

}
