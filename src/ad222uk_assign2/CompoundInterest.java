package ad222uk_assign2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class CompoundInterest extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    //check if the entry is a number
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    //the compound interest equation
    public long calcInterest(double a, double r, double y) {
        return Math.round(a * Math.pow((1 + r / 100.0), y));
    }

    @Override
    public void start(Stage primaryStage) {


        GridPane p = new GridPane();
        p.setAlignment(Pos.CENTER);
        p.setPadding(new Insets(19.5, 15.5, 13.5, 17));
        p.setHgap(7.5);
        p.setVgap(7.5);
        primaryStage.setTitle("Interest progrome ");



        Text TIT = new Text(0, 0, "Compound Interest");
        TIT.setTextAlignment(TextAlignment.CENTER);
        TIT.setFont(Font.font("Serif", 30));
        p.add(TIT, 1, 0);

        p.add(new Label("Overall Amount: "), 0, 1);
        final TextField Overall_Amount = new TextField();
        p.add(Overall_Amount, 1, 1);

        p.add(new Label("Interest Rate"), 0, 2);
        final TextField Interest_Rate = new TextField();
        p.add(Interest_Rate, 1, 2);

        p.add(new Label("In How Many Years?"), 0, 3);
        final TextField years = new TextField();
        p.add(years, 1, 3);

        final Label Outcome = new Label();
        p.add(Outcome, 0, 8);


        Button calCulate = new Button("Compute");
        p.add(calCulate, 1, 6);
        GridPane.setHalignment(calCulate, HPos.LEFT);



        calCulate.setOnAction(e -> {
            String y = years.getText();
            String ov = Overall_Amount.getText();
            String in = Interest_Rate.getText();

            if (Overall_Amount.getText().isEmpty() || Interest_Rate.getText().isEmpty() || years.getText().isEmpty())
            	Outcome.setText("Complete all the Fields please ^_^");
            else if (isNumeric(ov)&&isNumeric(in)&&isNumeric(y)){
                long Output = calcInterest(Double.parseDouble(ov), Double.parseDouble(in), Double.parseDouble(y));
                Outcome.setText("Result: " + Output);
            }
            else {
            	Outcome.setText("Wrong Input X_X");
            }


        });

        Scene scene = new Scene(p);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


    }
}