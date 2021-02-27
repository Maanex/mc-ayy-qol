package de.maanex.ayy.items;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Hammers {

	private Hammers() {
	}

	public static final ItemStack	STONE_HAMMER;
	public static final ItemStack	IRON_HAMMER;
	public static final ItemStack	DIAMOND_HAMMER;

	static {
		ItemMeta m;

		STONE_HAMMER = new ItemStack(Material.WOODEN_PICKAXE);
		m = STONE_HAMMER.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rStone Hammer");
		STONE_HAMMER.setItemMeta(m);

		IRON_HAMMER = new ItemStack(Material.STONE_PICKAXE);
		m = IRON_HAMMER.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rIron Hammer");
		IRON_HAMMER.setItemMeta(m);

		DIAMOND_HAMMER = new ItemStack(Material.IRON_PICKAXE);
		m = DIAMOND_HAMMER.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rDiamond Hammer");
		DIAMOND_HAMMER.setItemMeta(m);
	}

}
