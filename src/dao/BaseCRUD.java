package dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.Response;

abstract class BaseCRUD<T> {
    
    public static Connection connection;
    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public BaseCRUD() {
        connection = DbConnection.getInstance().getConnection();
        st = DbConnection.getInstance().getSt();
    }
    
    public abstract Response<T> add(T object);
    public abstract Response<T> get(int id);
    public abstract Response<T> getMany(int id);
    public abstract Response<T> getAll();
    public abstract Response<T> edit(int id);
    public abstract Response<T> delete(int id);
}
