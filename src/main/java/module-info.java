module co.bases.datos.proyectofinalbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.groovy;
    requires java.management;
    requires static lombok;


    opens co.bases.datos.proyectofinalbd to javafx.fxml;
    exports co.bases.datos.proyectofinalbd;
}