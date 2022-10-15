/*
    Krasso, R., (2022). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.

    Oracle. (2013, April 24). Working With Layouts in JavaFX: Tips for Sizing and 
        Aligning Nodes. Retrieved October 14, 2022, from 
        https://docs.oracle.com/javafx/2/layout/size_align.htm
*/

import javafx.application.Application;
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

public class BollmanFutureValueApp extends Application {
    // Text fields for the payment and interest rate.
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();

    private TextArea textArea = new TextArea();

    // Labels for the payment, interest, rate format, years, and the text area.
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lblTextArea = new Label();

    // Combobox for years
    private ComboBox<Integer> cbxYears = new ComboBox<>();

    // Buttons for clear and calculate.
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

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

        // Add the monthly payment label and textfield 
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(txtMonthlyPayment, 1, 0);

        // Add the interest rate label and textfield
        pane.add(lblInterestRate, 0, 1);
        pane.add(txtInterestRate, 1, 1);

        // Add the formatting informational label
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        // Add the years label and combobox
        pane.add(lblYears, 0, 3);
        cbxYears.setMaxWidth(Double.MAX_VALUE); // Fill the column.
        pane.add(cbxYears, 1, 3);

        // Create a container for the cancel/calculate buttons 
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        
        // Add the button container to the GridPane.
        pane.add(actionBtnContainer, 1, 4);

        // Add the textarea and label
        pane.add(lblTextArea, 0, 5);
        pane.add(textArea, 0, 6, 2, 1); // Span the 2 columns.

        // Set the stage title
        primaryStage.setTitle("Bollman Future Value App");
        
        // Add the Scene to the stage, setting it at 300x300 so it isn't a weird size
        primaryStage.setScene(new Scene(pane, 300, 300));

        // Show the app.
        primaryStage.show();
    }
}
