package controlador;

import dao.CRUDLocal;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Local;
import modelo.Response;
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
                if (CRUDLocal.getInstance().isLocalAlreadyExist(local).isSuccess()) {
                    Dialog.message("El local ya esta registrado");
                } else {
                    Response<Local> response = CRUDLocal.getInstance().add(local);
                    if (response.isSuccess()) {
                        formato.FormatoRegistroLocal.emptyFields(panel);
                        Dialog.message(response.getMessage());
                    } else {
                        Dialog.message(response.getMessage());
                    }
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }
    }

    private Local makeLocal() {
        return new Local.Builder()
                .setNombre(panel.jtxtNombre.getText())
                .setDistrito(panel.jtxtDistrito.getText())
                .setAforo(Integer.parseInt(panel.jspnAforo.getValue().toString()))
                .setCosto(Double.parseDouble(panel.jspnCosto.getValue().toString()))
                .setFecha(panel.jdchFecha.getDate()).build();
    }
}
