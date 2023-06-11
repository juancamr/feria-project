package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Reporte;
import modelo.Response;

public class CRUDReporte extends BaseCRUD<Reporte> implements Querys {

    private static CRUDReporte crudReporte;

    @Override
    public Response add(Reporte object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response get(int idReporte) {

        String sql = GET_REPORTE + idReporte;
        Reporte reporte = new Reporte();
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                reporte.setId(idReporte);
                reporte.setNombreReporte(rs.getString(1));
                reporte.setColumn_3(rs.getInt(2));
                reporte.setStandId(rs.getInt(3));
            }
            reporte.setListaGastos(CRUDGasto.getInstance().getMany(idReporte).getDataList());
            reporte.setListaIngresos(CRUDIngreso.getInstance().getMany(idReporte).getDataList());
            return new Response(true, reporte);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener el reporte");
        }
    }

    @Override
    public Response getMany(int filterId) {
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

    public static CRUDReporte getInstance() {
        if (crudReporte == null) {
            crudReporte = new CRUDReporte();
        }
        return crudReporte;
    }
}
