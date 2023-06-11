package dao;

import java.sql.*;
import interfaces.DbCredentials;

public class DbConnection implements DbCredentials {

    private static DbConnection dbConnection;
    private Connection connection;
    private Statement st;

    private DbConnection() {

        try {
            String url = String.format("jdbc:mysql://localhost:%s/%s", PORT, DBNAME);
            connection = DriverManager.getConnection(url, USER, PASSWD);
            st = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Error no se pudo conectar a la base de datos, " + e.toString());
            System.exit(0);
        }
    }

    public static DbConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public String getStatus() {
        try {
            return !(connection == null || connection.isClosed()) ? "Connected to database server!"
                    : "Error, we can't connect to database!";
        } catch (SQLException e) {
            System.out.println(e);
            return "Error";
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getSt() {
        return st;
    }

}
