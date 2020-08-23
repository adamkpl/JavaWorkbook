package workbook.FakeProgressCounter;

public class Progress {
    public final static Integer DEFAULT_MAX_THRESHOLD = 100;
    private int meterInterval;
    private String startMessage;
    private String progressIndicator;

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
        System.out.print(getStartMessage() + " " + ("(unit: ") + getProgressIndicator() + ")" + ": ");

        for (int i = 0; i <= getRefreshInterval(); i++) {
            refreshProgress();
            System.out.print(units + " ");
            units = units + getMeterInterval();

            // Finish progress
            //todo should not exceed DEFAULT_MAX_THRESHOLD
            if (units > DEFAULT_MAX_THRESHOLD) {
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