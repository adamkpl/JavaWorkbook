package com.horstmann;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Looper demo
 * @version 1.3 2020-05-28
 * @author Adam K.
 */

public class Looper
{
    public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException, IOException {
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

        /* Enhanced for loop demo for a Dynamic collecion (List) with Strings. Updated 28.05.2020. Data sources:
        http://www.if.pw.edu.pl/~ertman/pojava/?Laboratorium_4:Odczyt_linii_tekstu_z_pliku_-_klasy_FileReader_i_BufferedReader
        https://www.samouczekprogramisty.pl/operacje-na-plikach-w-jezyku-java/
        Java For Testers, Learn Java fundamentals fast - Alan Richardson
        System.out.println("Enhanced for loop:"); */

        try {
            // Define the source of strings that will go into a List
            BufferedReader file = new BufferedReader(new FileReader("src\\main\\java\\com\\horstmann\\dev.txt"));
            // Define input data type
            String input;
            // Define a collection type. It's going to be a dynamic List of strings from file
            List<String> list = new ArrayList<>();

            // Add every single line from file to our dynamic List of strings from file
            while((input = file.readLine()) != null) {
                list.add(input);
            }
            // Print the entire list
            for (String s : list) {
                System.out.println(s);
            }
            // Handle an exception
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Perform the code here regardless of whether an exception was thrown or not
            System.out.println("What DEVs say...");
        };
    }

}