package workbook.FakeProgressCounter;

/**
 * Fake "progress bar"
 * Simulates fake ongoing progress.
 * @version 1.0 2020-08-23
 * @author Adam K.
 */

public class MainFakeProcess {
    public static void main(String[] args) throws InterruptedException {

        // Without Fluent Builder pattern

        Progress progress = new Progress();
        progress.setMeterInterval(3);
        progress.setStartMessage(ProgressProcessNames.LOADING);
        progress.setProgressIndicator(ProgressIndicators.PERCENT);
        progress.start();

        Progress progress2 = new Progress();
        progress2.setMeterInterval(6);
        progress2.setStartMessage(ProgressProcessNames.FINISHING);
        progress2.setProgressIndicator(ProgressIndicators.TASK);
        progress2.start();

        // With Fluent Builder pattern

        Progress progress3 = ProgressBuilder.buildProgress()
                .withMeterInterval(9)
                .withStartMessage(ProgressProcessNames.COMPLETING)
                .withProgressIndicator(ProgressIndicators.STEP)
                .start();

        Progress progress4 = ProgressBuilder.buildProgress()
                .withMeterInterval(12)
                .withStartMessage(ProgressProcessNames.PROCESSING)
                .withProgressIndicator(ProgressIndicators.THREAD)
                .start();

        Progress progress5 = ProgressBuilder.buildProgress()
                .withMeterInterval(15)
                .withStartMessage(ProgressProcessNames.COMPILING)
                .withProgressIndicator(ProgressIndicators.SOURCE)
                .start();
    }
}