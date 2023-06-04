package controlador;

import dao.CRUDFeria;
import formato.FormatoRegistrarFeria;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Feria;
import utils.Dialog;
import utils.FormatFrame;
import vista.PanelRegistroFeria;
import vista.WindowMain;

public class ControladorRegistroFeria implements ActionListener {

    PanelRegistroFeria panel;

    public ControladorRegistroFeria(WindowMain vista, PanelRegistroFeria pan) {
        panel = pan;
        FormatFrame.fillComboBoxWithLocals(panel.jcbxLocal);
        panel.jbtnRegistrar.addActionListener(this);
        FormatFrame.panel(vista, panel);
        panel.jtxtNombre.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnRegistrar) {
            Feria feria = FormatoRegistrarFeria.makeFeria(panel);
            if (CRUDFeria.getInstance().add(feria)) {
                Dialog.message("Feria registrada con exito!");
                FormatoRegistrarFeria.emptyFields(panel);
            } else {
                Dialog.message(Strings.SOMETHING_WENT_WRONG);
            }
        }
    }

}
