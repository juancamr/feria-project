
package main.java.formato;

import java.awt.BorderLayout;
import main.java.vista.HomePanel;
import main.java.vista.VentanaPrincipal;


public class HomeFormato {
    public static void presentacion(VentanaPrincipal vista, HomePanel panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }

}
