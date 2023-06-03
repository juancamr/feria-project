package config;

import java.sql.*;
import services.DbCredentials;

public class DbConnection implements DbCredentials {
        
    private static DbConnection dbConnection;
    private Connection connection;
    private Statement st;
    
    private DbConnection() {
                
        try {
            String url = String.format("jdbc:mysql://localhost:%s/%s", PORT, DBNAME);
            connection = DriverManager.getConnection(url, USER, PASSWD);
            st = connection.createStatement();
            System.out.println("Creando conexion");
        } catch (SQLException e) {
            System.out.println("Error, " + e.toString());
        }
    }
    
    public static DbConnection getInstance() {
        if (dbConnection == null)
            dbConnection = new DbConnection();
        return dbConnection;
    }
    
    public void closeConnection() throws SQLException {
        connection.close();
    }
    
    public String getStatus() throws SQLException {
        return (connection == null || connection.isClosed())? "No se pudo conectar" :
                "Conectado!";
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getSt() {
        return st;
    }

}
