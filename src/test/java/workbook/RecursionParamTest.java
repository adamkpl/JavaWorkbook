package workbook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * My first parameterized JUnit test
 * @version 1.0 2020-08-25
 * @author Adam K.
 */

@RunWith(value = Parameterized.class)
public class RecursionParamTest {

    // Parameters
    private long testedValue;
    private long expectedValue;

    // Constructor is initialized with one set of parameters every time
    public RecursionParamTest(long expectedValue, long testedValue) {
        this.expectedValue = expectedValue;
        this.testedValue = testedValue;
    }

    // @Parameters annotation marks this method as parameters provider
    @Parameters(name = "{index}: {1}!={0}")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {1,-1}
                ,{1,0}
                ,{1,1}
                ,{2,2}
                ,{6,3}
        });
    }

    @Test
    public void shouldOutputValidResultsWithoutThrowingExceptions() {
        assertEquals(expectedValue, Recursion.calculateFactorial(testedValue));
    }
}