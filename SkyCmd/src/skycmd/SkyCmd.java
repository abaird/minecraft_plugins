/***
 * Excerpted from "Learn to Program with Minecraft Plugins",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine for more book information.
***/
package skycmd;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Entity;
import java.util.List;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Fish;

public class SkyCmd extends JavaPlugin { 

  public boolean onCommand(CommandSender sender, Command command, 
                           String commandLabel, String[] args) {         
    if (commandLabel.equalsIgnoreCase("sky")) { //(1)
      if (sender instanceof Player) { //(2)
        Player me = (Player)sender; //(3)
        List<Entity> list = me.getNearbyEntities(50,50,50);
        for (Entity target : list) {
          if (!(target instanceof Player)) {
            Location loc = target.getLocation();
            double y = loc.getY();
            loc.setY(y+50);
            target.teleport(loc);
          }
        }
        return true;
      }
    }
    if (commandLabel.equalsIgnoreCase("squidbomb")){
      if (sender instanceof Player) {
        Player me = (Player)sender; //(3)
        Location loc = me.getLocation();

        for (int i = 0; i < 10; i++) {
          Location new_loc = new Location(me.getWorld(),
            loc.getX() + ((Math.random() * 10) - 5),
            loc.getY() + 10,
            loc.getZ() + ((Math.random() * 10) - 5));
          me.getWorld().spawn(new_loc, Squid.class);
        }
        return true;
      }
    }
    if (commandLabel.equalsIgnoreCase("ocelotbomb")){
      if (sender instanceof Player) {
        Player me = (Player)sender; //(3)
        Location loc = me.getLocation();

        for (int i = 0; i < 10; i++) {
          Location new_loc = new Location(me.getWorld(),
            loc.getX() + ((Math.random() * 10) - 5),
            loc.getY() + 10,
            loc.getZ() + ((Math.random() * 10) - 5));
          me.getWorld().spawn(new_loc, Ocelot.class);
        }
        return true;
      }
    }
    return false;
  }
}
