package at.sm45654.boathunt.manager;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

import static at.sm45654.boathunt.BoatHunt.*;


public class Location {

    public static File file = new File("plugins/" + plugin.getName() + "/Locations", "locs.yml");

    public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

    public static void setLocation(String name, org.bukkit.Location loc) {

        cfg.set(name, name);

        cfg.set(name + ".world", loc.getWorld().getName());
        cfg.set(name + ".x", loc.getX());
        cfg.set(name + ".y", loc.getY());
        cfg.set(name + ".z", loc.getZ());

        cfg.set(name + ".yaw", loc.getYaw());
        cfg.set(name + ".pitch", loc.getPitch());
        saveCfg();
    }


    public static org.bukkit.Location getLocation(String name) {
        org.bukkit.Location loc;
        World w = Bukkit.getWorld(cfg.getString(name + ".world"));
        double x = cfg.getDouble(name + ".x");
        double y = cfg.getDouble(name + ".y");
        double z = cfg.getDouble(name + ".z");
        loc = new org.bukkit.Location(w, x, y, z);
        loc.setPitch(cfg.getInt(name + ".yaw"));
        loc.setPitch(cfg.getInt(name + ".pitch"));


        return loc;
    }

    public static void saveCfg() {
        try {
            cfg.save(file);
        } catch (IOException e) {
        }
    }
}


