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
    Response<Feria> response;
    WindowMain vistaa;
    Feria feria;

    public ControladorRegistroFinanzas(WindowMain vista, PanelFinanzas p) {
        panel = p;
        vistaa = vista;
        panel.jbtnAprobar.addActionListener(this);
        response = CRUDFeria.getInstance().isFeriaBeingRun();
        feria = response.getData();
        if (!response.isSuccess()) {
            Go.toRegistroFeria(vista);
            Dialog.message("Por favor, primero registre una feria");
        } else {
            FormatFrame.panel(vista, panel);
            panel.jlblFeriaActual.setText(feria.getNombre());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnAprobar) {
            if (Dialog.confirm("Desea generar el reporte? La feria sera cerrada")) {
                CRUDFeria.getInstance().setClose(feria.getId());
                Go.toHome(vistaa);
            }
        }
    }

}
