package tutoring;

import java.util.ArrayList;
import java.util.List;
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class NoteTracker extends Application
{
    // DECLARE AND CONSTRUCT ARRAYLIST OF LABELS
    private TextField noteTextField = new TextField();
    private GridPane notesGrid = new GridPane();
    // public ArrayList[][] noteArrayList = new ArrayList[0][0];
    public List<String> notes = new ArrayList<>();
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
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

    private class AddEvent implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            notesGrid.getChildren().clear();  // clear the grid before adding to it
            Label noteBoxLabel = new Label(noteTextField.getText());
            notesGrid.add(noteBoxLabel, 0, 0); // add to grid, only display value user inputted at 0,0
            notes.add(noteTextField.getText());      // add value user inputted to the listArray

        }
    }

    private class ShowEvent implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            Integer row = 0;
            Integer col = 0;
            notesGrid.getChildren().clear();  // clear the grid before adding to it


            for(Integer i = 0; i < notes.size(); i++) {
                // if i % 3, means we have hit the end of row and we need to create a new row
                if(i % 3 == 0) {
                    row++;
                    col = 0;
                }
                else {
                    col++;
                }
//                System.out.println("Note: " + notes.get(i) +  " Pos: "  + col + "," + (row-1));
                Label noteBoxLabel = new Label(notes.get(i));
                notesGrid.add(noteBoxLabel, col, row-1); // add to grid, only display value user inputted at 0,0
            }

            // IMPLEMENT SHOWEVENT'S HANDLE METHOD
        }
    }
}