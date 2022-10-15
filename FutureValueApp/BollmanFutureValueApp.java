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
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();

    private TextArea textArea = new TextArea();

    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lblTextArea = new Label();

    private ComboBox<Integer> cbxYears = new ComboBox<>();

    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(txtMonthlyPayment, 1, 0);

        pane.add(lblInterestRate, 0, 1);
        pane.add(txtInterestRate, 1, 1);

        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        pane.add(lblYears, 0, 3);

        cbxYears.setMaxWidth(Double.MAX_VALUE);
        pane.add(cbxYears, 1, 3);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        pane.add(lblTextArea, 0, 5);
        pane.add(textArea, 0, 6, 2, 1);

        primaryStage.setTitle("Bollman Future Value App");
        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();
    }
}
