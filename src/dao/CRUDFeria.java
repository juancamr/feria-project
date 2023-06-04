package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Feria;
import java.text.SimpleDateFormat;

public class CRUDFeria extends BaseCRUD<Feria> implements Querys {

    private static CRUDFeria crudFeria;

    @Override
    public boolean add(Feria feria) {
        try {
            makePs(feria, ADD_FERIA);
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

    private void makePs(Feria feria, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, feria.getLocal().getIdLocal());
        ps.setString(2, feria.getNombre());
        ps.setInt(3, feria.getAforo());
        ps.setDouble(4, feria.getCosto());
        ps.setString(5, new SimpleDateFormat("yyyy-MM-dd").format(feria.getFecha()));
        ps.setString(6, feria.getSeguridad());
        ps.setDouble(7, feria.getPresupuesto());
        ps.executeUpdate();
    }

    public static CRUDFeria getInstance() {
        if (crudFeria == null) {
            crudFeria = new CRUDFeria();
        }
        return crudFeria;
    }
}
