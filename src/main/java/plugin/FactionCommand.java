package plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FactionCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Use /union instead of /faction!");
		}

	return true;

	}
}
