
package controlador;

import dao.CRUDLocal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Local;
import utils.Dialog;
import utils.FormatFrame;
import vista.PanelRegistroLocal;
import vista.WindowMain;

public class ControladorRegistroLocal implements ActionListener {
    PanelRegistroLocal panel;
    
    public ControladorRegistroLocal(WindowMain vista, PanelRegistroLocal pan) {
        panel = pan;
        FormatFrame.panel(vista, panel);
        panel.jbtnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnRegistrar) {
            Local local = makeLocal();
            if (CRUDLocal.getInstance().add(local)) {
                formato.FormatoRegistroLocal.emptyFields(panel);
                Dialog.message("Local " + local.getNombre() + " agregado con exito!");
            } else{ 
                Dialog.message("Algo salio mal, por favor intentelo de nuevo");
            }
        }
    }
    
    private Local makeLocal() {
        Local local = new Local();
        local.setNombre(panel.jtxtNombre.getText());
        local.setDistrito(panel.jtxtDistrito.getText());
        local.setAforo(Integer.parseInt(panel.jtxtAforo.getText()));
        local.setCosto(Double.parseDouble(panel.jtxtCosto.getText()));
        local.setFecha(panel.jdchFecha.getDate());
        return local;
    }
}
