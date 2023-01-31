module com.example.fetch {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.web;


    opens com.example.fetch to javafx.fxml;
    exports com.example.fetch;
}