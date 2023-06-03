package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Ingreso;
import utils.Calculo;

public class CRUDIngreso extends BaseCRUD<Ingreso> {

    public static CRUDIngreso crudIngreso;

    @Override
    public boolean add(Ingreso object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ingreso get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Ingreso> getMany(int reporteId) {
        
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

    @Override
    public ArrayList<Ingreso> getAll() {
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

    public double calcularIngresos(ArrayList<Ingreso> ingresoList) {
        Calculo utils = new Calculo();
        double[] listaCantidadIngresos = new double[ingresoList.size()];
        for (int i = 0; i < ingresoList.size(); i++) {
            listaCantidadIngresos[i] = ingresoList.get(i).getCantidadIn();
        }
        return utils.calcularSuma(listaCantidadIngresos);
    }

    public static CRUDIngreso getInstance() {
        if (crudIngreso == null)
            crudIngreso = new CRUDIngreso();
        return crudIngreso;
    }

}
