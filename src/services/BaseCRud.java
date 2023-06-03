
package services;

import config.DbConnection;
import java.sql.*;

public class BaseCRUD {
    
    public static Connection connection;
    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public BaseCRUD() {
        connection = DbConnection.getInstance().getConnection();
        st = DbConnection.getInstance().getSt();
    }
    
}
