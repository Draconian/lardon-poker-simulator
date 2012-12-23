package org.lardonsoft.lardonpokersimulator.main;

import java.util.Random;
import org.lardonsoft.lardonpokersimulator.model.card.Card;
import org.lardonsoft.lardonpokersimulator.player.Player;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        int nbPlayer = random.nextInt(7) + 2;
        Table t = new Table();
        System.out.println("Random nb player: " + nbPlayer);
        t.generate(nbPlayer);

        for (Player p : t.players) {
            System.out.println("Name: " + p.getName());
            System.out.println("\tToken: " + p.getTokens());

            for (Card c : p.getCards()) {
                System.out.println("\t" + c.toString());
            }
        }

    }
}
