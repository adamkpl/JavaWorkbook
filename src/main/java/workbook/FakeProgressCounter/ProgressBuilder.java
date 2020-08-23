package workbook.FakeProgressCounter;

import com.sun.istack.internal.NotNull;

public final class ProgressBuilder extends Progress {
    private int meterInterval;
    private String startMessage;
    private String progressIndicator;

    public ProgressBuilder() {
        super();
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