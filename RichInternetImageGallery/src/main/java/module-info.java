module com.example.richinternetimagegallery {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.richinternetimagegallery to javafx.fxml;
    exports com.example.richinternetimagegallery;
}