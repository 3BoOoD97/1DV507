package ad222uk_assign3;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application {

    private Line line;
    private Rectangle rec;
    private Circle circle;
    private double x;
    private double y;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane layout = new Pane();
        Scene view = new Scene(layout, 700, 500);

        ComboBox<String> format = new ComboBox<>();
        format.relocate(5, 5);
        format.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
        format.getSelectionModel().selectFirst();
        ComboBox<String> size = new ComboBox<>();
        size.relocate(115, 5);
        size.getItems().addAll("1", "2", "5", "7", "10", "15", "21", "26", "28", "32", "36","41","46");
        size.getSelectionModel().selectFirst();
        ColorPicker color = new ColorPicker();
        color.relocate(180, 5);


        layout.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent m) {
                x = m.getX();
                y = m.getY();

                if (format.getSelectionModel().getSelectedIndex() == 0) {
                    int lineWidth = Integer.parseInt(size.getSelectionModel().getSelectedItem());
                    line = new Line();
                    line.setStrokeWidth(lineWidth);
                    line.setStroke(color.getValue());
                    line.relocate(x, -y);
                    layout.getChildren().addAll(line);
                } else if (format.getSelectionModel().getSelectedIndex() == 1) {
                    int dotSize = Integer.parseInt(size.getSelectionModel().getSelectedItem());
                    rec = new Rectangle(dotSize, dotSize);
                    rec.setFill(color.getValue());
                    rec.relocate(x, y);
                    layout.getChildren().addAll(rec);
                } else if (format.getSelectionModel().getSelectedIndex() == 2) {
                	rec = new Rectangle();
                	rec.relocate(x, y);
                	rec.setFill(color.getValue());
                    layout.getChildren().addAll(rec);
                } else if (format.getSelectionModel().getSelectedIndex() == 3) {
                    circle = new Circle();
                    circle.relocate(x, y);
                    circle.setFill(color.getValue());
                    layout.getChildren().addAll(circle);
                }
            }
        });

        layout.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (format.getSelectionModel().getSelectedIndex() == 1) {
                    line.setEndX(event.getX() - x);
                    line.setEndY(event.getY() - y);
                } else if (format.getSelectionModel().getSelectedIndex() == 2) {
                	rec.setHeight(event.getY() - y);
                	rec.setWidth(event.getX() - x);
                } else if (format.getSelectionModel().getSelectedIndex() == 3) {
                    circle.setRadius(event.getX() - x);
                }
            }
        });
        layout.getChildren().addAll(format, size, color);
        view.setFill(Color.WHITESMOKE);
        primaryStage.setTitle("Painter");
        primaryStage.setScene(view);
        primaryStage.show();
    }
}

// I got help help from youtube + github to solve this exercise :(