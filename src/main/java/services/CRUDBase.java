
package main.java.services;

import main.java.config.DbConnection;
import java.sql.*;

public class CRUDBase {
    
    public static Connection connect;
    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public CRUDBase() {
        connect = DbConnection.getInstance().getConnection();
        st = DbConnection.getInstance().getSt();
        ps = DbConnection.getInstance().getPs();
        rs = DbConnection.getInstance().getRs();
    }
    
}
