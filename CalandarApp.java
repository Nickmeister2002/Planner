import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.HashMap;

public class CalendarApp extends Application {
    private HashMap<String, String[]> data = new HashMap<>();
    private String currentDay = String.format("%02d", java.time.LocalDate.now().getDayOfMonth());
    private String currentMonth = String.format("%02d", java.time.LocalDate.now().getMonthValue());
    private String currentYear = String.format("%02d", java.time.LocalDate.now().getYear());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Planner");

        BorderPane root = new BorderPane();
        root.setCenter(createCalendar());

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private GridPane createCalendar() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // Add your calendar components to the gridPane

        return gridPane;
    }

    private void showDateInfo() {
        // Add logic to update UI with date information
    }

    private void addNote() {
        // Add logic to handle adding notes
    }

    private void delNote() {
        // Add logic to handle deleting notes
    }

    private void editNote() {
        // Add logic to handle editing notes
    }

    private String getDate() {
        // Add logic to get the selected date in string format
        return "";
    }

    private void labelDate() {
        // Add logic to update the label with the selected date
    }

    private void highlightFirstItem() {
        // Add logic to highlight the first item in the list
    }

    private void showTime() {
        // Add logic to update the time display
    }

    @Override
    public void stop() {
        // Add logic to save data when the application is closed
    }
}
