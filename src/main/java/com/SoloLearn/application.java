/* My workbook */

// Archived.

package com.SoloLearn;

public class application {
    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("SoloLearn, lesson: Arrays, part 2/4");
        System.out.println("****************************************");

        myArrays mySimpleArray = new myArrays(); // New instance of MyArrays class.
        mySimpleArray.calculateTheSumOfMyArray(); // This imports and executes a "calculateTheSumOfMyArray" method from com.SoloLearn.myArrays class (com.SoloLearn.myArrays.java)

        System.out.println("****************************************");
        System.out.println("SoloLearn, lesson: Creating Classes & Objects, part 4/13");
        System.out.println("****************************************");

        animal dog = new animal();
        System.out.println("What does the dog say?");
        dog.bark() ; // Imports & executes the bark method from the com.SoloLearn.animal class
        animal cat = new animal();
        System.out.println("What does the cat say?");
        cat.meow(); // Imports & executes the meow method from the com.SoloLearn.animal class

        System.out.println("****************************************");
        System.out.println("SoloLearn, lesson: Classes and Objects: Static, part 11/13");
        System.out.println("****************************************");

        final double Pi = 3.14; // Pi is now a constant. Any attempt to assign it a value will cause an error.
        System.out.println(Pi);

        System.out.println("*** THE END ***");

    }
}