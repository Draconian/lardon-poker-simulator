package org.lardonsoft.lardonpokersimulator.main;

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
import static org.junit.Assert.*;
import org.junit.Test;
import org.lardonsoft.lardonpokersimulator.player.RobPlayer;

public class TableTest {

    @Test
    public void testGenerate() {
        int maxNpcPlayer = 8;

        Table table = new Table();
        table.generate(maxNpcPlayer);

        assertEquals(9, table.players.size());

        RobPlayer rob = (RobPlayer) table.players.get(8);
        assertEquals(RobPlayer.class, rob.getClass());

        assertEquals(2, rob.getCards().size());
    }
    
    @Test
    public void testGenerateTableCards() {
        Table table = new Table();
        
        table.generateTableCards();
        
        assertEquals(2, table.tableCards.size());
    }
}
