module com.example.variacesachu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.variacesachu to javafx.fxml;
    exports com.example.variacesachu;
}