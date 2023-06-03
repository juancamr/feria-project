package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import formato.WindowFormat;
import vista.RegistrarLocal;
import vista.VentanaPrincipal;

public class WindowControlador implements ActionListener {

    public static VentanaPrincipal vista;

    public WindowControlador(VentanaPrincipal vista) {
        this.vista = vista;
        vista.jbtnRegistrarLocal.addActionListener(this);

    }

    public static void mostrarVentana() {
        WindowFormat.Presentacion(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrarLocal) {
            System.out.println("registrar local window");
            vista.dispose();
            new RegistrarLocalControlador(new RegistrarLocal());
        }
    }

}
