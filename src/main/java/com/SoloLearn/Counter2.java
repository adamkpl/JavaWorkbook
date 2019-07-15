/* SoloLearn, lesson: Classes and Objects: Static, part 11/13 */

package com.SoloLearn;

public class Counter2 {
    public static void main(String[ ] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.COUNT); // The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of the com.SoloLearn.Counter class is created. In the code above, we created 2 objects. It’s a common practice to use upper case when naming a static variable, although not mandatory. You can also access the static variable using any object of that class, such as c1.COUNT.
    }
}