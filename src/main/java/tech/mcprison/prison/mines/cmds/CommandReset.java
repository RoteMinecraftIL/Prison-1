/*
 * Prison - A plugin for the Minecraft Bukkit mod
 * Copyright (C) 2016  SirFaizdat
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package tech.mcprison.prison.mines.cmds;

import tech.mcprison.prison.core.MessageUtil;
import tech.mcprison.prison.mines.Mine;
import tech.mcprison.prison.mines.Mines;

/**
 * @author SirFaizdat
 */
public class CommandReset extends Command {

    public CommandReset() {
        super("reset");
        addRequiredArg("mine");

    }

    @Override protected void execute() {
        Mine m = Mines.i.mm.getMine(args[1]);
        if (m == null) {
            sender.sendMessage(MessageUtil.get("mines.notFound"));
            return;
        }
        if (m.reset()) {
            sender.sendMessage(MessageUtil.get("mines.resetSuccess", m.name));
        } else {
            sender.sendMessage(MessageUtil.get("mines.resetFailed", m.name));
        }
    }

    @Override public String description() {
        return "Reset a mine";
    }

}
