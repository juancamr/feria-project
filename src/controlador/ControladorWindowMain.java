package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import utils.FormatFrame;
import utils.Go;
import vista.WindowMain;

public class ControladorWindowMain implements ActionListener {

    public static WindowMain vista;

    public ControladorWindowMain(WindowMain vista) {
        this.vista = vista;
        vista.jbtnHome.addActionListener(this);
        vista.jbtnRegistrarLocal.addActionListener(this);
        vista.jbtnRegistrarFeria.addActionListener(this);
        vista.jbtnProveedores.addActionListener(this);
        vista.jbtnCerrarSesion.addActionListener(this);
        vista.jbtnEntradas.addActionListener(this);
        vista.jbtnPatrocinadores.addActionListener(this);
        vista.jbtnFinanzas.addActionListener(this);
        vista.jbtnMisFerias.addActionListener(this);
        int[] dimensions = {1100, 850};
        FormatFrame.window(vista, dimensions, "Feria");
        Go.toHome(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnHome) {
            Go.toHome(vista);
        }
        if (e.getSource() == vista.jbtnRegistrarLocal) {
            Go.toRegistroLocal(vista);
        }
        if (e.getSource() == vista.jbtnRegistrarFeria) {
            Go.toRegistroFeria(vista);
        }
        if (e.getSource() == vista.jbtnProveedores) {
            Go.toRegistroProveedor(vista);
        }
        if (e.getSource() == vista.jbtnEntradas) {
            Go.toRegistroEntradas(vista);
        }
        if (e.getSource() == vista.jbtnPatrocinadores) {
            Go.toRegistroPatrocinadores(vista);
        }
        if (e.getSource() == vista.jbtnFinanzas) {
            Go.toRegistroFinanzas(vista);
        }
        if (e.getSource() == vista.jbtnMisFerias) {
            Go.toMisFerias(vista);
        }
        if (e.getSource() == vista.jbtnCerrarSesion) {
            vista.dispose();
            Go.toLogin();
        }
    }

}
