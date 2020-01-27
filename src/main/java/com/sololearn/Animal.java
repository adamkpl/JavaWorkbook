package com.sololearn;

/* 06.2019. SoloLearn, lesson: Creating Classes & Objects, part 4/13 */

public class Animal // A Superclass
    {
        protected int legs; // protected access modifier makes the members visible only to the subclasses.
        protected String category;

        public void showDescription() { // showDescription method is public
            System.out.println("Animal properties:");
            System.out.println("Category: " + category);
            System.out.println("Legs: " + legs);
        }

        public void bark() {
            System.out.println("Woof-Woof!");
        }

        public void meow() {
            System.out.println("Meow...");
        }
    }