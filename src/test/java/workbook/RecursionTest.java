package workbook;

import org.junit.Test;

public class RecursionTest {
    @Test(expected = StackOverflowError.class)
    public void shouldThrowException() {
        //assertEquals(32767, Recursion.calculateFactorial(Short.MAX_VALUE));
        Recursion.calculateFactorial(Short.MAX_VALUE);
    }
}