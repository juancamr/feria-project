package formato;

import vista.WindowMain;

public class WindowFormat {
    public static void Presentacion(WindowMain window) {
        window.setSize(1100, 900);
        window.setTitle("Feria");
        window.setLocationRelativeTo(window);
        window.setVisible(true);
        window.setResizable(false);
    }
}
