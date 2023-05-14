package main.java.dao;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class DbConnection {
    Dotenv dotenv = Dotenv.configure().load();
    
    String port = "3306";
    String dbname = "feria";
    String user = dotenv.get("USER");
    String passwd = dotenv.get("PASSWORD");
        
    public static Connection connect;
    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public DbConnection() {
                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format("jdbc:mysql://localhost:%s/%s", port, dbname);
            connect = DriverManager.getConnection(url, user, passwd);
            st = connect.createStatement();
            System.out.println("Connected to db!");
        } catch (Exception e) {
            System.out.println("We cannot connect to db.");
        }
    }
    
    public static void closeConnection() throws SQLException {
        connect.close();
    }
}
