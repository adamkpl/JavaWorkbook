package com.sololearn;

/* 06.2019. SoloLearn, lesson: More on Classes: Inheritance, part 2/13. Access modifiers
left as is. Some of the code was modified. When one class is inherited from another
class, it inherits all of the superclass' non-private variables and methods. */

class Inheritance {
    public static void main(String[ ] args) {
        Dog germanShepherd = new Dog(); // Creates new object of a Dog subclass and run eat method
        germanShepherd.showDescription();
    }
}