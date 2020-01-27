package com.sololearn;

/* 07.2019. SoloLearn, lesson: Classes and Objects: Static, part 11/13 */

public class Counter {
    public static int COUNT=0; // The COUNT variable will be shared by all objects of that class.
    public Counter() {
        COUNT++; // Increments by 1.
    }
}