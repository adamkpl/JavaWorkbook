package com.horstmann;

import java.util.Arrays;

/**
 * Looper demo
 * @version 1.2 2019-08-06
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

        // Enhanced for loop demo
        // Array with Integers
        System.out.println("Enhanced for loop with an array of integers:");

        int[] myIntArray = {100,1,50};
        Arrays.sort(myIntArray); // Sort array
        for (int x : myIntArray) // List all elements in an array
        {
            //System.out.println(Array.getInt(myIntArray,myIntArray.length)); //ArrayIndexOutOfBoundsException :-)
            System.out.println(x);
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