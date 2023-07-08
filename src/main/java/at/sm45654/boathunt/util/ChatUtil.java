package at.sm45654.boathunt.util;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

    public class ChatUtil {

        public static final ChatColor GREEN = ChatColor.of("#52FF9D");
        public static final ChatColor YELLOW = ChatColor.of("#EEFF00");
        public static final ChatColor ORANGE = ChatColor.of("#FF7300");
        public static final ChatColor RED = ChatColor.of("#FF0000");
        public static final ChatColor PINK = ChatColor.of("#FF00B7");
        public static final ChatColor BLUE = ChatColor.of("#0040FF");
        public static final ChatColor DARK_GREEN = ChatColor.of("#179900");
        public static final ChatColor PURPLE = ChatColor.of("#A200FF");
        public static final ChatColor DARK_PURPLE = ChatColor.of("#7F0099");
        public static final ChatColor DARK_RED = ChatColor.of("#990005");
        public static final ChatColor BLACK = ChatColor.of("#000000");
        public static final ChatColor GRAY = ChatColor.of("#594E65");
        public static final ChatColor LIGHT_GRAY = ChatColor.of("#8C8099");
        public static final ChatColor WHITE = ChatColor.of("#FFFFFF");
        public static final ChatColor LIGHT_BLUE = ChatColor.of("#00C3FF");
        public static final ChatColor CYAN = ChatColor.of("#006A80");
        public static final ChatColor LIGHT_GREEN = ChatColor.of("#80FF00");
        public static final ChatColor LIGHT_YELLOW = ChatColor.of("#CCFF00");
        public static final ChatColor SCULK = ChatColor.of("#024050");
        public static final ChatColor SHRIEKER = ChatColor.of("#C5CDB5");
        public static final ChatColor NETHERRACK = ChatColor.of("#723232");
        public static final ChatColor WARPED = ChatColor.of("#119b84");
        public static final ChatColor CRIMSON = ChatColor.of("#ac2020");
        public static final ChatColor LAVA = ChatColor.of("#fe8738");
        public static final ChatColor GOLD = ChatColor.of("#D4af37");
        public static final ChatColor BROWN = ChatColor.of("#8B4513");

        public static void sendTitle(Player target, ChatColor color, String tmsg, String stmsg, int fadeIn, int stay, int fadeOut) {
            String ctmsg = color + tmsg;
            String cstmsg = color + stmsg;
            target.sendTitle(ctmsg, cstmsg, fadeIn, stay, fadeOut);
        }

        public static void sendActionbar(Player target, ChatColor color, String message) {
            String msg = color + message;
            target.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(msg));
        }



    }

