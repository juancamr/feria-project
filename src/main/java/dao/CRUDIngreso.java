package main.java.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import main.java.modelo.Ingreso;
import main.java.utils.Calculo;

public class CRUDIngreso extends DbConnection {

    public ArrayList<Ingreso> getIngresos(int reporteId) {
        ArrayList<Ingreso> ingresoList = new ArrayList<>();
        String sql = "SELECT id, cantidad_in, reporte_id FROM ingreso WHERE reporte_id=" + reporteId;
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                Ingreso ingreso = new Ingreso();
                ingreso.setId(rs.getInt(1));
                ingreso.setCantidadIn(rs.getInt(2));
                ingresoList.add(ingreso);
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ingresoList;
    }

    public double calcularIngresos(ArrayList<Ingreso> ingresoList) {
        Calculo utils = new Calculo();
        double[] listaCantidadIngresos = new double[ingresoList.size()];
        for (int i = 0; i < ingresoList.size(); i++) {
            listaCantidadIngresos[i] = ingresoList.get(i).getCantidadIn();
        }
        return utils.calcularSuma(listaCantidadIngresos);
    }

}
