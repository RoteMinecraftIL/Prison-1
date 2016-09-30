package io.github.sirfaizdat.prison;

import net.caseif.rosetta.LocaleManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import se.ranzdo.bukkit.methodcommand.CommandHandler;

public final class Prison extends JavaPlugin implements Listener {

    private LocaleManager lang;
    private CommandHandler commandHandler;

    @Override public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(this, this);

        this.lang = new LocaleManager(this);
        this.commandHandler = new CommandHandler(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return commandHandler.onCommand(sender, command, label, args);
    }

    @Override public void onDisable() {
        // Plugin shutdown logic
    }

    public LocaleManager getLang() {
        return lang;
    }

    public CommandHandler getCommandHandler() {
        return commandHandler;
    }

}
