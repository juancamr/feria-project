package main;

import java.sql.SQLException;
import config.DbConnection;
import vista.WindowLogin;
import controlador.ControladorLogeo;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(DbConnection.getInstance().getStatus());
        new ControladorLogeo(new WindowLogin());
    }
    
}
