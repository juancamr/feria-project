package dao;

import interfaces.Querys;
import java.sql.SQLException;
import java.sql.ResultSet;
import modelo.Feria;
import modelo.Finanza;
import modelo.Response;

public class CRUDFinanzas extends BaseCRUD<Finanza> implements Querys {

    static CRUDFinanzas crudFinanza;

    @Override
    public Response<Finanza> add(Finanza finanza) {
        try {
            makeFinanzaRequest(finanza, ADD_FINANZA);
            return new Response(true, "Finanza registrada con exito");
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo registrar la finanza");
        }
    }

    @Override
    public Response<Finanza> get(int id) {
        try {
            rs = st.executeQuery(GET_FINANZA + id);
            Finanza finanza = new Finanza();
            if (rs.next()) {
                finanza = makeFinanzaResponse(rs);
            }
            finanza = updateFinanzaAddingFeria(finanza);
            return new Response(true, finanza);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false, "No se pudo obtener la finanza");
        }
    }

    @Override
    public Response<Finanza> getMany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<Finanza> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<Finanza> edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<Finanza> delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void makeFinanzaRequest(Finanza finanza, String sql) throws SQLException {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, finanza.getFeria().getId());
        ps.setDouble(2, finanza.getGastos());
        ps.setDouble(3, finanza.getIngresos());
        ps.executeUpdate();
        ps.close();
    }

    private Finanza makeFinanzaResponse(ResultSet rs) throws SQLException {
        Finanza finanza = new Finanza();
        Feria feria = new Feria();

        feria.setId(rs.getInt(2));
        finanza.setId(rs.getInt(1));
        finanza.setFeria(feria);
        finanza.setGastos(rs.getDouble(3));
        finanza.setIngresos(rs.getDouble(4));

        return finanza;
    }

    private Finanza updateFinanzaAddingFeria(Finanza finanza) {
        Response<Feria> response = CRUDFeria.getInstance().get(finanza.getFeria().getId());
        if (response.isSuccess()) {
            finanza.setFeria(response.getData());
        }
        return finanza;
    }

    public static CRUDFinanzas getInstance() {
        if (crudFinanza == null) {
            crudFinanza = new CRUDFinanzas();
        }
        return crudFinanza;
    }

}
