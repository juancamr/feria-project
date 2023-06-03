package main;

import java.sql.SQLException;
import config.DbConnection;
import controlador.WindowControlador;
import vista.VentanaPrincipal;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(DbConnection.getInstance().getStatus());
        WindowControlador controlador = new WindowControlador(new VentanaPrincipal());
        controlador.mostrarVentana();
    }
    
}
