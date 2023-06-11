package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.WindowRegister;
import modelo.Usuario;
import utils.DebugObject;
import java.util.Date;
import dao.CRUDUsuario;
import interfaces.Strings;
import modelo.Response;
import utils.Dialog;
import utils.FormatFrame;
import utils.Go;

public class ControladorRegister implements ActionListener {

    WindowRegister vista;

    public ControladorRegister(WindowRegister v) {
        vista = v;
        vista.jbtnVolver.addActionListener(this);
        vista.jbtnRegistrar.addActionListener(this);
        int[] dimensions = {650, 530};
        FormatFrame.window(vista, dimensions, "Bienvenido");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnVolver) {
            vista.dispose();
            Go.toLogin();
        }
        if (e.getSource() == vista.jbtnRegistrar) {
            Usuario user = makeUsuario();
            if (DebugObject.isFilledObject(user)) {
                if (CRUDUsuario.getInstance().isUserAlreadyExist(user).isSuccess()) {
                    Dialog.message("El usuario ya existe");
                } else {
                    Response<Usuario> response = CRUDUsuario.getInstance().add(user);
                    if (response.isSuccess()) {
                        vista.dispose();
                        Go.toWindowMain();
                        Dialog.message(response.getMessage());
                    } else {
                        Dialog.message(response.getMessage());
                    }
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
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
