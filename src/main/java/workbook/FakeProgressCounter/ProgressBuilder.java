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
        //super();
        return new ProgressBuilder();
    }

    @Override
    public int getMeterInterval() {
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

    @Override
    public void start() throws InterruptedException {
        super.start();
    }
}