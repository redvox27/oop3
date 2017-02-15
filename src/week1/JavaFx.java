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
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();
        Circle circle6 = new Circle();

        circle1.setRadius(50);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.BLUE);

        circle2.setRadius(50);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.RED);

        circle3.setRadius(50);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.YELLOW);

        circle4.setRadius(50);
        circle4.setStroke(Color.BLACK);
        circle4.setFill(Color.PURPLE);

        circle5.setRadius(50);
        circle5.setStroke(Color.BLACK);
        circle5.setFill(Color.GREEN);

        circle6.setRadius(50);
        circle6.setStroke(Color.WHITE);
        circle6.setFill(Color.WHITE);

        Random random = new Random();

        int i = 0;
        Set <Circle> circleList = new HashSet<>();


        while(i < 7){
            int r = random.nextInt(6);
                if(r == 1){
                    circleList.add(circle1);
                    i++;

                }
                else if(r == 2){
                    circleList.add(circle2);
                    i++;
                }

                else if(r == 3){
                    circleList.add(circle3);
                    i++;
                }
                else if(r == 4){
                    circleList.add(circle4);
                    i++;
                }

                else if(r == 5){
                    circleList.add(circle5);
                    i++;
                }
                else if(r == 6){
                    circleList.add(circle6);
                }
            }



        for(Circle circle : circleList){
            pane1.getChildren().addAll(circle);
        }
        //pane1.getChildren().addAll(circle1,circle2);



        Scene scene1 = new Scene(pane1,600,600);

        primaryStage.setTitle("title");
        primaryStage.setScene(scene1);
        primaryStage.show();




    }
    public static void main(String args[]){
        Application.launch(args);
    }
}
