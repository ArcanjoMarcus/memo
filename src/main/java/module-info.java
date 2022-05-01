module com.example.memo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.memo to javafx.fxml;
    exports com.example.memo;
}