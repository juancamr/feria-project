package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Feria;
import java.text.SimpleDateFormat;
import modelo.Local;

public class CRUDFeria extends BaseCRUD<Feria> implements Querys {

    private static CRUDFeria crudFeria;

    @Override
    public boolean add(Feria feria) {
        try {
            makeFeriaRequest(feria, ADD_FERIA);
            return true;
        } catch (SQLException e) {
            System.err.print(e.toString());
            return false;
        }
    }

    @Override
    public Feria get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Feria getByName(String nombreFeria) {
        try {
            rs = st.executeQuery(GET_FERIA_BY_NAME + nombreFeria + "\"");
            Feria feria = new Feria();
            if (rs.next()) {
                feria = makeFeriaResponse(rs);
            }
            feria = updateFeriaAddingLocal(feria);
            return feria;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public ArrayList<Feria> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Feria> getAll() {
        ArrayList<Feria> listaFeria = new ArrayList<>();
        try {
            rs = st.executeQuery(GET_ALL_FERIA);
            while (rs.next()) {
                Feria feria = makeFeriaResponse(rs);
                listaFeria.add(feria);
            }
            for (Feria feria : listaFeria) {
                feria = updateFeriaAddingLocal(feria);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return listaFeria;
    }

    @Override
    public boolean edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void makeFeriaRequest(Feria feria, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, feria.getLocal().getIdLocal());
        ps.setString(2, feria.getNombre());
        ps.setInt(3, feria.getAforo());
        ps.setDouble(4, feria.getCosto());
        ps.setString(5, new SimpleDateFormat("yyyy-MM-dd").format(feria.getFecha()));
        ps.setString(6, feria.getSeguridad());
        ps.setDouble(7, feria.getPresupuesto());
        ps.executeUpdate();
        ps.close();
    }

    private Feria makeFeriaResponse(ResultSet rs) throws SQLException {
        Feria feria = new Feria();
        Local local = new Local();
        local.setIdLocal(rs.getInt(2));

        feria.setId(rs.getInt(1));
        feria.setLocal(local);
        feria.setNombre(rs.getString(3));
        feria.setAforo(rs.getInt(4));
        feria.setCosto(rs.getDouble(5));
        feria.setFecha(rs.getDate(6));
        feria.setSeguridad(rs.getString(7));
        feria.setPresupuesto(rs.getDouble(8));
        return feria;
    }

    private Feria updateFeriaAddingLocal(Feria feria) {
        feria.setLocal(CRUDLocal.getInstance().get(feria.getLocal().getIdLocal()));
        return feria;
    }

    public static CRUDFeria getInstance() {
        if (crudFeria == null) {
            crudFeria = new CRUDFeria();
        }
        return crudFeria;
    }
}
