package org.jtheque.demos.first;

/*
 * This file is part of JTheque.
 * 	   
 * JTheque is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License. 
 *
 * JTheque is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JTheque.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.jtheque.views.utils.AbstractModule;

/**
 * The first module of the Demo.
 *
 * @author Baptiste Wicht
 */
public final class DemoFirstModule extends AbstractModule {
    public DemoFirstModule() {
        super("org.jtheque.demo-module-1", new String[]{"mainLabel"});
    }
}