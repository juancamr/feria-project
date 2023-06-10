package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.Ingreso;

public class CRUDIngreso extends BaseCRUD<Ingreso> implements Querys {

    private static CRUDIngreso crudIngreso;

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
        String sql = GET_MANY_INGRESOS + reporteId;
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                Ingreso ingreso = new Ingreso();
                ingreso.setId(rs.getInt(1));
                ingreso.setCantidadIn(rs.getInt(2));
                ingresoList.add(ingreso);
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
        double[] listaCantidadIngresos = new double[ingresoList.size()];
        for (int i = 0; i < ingresoList.size(); i++) {
            listaCantidadIngresos[i] = ingresoList.get(i).getCantidadIn();
        }
        return Arrays.stream(listaCantidadIngresos).sum();
    }

    public static CRUDIngreso getInstance() {
        if (crudIngreso == null)
            crudIngreso = new CRUDIngreso();
        return crudIngreso;
    }

}
