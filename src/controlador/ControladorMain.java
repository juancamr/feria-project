package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import utils.FormatFrame;
import utils.Go;
import vista.WindowMain;

public class ControladorMain implements ActionListener {

    public static WindowMain vista;

    public ControladorMain(WindowMain vista) {
        this.vista = vista;
        vista.jbtnCerrarSesion.addActionListener(this);
        int[] dimensions = {1100, 900};
        FormatFrame.window(vista, dimensions, "Feria");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnCerrarSesion) {
            vista.dispose();
            Go.toLogin();
        }
    }

}
