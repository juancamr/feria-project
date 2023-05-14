package main.java.controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import main.java.formato.WindowFormat;
import main.java.vista.Window;

public class WindowControlador implements ActionListener {
    
    public static Window window;
    
    public WindowControlador(Window window) {
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
