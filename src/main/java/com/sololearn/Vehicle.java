package com.sololearn;

/* 07.2019. SoloLearn, lesson: Classes and Objects: Getters and setters, part 7/13
I wrote two classes here as suggested in the course for learning purposes only. Normally I should not do that.
It is better to learn that 1 class=1 file. */

public class Vehicle {
    private String color; // private = Accessible only within the declared class itself.

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) { // Does not return any value.
        this.color = c; // The keyword this is used to refer to the current object. Basically, this.color is the color attribute of the current object. Use "this" to differentiate instance variable from local variable. More: https://pl.wikipedia.org/wiki/This_(programowanie_obiektowe)
    }
}

class PimpMyRide {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Iron Man's Sexy Red");
        System.out.println("New color: " + v1.getColor());
    }
}