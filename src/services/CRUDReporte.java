package services;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Reporte;

public class CRUDReporte extends BaseCRUD<Reporte> {
    
    public static CRUDReporte crudReporte;

    @Override
    public boolean add(Reporte object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Reporte get(int idReporte) {
        
        String sql = "SELECT nombre_reporte, column_3, stand_id FROM reporte WHERE id=" + idReporte;
        Reporte reporte = new Reporte();
        try {
            rs = st.executeQuery(sql);
            if (rs.next()) {
                reporte.setId(idReporte);
                reporte.setNombreReporte(rs.getString(1));
                reporte.setColumn_3(rs.getInt(2));
                reporte.setStandId(rs.getInt(3));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        reporte.setListaGastos(CRUDGasto.getInstance().getMany(idReporte));
        reporte.setListaIngresos(CRUDIngreso.getInstance().getMany(idReporte));
        return reporte;
    }

    @Override
    public ArrayList<Reporte> getMany(int filterId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Reporte> getAll() {
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

    public static CRUDReporte getInstance() {
        if (crudReporte == null)
            crudReporte = new CRUDReporte();
        return crudReporte;
    }
}
