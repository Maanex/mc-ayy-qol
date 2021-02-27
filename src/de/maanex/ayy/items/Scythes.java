package de.maanex.ayy.items;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Scythes {

	private Scythes() {
	}

	public static final ItemStack	WOODEN_SCYTHE;
	public static final ItemStack	STONE_SCYTHE;
	public static final ItemStack	GOLDEN_SCYTHE;
	public static final ItemStack	IRON_SCYTHE;
	public static final ItemStack	DIAMOND_SCYTHE;

	static {
		ItemMeta m;

		WOODEN_SCYTHE = new ItemStack(Material.WOODEN_HOE);
		m = WOODEN_SCYTHE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rWooden Scythe");
		WOODEN_SCYTHE.setItemMeta(m);

		STONE_SCYTHE = new ItemStack(Material.STONE_HOE);
		m = STONE_SCYTHE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rStone Scythe");
		STONE_SCYTHE.setItemMeta(m);

		GOLDEN_SCYTHE = new ItemStack(Material.GOLDEN_HOE);
		m = GOLDEN_SCYTHE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rGolden Scythe");
		GOLDEN_SCYTHE.setItemMeta(m);

		IRON_SCYTHE = new ItemStack(Material.IRON_HOE);
		m = IRON_SCYTHE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rIron Scythe");
		IRON_SCYTHE.setItemMeta(m);

		DIAMOND_SCYTHE = new ItemStack(Material.DIAMOND_HOE);
		m = DIAMOND_SCYTHE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rDiamond Scythe");
		DIAMOND_SCYTHE.setItemMeta(m);
	}

}
