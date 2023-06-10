package controlador;

import dao.CRUDLocal;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Local;
import utils.DebugObject;
import utils.Dialog;
import utils.FormatFrame;
import vista.PanelRegistroLocal;
import vista.WindowMain;

public class ControladorRegistroLocal implements ActionListener {

    PanelRegistroLocal panel;

    public ControladorRegistroLocal(WindowMain vista, PanelRegistroLocal pan) {
        panel = pan;
        panel.jbtnRegistrar.addActionListener(this);
        FormatFrame.panel(vista, panel);
        panel.jtxtNombre.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnRegistrar) {
            Local local = makeLocal();
            local.setIdLocal(0);
            if (DebugObject.isFilledObject(local)) {
                if (CRUDLocal.getInstance().isLocalAlreadyExist(local)) {
                    Dialog.message("El local ya esta registrado");
                } else {
                    if (CRUDLocal.getInstance().add(local)) {
                        formato.FormatoRegistroLocal.emptyFields(panel);
                        Dialog.message("Local " + local.getNombre() + " agregado con exito!");
                    } else {
                        Dialog.message("Algo salio mal, por favor intentelo de nuevo");
                    }
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }
    }

    private Local makeLocal() {
        Local local = new Local();
        local.setNombre(panel.jtxtNombre.getText());
        local.setDistrito(panel.jtxtDistrito.getText());
        local.setAforo(Integer.parseInt(panel.jspnAforo.getValue().toString()));
        local.setCosto(Double.parseDouble(panel.jspnCosto.getValue().toString()));
        local.setFecha(panel.jdchFecha.getDate());
        return local;
    }
}
