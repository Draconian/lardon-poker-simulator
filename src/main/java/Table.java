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

import java.util.ArrayList;
import org.lardonsoft.lardonpokersimulator.model.card.Deck;
import org.lardonsoft.lardonpokersimulator.player.Player;
import org.lardonsoft.lardonpokersimulator.player.RobPlayer;

public class Table {

    protected static final int INITIAL_TOKENS = 5000;
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected Deck deck = new Deck();

    public Table() {
        deck.generateDeck();
    }

    public void generate(int numberNpcPlayer) {
        Player newPlayer;
        for (int i = 1; i <= numberNpcPlayer; i++) {
            newPlayer = new Player(String.format("Player %d", i), INITIAL_TOKENS, deck);
            newPlayer.pickCard();
            newPlayer.pickCard();
            this.players.add(newPlayer);

        }

        newPlayer = new RobPlayer(INITIAL_TOKENS, deck);
        newPlayer.pickCard();
        newPlayer.pickCard();
        this.players.add(newPlayer);

    }
}
