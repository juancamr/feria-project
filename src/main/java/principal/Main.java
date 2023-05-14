package main.java.principal;

import main.java.controlador.WindowControlador;
import main.java.vista.Window;

//import com.feria.dao.DbConnection;

public class Main {
    
    public static void main(String[] args) {
//        new DbConnection();
        
        WindowControlador controlador = new WindowControlador(new Window());
        controlador.mostrarVentana();
    }
    
}
