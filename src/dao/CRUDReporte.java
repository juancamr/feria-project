package dao;

import interfaces.Querys;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelo.Reporte;
import modelo.Response;

public class CRUDReporte extends BaseCRUD<Reporte> implements Querys {

    private static CRUDReporte crudReporte;

    @Override
    public Response add(Reporte reporte) {
        try {
            makeRequest(reporte, ADD_REPORTE);
            return new Response(true, reporte);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
    }

    @Override
    public Response get(int idReporte) {
        try {
            rs = st.executeQuery(GET_REPORTE);
            Reporte reporte = new Reporte();
            if (rs.next()) {
                reporte = makeResponse(rs);
            }
            return new Response(true, reporte);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
    }

    @Override
    public Response getMany(int filterId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Response getBetweenDates(Date from, Date to) {
        return null;
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

    public static CRUDReporte getInstance() {
        if (crudReporte == null) {
            crudReporte = new CRUDReporte();
        }
        return crudReporte;
    }

    @Override
    public void makeRequest(Reporte data, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
    }

    @Override
    public Reporte makeResponse(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
