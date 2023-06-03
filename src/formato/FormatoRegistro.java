
package formato;

import vista.WindowRegister;

public class FormatoRegistro {
    
    public static void presentacion(WindowRegister window) {
        window.setSize(650, 530);
        window.setTitle("BIENVENIDO");
        window.setLocationRelativeTo(window);
        window.setVisible(true);
        window.setResizable(false);
    }
}
