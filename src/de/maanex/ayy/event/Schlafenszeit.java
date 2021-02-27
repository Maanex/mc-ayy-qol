package de.maanex.ayy.event;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import de.maanex.ayy.Main;


public class Schlafenszeit implements Listener {

	private static List<String>	enter	= new ArrayList<>();
	private static List<String>	leave	= new ArrayList<>();

	static {
		enter.add("§6%name%§e liegt jetzt im Bett!");
		enter.add("§6%name%§e schläft tief und fest!");
		enter.add("§6%name%§e hat sich hingelegt!");
		enter.add("§6%name%§e liegt im Bett.");
		enter.add("§6%name%§e möchte schlafen!");
		enter.add("§6%name%§e liegt und schnarcht!");

		leave.add("§6%name%§e liegt jetzt nicht mehr im Bett.");
		leave.add("§6%name%§e ist aufgestanden!");
		leave.add("§6%name%§e ist auferstanden von den Schlafenden!");
		leave.add("§6%name%§e ist aufgewacht!");
		leave.add("§eGuten Morgen, §6%name%§e!");
		leave.add("§6%name%§e hatte keine Lust mehr zu schlafen!");
	}

	@EventHandler
	public void onSleep(PlayerBedEnterEvent e) {
		if (e.isCancelled()) return;

		Bukkit	.getScheduler()
				.runTaskLater(Main.instance, () -> {
					int req = (int) Math.ceil(Bukkit.getOnlinePlayers()
													.size()
							/ 2d);
					int cur = 0;
					for (Player p : Bukkit.getOnlinePlayers())
						if (p.isSleeping()) cur++;

					String m = enter.get(new Random().nextInt(enter.size()))
									.replace("%name%", e.getPlayer()
														.getName())
							+ " (" + cur + "/" + req + ")";

					e	.getPlayer()
						.getWorld()
						.getPlayers()
						.forEach(p -> p.sendMessage(m));

					if (cur >= req) e	.getPlayer()
										.getWorld()
										.setTime(5);
				}, 5);
	}

	@EventHandler
	public void onNotAnymoreSleep(PlayerBedLeaveEvent e) {
		if (e	.getBed()
				.getWorld()
				.getTime() > 12541
				&& e.getBed()
					.getWorld()
					.getTime() < 23458) {
			String m = leave.get(new Random().nextInt(enter.size()))
							.replace("%name%", e.getPlayer()
												.getName());
			e	.getPlayer()
				.getWorld()
				.getPlayers()
				.forEach(p -> p.sendMessage(m));
		}
	}
}
