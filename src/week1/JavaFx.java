package week1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Gebruiker on 14-2-2017.
 */
public class JavaFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane1 = new FlowPane();

        pane1.setHgap(100);
        pane1.setVgap(100);

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        circle1.setRadius(50);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.BLUE);

        circle2.setRadius(50);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.RED);

        Random random = new Random();

        int i = 0;
        Set <Circle> circleList = new HashSet<>();


        while(i < 2){
            int r = random.nextInt(3);
                if(r == 1){
                    circleList.add(circle1);
                    i++;

                }
                else if(r == 2){
                    circleList.add(circle2);
                    i++;
                }
            }



        for(Circle circle : circleList){
            pane1.getChildren().addAll(circle);
        }
        //pane1.getChildren().addAll(circle1,circle2);



        Scene scene1 = new Scene(pane1,800,800);

        primaryStage.setTitle("title");
        primaryStage.setScene(scene1);
        primaryStage.show();




    }
    public static void main(String args[]){
        Application.launch(args);
    }
}
