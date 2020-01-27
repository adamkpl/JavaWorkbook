package com.sololearn;

/* 07.2019. SoloLearn, lesson: Classes and Objects: Static, part 11/13 */

public class Counter2 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.COUNT);
        /*
        The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of
        the com.SoloLearn.Counter class is created.
        */

    }
}