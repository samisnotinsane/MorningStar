package test.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by sameenislam on 30/05/2016.
 * Opens the main clock screen
 */
public class TimerTest extends Application {

    private static final String ROOT_FXML_SCENE_PATH = "../../main/java/timer/Star_Clock.fxml";
    private static final String ROOT_STAGE_TITLE = "Star";
    private static final double ROOT_SCENE_WIDTH = 290.0;
    private static final double ROOT_SCENE_HEIGHT = 151.0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootNode = FXMLLoader.load(getClass().getResource(ROOT_FXML_SCENE_PATH));
        Scene starClockScene = new Scene(rootNode, ROOT_SCENE_WIDTH, ROOT_SCENE_HEIGHT);
        primaryStage.setX(900);
        primaryStage.setTitle(ROOT_STAGE_TITLE);
        primaryStage.setScene(starClockScene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
