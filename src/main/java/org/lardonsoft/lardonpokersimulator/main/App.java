package org.lardonsoft.lardonpokersimulator.main;

import org.lardonsoft.lardonpokersimulator.model.card.Card;
import org.lardonsoft.lardonpokersimulator.player.Player;


public class App {

    public static void main(String[] args) {
        
       Table t = new Table();
        
       t.generate(8);
        
       for(Player p : t.players)
       {
           System.out.println("Name: " + p.getName());
           System.out.println("Token: " + p.getTokens());
           
           for(Card c : p.getCards())
           {
               System.out.println("\t" + c.toString());
           }
       }
       
    }
}
