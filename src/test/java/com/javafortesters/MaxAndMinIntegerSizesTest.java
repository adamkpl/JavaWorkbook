package com.javafortesters;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Check border values of Integer
 * @version 1.0 2019-09-06
 * @author Adam K.
 */

public class MaxAndMinIntegerSizesTest {
    @Test
    public void confirmMaxAndMinIntegerSizes() {
        assertEquals("Integer.MIN_VALUE equals -2147483648",-2147483648, Integer.MIN_VALUE);
        assertEquals("Integer.MAX_VALUE equals 2147483647",2147483647, Integer.MAX_VALUE);
    }
}