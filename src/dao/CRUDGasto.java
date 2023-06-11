package dao;
import interfaces.Querys;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            if (rs.next()) {
                Gasto gasto = new Gasto();
                gasto.setId(rs.getInt(1));
                gasto.setCantGast(rs.getInt(2));
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
    
    public double calcularGastos(ArrayList<Gasto> gastoList) {
        double[] listaCantidadGastos = new double[gastoList.size()];
        for (int i = 0; i < gastoList.size(); i++) {
            listaCantidadGastos[i] = gastoList.get(i).getCantGast();
        }
        return Arrays.stream(listaCantidadGastos).sum();
    }

    public static CRUDGasto getInstance() {
        if (crudGasto == null)
            crudGasto = new CRUDGasto();
        return crudGasto;
    }
}
