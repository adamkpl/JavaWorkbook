package workbook.FakeProgressCounter;

/**
 * Fake "progress bar"
 * Simulates fake ongoing progress.
 * @version 1.0 2020-08-23
 * @author Adam K.
 */

public class MainFakeProcess {
    public static void main(String[] args) throws InterruptedException {

        // Without Builder

        Progress progress = new Progress();
        progress.setMeterInterval(3);
        progress.setStartMessage(ProgressProcessNames.LOADING);
        progress.setProgressIndicator(ProgressIndicators.PERCENT);
        progress.start();

        Progress progress2 = new Progress();
        progress2.setMeterInterval(5);
        progress2.setStartMessage(ProgressProcessNames.FINISHING);
        progress2.setProgressIndicator(ProgressIndicators.TASK);
        progress2.start();

        // With Builder Class

        Progress progress3 = ProgressBuilder.buildProgress()
                .withMeterInterval(9)
                .withStartMessage(ProgressProcessNames.COMPLETING)
                .withProgressIndicator(ProgressIndicators.STEP)
                .start();
    }
}