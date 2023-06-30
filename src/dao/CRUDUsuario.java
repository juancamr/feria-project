package dao;

import interfaces.Querys;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import modelo.Response;
import modelo.Usuario;
import utils.Utils;

public class CRUDUsuario extends BaseCRUD<Usuario> implements Querys {

    private static CRUDUsuario crudUsuario;

    @Override
    public Response add(Usuario user) {
        try {
            makeRequest(user, ADD_USER);
            return new Response(true, "Felicitaciones " + user.getNombres() + ", tu registro fue exitoso",
                    user);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo agregar el usuario");
        }
    }

    public Response isMatchCredentials(Usuario user) {
        try {
            rs = st.executeQuery(GET_USER_BY_USERNAME + user.getUserName() + "\"");
            if (rs.next()) {
                return new Response(Utils.comparePassword(user.getPassword(), rs.getString(2)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Response(false);
    }

    public Response isUserAlreadyExist(Usuario user) {
        try {
            rs = st.executeQuery(GET_USER_BY_USERNAME + user.getUserName() + "\"");
            if (rs.next()) {
                return new Response(!rs.getString(1).isEmpty());
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Response(false);
    }

    @Override
    public Response get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public int makeRequest(Usuario user, String sql) throws SQLException {
        ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, user.getNombres());
        ps.setString(2, user.getDni());
        ps.setString(3, user.getTelefono());
        ps.setString(4, user.getUserName());
        ps.setString(5, Utils.encryptPassword(user.getPassword()));
        ps.setString(6, user.getCorreo());
        ps.setString(7, user.getTipoUsuario());
        ps.setString(8, Utils.makeSqlDate(user.getFechaRegistro()));
        ps.executeUpdate();
        rs = ps.getGeneratedKeys();
        ps.close();
        if (rs.next()) {
            return rs.getInt(1);
        } else {
            return 0;
        }
    }

    @Override
    public Usuario makeResponse(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static CRUDUsuario getInstance() {
        if (crudUsuario == null) {
            crudUsuario = new CRUDUsuario();
        }
        return crudUsuario;
    }
}
