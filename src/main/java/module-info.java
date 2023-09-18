module com.up.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.up.calculadora to javafx.fxml;
    exports com.up.calculadora;
}