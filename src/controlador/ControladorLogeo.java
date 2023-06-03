
package controlador;

import formato.FormatoLogeo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.WindowLogin;
import vista.WindowRegister;

public class ControladorLogeo implements ActionListener{
    
    WindowLogin vista;
    public ControladorLogeo(WindowLogin v) {
        vista = v;
        vista.jbtnIngresar.addActionListener(this);
        vista.jbtnRegistrarse.addActionListener(this);
        FormatoLogeo.presentacion(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrarse) {
            vista.dispose();
            new ControladorRegistro(new WindowRegister());
        }
    }
    
}
