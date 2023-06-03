package services;

import java.sql.SQLException;
import config.DbConnection;
import java.util.Date;
import modelo.Reporte;

public class CRUDReporte extends BaseCRUD {
    
    public static CRUDReporte crudReporte;

    public Reporte getReporte(int idReporte) throws ClassNotFoundException {
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
        reporte.setListaGastos(CRUDGasto.getInstance().getGastos(idReporte));
        reporte.setListaIngresos(CRUDIngreso.getInstance().getIngresos(idReporte));
        return reporte;
    }
    
    public int getReporteId(Date fechaActual) {
        return 0;
    }
    
    public static CRUDReporte getInstance() throws ClassNotFoundException {
        if (crudReporte == null)
            crudReporte = new CRUDReporte();
        return crudReporte;
    }
}
