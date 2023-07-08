package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import modelo.Local;
import java.sql.ResultSet;
import java.util.List;
import modelo.Response;
import utils.Utils;

public class CRUDLocal extends BaseCRUD<Local> implements Querys {

    private static CRUDLocal crudLocal;

    @Override
    public Response add(Local local) {
        try {
            makeRequest(local, ADD_LOCAL);
            return new Response(true, "Local agregado con exito", local);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo agregar el local");
        }
    }

    @Override
    public Response get(int id) {
        try {
            rs = st.executeQuery(GET_LOCAL + id);
            Local local = new Local();
            if (rs.next()) {
                local = makeResponse(rs);
            }
            return new Response(true, local);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener el local");
        }
    }

    public Response getByName(String name) {
        try {
            rs = st.executeQuery(GET_LOCAL_BY_NAME + name + "\"");
            Local local = null;
            if (rs.next()) {
                local = makeResponse(rs);
            }
            return new Response(true, local);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener el local");
        }
    }

    public Response isLocalAlreadyExist(Local local) {
        try {
            rs = st.executeQuery(GET_LOCAL_BY_NAME + local.getNombre() + "\"");
            if (rs.next()) {
                return new Response(!rs.getString(2).isEmpty());
            }
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
        return new Response(false);
    }

    @Override
    public Response getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getAll() {
        List<Local> listaLocal = new ArrayList<>();
        try {
            rs = st.executeQuery(GET_ALL_LOCALS);
            while (rs.next()) {
                Local local = makeResponse(rs);
                listaLocal.add(local);
            }
            return new Response(true, listaLocal);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudieron obtener todos los locales");
        }
    }

    @Override
    public Response edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int makeRequest(Local local, String sql) throws SQLException {
        ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, local.getNombre());
        ps.setString(2, local.getDistrito());
        ps.setInt(3, local.getAforo());
        ps.setDouble(4, local.getCosto());
        ps.setString(5, Utils.makeSqlDate(local.getFecha()));
        ps.executeUpdate();
        rs = ps.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        }
        ps.close();
        return 0;
    }

    @Override
    public Local makeResponse(ResultSet rs) throws SQLException {
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
