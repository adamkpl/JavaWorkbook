package com.javafortesters;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * My First JUnit Test
 * @version 1.0 2019-08-31
 * @author Adam K.
 */

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        int result = 2+2;
        /*
        When we write @Test methods we have to make sure that we assert something because we want to make sure that our
        code reports failures to us automatically. An assert is a special type of check: a) If the check fails then the
        assert throws an assertion error and our method will fail. b) If the check passes then the assert doesn’t have
        any side-effects.
        */
        assertEquals("2+2=4", 4, result );
    }
}