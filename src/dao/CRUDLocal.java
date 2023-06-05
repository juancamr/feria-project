package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Local;
import java.sql.ResultSet;
import utils.Utils;

public class CRUDLocal extends BaseCRUD<Local> implements Querys {

    private static CRUDLocal crudLocal;

    @Override
    public boolean add(Local local) {
        try {
            makePs(local, ADD_LOCAL);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public Local get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Local getByName(String name) {
        Local local = new Local();
        try {
            rs = st.executeQuery(GET_LOCAL_BY_NAME + name + "\"");
            if (rs.next()) {local = makeLocal(rs);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return local;
    }
    
    public boolean isLocalAlreadyExist(Local local) {
        try {
            rs = st.executeQuery(GET_LOCAL_BY_NAME);
            if (rs.next()) {
                return !rs.getString(2).isEmpty();
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    @Override
    public ArrayList<Local> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Local> getAll() {
        ArrayList<Local> listaLocal = new ArrayList<>();
        try {
            rs = st.executeQuery(GET_ALL_LOCALS);
            while (rs.next()) {
                Local local = new Local();
                local.setIdLocal(rs.getInt(1));
                local.setNombre(rs.getString(2));
                local.setDistrito(rs.getString(3));
                local.setAforo(rs.getInt(4));
                local.setCosto(rs.getDouble(5));
                local.setFecha(rs.getDate(6));
                listaLocal.add(local);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listaLocal;
    }

    @Override
    public boolean edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void makePs(Local local, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setString(1, local.getNombre());
        ps.setString(2, local.getDistrito());
        ps.setInt(3, local.getAforo());
        ps.setDouble(4, local.getCosto());
        ps.setString(5, Utils.makeDate(local.getFecha()));
        ps.executeUpdate();
        ps.close();
    }

    private Local makeLocal(ResultSet rs) throws SQLException {
        Local local = new Local();
        local.setIdLocal(rs.getInt(1));
        local.setNombre(rs.getString(2));
        local.setDistrito(rs.getString(3));
        local.setAforo(rs.getInt(4));
        local.setCosto(rs.getDouble(5));
        local.setFecha(rs.getDate(6));
        return local;
    }

    public static CRUDLocal getInstance() {
        if (crudLocal == null) {
            crudLocal = new CRUDLocal();
        }
        return crudLocal;
    }

}
