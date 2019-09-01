package com.horstmann;

import java.util.Scanner;

/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
 * JAVA API: https://docs.oracle.com/javase/8/docs/api/ */

/**
 * Constructors
 * @version 1.0 2019-08-07
 * @author Adam K.
 */

/* 1. Ask user for two digits/numbers
 * 2. Multiply them
 * 3. Print result */

/* 4.3.2. Używanie wielu plików źródłowych
"Wielu programistów woli jednak każdą klasę umieścić w oddzielnym pliku." */

public class Maths
{
    public static void main(String[]args) //todo: add try, catch exception handler later
    {
        System.out.println("Multiply!");

        // Ask user for two long-type numbers. Float and Double not allowed here
        Scanner readInput1 = new Scanner(System.in);
        System.out.println("Type first long-type digit/number: "); //todo: strings and null not allowed
        String userInput1 = readInput1.nextLine();

        Scanner readInput2 = new Scanner(System.in);
        System.out.println("Type second long-type digit/number: "); //todo: strings and null not allowed
        String userInput2 = readInput2.nextLine();

        long userInput1Parser = Long.parseLong(userInput1);
        long userInput2Parser = Long.parseLong(userInput2);

        // Arithmetic
        // Multiplication

        /* 4.3.4. Pierwsze kroki w tworzeniu konstruktorów. "(...) konstruktor jest zawsze wywoływany przy użyciu operatora new." */
        Multiplication m = new Multiplication(userInput1Parser,userInput2Parser);
        System.out.println("Result: " + m.getResults());
    }
}
