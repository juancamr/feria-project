package controlador;

import dao.CRUDProveedor;
import formato.FormatoRegistroProveedor;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Proveedor;
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
            DebugObject.printObject(proveedor);
            if (DebugObject.isFilledObject(proveedor)) {
                Object[] response = CRUDProveedor.getInstance().agregar(proveedor);
                if ((boolean)response[0]) {
                    FormatoRegistroProveedor.emptyFields(panel);
                    Dialog.message(response[1].toString());
                } else {
                    Dialog.message(response[1].toString());
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }
    }

}
