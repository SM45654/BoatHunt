package at.sm45654.boathunt.cfg;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

import static at.sm45654.boathunt.BoatHunt.plugin;

public class Config {


    public  static File file = new File("plugins/"+ plugin.getName(),"config.yml");
    public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);



    public static void register() {
        cfg.options().copyDefaults(true);
        cfg.addDefault("max_players", 20);
        cfg.addDefault("min_players", 2);
        saveCfg();
    }

    public boolean getBoolean(String path) {
        return cfg.getBoolean(path);
    }
    public String getString(String path) {
        return cfg.getString(path);
    }
    public int getInt(String path) {
        return cfg.getInt(path);
    }



    public static void saveCfg() {
        try {
            cfg.save(file);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}

