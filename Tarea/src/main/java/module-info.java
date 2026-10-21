module co.edu.uniquindio.poo.tarea {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.tarea to javafx.fxml;
    exports co.edu.uniquindio.poo.tarea;
}