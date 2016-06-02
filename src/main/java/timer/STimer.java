package main.java.timer;

import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;

/**
 * Modified implementation of Class created by KEV on:
 * http://stackoverflow.com/questions/9355303/javafx-stopwatch-timer.
 */
public class STimer extends Thread {
    private Thread thread = null;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss:S");
    private String[] split;
    private SimpleStringProperty min, sec, millis, sspTime;
    private long time;

    public STimer() {
        min = new SimpleStringProperty("00");
        sec = new SimpleStringProperty("00");
        millis = new SimpleStringProperty("00");
        sspTime = new SimpleStringProperty("00:00:00");
    }

    public void startTimer(long time) {
        this.time = time;
        thread = new Thread(this);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
    }

    public void stopTimer(long time) {
        if (thread != null) {
            thread.interrupt();
        }
        this.time = time;

    }
}
