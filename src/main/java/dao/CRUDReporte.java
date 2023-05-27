package main.java.dao;

import main.java.modelo.Reporte;

public class CRUDReporte extends DbConnection {

    public Reporte getReporte(int idReporte) {
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
        } catch (Exception e) {
            System.out.println(e);
        }
        return reporte;
    }
}
