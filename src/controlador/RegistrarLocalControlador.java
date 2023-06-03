
package controlador;
import formato.RegistrarLocalFormato;
import vista.RegistrarLocal;

public class RegistrarLocalControlador {
    public static RegistrarLocal vista;
    public RegistrarLocalControlador(RegistrarLocal vista) {
        vista = vista;
        RegistrarLocalFormato.presentacion(vista);
    }
}
