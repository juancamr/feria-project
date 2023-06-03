package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Feria;
import java.text.SimpleDateFormat;

public class CRUDFeria extends BaseCRUD<Feria> implements Querys {
    public static CRUDFeria crudFeria;

    @Override
    public boolean add(Feria feria) {
        try {
            ps = connection.prepareStatement(ADD_FERIA);
            ps.setString(1, feria.getNombre());
            ps.setInt(2, feria.getAforo());
            ps.setDouble(3, feria.getCosto());
            ps.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(feria.getFecha()));
            ps.setString(5, feria.getSeguridad());
            ps.setDouble(6, feria.getPresupuesto());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e.toString());
            return false;
        }
    }

    @Override
    public Feria get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Feria> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Feria> getAll() {
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
    
    public static CRUDFeria getInstance() {
        if (crudFeria == null)
            crudFeria = new CRUDFeria();
        return crudFeria;
    }
}
