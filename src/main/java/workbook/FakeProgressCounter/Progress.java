package workbook.FakeProgressCounter;

/**
 * @param DEFAULT_MAX_THRESHOLD is the limit of the progress indicator e.g 100%.
 * @param meterInterval will show updated value in interval e.g 5%, 10%, 15% and so on until DEFAULT_MAX_THRESHOLD is reached.
 * @param startMessage indicates the type of progress. @See ProgressProcessNames.
 * @param progressIndicator e.g percents, steps, tasks performed/completed. @See ProgressIndicators.
 */

public class Progress {

    public final static Integer DEFAULT_MAX_THRESHOLD = 100;
    private int meterInterval;
    private String startMessage;
    private String progressIndicator;

    Progress() {
    }

    public String getProgressIndicator() {
        return progressIndicator;
    }

    public void setProgressIndicator(String progressIndicator) {
        this.progressIndicator = progressIndicator;
    }

    public String getStartMessage() {
        return startMessage;
    }

    public void setStartMessage(String startMessage) {
        this.startMessage = startMessage;
    }

    public int getMeterInterval() {
        return meterInterval;
    }

    public void setMeterInterval(int meter) {
        this.meterInterval = meter;
    }

    public int getRefreshInterval() {
        return DEFAULT_MAX_THRESHOLD / getMeterInterval();
    }

    public void start() throws InterruptedException {

        // Init progress, always from 0
        int units = 0;

        // Start counting
        //todo clear progress result, and put new value
        System.out.print(getStartMessage() + " " + ("(unit: ") + getProgressIndicator() + ")" + ": ");

        for (int i = 0; i <= getRefreshInterval(); i++) {
            refreshProgress();
            System.out.print(units + " ");
            units = units + getMeterInterval();

            // Finish progress
            //todo should not exceed DEFAULT_MAX_THRESHOLD
            if (units > DEFAULT_MAX_THRESHOLD) {
                //todo should be able to change the completion message
                System.out.println("\nDONE!");
                break;
            }
        }
    }

    private static void refreshProgress() throws InterruptedException {
        Thread.sleep(100);
    }

    private static void refreshProgress(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

}