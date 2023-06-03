package controlador;

import formato.FormatoRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.WindowLogin;
import vista.WindowRegister;
import modelo.Usuario;
import utils.DebugObject;

public class ControladorRegistro implements ActionListener {

    WindowRegister vista;
    
    public ControladorRegistro(WindowRegister v) {
        vista = v;
        vista.jbtnVolver.addActionListener(this);
        vista.jbtnRegistrar.addActionListener(this);
        FormatoRegistro.presentacion(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnVolver) {
            vista.dispose();
            new ControladorLogeo(new WindowLogin());
        }
        if (e.getSource() == vista.jbtnRegistrar) {
            Usuario user = new Usuario();
            user.setNombres(vista.jtxtNombre.getText());
            user.setDni(vista.jtxtDni.getText());
            user.setTelefono(vista.jtxtTelefono.getText());
            user.setPassword(new String(vista.jpwdPassword.getPassword()));
            user.setUserName(vista.jtxtUsuario.getText());
            user.setCorreo(vista.jtxtCorreo.getText());
            if (DebugObject.isFilledObject(user)) {
                
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos");
            }
        }
    }
    
}
