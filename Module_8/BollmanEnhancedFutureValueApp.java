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

public class BollmanEnhancedFutureValueApp extends Application {
    // Text fields for the payment and interest rate.
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();

    private TextArea txtResults = new TextArea();

    // Labels for the payment, interest, rate format, years, and the text area.
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lblFutureValueDate = new Label();

    // Combobox for years, populated 1 to 10.
    private Integer[] years = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private ComboBox<Integer> cbYears = new ComboBox<Integer>(
            FXCollections.observableArrayList(years));

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
        cbYears.setMaxWidth(Double.MAX_VALUE); // Fill the column.
        pane.add(cbYears, 1, 3);

        // Add button events
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());

        // Create a container for the cancel/calculate buttons 
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);

        // Add the button container to the GridPane.
        pane.add(actionBtnContainer, 1, 4);

        // Add the textarea and label, each spans 2 columns
        pane.add(lblFutureValueDate, 0, 5, 2, 1);
        pane.add(txtResults, 0, 6, 2, 1);

        // Set the stage title
        primaryStage.setTitle("Bollman Future Value App");

        // Add the Scene to the stage, setting it at 300x300 so it isn't a weird size
        primaryStage.setScene(new Scene(pane, 300, 300));

        // Show the app.
        primaryStage.show();
    }

    /**
     * Reset form fields to default values.
     */
    private void clearFormFields() {
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        txtResults.setText("");
        lblFutureValueDate.setText("");
        cbYears.setValue(0);
    }

    /**
     * Get the input from the app form and display the calculated value.
     */
    private void calculateResults() {
        double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
        double rate = Double.parseDouble(txtInterestRate.getText());
        int years = cbYears.getValue();
        double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);

        // Format and display results.
        lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
        txtResults.setText(String.format("The future value is $%,6.2f", futureValue));
    }

    /**
     * Get the current date and return as a formatted string.
     * @return String - formatted date
     */
    private String getCurrentDate() {
        // Instantiate a date formatting object with date format MM-dd-yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date today = new Date(); // Get today's date.
        return dateFormat.format(today);
    }
}
