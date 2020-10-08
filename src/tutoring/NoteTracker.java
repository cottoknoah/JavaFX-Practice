package tutoring;

//import java.util.ArrayList;
import java.util.Iterator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

//import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;

public class NoteTracker extends Application {
    // DECLARE AND CONSTRUCT ARRAY LIST OF LABELS
    private TextField noteTextField = new TextField();
    private GridPane notesGrid = new GridPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label noteLabel = new Label("New Note: ");

        HBox noteHBox = new HBox(5, noteLabel, noteTextField);
        noteHBox.setAlignment(Pos.CENTER);
        noteHBox.setPadding(new Insets(10, 0, 0, 0));

        Button addNote = new Button("Add a Note");
        Button showNotes = new Button("Show All Notes");

        notesGrid.setAlignment(Pos.CENTER);
        notesGrid.setHgap(10);
        notesGrid.setVgap(20);

        addNote.setOnAction(new AddEvent());
        showNotes.setOnAction(new ShowEvent());

        VBox root = new VBox(10, noteHBox, addNote, showNotes, notesGrid);
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Note Tracker");
        primaryStage.show();
    }

    private class AddEvent implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            // ADD COMMENTS ABOUT ITERATOR
            for (Iterator<Node> children = notesGrid.getChildren().iterator(); children.hasNext(); ) {
                Node node = children.next();

                if (node != null)
                    children.remove();
            }

            // IMPLEMENT ADD EVENT'S HANDLE METHOD
        }
    }

    private class ShowEvent implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            for (Iterator<Node> children = notesGrid.getChildren().iterator(); children.hasNext(); ) {
                Node node = children.next();

                if (node != null)
                    children.remove();
            }

            // IMPLEMENT SHOW EVENT'S HANDLE METHOD
        }
    }
}