// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.

package plugin;

import org.bukkit.plugin.java.JavaPlugin;

// Extending this class is standard bukkit boilerplate for any plugin, or else the server software won't load the
// classes.
public class MissingCommandsOG extends JavaPlugin {

    // Declare plugin instance.
    private static MissingCommandsOG plugin;

    // What to do when the plugin is run by the server.
    @Override
    public void onEnable() {

        // Set plugin instance.
        plugin = this;

        // Register the events.
        this.getCommand("wild").setExecutor(new WildCommand());
        this.getCommand("rtp").setExecutor(new RTPCommand());
        this.getCommand("seed").setExecutor(new SeedCommand());
        this.getCommand("f").setExecutor(new FCommand());
        this.getCommand("faction").setExecutor(new FactionCommand());
        this.getCommand("guild").setExecutor(new GuildCommand());
        this.getCommand("kit").setExecutor(new KitCommand());
    }

    public String getPrefix() {

        return "&8[&2True&4OG&8] ";
    }

    // Accessor constructor so that the main class (this) can be referenced from other classes.
    public static MissingCommandsOG getPlugin() {

        // Pass instance of main.
        return plugin;
    }
}
