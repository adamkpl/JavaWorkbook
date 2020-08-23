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

        // Settings
        progress.setMeterInterval(5);
        progress.setStartMessage(ProgressProcessNames.LOADING);
        progress.setProgressIndicator(ProgressIndicators.PERCENT);

        // Start
        progress.start();


        Progress progress2 = new Progress();

        // Settings
        progress2.setMeterInterval(9);
        progress2.setStartMessage(ProgressProcessNames.FINISHING);
        progress2.setProgressIndicator(ProgressIndicators.TASK);

        progress2.start();

        // With Builder Class

        Progress progress3 = ProgressBuilder.buildProgress()
                .withMeterInterval(25)
                .withProgressIndicator(ProgressIndicators.STEP)
                .withStartMessage(ProgressProcessNames.COMPLETING)
                .start();
    }
}