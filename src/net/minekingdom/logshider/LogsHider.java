package net.minekingdom.logshider;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LogsHider extends JavaPlugin implements Listener {
	
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler(priority = EventPriority.MONITOR)
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(null);
	}
	
	@EventHandler(priority = EventPriority.MONITOR)
	public void onQuit(PlayerQuitEvent event) {
		event.setQuitMessage(null);
	}
	
}
