package de.maanex.ayy.event;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class JoinLeave implements Listener {

	private static List<String>	jmes	= new ArrayList<>();
	private static List<String>	lmes	= new ArrayList<>();

	static {
		jmes.add("§d> §bEnter. §3%name%");
		jmes.add("§d> §3%name% §bjoined the game!");
		jmes.add("§d> §3%name% §bhas joined the battle bus!");
		jmes.add("§d> §3%name% §bjoined the party!");
		jmes.add("§d> §3%name% §bjust joined the crusade!");
		jmes.add("§d> §bWelcome back, §3%name%§b!");
		jmes.add("§d> §bIt's just §3%name%§b.");
		jmes.add("§d> §bWelcome on board, §3%name%§b!");

		lmes.add("§d< §bLeave. §3%name%");
		lmes.add("§d< §3%name% §bleft the game!");
		lmes.add("§d< §3%name% §bhas dropped out of the battle bus!");
		lmes.add("§d< §3%name% §bleft the party!");
		lmes.add("§d< §3%name% §bquit.");
		lmes.add("§d< §bGood bye, §3%name%§b!");
		lmes.add("§d< §bCya §3%name%§b!");
		lmes.add("§d< §3%name%§b's gone!");
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage(jmes	.get(new Random().nextInt(jmes.size()))
								.replace("%name%", e.getPlayer().getName()));
//		DiscordThing.status(Bukkit.getOnlinePlayers().size() + " Online");
	}

	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		e.setQuitMessage(lmes	.get(new Random().nextInt(lmes.size()))
								.replace("%name%", e.getPlayer().getName()));
//		DiscordThing.status(Bukkit.getOnlinePlayers().size() + " Online");
	}

}
