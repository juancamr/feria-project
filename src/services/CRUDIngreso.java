package services;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Ingreso;
import utils.Calculo;

public class CRUDIngreso extends BaseCRUD {

    public static CRUDIngreso crudIngreso;

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

    public static CRUDIngreso getInstance() throws ClassNotFoundException {
        if (crudIngreso == null)
            crudIngreso = new CRUDIngreso();
        return crudIngreso;
    }

}
