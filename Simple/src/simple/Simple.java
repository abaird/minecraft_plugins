package simple;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Sound;
import org.bukkit.Location;
import org.bukkit.entity.Pig;

public class Simple extends JavaPlugin {
  public static Logger log = Logger.getLogger("Minecraft");
  public void onEnable() {
    log.info("[Simple] Start up.");
  }
  public void onReload() {
    log.info("[Simple] Server reloaded.");
  }
  public void onDisable() {
    log.info("[Simple] Server stopping.");
  }

  public static int howlong(int years){
    return years * 356 * 3600;
  }

  public static Location origin = null;

  public boolean onCommand(CommandSender sender, Command command, 
                           String commandLabel, String[] args) {         
    if (commandLabel.equalsIgnoreCase("simple")) {
      if (sender instanceof Player) { 
        Player me = (Player)sender;
        origin = me.getLocation();
        Location myLocation = new Location(origin.getWorld(), 0,0,0);
        
        
        int myAge = 40;
        int twiceMyAge = 80;

        float volume = 0.9f;
        float pitch = 1.0f;

        double dayOnio = 152853.5047;

        String myName = "Alan C. Baird";

        long secondsOld = howlong(myAge);

        me.sendMessage("My name is " + myName);
        me.sendMessage("I am " + myAge + " years old");
        me.sendMessage("I am " + secondsOld + " seconds old");
        me.sendMessage("volume: " + volume);
        me.sendMessage("pitch: " + pitch);
        me.playSound(me.getLocation(), Sound.GHAST_SCREAM, volume, pitch);

        for (int i=0; i < 10; i++) {
          me.getWorld().spawn(me.getLocation(), Pig.class);
        }

        return true;
        }
    }
    return false;
  }
}
