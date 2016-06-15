package me.sirfaizdat.prison.core.cmds;

import me.sirfaizdat.prison.core.Command;
import me.sirfaizdat.prison.core.MessageUtil;
import me.sirfaizdat.prison.core.Prison;

/**
 * @author SirFaizdat
 */
public class CmdReload extends Command {

    public CmdReload() {
        super("reload");
    }

    @Override
    protected void execute() {
        Prison.i().reload();
        sender.sendMessage(MessageUtil.get("general.reloadSuccessful"));
    }

    @Override
    public String description() {
        return "Reload Prison's configuration and all components.";
    }

}
