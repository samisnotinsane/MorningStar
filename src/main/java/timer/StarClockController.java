package main.java.timer;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

/**
 * Created by sameenislam on 30/05/2016.
 */

public class StarClockController implements Initializable {
    @FXML private Label lblTime; // time label
    STimer sTimer;
    private String INITIAL_TIMER_VALUE = "00:00";
    private boolean isTimerRunning = false; // timer

    // pop up for add new task button
    public static void onClickAddTaskBtn() throws Exception{
        throw new Exception("Feature not yet implemented!");
    }

    // play and pause button controller
    public void onClickPpBtn() throws Exception{
//        throw new Exception("Feature not yet implemented!");
        System.out.println("Starting/pausing timer");
        sTimer.startTimer(sTimer.getTime());

//        isTimerRunning = false;
//
//        if(!isTimerRunning) {
//            // start timer
//        } else {
//            // timer already running, pause it
//        }

    }

    // stop timer and reset
    public void onClickStopReset() throws Exception {
        System.out.println("Stopping/resetting timer");
        sTimer.stopTimer(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initialising");
        lblTime.setText(INITIAL_TIMER_VALUE);
        sTimer = new STimer();
        lblTime = new Label(sTimer.getSspTime().get());
        sTimer.getSspTime().addListener(new InvalidationListener() {

            @Override
            public void invalidated(Observable observable) {
                lblTime.setText(sTimer.getSspTime().get());
                System.out.println(sTimer.getSspTime().get());
            }
        });

    }
}
