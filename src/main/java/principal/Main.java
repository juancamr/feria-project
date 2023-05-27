package main.java.principal;

import main.java.controlador.WindowControlador;
import main.java.vista.Window;

public class Main {
    
    public static void main(String[] args) {
        
        WindowControlador controlador = new WindowControlador(new Window());
        controlador.mostrarVentana();
    }
    
}
