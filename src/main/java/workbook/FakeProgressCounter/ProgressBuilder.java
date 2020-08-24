package workbook.FakeProgressCounter;

/**
 * Inner Static Fluent Builder pattern.
 * @author      devcave.pl
 * @see         <a href="https://devcave.pl/effective-java/wzorzec-projektowy-builder">Wzorzec projektowy Builder</a>
 */

public final class ProgressBuilder extends Progress {
    private int meterInterval;
    private String startMessage;
    private String progressIndicator;

    public static ProgressBuilder buildProgress() {
        return new ProgressBuilder();
    }

    @Override
    public int getMeterInterval() {
        if (meterInterval == 0) {
            //meterInterval = 1;
            throw new ArithmeticException("0 not allowed. Minimum 1 is allowed.");
        }
        return meterInterval;
    }

    @Override
    public String getStartMessage() {
        return startMessage;
    }

    @Override
    public String getProgressIndicator() {
        return progressIndicator;
    }

    public ProgressBuilder withMeterInterval(int meterInterval) {
        this.meterInterval = meterInterval;
        return this;
    }

    public ProgressBuilder withStartMessage(String startMessage) {
        this.startMessage = startMessage;
        return this;
    }

    public ProgressBuilder withProgressIndicator(String progressIndicator) {
        this.progressIndicator = progressIndicator;
        return this;
    }

    public Progress build() {
        Progress progress = new Progress();
        progress.setMeterInterval(meterInterval);
        progress.setStartMessage(startMessage);
        progress.setProgressIndicator(progressIndicator);
        return progress;
    }

/*    @Override
    public ProgressBuilder start() throws InterruptedException {
        super.start();
        return this;
    }*/
}