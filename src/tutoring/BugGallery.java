package tutoring;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;

public class BugGallery extends Application {

    Bug bug = new Ant();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button antBtn = new Button("Ant");
        Button beeBtn = new Button("Bee");
        Button spiderBtn = new Button("Spider");
        Button scorpionBtn = new Button("Scorpion");
        Label output = new Label(this.bug.toString());

        // create the images
        Image antImg = new Image(new FileInputStream("src/sample/imgs/ant.jpg"));
        Image beeImg = new Image(new FileInputStream("src/sample/imgs/bee.jpg"));
        Image scorpImg = new Image(new FileInputStream("src/sample/imgs/scorp.jpg"));
        Image spiderImg = new Image(new FileInputStream("src/sample/imgs/spider.jpg"));

        // Set default/startup image view
        ImageView imageView = new ImageView(antImg);
        imageView.setX(50);
        imageView.setY(50);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);

        // button click handlers
        antBtn.setOnAction(event -> {
            this.bug = new Ant();
            imageView.setImage(antImg);
            output.setText(this.bug.toString());
        });
        beeBtn.setOnAction(event -> {
            this.bug = new Bee();
            imageView.setImage(beeImg);
            output.setText(this.bug.toString());
        });
        spiderBtn.setOnAction(event -> {
            this.bug = new Spider();
            imageView.setImage(spiderImg);
            output.setText(this.bug.toString());
        });
        scorpionBtn.setOnAction(event -> {
            this.bug = new Scorpion();
            imageView.setImage(scorpImg);
            output.setText(this.bug.toString());
        });


        // Create the scene
        VBox vbox = new VBox(8);
        HBox buttonRowInsect = new HBox(20, antBtn, beeBtn);
        HBox buttonRowArachnid = new HBox(20, spiderBtn, scorpionBtn);
        buttonRowInsect.setPadding(new Insets(50, 0, 0, 0));
        buttonRowInsect.setAlignment(Pos.CENTER);
        buttonRowArachnid.setPadding(new Insets(50, 0, 0, 0));
        buttonRowArachnid.setAlignment(Pos.CENTER);

        vbox.getChildren().addAll(imageView, output, buttonRowInsect, buttonRowArachnid);

        primaryStage.setTitle("Bug Gallery");
        primaryStage.setScene(new Scene(vbox, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
