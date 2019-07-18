/* SoloLearn, lesson: Arrays, part 2/4 */

package com.SoloLearn;

import java.util.Arrays; // This is required in order to be able to print values defined in array, otherwise it will be something like '[I@3343c8b3'

public class myArrays {

    public void calculateTheSumOfMyArray () {

        // Define variables in array.
        int[] myArray = {6, 42, 3, 7}; // There are 4 elements in array; last one (7) index=3
        int sum = 0;

        // Open a FOR loop & define a new variable called index.
        for (int index = 0; index < myArray.length; index++) {
            sum = sum + myArray[index];
        }
        // Print results.
        System.out.println("Entries in Array: " + myArray.length);
        System.out.println("Digits/Numbers in Array: " + Arrays.toString(myArray));
        System.out.println("Sum: " + sum); // = 58

    }
}