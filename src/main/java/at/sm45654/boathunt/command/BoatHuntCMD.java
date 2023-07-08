package at.sm45654.boathunt.command;

import at.sm45654.boathunt.map.Map;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static at.sm45654.boathunt.BoatHunt.*;
import static at.sm45654.boathunt.util.ChatUtil.*;


public class BoatHuntCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {

        Player p = (Player) s;
        Location ploc = p.getLocation();

        if (args.length == 0) {
            Help(p);
            return false;
        }

        switch (args[0]) {
            case "help":
                Help(p);
                break;

            case "version":
                p.sendMessage(PREFIX + LIGHT_BLUE + "BoatHunt v. " + plugin.getDescription().getVersion() + " by " + plugin.getDescription().getAuthors());
                break;

            case "set":
                if (!p.hasPermission("boathunt.set")) {
                    p.sendMessage(PREFIX + RED + "No permission!");
                    return false;
                }
                if (args[1].equalsIgnoreCase("lobby")) {
                    at.sm45654.boathunt.manager.Location.setLocation("lobby", ploc);
                    p.sendMessage(PREFIX + LIGHT_GREEN + "Lobby spawnpoint set.");
                } else if (args[1].equalsIgnoreCase("leave")) {
                    at.sm45654.boathunt.manager.Location.setLocation("leave", ploc);
                    p.sendMessage(PREFIX + LIGHT_GREEN + "Leave spawnpoint set.");
                }
                break;


            case "map":
                if (!p.hasPermission("boathunt.map")) {
                    p.sendMessage(PREFIX + RED + "No permission!");
                    return false;
                }
                if (args[2].length() == 0) {
                    p.sendMessage(PREFIX + RED + "Please enter a map name!");
                    return false;
                }
                if (args[1].equalsIgnoreCase("create")) {
                    Map.maplist.add(args[2]);
                    at.sm45654.boathunt.manager.Location.setLocation(args[2], ploc);
                    p.sendMessage(PREFIX + LIGHT_GREEN + "Map created.");
                } else if (args[1].equalsIgnoreCase("delete")) {
                    Map.maplist.remove(args[2]);
                    p.sendMessage(PREFIX + LIGHT_GREEN + "Map deleted.");
                }


                default:
                return false;
        }






        return false;
    }


}
