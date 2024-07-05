package plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuildCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {

			Player player = (Player) sender;

			Utils.missingCommandsOGMessage(player, (MissingCommandsOG.getPlugin().getPrefix() + "&6Use &e/union &6instead of &e/guild&6!"));

		}

		return true;

	}

}