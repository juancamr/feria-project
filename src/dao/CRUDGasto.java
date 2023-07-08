package dao;

import interfaces.Querys;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Gasto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Response;

public class CRUDGasto extends BaseCRUD<Gasto> implements Querys {

    private static CRUDGasto crudGasto;

    @Override
    public Response add(Gasto gasto) {
        try {
            makeRequest(gasto, ADD_GASTO);
            return new Response(true);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo agregar el gasto");
        }
    }

    @Override
    public Response get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getMany(int reporteId) {

        List<Gasto> gastoList = new ArrayList<>();
        String sql = GET_MANY_GASTOS + reporteId;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Gasto gasto = makeResponse(rs);
                gastoList.add(gasto);
            }
            return new Response(true, gastoList);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener los gastos");
        }
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

    public static CRUDGasto getInstance() {
        if (crudGasto == null) {
            crudGasto = new CRUDGasto();
        }
        return crudGasto;
    }

    @Override
    public int makeRequest(Gasto gasto, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, gasto.getIdReporte());
        ps.setString(2, gasto.getDetalle());
        ps.setDouble(3, gasto.getAmount());
        ps.executeUpdate();
        ps.close();
        return 0;
    }

    @Override
    public Gasto makeResponse(ResultSet rs) throws SQLException {
        return new Gasto.Builder()
                .id(rs.getInt(1))
                .idReporte(rs.getInt(2))
                .detalle(rs.getString(3))
                .amount(rs.getDouble(4))
                .build();
    }
}
