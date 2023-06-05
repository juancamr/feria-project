package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FormatFrame;
import vista.PanelRegistroEntradas;
import vista.WindowMain;

public class ControladorRegistroEntradas implements ActionListener {

    public ControladorRegistroEntradas(WindowMain vista, PanelRegistroEntradas panel) {
        FormatFrame.panel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
