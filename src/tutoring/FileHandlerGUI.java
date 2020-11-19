package tutoring;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class FileHandlerGUI extends Application
{
    private String[] messageAndContent = null;
    private String message = "";

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        // Create the controls for the application
        Button createFile = new Button("Create a File");
        Button writeFile = new Button("Write to File");
        Button readFile = new Button("Read from File");
        Button deleteFile = new Button("Delete a File");
        TextField fileName = new TextField("Enter the name of the file here...");
        TextArea fileContent = new TextArea("Enter content to write to the file here...");
        Label feedbackLabel = new Label("");

        // Create the VBox for the four buttons
        VBox buttons = new VBox(10, createFile, writeFile, readFile, deleteFile);

        // Create the VBox for the text inputs
        VBox textControls = new VBox(15, fileName, fileContent, feedbackLabel);

        // Create the HBox for the root of the scene
        HBox root = new HBox(50, buttons, textControls);

        root.setPadding(new Insets(100, 0, 0, 0));
        root.setAlignment(Pos.CENTER);

        // Set the style classes for the buttons and the functionality for each button
        createFile.getStyleClass().add("create-button");
        writeFile.getStyleClass().add("write-button");
        readFile.getStyleClass().add("read-button");
        deleteFile.getStyleClass().add("delete-button");

        // Call the createFile method and get the message for the feedback label
        createFile.setOnAction(event -> {
            message = filehandler.makeFile(fileName.getText());
            feedbackLabel.setText(message);
        });

        // Call the writeFile method and get the message for the feedback label
        writeFile.setOnAction(event -> {
            message = filehandler.writeFile(fileName.getText(), fileContent.getText());
            feedbackLabel.setText(message);
        });

        // Call the readFile method
        // Get the message for the feedback label and the content for the text area
        readFile.setOnAction(event -> {
            messageAndContent = filehandler.readFile(fileName.getText());
            fileContent.setText(messageAndContent[0]);
            feedbackLabel.setText(messageAndContent[1]);
        });

        // Call the deleteFile method and get the message for the feedback label
        deleteFile.setOnAction(event -> {
            message = filehandler.deleteFile(fileName.getText());
            feedbackLabel.setText(message);
        });

        // Create the scene and set up the style
        Scene scene = new Scene(root, 1200, 600);

        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

        // Set up the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Notepad");
        primaryStage.show();
    }
}