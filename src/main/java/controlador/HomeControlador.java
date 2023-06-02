package main.java.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.formato.HomeFormato;
import main.java.vista.HomePanel;
import main.java.vista.VentanaPrincipal;

public class HomeControlador implements ActionListener {
    HomePanel panel;
    public HomeControlador(VentanaPrincipal vista, HomePanel panel) {
        HomeFormato.presentacion(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
