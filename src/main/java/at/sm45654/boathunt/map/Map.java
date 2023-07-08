package at.sm45654.boathunt.manager;

import at.sm45654.boathunt.BoatHunt;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Map {

    public static ArrayList<String> maplist = new ArrayList<String>();
    public static File listFile;

    public static YamlConfiguration cfg;

    static {
        listFile = new File("plugins/" + BoatHunt.plugin.getName() + "/Maps", "maps.yml");
        cfg = YamlConfiguration.loadConfiguration(listFile);
    }



    public static void saveList() {
        cfg.set("MapList", maplist);
        try {
            cfg.save(listFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadList() {
        maplist = (ArrayList<String>) cfg.getStringList("MapList");
    }

}


}
