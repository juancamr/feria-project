package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Feria;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import modelo.Local;
import modelo.Response;
import utils.Utils;

public class CRUDFeria extends BaseCRUD<Feria> implements Querys {

    private static CRUDFeria crudFeria;

    @Override
    public Response add(Feria feria) {
        try {
            makeRequest(feria, ADD_FERIA);
            return new Response(
                    true,
                    "Feria " + feria.getNombre() + " agregada con exito!",
                    feria
            );
        } catch (SQLException e) {
            System.err.print(e.toString());
            return new Response(
                    false,
                    "Error, no se pudo agregar la feria."
            );
        }
    }

    @Override
    public Response get(int id) {
        try {
            rs = st.executeQuery("");
            Feria feria = null;
            if (rs.next()) {
                feria = makeResponse(rs);
            }
            feria = updateFeriaAddingLocal(feria);
            return new Response(true, feria);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener la feria");
        }
    }

    public Response getFeriaToday() {
        String today = Utils.makeSqlDate(new Date());
        try {
            rs = st.executeQuery(GET_FERIA_TODAY + today + "\"");
            Feria feria = null;
            if (rs.next()) {
                feria = makeResponse(rs);
            }
            if (feria == null) {
                return new Response(false);
            } else {
                feria = updateFeriaAddingLocal(feria);
                return new Response(true, feria);
            }
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener la feria creada hoy");
        }
    }

    public Response getByName(String nombreFeria) {
        try {
            rs = st.executeQuery(GET_FERIA_BY_NAME + nombreFeria + "\"");
            Feria feria = new Feria();
            if (rs.next()) {
                feria = makeResponse(rs);
            }
            feria = updateFeriaAddingLocal(feria);
            return new Response(true, feria);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener la feria");
        }
    }

    @Override
    public Response getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response getAll() {
        List<Feria> listaFeria = new ArrayList<>();
        try {
            rs = st.executeQuery(GET_ALL_FERIA);
            while (rs.next()) {
                Feria feria = makeResponse(rs);
                listaFeria.add(feria);
            }
            for (Feria feria : listaFeria) {
                feria = updateFeriaAddingLocal(feria);
            }
            return new Response(true, listaFeria);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener todas las ferias");
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
    public void makeRequest(Feria feria, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, feria.getLocal().getIdLocal());
        ps.setString(2, feria.getNombre());
        ps.setInt(3, feria.getAforo());
        ps.setDouble(4, feria.getCosto());
        ps.setString(5, Utils.makeSqlDate(feria.getFecha()));
        ps.setString(6, feria.getSeguridad());
        ps.setDouble(7, feria.getPresupuesto());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public Feria makeResponse(ResultSet rs) throws SQLException {

        Local local = new Local.Builder()
                .setIdLocal(rs.getInt(2)).build();
        return new Feria.Builder()
                .setId(rs.getInt(1))
                .setLocal(local)
                .setNombre(rs.getString(3))
                .setAforo(rs.getInt(4))
                .setCosto(rs.getDouble(5))
                .setFecha(rs.getDate(6))
                .setSeguridad(rs.getString(7))
                .setPresupuesto(rs.getDouble(8)).build();
    }

    private Feria updateFeriaAddingLocal(Feria feria) {
        Response<Local> response = CRUDLocal.getInstance().get(feria.getLocal().getIdLocal());
        if (response.isSuccess()) {
            feria.setLocal(response.getData());
        }
        return feria;
    }

    public static CRUDFeria getInstance() {
        if (crudFeria == null) {
            crudFeria = new CRUDFeria();
        }
        return crudFeria;
    }
}
