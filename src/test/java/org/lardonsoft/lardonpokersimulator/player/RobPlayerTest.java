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

public class RobPlayerTest {

    @Test
    public void testCreateRobPlayer() {
        Player robPlayer = new RobPlayer(1000);
        
        assertEquals(RobPlayer.ROB_NAME, robPlayer.name);
        assertEquals(1000, robPlayer.tokens);
    }
}