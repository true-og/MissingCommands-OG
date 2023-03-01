import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import java.util.Random;
public class Listeners implements Listener {
  
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDragonEggDrop(DragonEggFormEvent event) {
    Random r = new Random();
		// 10% chance
		if (r.nextDouble() < 0.1) {event.setCancelled(false);}
		else {event.setCancelled(true);}
	}
  
}
