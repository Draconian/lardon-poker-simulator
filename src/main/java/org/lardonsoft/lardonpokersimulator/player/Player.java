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

import java.util.ArrayList;
import javax.media.jai.Histogram;
import org.lardonsoft.lardonpokersimulator.model.card.Card;
import org.lardonsoft.lardonpokersimulator.model.card.Deck;

public class Player {

    protected String name;
    protected int tokens;
    protected Deck deck;
    protected ArrayList<Card> cards = new ArrayList<Card>();

    protected Player() {
    }

    public Player(String name, int initialTokens, Deck deck) {
        this.name = name;
        this.tokens = initialTokens;
        this.deck = deck;
    }

    public String getName() {
        return this.name;
    }

    public int getTokens() {
        return this.tokens;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public boolean isAlive() {
        return (this.tokens > 0);
    }

    public void addTokens(int addTokens) {
        this.tokens += addTokens;
    }

    public void substractTokens(int subTokens) {
        this.tokens -= subTokens;

        if (this.tokens < 0) {
            this.tokens = 0;
        }
    }

    public void pickCard() {
        Card card = deck.pickRandomCard();
        this.cards.add(card);
    }
}
