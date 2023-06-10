package dao;
import interfaces.Querys;
import java.sql.SQLException;
import modelo.Gasto;
import java.util.ArrayList;
import java.util.Arrays;

public class CRUDGasto extends BaseCRUD<Gasto> implements Querys {
    private static CRUDGasto crudGasto;

    @Override
    public boolean add(Gasto gasto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Gasto get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Gasto> getMany(int reporteId) {
        
        ArrayList<Gasto> gastoList = new ArrayList<>();
        String sql = GET_MANY_GASTOS + reporteId;
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                Gasto gasto = new Gasto();
                gasto.setId(rs.getInt(1));
                gasto.setCantGast(rs.getInt(2));
                gastoList.add(gasto);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return gastoList;
    }

    @Override
    public ArrayList<Gasto> getAll() {
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
