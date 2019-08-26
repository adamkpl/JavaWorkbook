package com.horstmann;

/**
 * Simple Text Games
 * @version 1.0 2019-08-17
 * @author Adam K.
 */

public class SimpleTextGames
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Simple Text Games!");

        //Game #1: roll a dice (once)
        System.out.println("\nGame #1: Roll a dice");
        Dice dice = new Dice(Dice.diceSix);
        System.out.println("Alea iacta est! Result: " + dice.getDiceTossResult());
    }
}