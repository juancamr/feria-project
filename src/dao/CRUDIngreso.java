package dao;

import interfaces.Querys;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Ingreso;
import modelo.Response;

public class CRUDIngreso extends BaseCRUD<Ingreso> implements Querys {

    private static CRUDIngreso crudIngreso;

    @Override
    public Response add(Ingreso object) {
        try {
            makeRequest(object, ADD_INGRESO);
            return new Response(true);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
    }

    @Override
    public Response get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getMany(int reporteId) {

        List<Ingreso> ingresoList = new ArrayList<>();
        String sql = GET_MANY_INGRESOS + reporteId;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ingresoList.add(makeResponse(rs));
            }
            return new Response(true, ingresoList);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener los ingresos");
        }
    }

    @Override
    public Response<Ingreso> getAll() {
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

    public static CRUDIngreso getInstance() {
        if (crudIngreso == null) {
            crudIngreso = new CRUDIngreso();
        }
        return crudIngreso;
    }

    @Override
    public int makeRequest(Ingreso ingreso, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, ingreso.getIdReporte());
        ps.setString(2, ingreso.getDetalle());
        ps.setDouble(3, ingreso.getAmount());
        ps.executeUpdate();
        ps.close();
        return 0;
    }

    @Override
    public Ingreso makeResponse(ResultSet rs) throws SQLException {
        return new Ingreso.Builder()
                .id(rs.getInt(1))
                .idReporte(rs.getInt(2))
                .detalle(rs.getString(3))
                .amount(rs.getDouble(4))
                .build();
    }

}
