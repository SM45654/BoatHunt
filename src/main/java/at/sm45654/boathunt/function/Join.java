package at.sm45654.boathunt.function;

import at.sm45654.boathunt.GameState;
import at.sm45654.boathunt.manager.Location;
import org.bukkit.entity.Player;

import static at.sm45654.boathunt.util.List.*;
import static at.sm45654.boathunt.BoatHunt.*;
import static at.sm45654.boathunt.util.ChatUtil.*;
import static at.sm45654.boathunt.cfg.Config.cfg;

public class Join {


    public static void JoinGame(Player p) {
        if (players.size() >= cfg.getInt("max_players")) {
            p.sendMessage(PREFIX + RED + "Maximum number of players reached! " + ORANGE + "(" + cfg.getInt("max_players") + ")");
            return;
        } else {

            p.teleport(Location.getLocation("lobby"));
            players.add(p);
            if (state == GameState.RUNNING) {
                p.sendMessage(PREFIX + ORANGE + "Game is running!");
            } else if (state == GameState.STARTING) {
                //
            } else if (state == GameState.WAITING) {
                if (players.size() < cfg.getInt("min_players")) {
                    p.sendMessage(PREFIX + RED + "Not enough players! " + ORANGE + "(" + players.size() + "/" + cfg.getInt("min_players") + ")");
                } else if (players.size() >= cfg.getInt("min_players")) {
                    state = GameState.STARTING;
                }
            }
        }
    }
}

