package tutoring;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.util.ArrayList;

public class InventoryTwo extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        ArrayList<Item> itemsList = new ArrayList<>();

        Label nameLabel = new Label("Name: ");
        TextField nameTextField = new TextField();
        HBox nameHBox = new HBox(nameLabel, nameTextField);
        nameHBox.setAlignment(Pos.CENTER);
        nameHBox.setPadding(new Insets(10, 0, 0, 0));

        Button addButton = new Button("Add Item");
        Button showButton = new Button("Show All Items");
        Label outputLabel = new Label();

        addButton.setOnAction(event -> {
            // IMPLEMENT LAMBDA EXPRESSION
            Item item = new Item(nameTextField.getText());
            Boolean isNew = true;
            selectionSort(itemsList);

            Integer pos = binarySearch(itemsList, item);
            if(pos == -1) {
                itemsList.add(item);
                pos = itemsList.size() - 1;
            } else {
                itemsList.get(pos).incrementQuantity();
            }
            outputLabel.setText(itemsList.get(pos).toString());
        });


}