package ad222uk_assign2;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import javax.swing.border.TitledBorder;


public class Snowman extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	Group gr = new Group();
        Scene scene = new Scene(gr, 500, 420);


        primaryStage.setTitle("Cute Snowman");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        
        Rectangle sky = new Rectangle(0,0,510,315);
        sky.setFill(Color.rgb(55, 208,250));

        Circle sun = new Circle(430, 70, 40);
        sun.setFill(Color.YELLOW);

        Circle head = new Circle(252, 149,33);
        head.setFill(Color.WHITE);

        Circle middle = new Circle(255, 193, 39);
        middle.setFill(Color.WHITE);

        Circle bottom = new Circle(250, 263, 53);
        bottom.setFill(Color.WHITE);

        Circle button1 = new Circle(255, 175, 2);
        Circle button2 = new Circle(255, 185, 2);
        Circle button3 = new Circle(255, 195, 2);

        Line mouth = new Line(244, 148, 260, 147);

        Circle eye1 = new Circle(245, 140, 4);
        Circle eye2 = new Circle(260, 140, 4);


        
        gr.getChildren().addAll(sky, sun, middle,bottom,  head,mouth, button1, button2, button3,  eye1, eye2);

        
    

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}