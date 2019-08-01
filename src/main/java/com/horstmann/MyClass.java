/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
* JAVA API: https://docs.oracle.com/javase/8/docs/api/ */

package com.horstmann;

public class MyClass {

    public static final String title = "Java. Podstawy. Wydanie X – Cay S. Horstmann";
    //public static final String title = "";

    public static void main(String[] args)

    //3.6.5. Łańcuchy puste i łańcuchy null
    {
        if (title.length() == 0) {
            System.out.println("Error: title string was not defined.");
        } else {
            System.out.println(title);
            System.out.println("Title length: " + title.length());
            System.out.println("First character: " + title.charAt(0));
            System.out.println("Last character: " + title.substring(title.length() - 1));
        }
    }

}
