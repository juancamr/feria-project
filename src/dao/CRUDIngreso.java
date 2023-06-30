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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            if (rs.next()) {
                Ingreso ingreso = new Ingreso();
                ingresoList.add(ingreso);
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

    public double calcularIngresos(ArrayList<Ingreso> ingresoList) {
        double[] listaCantidadIngresos = new double[ingresoList.size()];
        for (int i = 0; i < ingresoList.size(); i++) {
            listaCantidadIngresos[i] = ingresoList.get(i).getCantidadIn();
        }
        return Arrays.stream(listaCantidadIngresos).sum();
    }

    public static CRUDIngreso getInstance() {
        if (crudIngreso == null) {
            crudIngreso = new CRUDIngreso();
        }
        return crudIngreso;
    }

    @Override
    public int makeRequest(Ingreso data, String sql) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ingreso makeResponse(ResultSet rs) throws SQLException {
        Ingreso ingreso = new Ingreso();
        ingreso.setId(rs.getInt(1));
        ingreso.setCantidadIn(rs.getInt(2));
        return ingreso;
    }

}
