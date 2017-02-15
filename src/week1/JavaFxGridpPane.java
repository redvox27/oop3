package week1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
/**
 * Created by vincent on 15-2-2017.
 */
public class JavaFxGridpPane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TilePane pane = new TilePane();
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 1) {
                pane.getChildren().add(new Rectangle(50,50));
            }
            else{
                pane.getChildren().add(new Rectangle(50,50,Color.WHITE));
            }


        }
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();



    }

    public static void main(String args[]){
        Application.launch();
    }
}
