package com.feria.controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.feria.formato.WindowFormat;
import com.feria.vista.Window;

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
