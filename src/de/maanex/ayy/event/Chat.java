package de.maanex.ayy.event;


import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class Chat implements Listener {

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if (e	.getPlayer()
				.getName()
				.equalsIgnoreCase("Maanex")
				&& e.getMessage()
					.startsWith("~"))
			return;
		if (e.isCancelled()) return;
		e.setCancelled(true);
		String raw = e.getMessage();
		// raw = ChatIcons.translate(raw);

		String mes = raw;
		Bukkit	.getOnlinePlayers()
				.forEach(p -> p.sendMessage("§7" + e.getPlayer()
													.getName()
						+ "§8:§f " + mes));
		System.out.println("[Chat] " + e.getPlayer()
										.getName()
				+ ": " + e.getMessage());
	}

}
