package main.java;

import java.sql.SQLException;
import main.java.config.DbConnection;
import main.java.controlador.WindowControlador;
import main.java.vista.VentanaPrincipal;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DbConnection.getInstance(); //primera conexion a la base de datos
        System.out.println(DbConnection.getInstance().getStatus());
        WindowControlador controlador = new WindowControlador(new VentanaPrincipal());
        controlador.mostrarVentana();
    }
    
}
