package week1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Gebruiker on 28-2-2017.
 */
public class BallPaneMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BallPane pane = new BallPane();

        Scene scene = new Scene(pane);

        primaryStage.setTitle("BallAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
