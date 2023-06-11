package dao;

import interfaces.Querys;
import java.sql.SQLException;
import modelo.Proveedor;
import modelo.Response;

public class CRUDProveedor extends BaseCRUD<Proveedor> implements Querys {

    private static CRUDProveedor crudProveedor;

    @Override
    public Response add(Proveedor proveedor) {
        try {
            ps = connection.prepareStatement(ADD_PROVIDER);
            ps.setInt(1, proveedor.getFeria().getId());
            ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getDescripcion());
            ps.setDouble(4, proveedor.getCosto());
            ps.executeUpdate();
            ps.close();
            return new Response(true, "Proveedor agregado con exito", proveedor);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo agregar el proveedor");
        }
    }

    @Override
    public Response get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static CRUDProveedor getInstance() {
        if (crudProveedor == null) {
            crudProveedor = new CRUDProveedor();
        }
        return crudProveedor;
    }

}
