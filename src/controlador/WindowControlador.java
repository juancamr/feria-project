package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import formato.WindowFormat;
import vista.RegistrarLocal;
import vista.WindowMain;

public class WindowControlador implements ActionListener {

    public static WindowMain vista;

    public WindowControlador(WindowMain vista) {
        this.vista = vista;
        vista.jbtnRegistrarLocal.addActionListener(this);
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
