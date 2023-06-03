package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import formato.FormatoMain;
import vista.WindowMain;

public class ControladorMain implements ActionListener {

    public static WindowMain vista;

    public ControladorMain(WindowMain vista) {
        this.vista = vista;
        vista.jbtnRegistrarLocal.addActionListener(this);
        FormatoMain.Presentacion(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrarLocal) {
            System.out.println("registrar local window");
        }
    }

}
