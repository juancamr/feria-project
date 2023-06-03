package dao;
import java.sql.SQLException;
import modelo.Gasto;
import java.util.ArrayList;
import utils.Calculo;

public class CRUDGasto extends BaseCRUD<Gasto> {
    public static CRUDGasto crudGasto;

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
        String sql = "SELECT id, cant_gast, reporte_id FROM gasto WHERE reporte_id=" + reporteId;
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                Gasto gasto = new Gasto();
                gasto.setId(rs.getInt(1));
                gasto.setCantGast(rs.getInt(2));
                gastoList.add(gasto);
                rs.close();
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
        Calculo utils = new Calculo();
        double[] listaCantidadGastos = new double[gastoList.size()];
        for (int i = 0; i < gastoList.size(); i++) {
            listaCantidadGastos[i] = gastoList.get(i).getCantGast();
        }
        return utils.calcularSuma(listaCantidadGastos);
    }

    public static CRUDGasto getInstance() {
        if (crudGasto == null)
            crudGasto = new CRUDGasto();
        return crudGasto;
    }
}
