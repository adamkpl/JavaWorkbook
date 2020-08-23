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
        System.out.println(getStartMessage() + " " + ("(unit: ") + getProgressIndicator() + ")" + ": ");

        for (int i = 0; i <= getRefreshInterval(); i++) {
            waitToRefreshProgress();
            clearConsole();

            System.out.print(getUnits() + " ");
            units = getUnits() + getMeterInterval();

            // Finish progress
            //todo should not exceed DEFAULT_MAX_THRESHOLD
            if (units >= DEFAULT_MAX_THRESHOLD) {
                //todo should be able to change the completion message
                setUnits(100);
                clearConsole();
                System.out.print(getUnits() + ". DONE!\n");
                break;
            }
        }
        return this;
    }

    private static void waitToRefreshProgress() throws InterruptedException {
        Thread.sleep(125);
    }

    private static void waitToRefreshProgress(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

    private int getUnitsLength(int units) {
        this.units = units;
        return String.valueOf(units).length();
    }

    private void typeBackspaceNtimes(int getUnitsLength) {
        for (int i = 0; i <= getUnitsLength; i++) {
            System.out.print("\b");
        }
    }

    private void clearConsole() {
        int x = getUnitsLength(getUnits());
        typeBackspaceNtimes(x);
    }

}