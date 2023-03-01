// This is free and unencumbered software released into the public domain.
// Author: s0me0ne-coder

package plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import io.papermc.paper.event.block.DragonEggFormEvent;


// Extending this class is standard bukkit boilerplate for any plugin, or else the server software won't load the classes.
public class RandomEggs extends JavaPlugin{
	boolean isRunning = false;
	
	// What to do when the plugin is run by the server.
	public void onEnable() {
		// register the event
		getServer().getPluginManager().registerEvents(new RandomEggs(), this);
	}

}
