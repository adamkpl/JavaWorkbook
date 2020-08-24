package workbook.FakeProgressCounter;

public class Progress {

    /**
     * @param DEFAULT_MAX_THRESHOLD is the limit of the progress indicator e.g 100%.
     * @param meterInterval will show updated value in interval e.g 5%, 10%, 15% and so on until DEFAULT_MAX_THRESHOLD is reached.
     * @param startMessage indicates the type of progress. @See ProgressProcessNames.
     * @param progressIndicator e.g percents, steps, tasks performed/completed. @See ProgressIndicators.
     */

    public final static Integer DEFAULT_MAX_THRESHOLD = 100;
    private int meterInterval;
    private String startMessage;
    private String progressIndicator;
    private int units;

    Progress() {
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
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
        if (meterInterval == 0) {
            //meterInterval = 1;
            throw new ArithmeticException("0 not allowed. Minimum 1 is allowed.");
        }
        return meterInterval;
    }

    public void setMeterInterval(int meter) {
        this.meterInterval = meter;
    }

    public int getRefreshInterval() {
        return DEFAULT_MAX_THRESHOLD / getMeterInterval();
    }

    public Progress start() throws InterruptedException {

        // Init progress, always from 0
        setUnits(0);

        // Start counting
        System.out.println(getStartMessage() + " " + ("(units: ") + getProgressIndicator() + ")" + ": ");

        for (int i = 0; i <= getRefreshInterval(); i++) {
            waitToRefreshProgress();
            clearConsole();

            units = getUnits() + getMeterInterval();
            System.out.print(units);

            // Finish progress
            if (units >= DEFAULT_MAX_THRESHOLD) {
                setUnits(DEFAULT_MAX_THRESHOLD);
                clearConsole();
                //todo should be able to change the completion message
                System.out.print(getUnits() + ". DONE!\n");
                break;
            }
        }
        return this;
    }

    private static void waitToRefreshProgress() throws InterruptedException {
        /* Note that when the value is low (e.g 125 millis), and you setMeterInterval to 1, you may not see the
        progress increment by 1. You will notice that the values jump by 2 e.g 1-3-5, but if you modify the millis to a
        higher value e.g to 250 millis, this issue disappears. */
        Thread.sleep(125);
    }

    private static void waitToRefreshProgress(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

    private int getUnitsLength(int units) {
        return String.valueOf(units).length();
    }

    private void insertBackspace(int nTimes) {
        for (int i = 0; i <= nTimes; i++) {
            System.out.print("\b");
        }
    }

    private void clearConsole() {
        insertBackspace(getUnitsLength(getUnits()));
    }

}