package week1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Gebruiker on 24-2-2017.
 */
public class ThreadMain extends Application{
    TextArea textArea = new TextArea();


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TextArea Experiment 1");


        textArea.appendText("henk");

        VBox vbox = new VBox(textArea);

        Scene scene = new Scene(vbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    textArea.appendText("klaas");
                }
            }
        });
    }



}

