
package org.cuatrovientos.julen.minecraft.arguments; 

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This plugins sends greets or messages repeteadly
 * showing how to get command arguments
 * @author Julen
 */
public class muralla extends JavaPlugin { 
  // we set this logger to show messages on console
  private static Logger log = Logger.getLogger("Minecraft");
  
  /**
   * This method is called when the plugin is loaded
   */
  public void onLoad() {
	    log.info("Greets Plugin> loaded");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onEnable() {
    log.info("Greets Plugin> enabled");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onDisable() {
	    log.info("Greets Plugin> disabled");
  }
  
  /**
   * onCommand event, whenever the player sends a command with /command
   * this method will be invoked
   */
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
	// If the command is hello...
    if (commandLabel.equalsIgnoreCase("muralla")) {
       	// Check if command was sent by a player
    	if (sender instanceof Player) {
    		// Cast or convert sender to Player
    		Player myPlayer = (Player) sender;
    		// Get arguments
    		// Check arguments length, must be 2
    		if (args.length == 2) {
    			Location milocalizacion = myPlayer.getLocation();
    			World world = milocalizacion.getWorld();
    			
    			log.info("First argument: " + args[0]);
    			log.info("Second argument: " + args[1]);
    		
    			int width = 0;
    			int height = 0;
    			
    			width = Integer.parseInt(args[0]);
    			height = Integer.parseInt(args[1]);
    			
    			int startx = milocalizacion.getBlockX() + 2;
    			int starty = milocalizacion.getBlockY();
    			int startz = milocalizacion.getBlockZ() + 2;
    			
    			int finishz = startz + width;
    			int finishy = starty + height;
    			
    			for (int puntoz = startz; puntoz <= finishz; puntoz ++) {
    				for (int puntoy = starty; puntoy <= finishy; puntoy ++) {
    					Block mibloque = world.getBlockAt(startx, puntoy, puntoz);
    					mibloque.setType(Material.COBBLESTONE);
    					}    			
    			}
    		}
    	}
    	
      return true;
    }
    return false;
  }
}

