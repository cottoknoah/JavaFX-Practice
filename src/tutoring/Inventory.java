package tutoring;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.ArrayList;

public class Inventory extends Application
{
    public String name;
    public double price;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Item item = new Item();

        ArrayList<Item> itemsList = new ArrayList<>();

        Label nameLabel = new Label("Name: ");
        TextField nameTextField = new TextField();
        HBox nameHBox = new HBox(nameLabel, nameTextField);
        nameHBox.setAlignment(Pos.CENTER);
        nameHBox.setPadding(new Insets(10, 0, 0, 0));

        Label priceLabel = new Label("Price: ");
        TextField priceTextField = new TextField();
        HBox priceHBox = new HBox(priceLabel, priceTextField);
        priceHBox.setAlignment(Pos.CENTER);

        Button addButton = new Button("Add Item");
        Label outputLabel = new Label();

        addButton.setOnAction(event -> {
            // IMPLEMENT LAMBDA EXPRESSION FOR ADD BUTTON

            outputLabel.setText("The name of your item is " + nameTextField.getText()  + "is priced at " + priceTextField.getText());
//            is an item being added ? boolean
//            if (!itemsList.getName().equals(""))
//            {
//              return true;
//            }

        });

        VBox root = new VBox(10, nameHBox, priceHBox, addButton, outputLabel);
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, 500, 500);

//        System.out.println(scene);
        primaryStage.setTitle("Inventory");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}