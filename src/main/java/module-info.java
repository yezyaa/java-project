module com.example._003_0419 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires java.sql;


    opens com.example._003_0419 to javafx.fxml;
    exports com.example._003_0419;
    exports com.example._003_0419.miniProject;
    opens com.example._003_0419.miniProject to javafx.fxml;
}