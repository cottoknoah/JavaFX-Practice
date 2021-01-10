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
        Button editButton = new Button("Edit Items");
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
//                itemsList.get(pos).incrementQuantity();
            }
            outputLabel.setText(itemsList.get(pos).toString());
        });

        showButton.setOnAction(event -> {
            String output = "";

            for (Item item : itemsList)
            {
                output += item + "\n";
            }

            outputLabel.setText(output);
        });

        VBox root = new VBox(10, nameHBox, addButton, showButton, outputLabel);
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Inventory");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // IMPLEMENT SELECTION SORT METHOD
    void selectionSort(ArrayList<Item> arr)
    {
        int n = arr.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
//                if (arr.get(j).compareItems(arr.get(min_idx)) < 0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Item temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i,temp);
        }
    }

    void selectionEdit(ArrayList<Item> arr)
    {
        int n = arr.size();

        // One by one move boundary of edited subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in edited array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
//                if (arr.get(j).compareItems(arr.get(min_idx)) < 0)
                min_idx = j;

            // Swap the found minimum element with the first
            // element

            Item temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i,temp);
        }
    }


    // IMPLEMENT BINARY SEARCH METHOD
    int binarySearch(ArrayList<Item> arr, Item key)
    {
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
//            if (arr.get(mid).compareItems(key) < 0) {
                start = mid + 1;
            }
//            else if(arr.get(mid).compareItems(key) > 0) {
                end = mid - 1;
            }
            else {
                return midway;
            }
        }
        return -1;
    }
}