package sample;

//This program is a simple application designed to show you a series of pictures of anime titles that
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import java.util.List;
import javafx.event.EventHandler;

//This method creates the array and fills it with images included in the program.
public class imageGallery extends Application
{
    private List<String> list = new ArrayList<>();
    int iter = 0;
    double orgCliskSceneX, orgReleaseSceneX;
    @Override
    public void start(Stage primaryStage)
    {
        //Module to add pictures to the array
        //add "list.add("file:.jpg");" to add a new picture to the image gallery and add respective image to folder.
        //searching for different images to display
        try {
            list.add("file:abyss.jpg");
            list.add("file:BigO.jpg");
            list.add("file:ditfxx.jpg");
            list.add("file:eureka7.jpg");
            list.add("file:fma.jpg");
            list.add("file:gurrenlagann.jpg");
            list.add("file:kos.jpg");
            list.add("file:prisonschool.jpg");
            list.add("file:overlord.jpg");
            list.add("file:shieldhero.jpg");
            list.add("file:tanya.jpg");
            list.add("file:uzaki.jpg");
//This module creates the panel and sets the stage for buttons and images inside it.
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setPadding(new Insets(10, 10, 10, 10));
//initialize buttons
            Button LB = new Button("Previous");
            Button RB = new Button("Next");
//Sets up the array list size for the images
            Image[] images = new Image[list.size()];
            for (int i = 0; i < list.size(); i++) {
                images[i] = new Image(list.get(i));
            }
//Image selector, iter shows which image in the array is being displayed.
            ImageView view = new ImageView(images[iter]);
//set this to true to force a width and height of 750 pixels. Pictures probably won't look right if you do.
            view.setPreserveRatio(true);
            view.setFitWidth(750);
            view.setFitHeight(750);
//This module handles actions performed by the mouse.
            view.setCursor(Cursor.CLOSED_HAND);
            view.setOnMousePressed(circleOnMousePressedEventHandler);
            view.setOnMouseReleased(e -> {
                orgReleaseSceneX = e.getSceneX();
                if (orgCliskSceneX > orgReleaseSceneX)
                {
                    LB.fire();
                }
                else
                {
                    RB.fire();
                }
            });
//This section handles actions performed when the "next" button is clicked.
            RB.setOnAction(e -> {
                iter = iter + 1;
                if (iter == list.size())
                {
                    iter = 0;
                }
                view.setImage(images[iter]);
            });
//This section handles actions performed when the "previous" button is clicked.
            LB.setOnAction(e -> {
                iter = iter - 1;
                if (iter == 0 || iter > list.size() + 1 || iter == -1)
                {
                    iter = list.size() - 1;
                }
                view.setImage(images[iter]);
            });
//This section creates the window in which the image and the buttons "next" & "previous" are displayed.
            view.setFitHeight(750);
            view.setFitWidth(750);
            HBox hBox = new HBox();
            hBox.setSpacing(15);
            hBox.setAlignment(Pos.CENTER);
            hBox.getChildren().addAll(LB, view, RB);
            grid.add(hBox, 1, 1);
            Scene scene = new Scene(grid, 1000, 750);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Anime you should watch!");
            primaryStage.show();
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
    EventHandler<MouseEvent> circleOnMousePressedEventHandler = new EventHandler<>()
    {
        @Override
        public void handle(MouseEvent click)
        {
            orgCliskSceneX = click.getSceneX();
        }
    };
    public static void main(String[] args)
    {
        launch(args);
    }

}