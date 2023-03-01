// This is free and unencumbered software released into the public domain.
// Author: s0me0ne-coder

package plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import io.papermc.paper.event.block.DragonEggFormEvent;
import java.util.Random;

// Extending this class is standard bukkit boilerplate for any plugin, or else the server software won't load the classes.
public class RandomEggs extends JavaPlugin {
	boolean isRunning = false;
	Random r = new Random();
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDragonEggDrop(DragonEggFormEvent event) {
		// 10% chance
		if (isRunning && r.nextDouble < 0.1) {event.setCancelled(false);}
		else {event.setCancelled(true);}
	}
	
	// What to do when the plugin is run by the server.
	public void onEnable() {
		isRunning = true;

		// Register the instantiation of the plugin (triggers loading with messages in console).
		getServer().getPluginManager().registerEvents(new Listeners(), (Plugin) this);
	}

	// What to do when the plugin is disabled by the server (such as during a reboot).
	public void onDisable() {
		isRunning = false;
	}

}
