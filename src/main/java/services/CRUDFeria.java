package main.java.services;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDFeria extends CRUDBase {
    public static CRUDFeria crudFeria;

    public void guardarFeria(String nombre, Integer aforo, Double costo, Date fecha, String seguridad, Double presupuesto) {
     
        try {
            String sql = "Insert into ferias (nom_fer, afor_fer, cost_fer, fech_fer, seg_fer,presu_fer) values (?,?,?,?,?,?)";
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setInt(2, aforo);
            pst.setDouble(3, costo);
            pst.setDate(4, fecha);
            pst.setString(5, seguridad);
            pst.setDouble(6, presupuesto);

            int res = pst.executeUpdate();
            if (res > 0) {
                System.err.println("Datos guardados correctamente");
            }
        } catch (SQLException e) {
            System.err.print(e.toString());
        }
    }
    
    
    public static CRUDFeria getInstance() throws ClassNotFoundException {
        return (crudFeria == null)? new CRUDFeria() : crudFeria;
    }
}
