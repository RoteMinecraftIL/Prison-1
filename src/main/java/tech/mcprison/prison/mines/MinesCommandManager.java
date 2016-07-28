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

package tech.mcprison.prison.mines;

import tech.mcprison.prison.core.Component;
import tech.mcprison.prison.mines.cmds.*;

/**
 * @author SirFaizdat
 */
public class MinesCommandManager extends AbstractCommandManager {

    public MinesCommandManager(Component c) {
        super(c, "mines");
    }

    @Override public void registerCommands() {
        commands.put("create", new CommandCreate());
        commands.put("addblock", new CommandAddBlock());
        commands.put("reset", new CommandReset());
        commands.put("info", new CommandInfo());
        commands.put("list", new CommandList());
        commands.put("removeblock", new CommandRemoveBlock());
        commands.put("delete", new CommandDelete());
        commands.put("redefine", new CommandRedefine());
    }
}
