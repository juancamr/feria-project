package controlador;

import formato.FormatoRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.WindowLogin;
import vista.WindowRegister;
import modelo.Usuario;
import utils.DebugObject;
import java.util.Date;
import services.CRUDUsuario;
import utils.Dialog;
import vista.WindowMain;

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
            Usuario user = makeUsuario();
            if (DebugObject.isFilledObject(user)) {
                if (CRUDUsuario.getInstance().add(user)) {
                    new ControladorMain(new WindowMain());
                    vista.dispose();
                } else {
                    Dialog.message("Algo salio mal, por favor intentelo de nuevo.");
                }
            } else {
                Dialog.message("Por favor, llene todos los campos");
                System.out.println("error");
            }
        }
    }

    private Usuario makeUsuario() {
        Usuario user = new Usuario();
        user.setIdUsuario(1);
        user.setNombres(vista.jtxtNombre.getText());
        user.setDni(vista.jtxtDni.getText());
        user.setTelefono(vista.jtxtTelefono.getText());
        user.setPassword(new String(vista.jpwdPassword.getPassword()));
        user.setUserName(vista.jtxtUsuario.getText());
        user.setCorreo(vista.jtxtCorreo.getText());
        user.setTipoUsuario("hola mundo");
        user.setFechaRegistro(new Date());
        return user;
    }

}
