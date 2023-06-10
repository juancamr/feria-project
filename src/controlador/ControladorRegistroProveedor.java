
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FormatFrame;
import vista.PanelRegistroProveedor;
import vista.WindowMain;

public class ControladorRegistroProveedor implements ActionListener {
    PanelRegistroProveedor panel;
    
    public ControladorRegistroProveedor(WindowMain vista, PanelRegistroProveedor pan) {
        panel = pan;
        panel.jbtnSubir.addActionListener(this);
        FormatFrame.panel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnSubir) {
            
        }
    }
    
}
