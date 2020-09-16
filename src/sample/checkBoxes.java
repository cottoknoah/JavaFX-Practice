package sample;

//imported all necessary classes for this application
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class checkBoxes extends Application {
    //    declared variables in the global scope of the class
    private String checkBoxContents = "";
    private String styleOpt = "";
    private Text label = new Text("Please select a checkbox or two.");
    private CheckBox chkBox1 = new CheckBox("Bold");
    private CheckBox chkBox2 = new CheckBox("Italicize");
    private CheckBox chkBox3 = new CheckBox("Underline");

    @Override
    public void start(Stage primaryStage) {
//set the font of the label
        label.setFont(new Font("Arial", 12));

//        event handler from below
        chkBox1.setOnAction(handleCheckbox);
        chkBox2.setOnAction(handleCheckbox);
        chkBox3.setOnAction(handleCheckbox);

//        changed order of displayed label and checkboxes
        VBox checkVbox = new VBox(20, label, chkBox1, chkBox2, chkBox3);

        VBox vbox = new VBox(25, checkVbox);

        Scene scene = new Scene(vbox, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkboxes");
        primaryStage.show();
    }

    //    below is the function allowing a selected checked box to change the label accordingly
    EventHandler handleCheckbox = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() instanceof CheckBox){
                checkBoxContents = "";
                styleOpt = "";
                if (chkBox1.isSelected()){
                    styleOpt += "-fx-font-weight: bold; ";
                }
                if (chkBox2.isSelected()){
                    styleOpt += "-fx-font-style: italic; ";
                }
                if (chkBox3.isSelected()){
                    styleOpt += "-fx-underline: true; ";
                }
                label.setStyle(styleOpt);
            }
        }

    };

    //    main method
    public static void main(String[] args) {
        Application.launch(args);
    }

}