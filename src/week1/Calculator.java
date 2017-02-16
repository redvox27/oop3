package week1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Gebruiker on 15-2-2017.
 */
public class Calculator extends Application {
    private TextField number1 = new TextField();
    private Label number1Label = new Label("label1");
    private TextField number2 = new TextField();
    private Label number2Label = new Label("number2");
    private TextField result = new TextField();
    private Label resultLabel = new Label("result");

    private Button calculate = new Button("calculate");



    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(10);
        pane.setHgap(5);

        pane.getChildren().add(number1Label);
        pane.getChildren().add(number1);

        pane.getChildren().add(number2Label);
        pane.getChildren().add(number2);

        pane.getChildren().add(resultLabel);
        pane.getChildren().add(result);

        pane.getChildren().add(calculate);




        calculate.setOnAction(event -> calculateSum());

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void calculateSum(){
        double firstNumber = Double.parseDouble(number1.getText());

        double secondNumber = Double.parseDouble(number2.getText());

        double sum = firstNumber + secondNumber;



    }

    public static void main(String args[]){
        Application.launch(args);
    }
}
