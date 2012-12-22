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

import java.util.ArrayList;
import java.util.Random;
import org.lardonsoft.lardonpokersimulator.model.card.Card.Suit;

public class Deck {

    protected static final int NUMBER_CARDS_PER_SUIT = 13;
    protected ArrayList<Card> cards = new ArrayList<Card>(52);
    protected Random random = new Random();

    protected Deck(int randomSeed) {
        this.random = new Random(randomSeed);
    }
    
    public Deck() {}

    protected void addCard(Card card) {
        cards.add(card);
    }

    public void generateDeck() {
        Card newCard;
        for (Suit suit : Suit.values()) {
            for (short i = 1; i <= NUMBER_CARDS_PER_SUIT; i++) {
                newCard = new Card(i, suit);
                this.cards.add(newCard);
            }
        }
    }

    public Card pickRandomCard() {
        ArrayList<Card> unUsedCardList = new ArrayList<Card>();
        
        for(Card card : this.cards){
            if(!card.isUsed()) {
                unUsedCardList.add(card);
            }
        }
        
        int cardIndex = this.random.nextInt(unUsedCardList.size());
        
        Card randCard = unUsedCardList.get(cardIndex);
        randCard.setIsUsed(true); 
        
        return randCard;
    }
}
