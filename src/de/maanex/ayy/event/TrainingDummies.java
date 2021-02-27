package de.maanex.ayy.event;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class TrainingDummies implements Listener {

	public TrainingDummies() {
	}

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e) {
		if (e.getEntity() == null) return;
		if (e	.getEntity()
				.getCustomName() == null)
			return;
		if (e	.getEntity()
				.getCustomName()
				.equalsIgnoreCase("Dummie")) {
			e.setCancelled(true);
			if (e.getDamager() instanceof Player) ((Player) e.getDamager()).sendMessage("§3Damage: §a" + Math.floor(e.getDamage() * 100) / 100);
		}
	}

}
