package com.feria.principal;

import com.feria.controlador.WindowControlador;
import com.feria.vista.Window;

//import com.feria.dao.DbConnection;

public class Main {
    
    public static void main(String[] args) {
//        new DbConnection();
        
        WindowControlador controlador = new WindowControlador(new Window());
        controlador.mostrarVentana();
    }
    
}
