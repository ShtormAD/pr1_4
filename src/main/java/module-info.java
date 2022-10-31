module com.example.pr1_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr1_4 to javafx.fxml;
    exports com.example.pr1_4;
}