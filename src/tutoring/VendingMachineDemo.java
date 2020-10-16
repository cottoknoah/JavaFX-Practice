package tutoring;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class VendingMachineDemo extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        Button addSodaBtn = new Button("Add a Soda");
        Button buySodaBtn = new Button("Buy a Soda");
        Label output = new Label("The vending machine is set up and has one soda in it.");

        Soda soda = new Soda("Sunkist", 1.25);
        VendingMachine vendingMachine = new VendingMachine(soda);

        addSodaBtn.setOnAction(event -> {
            if (vendingMachine.addSoda(soda))
                output.setText("A soda was added to the vending machine.");
            else
                output.setText("The vending machine already has a soda in it.");
        });

        buySodaBtn.setOnAction(event -> {
            if (vendingMachine.removeSoda())
                output.setText(String.format("You purchased a %s for $%.2f.", soda.getName(), soda.getPrice()));
            else
                output.setText("The vending machine is empty.");
        });
