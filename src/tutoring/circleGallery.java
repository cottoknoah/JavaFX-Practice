package tutoring;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

    public class circleGallery extends Application {
        @Override
        public void start(Stage primaryStage) {
            Circle circle = new Circle();
            Label heightLabel = new Label("Height:");
            TextField heightTextField = new TextField();
            HBox heightHbox = new Hbox(5, heightLabel, heightTextField);
            heightHbox.setAlignment(Pos.CENTER);
            heightHbox.setPadding(new Insets(10,0,0,0));

            Button makeCircle = new Button("Create the Circle");

        }
    }


//        3. In CircleGallery, make sure you have the required imports for building a JavaFX
//        application as well as the imports for a TextField, Label, Button, Hbox, and VBox. You
//        will also need the Insets class to set the padding of a control later in this program.
//        4. In the start method of this program, construct an object of the Circle class.
//        5. Construct a TextField that will be used to accept the user’s input for the diameter of the
//        Circle object. Also, construct a Label indicating that this TextField is used for the circle’s
//        diameter. Place both of these controls into an HBox.