package main.java.timer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by sameenislam on 30/05/2016.
 */
public class StarClockController implements Initializable{
    @FXML private Label txtTimer;
    private String INITIAL_TIMER_VALUE = "00:00";

    // pop up for add new task button
    public static void onClickAddTaskBtn() throws Exception{
        throw new Exception("Feature not yet implemented!");
    }

    // play and pause button controller
    public static void onClickPpBtn() throws Exception{
//        throw new Exception("Feature not yet implemented!");
        System.out.println("Starting timer");

        boolean isTimerRunning = false;

        if(!isTimerRunning) {
            // start timer
        } else {
            // timer already running, pause it
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtTimer.setText(INITIAL_TIMER_VALUE);
    }
}
