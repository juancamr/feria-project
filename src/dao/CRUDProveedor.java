package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Proveedor;

public class CRUDProveedor extends BaseCRUD<Proveedor> implements Querys {

    private static CRUDProveedor crudProveedor;

    @Override
    public boolean add(Proveedor object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object[] agregar(Proveedor proveedor) {
        try {
            ps = connection.prepareStatement(ADD_PROVIDER);
            ps.setInt(1, proveedor.getFeria().getId());
            ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getDescripcion());
            ps.setDouble(4, proveedor.getCosto());
            ps.executeUpdate();
            return new Object[]{true, "El proveedor " + proveedor.getNombre() + " ah sido registrado con exito!"};
        } catch (SQLException e) {
            System.out.println(e);
            return new Object[]{false, "Problema al insertar el proveedor"};
        }
    }

    @Override
    public Proveedor get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Proveedor> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Proveedor> getAll() {
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

    public static CRUDProveedor getInstance() {
        if (crudProveedor == null) {
            crudProveedor = new CRUDProveedor();
        }
        return crudProveedor;
    }

}
