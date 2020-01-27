package com.sololearn;

/* 06.2019. My workbook. My first JAVA code. */

public class Workbook {
    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("SoloLearn, lesson: Arrays, part 2/4");
        System.out.println("****************************************");

        MyArrays mySimpleArray = new MyArrays(); // New instance of MyArrays class.
        mySimpleArray.calculateTheSumOfMyArray(); // This imports and executes a "calculateTheSumOfMyArray" method from com.SoloLearn.myArrays class (com.SoloLearn.myArrays.java)

        System.out.println("\n****************************************");
        System.out.println("SoloLearn, lesson: Creating Classes & Objects, part 4/13");
        System.out.println("****************************************");

        Animal dog = new Animal();
        System.out.println("What does the dog say?");
        dog.bark(); // Imports & executes the bark method from the com.SoloLearn.animal class
        Animal cat = new Animal();
        System.out.println("What does the cat say?");
        cat.meow(); // Imports & executes the meow method from the com.SoloLearn.animal class

        System.out.println("\n****************************************");
        System.out.println("SoloLearn, lesson: Classes and Objects: Static, part 11/13");
        System.out.println("****************************************");

        final double Pi = 3.14; // Pi is now a constant. Any attempt to assign it a value will cause an error.
        System.out.println(Pi);

        System.out.println("\n*** THE END ***");
    }
}