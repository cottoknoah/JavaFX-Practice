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



        // Create the scene

    }


    public static void main(String[] args) {
        launch(args);
    }
}
