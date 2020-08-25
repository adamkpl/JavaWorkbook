package workbook;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class RecursionTest {

    // Parameters
    private long testedValue;
    private long expectedValue;

    // Constructor is initialized with one set of parameters every time
    public RecursionTest(long expectedValue, long testedValue) {
        this.expectedValue = expectedValue;
        this.testedValue = testedValue;
    }

    // @Parameters annotation marks this method as parameters provider
    @Parameterized.Parameters
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {6,3}
                ,{1,-1}
                ,{1,0}
                ,{1,1}
                //todo add more values
        });
    }

    @Test
    public void shouldOutputValidResultsWithARecursiveMethod() {
        assertEquals(expectedValue, Recursion.calculateFactorial(testedValue));
    }
}