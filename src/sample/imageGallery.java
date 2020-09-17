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