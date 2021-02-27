package de.maanex.ayy.cit;


import java.util.Random;

import org.bukkit.CropState;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Crops;


public class ScythesWork implements Listener {

	public ScythesWork() {
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		if (!e	.getAction()
				.equals(Action.RIGHT_CLICK_BLOCK))
			return;
		if (e.getItem() == null) return;
		if (!e	.getItem()
				.getType()
				.toString()
				.endsWith("_HOE"))
			return;
		if (!e	.getItem()
				.hasItemMeta())
			return;
		if (!e	.getItem()
				.getItemMeta()
				.hasCustomModelData())
			return;
		if (e	.getItem()
				.getItemMeta()
				.getCustomModelData() != 1)
			return;

		int unbreaking = e	.getItem()
							.getEnchantmentLevel(Enchantment.DURABILITY);
		Random r = new Random();

		out: for (int x = -1; x < 2; x++)
			for (int z = -1; z < 2; z++) {
				boolean used = harvest(e.getClickedBlock()
										.getLocation()
										.clone()
										.add(x, 0, z));

				if (used && r.nextInt(Enchantment.DURABILITY.getMaxLevel() + 1) >= unbreaking) {
					Damageable d = ((Damageable) e	.getItem()
													.getItemMeta());
					d.setDamage(d.getDamage() + 1);
					e	.getItem()
						.setItemMeta((ItemMeta) d);
					if (d.getDamage() >= e	.getItem()
											.getType()
											.getMaxDurability()) {
						e	.getPlayer()
							.playSound(e.getPlayer()
										.getEyeLocation(),
									Sound.ENTITY_ITEM_BREAK, 1, 1);
						e	.getItem()
							.setAmount(0);
						break out;
					}
				}
			}
	}

	public boolean harvest(Location l) {
		ItemStack s = getDrop(l	.getBlock()
								.getType());
		if (s == null) return false;

		if (((Crops) l	.getBlock()
						.getState()
						.getData()).getState() != CropState.RIPE)
			return false;

		l	.getWorld()
			.spawnParticle(Particle.SWEEP_ATTACK, l, 1);

		Material m = l	.getBlock()
						.getType();
		l	.getBlock()
			.setType(Material.AIR);
		l	.getBlock()
			.setType(m);

		l	.getWorld()
			.dropItemNaturally(l, s);

		return true;
	}

	public ItemStack getDrop(Material m) {
		Material out;
		switch (m) {
			case WHEAT:
				out = Material.WHEAT;
				break;
			case BEETROOTS:
				out = Material.BEETROOT;
				break;
			case CARROTS:
				out = Material.CARROT;
				break;
			case POTATOES:
				out = Material.POTATO;
				break;
			default:
				return null;
		}
		return new ItemStack(out, 1);
	}

}
