package controlador;

import dao.CRUDFinanzas;
import formato.FormatoRegistroFinanzas;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Finanza;
import modelo.Response;
import utils.Dialog;
import utils.FormatFrame;
import vista.PanelFinanzas;
import vista.WindowMain;

public class ControladorRegistroFinanzas implements ActionListener {

    PanelFinanzas panel;

    public ControladorRegistroFinanzas(WindowMain vista, PanelFinanzas p) {
        panel = p;
        panel.jbtnAprobar.addActionListener(this);
        FormatoRegistroFinanzas.fillComboBox(panel);
        FormatFrame.panel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnAprobar) {
            if (FormatoRegistroFinanzas.isAllFieldsFilled(panel)) {
                Finanza finanza = FormatoRegistroFinanzas.makeFinanza(panel);
                Response<Finanza> response = CRUDFinanzas.getInstance().add(finanza);
                if (response.isSuccess()) {
                    FormatoRegistroFinanzas.emptyFields(panel);
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
