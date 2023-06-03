package dao;

import java.sql.*;
import java.util.ArrayList;

abstract class BaseCRUD<T> {
    
    public static Connection connection;
    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public BaseCRUD() {
        connection = DbConnection.getInstance().getConnection();
        st = DbConnection.getInstance().getSt();
    }
    
    public abstract boolean add(T object);
    public abstract T get(int id);
    public abstract ArrayList<T> getMany(int id);
    public abstract ArrayList<T> getAll();
    public abstract boolean edit(int id);
    public abstract boolean delete(int id);
}
