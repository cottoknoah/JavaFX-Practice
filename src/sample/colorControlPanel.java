package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class colorControlPanel extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        // Constants
        final double MIN = 0.0, MAX = 255.0, INITIAL = 0.0;
        final double MAJOR_TICK_UNIT = 15;
        final int MINOR_TICK_COUNT = 5;
        final double SLIDER_WIDTH = 512.0;
        final double SPACING = 10.0;

        // Create the Red label and slider
        Label redLabel = new Label("Red: ");

        // INSERT CODE HERE TO IMPLEMENT RED SLIDER

        HBox redHBox = new HBox(SPACING, redLabel, redSlider);
        redHBox.setAlignment(Pos.CENTER);

        // Create the Green label and slider
        Label greenLabel = new Label("Green: ");

        // INSERT CODE HERE TO IMPLEMENT GREEN SLIDER

        HBox greenHBox = new HBox(SPACING, greenLabel, greenSlider);
        greenHBox.setAlignment(Pos.CENTER);

        // Create the Blue label and slider
        Label blueLabel = new Label("Blue: ");

        // INSERT CODE HERE TO IMPLEMENT BLUE SLIDER

        HBox blueHBox = new HBox(SPACING, blueLabel, blueSlider);
        blueHBox.setAlignment(Pos.CENTER);

        // INSERT CODE TO IMPLEMENT TEXT AREA

        // INSERT CODE TO REGISTER AN EVENT HANDLER FOR THE RED SLIDER

        // INSERT CODE TO REGISTER AN EVENT HANDLER FOR THE GREEN SLIDER

        // INSERT CODE TO REGISTER AN EVENT HANDLER FOR THE BLUE SLIDER

        // Add the controls to a VBox
        VBox vbox = new VBox(10, redHBox, greenHBox, blueHBox, textArea);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(SPACING));

        // Create a Scene and display it
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}