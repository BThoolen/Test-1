module com.example.botenles1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.botenles1 to javafx.fxml;
    exports com.example.botenles1;
    exports com.example.botenles1.screens;
    opens com.example.botenles1.screens to javafx.fxml;
}