module io.dbc.github.scantoorder {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens io.dbc.github.scantoorder to javafx.fxml;
    exports io.dbc.github.scantoorder;
}