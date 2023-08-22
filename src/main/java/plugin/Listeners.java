// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.
package plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.barny1094875.utilitiesog.Utilities_OG;

public class Listeners implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerMove(PlayerMoveEvent event) {

		Utilities_OG utilities = (Utilities_OG) Bukkit.getPluginManager().getPlugin("Utilities-OG");

	}

}
