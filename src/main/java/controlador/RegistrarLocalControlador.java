
package main.java.controlador;
import main.java.formato.RegistrarLocalFormato;
import main.java.vista.RegistrarLocal;

public class RegistrarLocalControlador {
    public static RegistrarLocal vista;
    public RegistrarLocalControlador(RegistrarLocal vista) {
        vista = vista;
        RegistrarLocalFormato.presentacion(vista);
    }
}
