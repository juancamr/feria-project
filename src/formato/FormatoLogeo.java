package formato;
import vista.WindowLogin;

public class FormatoLogeo {
    public static void presentacion(WindowLogin window) {
        window.setSize(650, 500);
        window.setTitle("BIENVENIDO");
        window.setLocationRelativeTo(window);
        window.setVisible(true);
        window.setResizable(false);
    }
}
