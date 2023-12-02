package ro.fr33styler.grinch.util;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.OfflinePlayer;

public class ChatUtil {

    public static String parseColor(OfflinePlayer player, String msg) {
        msg = msg.replace("&", "§");
        return PlaceholderAPI.setPlaceholders(player, msg);
    }

}
