package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import utils.FormatFrame;
import vista.WindowMain;

public class ControladorRegistroFeria implements ActionListener {
    
    public ControladorRegistroFeria(WindowMain vista, JPanel panel) {
        FormatFrame.panel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
