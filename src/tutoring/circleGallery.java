package tutoring;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

    public class circleGallery extends Application {
        @Override
        public void start(Stage primaryStage) {
            Circle circle = new Circle();
            Label heightLabel = new Label("Height:");
            TextField heightTextField = new TextField();
            HBox heightHBox = new HBox(5, heightLabel, heightTextField);
            heightHBox.setAlignment(Pos.CENTER);
            heightHBox.setPadding(new Insets(10,0,0,0));

            Button makeCircle = new Button("Create the Circle");
//    circle.setCenterX(100);
//    circle.setCenterY(100);
//    circle.setRadius(50);
//    circle.setStroke(Color.GREEN);
//    circle.setFill(Color.RED);
//
//    Pane pane = new Pane();
//    pane.getChildren() .add(circle);
//    Scene scene = new Scene(pane , 200, 200);
//    primaryStage.setTitle("ShowCircle");
//    primaryStage.show();
        }
    }

//        3. In CircleGallery, make sure you have the required imports for building a JavaFX
//        application as well as the imports for a TextField, Label, Button, Hbox, and VBox. You
//        will also need the Insets class to set the padding of a control later in this program.
//        4. In the start method of this program, construct an object of the Circle class.
//        5. Construct a TextField that will be used to accept the user’s input for the diameter of the
//        Circle object. Also, construct a Label indicating that this TextField is used for the circle’s
//        diameter. Place both of these controls into an HBox.