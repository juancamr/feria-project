package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;
import utils.Hash;
import utils.MySql;

public class CRUDUsuario extends BaseCRUD<Usuario> implements Querys {

    private static CRUDUsuario crudUsuario;

    @Override
    public boolean add(Usuario user) {
        try {
            makePs(user, ADD_USER);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean isUserExist(Usuario user) {
        String passwordEntered = Hash.encryptPassword(user.getPassword());
        try {
            rs = st.executeQuery(IS_USER_EXIST + user.getUserName() + "\"");
            if (rs.next()) {
                return passwordEntered.equals(rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    @Override
    public Usuario get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Usuario> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Usuario> getAll() {
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

    private void makePs(Usuario user, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setString(1, user.getNombres());
        ps.setString(2, user.getDni());
        ps.setString(3, user.getTelefono());
        ps.setString(4, user.getUserName());
        ps.setString(5, Hash.encryptPassword(user.getPassword()));
        ps.setString(6, user.getCorreo());
        ps.setString(7, user.getTipoUsuario());
        ps.setString(8, MySql.makeDate(user.getFechaRegistro()));
        ps.executeUpdate();
        ps.close();
    }

    public static CRUDUsuario getInstance() {
        if (crudUsuario == null) {
            crudUsuario = new CRUDUsuario();
        }
        return crudUsuario;
    }
}