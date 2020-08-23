package workbook.FakeProgressCounter;

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

        // todo
        // With Builder Class

    }
}