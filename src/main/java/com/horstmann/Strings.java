package com.horstmann;

/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
* JAVA API: https://docs.oracle.com/javase/8/docs/api/ */

public class Strings {

    public static final String BOOK_AUTHOR = "Cay S. Horstmann";
    public static final String BOOK_TITLE = "Java. Podstawy. Wydanie X";
    public static final String FULL_BOOK_TITLE = BOOK_TITLE + " - " + BOOK_AUTHOR;
    //public static final String title = "";

    public static void main(String[] args)

    //3.6.5. Łańcuchy puste i łańcuchy null
    {
        if (BOOK_TITLE.length() == 0)
        {
            System.out.println("Error: title string was not defined.");
        }
        else
        {
            System.out.println("Book author: " + BOOK_AUTHOR);
            System.out.println("Book title: " + BOOK_TITLE);

            System.out.println("Title length: " + FULL_BOOK_TITLE.length());
            System.out.println("First character: " + FULL_BOOK_TITLE.charAt(0));
            System.out.println("Last character: " + FULL_BOOK_TITLE.substring(FULL_BOOK_TITLE.length() - 1));
        }
    }
}
