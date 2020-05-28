package com.horstmann;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Looper demo
 * @version 1.3 2020-05-28
 * @author Adam K.
 */

public class Looper
{
    public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException
    {
        // For loop demo
        System.out.println("For loop demo:");

        for (int i=0; i < 3; i++)
        {
            System.out.println(i);
        }

        System.out.println("*****");

        // Enhanced for loop demo. Updated on 28.05.2020 with an exception handling
        // Array with Integers
        System.out.println("Enhanced for loop with an array of integers:");

        int[] myIntArray = {100,1,50,49};
        Arrays.sort(myIntArray); // Sort array
        try {
            for (int x : myIntArray)
            {
                System.out.println(Array.getInt(myIntArray,myIntArray.length)); // =ArrayIndexOutOfBoundsException
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            for (int x : myIntArray)
            {
                System.out.println(x);
            }
            //e.printStackTrace();
        }

        System.out.println("*****");

        //array with Strings
        System.out.println("Enhanced for loop with an array of strings:");

        String[] myStringArray = {"Z","A","L"}; //todo insert a source file with strings e.g an alphabet (A-Z)
        Arrays.sort(myStringArray); // Sort array
        for (String s : myStringArray)
        {
            System.out.println(s);
        }
    }

}