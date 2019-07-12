/* SoloLearn, lesson: Classes and Objects: Value & Reference Types, part 9/13 */

public class Values {
    public static void main(String[ ] args) { // This where the main executes everything.
        int x = 0; // sample variable and its value
        addOneTo(x); // this method is invoked from the code below, and inserts a new argument (int x=5).
        System.out.println("main method = " + x); // Outputs "0"
    }

    static void addOneTo(int num) { // method called addOneTo with a int-type 'num' variable.
        num = num + 1; // increment by 1
        System.out.println("addOneTo method = " + num); // Outputs "1". See https://www.youtube.com/watch?v=eRfvgSvf-mM. x is defined first, and also in public static void main(String[ ] args), not in the addOneTo() method. When the method is called, it creates a new variable = num, defined in the method itself. The value of x is "passed" to num, but they're different variables, defined in different spaces (that's the most important information!). The method only uses num, not x, and modifies only num, not x.
    }
}
