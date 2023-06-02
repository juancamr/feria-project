package main.java.config;

import java.sql.*;
import main.java.services.DbCredentials;

public class DbConnection implements DbCredentials {
        
    private static DbConnection dbConnection;
    private Connection connection;
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    private DbConnection() {
                
        try {
            String url = String.format("jdbc:mysql://localhost:%s/%s", PORT, DBNAME);
            connection = DriverManager.getConnection(url, USER, PASSWD);
            st = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("We cannot connect to db.");
        }
    }
    
    public static DbConnection getInstance() {
        return (dbConnection == null)? new DbConnection() : dbConnection;
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

    public void setSt(Statement st) {
        this.st = st;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
