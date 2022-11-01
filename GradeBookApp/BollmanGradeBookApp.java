/*
    GeeksforGeeks. (2021, August 20). JavaFX: ComboBox with examples. Retrieved 
        October 17, 2022, from https://www.geeksforgeeks.org/javafx-combobox-with-examples/ 

    Krasso, R., (2022). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.

    Oracle. (2013, April 24). Working With Layouts in JavaFX: Tips for Sizing and 
        Aligning Nodes. Retrieved October 14, 2022, from 
        https://docs.oracle.com/javafx/2/layout/size_align.htm
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BollmanGradeBookApp extends Application {
    // Components for the First Name.
    private Label lblFirstName = new Label("First Name:");
    private TextField txtFirstName = new TextField();

    // Components for the Last Name.
    private Label lblLastName = new Label("Last Name:");
    private TextField txtLastName = new TextField();

    // Components for the Course Name.
    private Label lblCourse = new Label("Course:");
    private TextField txtCourse = new TextField();

    // Components for the Grade.
    private Label lblGrades = new Label("Grade:");

    private String[] grades = { "A", "B", "C", "D", "F" };
    private ComboBox<String> cbGrades = new ComboBox<String>(
            FXCollections.observableArrayList(grades));

    // Components for Displaying Saved Grades.
    private Label lblSavedGrades = new Label("Saved Grades:");
    private TextArea txtSavedGrades = new TextArea();

    // Buttons for clear and calculate.
    private Button btnClear = new Button("Clear");
    private Button btnSubmit = new Button("Submit");
    private Button btnViewGrades = new Button("View Grades");

    public static void main(String[] args) {
        // Launch the JavaFX app.
        launch(args);
    }

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) {
        // Create a Gridpane for the components, centered.
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Add the first name label and textfield 
        pane.add(lblFirstName, 0, 0);
        pane.add(txtFirstName, 1, 0);

        // Add the last name label and textfield
        pane.add(lblLastName, 0, 1);
        pane.add(txtLastName, 1, 1);

        // Add the course label and textfield
        pane.add(lblCourse, 0, 2);
        pane.add(txtCourse, 1, 2);

        // Add the grades label and combobox
        pane.add(lblGrades, 0, 3);
        cbGrades.setMaxWidth(Double.MAX_VALUE); // Fill the column.
        pane.add(cbGrades, 1, 3);

        // Add button events
        btnClear.setOnAction(e -> clearFormFields());
        btnSubmit.setOnAction(e -> submitForm());

        // Create a container for the cancel/calculate buttons 
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnSubmit);

        // Add the button container to the GridPane.
        pane.add(actionBtnContainer, 1, 4);

        // Add the saved grades label, button, and textarea
        pane.add(lblSavedGrades, 0, 5);
        
        btnViewGrades.setOnAction(e -> displaySavedGrades());
        HBox viewBtnContainer = new HBox();
        viewBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        viewBtnContainer.getChildren().add(btnViewGrades);
        pane.add(viewBtnContainer, 1, 5);

        pane.add(txtSavedGrades, 0, 6, 2, 1);

        // Set the stage title
        primaryStage.setTitle("Bollman Gradebook App");

        // Add the Scene to the stage, setting it at 300x300 so it isn't a weird size
        primaryStage.setScene(new Scene(pane, 300, 400));

        // Show the app.
        primaryStage.show();
    }

    private void clearFormFields() {
        // TODO: clear form
    }

    private void submitForm() {
        // TODO: submit form
    }

    private void displaySavedGrades() {
        // TODO: get saved grades and display.
    }
}
