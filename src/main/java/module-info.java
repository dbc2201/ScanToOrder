module io.dbc.github.scantoorder {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.scantoorder to javafx.fxml;
    exports io.dbc.github.scantoorder;
}