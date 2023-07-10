package at.sm45654.boathunt;

import at.sm45654.boathunt.cfg.Config;
import at.sm45654.boathunt.command.BoatHuntCMD;
import at.sm45654.boathunt.map.Map;
import at.sm45654.boathunt.util.ChatUtil;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class BoatHunt extends JavaPlugin {

    public static String PREFIX = ChatUtil.BLUE + "[" + ChatUtil.LIGHT_BLUE + "BoatHunt" + ChatUtil.BLUE + "] ";
    public static BoatHunt plugin;

    public static GameState state;

    @Override
    public void onEnable() {
        plugin = this;
        plugin.getCommand("boathunt").setExecutor(new BoatHuntCMD());
        Map.loadList();
        Config.register();
        Config.saveCfg();
    }

    @Override
    public void onDisable() {
        Map.saveList();
    }

    public static void Help(Player p) {
        p.sendMessage(ChatUtil.BLUE + "--- [" + ChatUtil.LIGHT_BLUE + "BoatHunt HELP" + ChatUtil.BLUE + "] ---");
    }


}
