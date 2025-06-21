package plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WildCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            Utils.missingCommandsOGMessage(
                    player,
                    (MissingCommandsOG.getPlugin().getPrefix()
                            + "&e/wild &6will not be implemented! Escape spawn yourself!"));
        }

        return true;
    }
}
