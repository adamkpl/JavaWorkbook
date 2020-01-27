package com.horstmann;

import java.util.Random;

/**
 * @version 1.0 2019-08-17
 * @author Adam K.
 * @see <a href="https://en.wikipedia.org/wiki/Dice#Construction">Dice</a>
 */

public class Dice
{
    public static final int DICE_SIX = 6;
    private int result;

    // A default constructor
    public Dice ()
    {
        Random tossResult = new Random();
        result = tossResult.nextInt(DICE_SIX);
        result++; // Result cannot be 0 so always +1
    }

    // Return results method
    public int getDiceTossResult()
    {
        return result;
    }
}