package org.lardonsoft.lardonpokersimulator.main;

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        long seed = 10;
        Random random = new Random(seed);
        System.out.println( "Number:" + random.nextInt(52));
        System.out.println( "Number:" + random.nextInt(51));
        System.out.println( "Number:" + random.nextInt(50));
        System.out.println( "Number:" + random.nextInt(49));
        System.out.println( "Number:" + random.nextInt(48));
    }
}
