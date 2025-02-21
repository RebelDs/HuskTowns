package net.william278.husktowns.command.subcommands.town;

import net.william278.husktowns.MessageManager;
import net.william278.husktowns.command.subcommands.TownSubCommand;
import net.william278.husktowns.data.DataManager;
import net.william278.husktowns.util.NameAutoCompleter;
import org.bukkit.entity.Player;

public class TownPlayerSubCommand extends TownSubCommand {

    public TownPlayerSubCommand() {
        super("player",
                "husktowns.command.town.player", "<player>", "who");
    }

    @Override
    public void onExecute(Player player, String[] args) {
        if (args.length == 1) {
            DataManager.sendPlayerInfo(player, NameAutoCompleter.getAutoCompletedName(args[0]));
        } else {
            MessageManager.sendMessage(player, "error_invalid_syntax", getUsage());
        }
    }
}
