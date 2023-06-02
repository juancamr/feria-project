package main.java.controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import main.java.formato.WindowFormat;
import main.java.vista.VentanaPrincipal;

public class WindowControlador implements ActionListener {
    
    public static VentanaPrincipal window;
    
    public WindowControlador(VentanaPrincipal window) {
        this.window = window;
    }
    
    public static void mostrarVentana() {
        WindowFormat.Presentacion(window);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
