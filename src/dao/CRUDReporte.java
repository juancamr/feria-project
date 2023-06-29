package dao;

import interfaces.Querys;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.*;
import utils.Utils;

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
            reporte = addDataForReporte(reporte);
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
        String fechaInicial = Utils.makeSqlDate(from);
        String fechaFinal = Utils.makeSqlDate(to);
        List<Reporte> listaReportes = new ArrayList<>();

        try {
            rs = st.executeQuery(GET_MANY_REPORTES);
            while (rs.next()) {
                Reporte reporte = makeResponse(rs);
                listaReportes.add(reporte);
            }
            for (Reporte reporte : listaReportes) {
                reporte = addDataForReporte(reporte);
            }
            return new Response(true, listaReportes);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
    }

    @Override
    public Response getAll() {
        try {
            List<Reporte> listaReportes = new ArrayList<>();
            rs = ps.executeQuery(GET_ALL_REPORTES);
            while (rs.next()) {
                Reporte reporte = makeResponse(rs);
                listaReportes.add(reporte);
            }
            for (Reporte reporte : listaReportes) {
                reporte = addDataForReporte(reporte);
            }
            return new Response(true, listaReportes);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener todos los reportes");
        }
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
    public void makeRequest(Reporte reporte, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, reporte.getFeria().getId());
        ps.setInt(2, reporte.getChart().getId());
        ps.setString(3, Utils.makeSqlDate(new Date()));
    }

    @Override
    public Reporte makeResponse(ResultSet rs) throws SQLException {
        Feria feria = new Feria.Builder().setId(rs.getInt(2)).build();
        Chart chart = new Chart.Builder().setId(rs.getInt(3)).build();
        return new Reporte.Builder()
                .setId(rs.getInt(1))
                .setFecha(rs.getDate(4))
                .setFeria(feria)
                .setChart(chart)
                .build();
    }

    private Reporte addDataForReporte(Reporte reporte) {
        Response<Feria> rsFeria = CRUDFeria.getInstance().get(reporte.getFeria().getId());
        Response<Gasto> rsGasto = CRUDGasto.getInstance().getMany(reporte.getId());
        Response<Ingreso> rsIngreso = CRUDIngreso.getInstance().getMany(reporte.getId());
        Response<Chart> rsChart = CRUDChart.getInstance().get(reporte.getChart().getId());
        reporte.setFeria(rsFeria.isSuccess() ? rsFeria.getData() : null);
        reporte.setChart(rsChart.isSuccess() ? rsChart.getData() : null);
        reporte.setListaGastos(rsGasto.isSuccess() ? rsGasto.getDataList() : null);
        reporte.setListaIngresos(rsIngreso.isSuccess() ? rsIngreso.getDataList() : null);
        return reporte;
    }
}
