package workbook.FakeProgressCounter;

import org.junit.Test;

public class FakeProgressCounterTest {

    Progress progress;

    @Test(expected = ArithmeticException.class)
    public void catchExceptionWhenMeterIntervalIsZero() throws Exception {
        progress = ProgressBuilder.buildProgress()
                .withMeterInterval(0)
                .withStartMessage(ProgressProcessNames.LOADING)
                .withProgressIndicator(ProgressIndicators.PERCENT)
                .start();
    }
    
}