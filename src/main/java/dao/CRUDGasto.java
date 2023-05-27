package main.java.dao;
import main.java.modelo.Gasto;
import java.util.ArrayList;
import main.java.utils.Calculo;

public class CRUDGasto extends DbConnection {

    public ArrayList<Gasto> getGastos(int reporteId) {
        CRUDReporte crudReporte = new CRUDReporte();
        ArrayList<Gasto> gastoList = new ArrayList<Gasto>();
        String sql = "SELECT id, cant_gast, reporte_id FROM gasto WHERE reporte_id=" + reporteId;
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                Gasto gasto = new Gasto();
                gasto.setId(rs.getInt(1));
                gasto.setCantGast(rs.getInt(2));
                gasto.setReporte(crudReporte.getReporte(rs.getInt(3)));
                gastoList.add(gasto);
                rs.close();
            }
        } catch (Exception e) {
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
