package workbook;

import java.util.ArrayList;

public class IntToCharAndBackToInt {

    public static void main(String[] args) {

        // Task: convert 358 to single digits so they add up to 16.

        System.out.println("\nBASIC APPROACH: ");
        getBasicSolution();

        System.out.println("\nBASIC APPROACH v2: ");
        getBasicSolutionV2();

        System.out.println("\nFANCY APPROACH with the help of Stack Overflow: ");
        getFancySolution();

    }

    public static void getBasicSolution(){
        int originalNumber = 358;

        // Print originalNumber
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

    public static void getBasicSolutionV2(){
        int originalNumber = 358;

        // Print originalNumber
        System.out.println("originalNumber: " + originalNumber);

        // Print the length of the originalNumber
        int numberLength = Integer.toString(originalNumber).length();
        System.out.println("Number of chars in originalNumber: " + numberLength);

        // Save individual digit values to an Integer arrayList
        ArrayList<Integer> charList = new ArrayList<>();
        for (int y=0; y<numberLength; y++) {
            int numericValue = Character.getNumericValue(Integer.toString(originalNumber).charAt(y));
            charList.add(numericValue);
            System.out.println("Numeric value: " + numericValue);
        }

        // Print Integer arrayList elements
        System.out.println("Integer arrayList elements: " + charList);

        // Print the sum of Integer arrayList elements
        int sum = 0;
        for(int z : charList) {
            sum += z;
        }
        System.out.println("Sum: " + sum);

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