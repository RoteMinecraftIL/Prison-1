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
 */

package se.ranzdo.bukkit.methodcommand;

import java.lang.reflect.Method;

public class RegisterCommandMethodException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RegisterCommandMethodException(Method method, String msg) {
        super(
            "Could not register the command method " + method.getName() + " in the class " + method
                .getDeclaringClass().getName() + ". Reason: " + msg);
    }
}