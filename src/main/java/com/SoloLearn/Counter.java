/* SoloLearn, lesson: Classes and Objects: Static, part 11/13 */

// Archived.

package com.SoloLearn;

public class Counter {
    public static int COUNT=0; // The COUNT variable will be shared by all objects of that class.
    public Counter() {
        COUNT++; // Increments by 1.
    }
}