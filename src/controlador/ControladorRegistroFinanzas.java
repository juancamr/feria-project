
package controlador;

import formato.FormatoRegistroFinanzas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FormatFrame;
import vista.PanelFinanzas;
import vista.WindowMain;

public class ControladorRegistroFinanzas implements ActionListener {
    
    PanelFinanzas panel;
    
    public ControladorRegistroFinanzas(WindowMain vista, PanelFinanzas p) {
        panel = p;
        FormatoRegistroFinanzas.fillComboBox(panel);
        FormatFrame.panel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
