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

public class Card {

    protected short number;
    protected Suit suit;
    protected boolean isUsed = false;

    public Card(short number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public short getNumber() {
        return number;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    @Override
    public String toString() {
        return "Card{" + "number=" + number + ", suit=" + suit + '}';
    }

    public enum Suit {

        Clubs,
        Diamons,
        Hearts,
        Spades
    }
}
