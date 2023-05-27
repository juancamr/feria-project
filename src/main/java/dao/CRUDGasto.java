package main.java.dao;
import java.sql.SQLException;
import main.java.modelo.Gasto;
import java.util.ArrayList;
import main.java.utils.Calculo;

public class CRUDGasto extends DbConnection {

    public ArrayList<Gasto> getGastos(int reporteId) {
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
    
    public double calcularGastos(ArrayList<Gasto> gastoList) {
        Calculo utils = new Calculo();
        double[] listaCantidadGastos = new double[gastoList.size()];
        for (int i = 0; i < gastoList.size(); i++) {
            listaCantidadGastos[i] = gastoList.get(i).getCantGast();
        }
        return utils.calcularSuma(listaCantidadGastos);
    }
}
