package controlador;

import dao.CRUDProveedor;
import formato.FormatoRegistroProveedor;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Proveedor;
import modelo.Response;
import utils.DebugObject;
import utils.Dialog;
import utils.FormatFrame;
import vista.PanelRegistroProveedor;
import vista.WindowMain;

public class ControladorRegistroProveedor implements ActionListener {

    PanelRegistroProveedor panel;

    public ControladorRegistroProveedor(WindowMain vista, PanelRegistroProveedor pan) {
        panel = pan;
        panel.jbtnSubir.addActionListener(this);
        FormatoRegistroProveedor.fillComboBox(panel);
        FormatFrame.panel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnSubir) {
            Proveedor proveedor = FormatoRegistroProveedor.makeProveedor(panel);
            proveedor.setId(0);
            if (DebugObject.isFilledObject(proveedor)) {
                Response<Proveedor> response = CRUDProveedor.getInstance().add(proveedor);
                if (response.isSuccess()) {
                    FormatoRegistroProveedor.emptyFields(panel);
                    Dialog.message(response.getMessage());
                } else {
                    Dialog.message(response.getMessage());
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }
    }

}
