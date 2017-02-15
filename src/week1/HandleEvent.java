package week1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Gebruiker on 15-2-2017.
 */
public class HandleEvent extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);

        Button okButton = new Button("ok");
        Button cancelButton = new Button("cancel");

        OKHandlerClass handler1 = new OKHandlerClass();
        okButton.setOnAction(handler1);

        CancelHandlerClass handler2 = new CancelHandlerClass();
        cancelButton.setOnAction(handler2);

        pane.getChildren().addAll(okButton,cancelButton);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("actionhandler");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String args[]){
        Application.launch(args);
    }
}

class OKHandlerClass implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
        System.out.println("ok button clicked");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
        System.out.println("cancel button clicked");
    }
}
