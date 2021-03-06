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

import org.lardonsoft.lardonpokersimulator.model.card.Deck;

public class RobPlayer extends Player {

    protected static final String ROB_NAME = "Rob";

    public RobPlayer(int initialTokens, Deck deck) {
        super(ROB_NAME, initialTokens, deck);
    }
}
