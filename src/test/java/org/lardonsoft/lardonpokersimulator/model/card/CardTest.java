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
package org.lardonsoft.lardonpokersimulator.model.card;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lardonsoft.lardonpokersimulator.model.card.Card.Suit;

public class CardTest {

    public CardTest() {
    }

    @Test
    public void testGetNumber() {
        short number = 1;
        Card card = new Card(number, Suit.Clubs);

        assertEquals(number, card.getNumber());
    }

    @Test
    public void testGetSuit() {
        Suit suit = Suit.Diamons;
        Card card = new Card((short)0, suit);

        assertEquals(suit, card.getSuit());
    }

    @Test
    public void testIsIsUsedTrue() {
        Card card = new Card((short)0, Suit.Hearts);
        card.setIsUsed(true);
        
        assertTrue(card.isUsed());
    }
    
    @Test
    public void testIsIsUsedFalse() {
        Card card = new Card((short)0, Suit.Hearts);

        assertFalse(card.isUsed());
    }

    @Test
    public void testToString() {
        Card card = new Card((short)5, Suit.Hearts);
        String expectedText = "Card{" + "number=" + 5 + ", suit=" + Suit.Hearts + '}';
        
        assertEquals(expectedText, card.toString());
    }
}
