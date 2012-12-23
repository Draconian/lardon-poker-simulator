/* 
 * Copyright 2012 LardonSoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package org.lardonsoft.lardonpokersimulator.player;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testGetName() {
        String name = "one name";
        Player player = new Player(name, 0);

        assertEquals(name, player.getName());
    }

    @Test
    public void testGetTokens() {
        int tokens = 1000;
        Player player = new Player(null, tokens);

        assertEquals(tokens, player.getTokens());
    }

    @Test
    public void testAddTokens() {
        int tokens = 1000;

        Player player = new Player(null, tokens);
        player.addTokens(100);

        assertEquals(1100, player.tokens);
    }

    @Test
    public void testSubstractTokens() {
        int tokens = 1000;

        Player player = new Player(null, tokens);
        player.substractTokens(100);

        assertEquals(900, player.tokens);
    }

    @Test
    public void testSubstractTokensUnderZero() {
        int tokens = 50;

        Player player = new Player(null, tokens);
        player.substractTokens(100);

        assertEquals(0, player.tokens);
    }

    @Test
    public void testIsAliveTrue() {
        Player player = new Player();
        player.tokens = 1;

        assertTrue(player.isAlive());
    }

    @Test
    public void testIsAliveFalse() {
        Player player = new Player();
        player.tokens = 0;

        assertFalse(player.isAlive());
    }
}
