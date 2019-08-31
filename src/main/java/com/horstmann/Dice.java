package com.horstmann;

import java.util.Random;

/**
 * @version 1.0 2019-08-17
 * @author Adam K.
 * @see <a href="https://en.wikipedia.org/wiki/Dice#Construction">Dice</a>
 * @param diceSix A six-sided standard dice with digits from 1 to 6.
 */

public class Dice
{
    public static final int diceSix = 6;
    private int result;

    // A default constructor
    public Dice (int diceSix)
    {
        Random tossResult = new Random();
        result = tossResult.nextInt(diceSix);
        result++; // Result cannot be 0 so always +1
    }

    // Return results method
    public int getDiceTossResult()
    {
        return result;
    }
}