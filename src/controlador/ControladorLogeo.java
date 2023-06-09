package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.WindowLogin;
import modelo.Usuario;
import dao.CRUDUsuario;
import utils.Dialog;
import utils.Go;
import utils.FormatFrame;

public class ControladorLogeo implements ActionListener {

    WindowLogin vista;

    public ControladorLogeo(WindowLogin v) {
        vista = v;
        vista.jbtnIngresar.addActionListener(this);
        vista.jbtnRegistrarse.addActionListener(this);
        int[] dimensions = {650, 500};
        FormatFrame.window(vista, dimensions, "Bienvenido");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnIngresar) {
            Usuario user = new Usuario.Builder()
                    .setUserName(vista.jtxtUserName.getText())
                    .setPassword(new String(vista.jpwdPassword.getPassword()))
                    .build();
            if (isFilledFields(user)) {
                if (CRUDUsuario.getInstance().isMatchCredentials(user).isSuccess()) {
                    vista.dispose();
                    Go.toWindowMain();
                } else {
                    Dialog.message("Username o contraseña incorrecta");
                }
            } else {
                Dialog.message("Por favor, llene todos los campos");
            }
        }
        if (e.getSource() == vista.jbtnRegistrarse) {
            vista.dispose();
            Go.toRegistro();
        }
    }

    private boolean isFilledFields(Usuario user) {
        return !user.getUserName().trim().isEmpty()
                && !user.getPassword().trim().isEmpty();
    }

}
