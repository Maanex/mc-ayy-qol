package de.maanex.ayy.items;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Backpacks {

	private Backpacks() {
	}

	public static final ItemStack	TINY_BACKPACK;
	public static final ItemStack	SMALL_BACKPACK;
	public static final ItemStack	NORMAL_BACKPACK;
	public static final ItemStack	LARGE_BACKPACK;
	public static final ItemStack	HUGE_BACKPACK;

	static {
		ItemMeta m;

		TINY_BACKPACK = new ItemStack(Material.BRICK);
		m = TINY_BACKPACK.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rTiny Backpack");
		TINY_BACKPACK.setItemMeta(m);

		SMALL_BACKPACK = new ItemStack(Material.BRICK);
		m = SMALL_BACKPACK.getItemMeta();
		m.setCustomModelData(2);
		m.setDisplayName("§rSmall Backpack");
		SMALL_BACKPACK.setItemMeta(m);

		NORMAL_BACKPACK = new ItemStack(Material.BRICK);
		m = NORMAL_BACKPACK.getItemMeta();
		m.setCustomModelData(3);
		m.setDisplayName("§rNormal Backpack");
		NORMAL_BACKPACK.setItemMeta(m);

		LARGE_BACKPACK = new ItemStack(Material.BRICK);
		m = LARGE_BACKPACK.getItemMeta();
		m.setCustomModelData(4);
		m.setDisplayName("§rLarge Backpack");
		LARGE_BACKPACK.setItemMeta(m);

		HUGE_BACKPACK = new ItemStack(Material.BRICK);
		m = HUGE_BACKPACK.getItemMeta();
		m.setCustomModelData(5);
		m.setDisplayName("§rHuge Backpack");
		HUGE_BACKPACK.setItemMeta(m);
	}

}
