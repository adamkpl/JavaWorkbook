/* SoloLearn, lesson: More on Classes: Inheritance, part 2/13. Access modifiers
left as is. Some of the code was modified. When one class is inherited from another
class, it inherits all of the superclass' non-private variables and methods. */

package com.SoloLearn;

class Animal { // Superclass, access modifier not defined(!), recommended: public
    protected int legs; // protected access modifier makes the members visible only to the subclasses.
    protected String category;
    public void showDescription() { // showDescription method is public
        System.out.println("Animal properties:");
        System.out.println("Category: " + category);
        System.out.println("Legs: " + legs);
    }
}

class Dog extends Animal { // Subclass, inherits properties of Animal superclass, access modifier not defined
    Dog() { // constructor, access modifier not defined
        legs = 4;
        category = "dog";
    }
}

/*Run code from here*/

class Inheritance {
    public static void main(String[ ] args) {
        Dog germanShepherd = new Dog(); // Creates new object of a Dog subclass and run eat method
        germanShepherd.showDescription();
    }
}