package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Local;
import utils.DebugObject;
import utils.Utils;

public class CRUDLocal extends BaseCRUD<Local> implements Querys {
    
    private static CRUDLocal crudLocal;

    @Override
    public boolean add(Local local) {
        try {
            DebugObject.printObject(local);
            makePs(local, ADD_LOCAL);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public Local get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Local> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Local> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void makePs(Local local, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setString(1, local.getNombre());
        ps.setString(2, local.getDistrito());
        ps.setInt(3, local.getAforo());
        ps.setDouble(4, local.getCosto());
        ps.setString(5, Utils.makeDate(local.getFecha()));
        ps.executeUpdate();
        ps.close();
    }
    
    public static CRUDLocal getInstance() {
        if (crudLocal == null)
            crudLocal = new CRUDLocal();
        return crudLocal;
    }
    
}
