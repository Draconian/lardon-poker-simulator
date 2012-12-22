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

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lardonsoft.lardonpokersimulator.model.card.Card.Suit;

public class DeckTest {

    @Test
    public void testAddCard() {
        Deck deck = new Deck();
        Card card = new Card((short)0, Suit.Clubs);
        deck.addCard(card);
        
        assertSame(card, deck.cards.get(0));
        
    }
    
    @Test
    public void testGenerateDeck() {
        Deck deck = new Deck();
        
        deck.generateDeck();
        
        assertEquals(52, deck.cards.size());
        
        Card firstCard = deck.cards.get(0);
        
        assertEquals(1, firstCard.number);
        assertEquals(Suit.Clubs, firstCard.suit);
        
        Card lastCard = deck.cards.get(51);
        assertEquals(13, lastCard.number);
        assertEquals(Suit.Spades, lastCard.suit);
    }
    
    @Test
    public void testPickRandomCard() {
        //41 -> 24      
        Deck deck = new Deck(10);
        deck.generateDeck();
        
        Card randCard = deck.pickRandomCard();
        
        assertEquals(3, randCard.number);
        assertEquals(Suit.Spades, randCard.suit);
        
        randCard = deck.pickRandomCard();
        
        assertEquals(12, randCard.number);
        assertEquals(Suit.Diamons, randCard.suit);
    }
}