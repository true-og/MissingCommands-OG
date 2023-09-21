// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.

package plugin;

import org.bukkit.plugin.java.JavaPlugin;
// Extending this class is standard bukkit boilerplate for any plugin, or else the server software won't load the classes.
public class MissingCommandsOG extends JavaPlugin {

	// What to do when the plugin is run by the server.
	@Override
	public void onEnable() {

		// Register the event.
		this.getCommand("wild").setExecutor(new WildCommand());
		this.getCommand("rtp").setExecutor(new RTPCommand());
		this.getCommand("seed").setExecutor(new SeedCommand());
		this.getCommand("f").setExecutor(new FCommand());
		this.getCommand("faction").setExecutor(new FactionCommand());
		this.getCommand("guild").setExecutor(new GuildCommand());
		this.getCommand("kit").setExecutor(new KitCommand());

	}

}
/*
FCommand.java
FactionCommand.java
GuildCommand.java
KitCommand.java
MissingCommandsOG.java
RTPCommand.java
SeedCommand.java
WildCommand.java
*/
