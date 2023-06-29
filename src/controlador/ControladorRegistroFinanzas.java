package controlador;

import dao.CRUDFeria;
import formato.FormatoRegistroFinanzas;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Feria;
import modelo.Response;
import utils.Dialog;
import utils.FormatFrame;
import utils.Go;
import vista.PanelFinanzas;
import vista.WindowMain;

public class ControladorRegistroFinanzas implements ActionListener {

    PanelFinanzas panel;

    public ControladorRegistroFinanzas(WindowMain vista, PanelFinanzas p) {
        panel = p;
        panel.jbtnAprobar.addActionListener(this);
        Response<Feria> response = CRUDFeria.getInstance().getFeriaToday();
        if (!response.isSuccess()) {
            Go.toRegistroFeria(vista);
            Dialog.message("Por favor, primero registre una feria");
        } else {
            FormatFrame.panel(vista, panel);
        }
        panel.jlblFeriaActual.setText(response.getData().getNombre());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnAprobar) {
            System.out.println("hola");
        }
    }

}
