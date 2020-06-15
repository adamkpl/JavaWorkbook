package com.horstmann;

import org.junit.Test;

import static com.horstmann.Strings.*;
import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void stringIsNotEmptyNorNull() {
        System.out.println("Book title: " + BOOK_TITLE);
        System.out.println("Title length: " + BOOK_TITLE.length());

        assertTrue("Title length is more than 0", BOOK_TITLE.length() > 0);
        assertEquals("Book title is 25 characters long", 25 , BOOK_TITLE.length());
        assertNotNull("Title field is not null", BOOK_TITLE);
    }

    @Test
    public void bookHasAnAuthorAssigned() {
        System.out.println("Book author: " + BOOK_AUTHOR);

        assertTrue("Book author's first name is Cay", BOOK_AUTHOR.contains("Cay"));
        assertTrue("Book author's surname is Horstmann", BOOK_AUTHOR.contains("Horstmann"));
        assertNotNull("Author field is not null", BOOK_AUTHOR);
    }

}
