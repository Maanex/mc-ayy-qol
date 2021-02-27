package de.maanex.ayy.event;


import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class FelderTrampeln implements Listener {

	@EventHandler
	public void onTrample(PlayerInteractEvent event) {
		if (event.getAction() != Action.PHYSICAL) return;
		Block soil = event.getClickedBlock();
		if (soil == null || soil.getType() != Material.FARMLAND) return;
		event.setUseInteractedBlock(Event.Result.DENY);
		event.setCancelled(true);

		Material org = soil	.getRelative(BlockFace.UP)
							.getType();

		if (!Arrays	.asList(Material.WHEAT, Material.BEETROOTS, Material.CARROTS, Material.POTATOES, Material.MELON_STEM, Material.PUMPKIN_STEM)
					.contains(org))
			return;

		soil.getRelative(BlockFace.UP)
			.setType(Material.AIR);
		soil.getRelative(BlockFace.UP)
			.setType(org);
		soil.getWorld()
			.playSound(soil.getLocation(), Sound.BLOCK_CROP_BREAK, 1, 1);
	}

}
