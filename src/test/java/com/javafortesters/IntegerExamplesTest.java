package com.javafortesters;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Check Integers
 * @version 1.0 2019-09-06
 * @author Adam K.
 */

public class IntegerExamplesTest {
    @Test
    public void checkIfValueOfIntegerClassIsCorrect() {
        Integer four = 4;
        assertEquals("intValue returns int 4", 4, four.intValue());
    }
}