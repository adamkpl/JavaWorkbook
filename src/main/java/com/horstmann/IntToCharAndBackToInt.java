package com.horstmann;

public class IntToCharAndBackToInt {

    public static void main(String[] args) {

        // Task: convert 358 to single digits so they add up to 16.

        System.out.println("BASIC APPROACH: ");
        getBasicSolution();

        System.out.println("FANCY APPROACH with the help of Stack Overflow: ");
        getFancySolution();

    }

    public static void getBasicSolution(){
        int originalNumber = 358;

        // Print 358
        System.out.println(originalNumber);

        // Convert int to single chars
        char a = Integer.toString(originalNumber).charAt(0);
        char b = Integer.toString(originalNumber).charAt(1);
        char c = Integer.toString(originalNumber).charAt(2);

        // Print chars
        System.out.println(a + ", " + b + ", " + c);

        // Convert chars to numeric values, and sum them up
        int three = Character.getNumericValue(a);
        int five = Character.getNumericValue(b);
        int eight = Character.getNumericValue(c);

        // Print results
        System.out.println(three + five + eight);
    }

    public static void getFancySolution(){

        // Print 358
        int number = 358;

        System.out.println(number);

        int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }

}

