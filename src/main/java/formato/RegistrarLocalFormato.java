

package main.java.formato;
import main.java.vista.RegistrarLocal;

public class RegistrarLocalFormato {
    public static void presentacion(RegistrarLocal vista) {
        vista.setVisible(true);
        vista.setResizable(false);
//        vista.setLocationRelativeTo(vista);
        vista.setLocation(0, 0);
        vista.setSize(1100, 900);
    }
}
