package de.maanex.ayy.event;


import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;


public class BrokenTools implements Listener {

	@EventHandler
	public void onBreak(PlayerItemBreakEvent e) {
		Item i = e	.getPlayer()
					.getWorld()
					.dropItem(e	.getPlayer()
								.getEyeLocation(),
							e.getBrokenItem());
		i.setVelocity(e	.getPlayer()
						.getLocation()
						.getDirection());
		i.setPickupDelay(20 * 3);
	}

}
