public class SeedCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Cracking the seed is disallowed but you can go look for the 0-40k seed.");
}
