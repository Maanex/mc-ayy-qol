package de.maanex.ayy.cit;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LeashHitch;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import de.maanex.ayy.Main;

public class WhipsWork implements Listener {

	public WhipsWork() {
	}

	@SuppressWarnings("unused")
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		if (e.getItem() == null) return;
		if (!e.getItem().getType().equals(Material.GOLDEN_SHOVEL)) return;
		if (true) return; //TODO disabled.
		
		Bat s = e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Bat.class);
		s.setLeashHolder(e.getPlayer());
		s.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9999, 1, true, false), true);
		s.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999, 99, true, false), true);
		s.setSilent(true);
		
		Vector vel = e.getPlayer().getLocation().getDirection().clone().multiply(2);
		
		int timer = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.instance, () -> {
			s.setVelocity(vel);
			vel.multiply(.9);
			
			for (Entity n : s.getNearbyEntities(.5, .5, .5)) {
				if (!(n instanceof LivingEntity)) continue;
				if (n.equals(e.getPlayer())) continue;
				((LivingEntity) n).damage(1, e.getPlayer());
			}
		}, 1, 1);
		
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> {
			vel.multiply(-2);
		}, 10);
		
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> {
			Bukkit.getScheduler().cancelTask(timer);
			s.remove();
		}, 20);
	}
	
	@EventHandler
	public void hangingBreak(HangingBreakEvent event) {
	    if (event.getEntity() instanceof LeashHitch) {
	        event.setCancelled(true);
	    }
	}
	
}
