/* Main file with the public static void main */
/* I will be writing my executable code here. */

public class application {
    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("SoloLearn, lesson: Arrays, part 2/4");
        System.out.println("****************************************");

        myArrays mySimpleArray = new myArrays(); // New instance of MyArrays class.
        mySimpleArray.calculateTheSumOfMyArray(); // This imports and executes a "calculateTheSumOfMyArray" method from myArrays class (myArrays.java)

        /* SoloLearn, lesson: Creating Classes & Objects, part 4/13 */
        System.out.println("****************************************");
        System.out.println("SoloLearn, lesson: Creating Classes & Objects, part 4/13");
        System.out.println("****************************************");

        animal dog = new animal();
        System.out.println("What does the dog say?");
        dog.bark() ; // Imports & executes the bark method from the animal class
        animal cat = new animal();
        System.out.println("What does the cat say?");
        cat.meow(); // Imports & executes the meow method from the animal class

        System.out.println("*** THE END ***");

    }
}