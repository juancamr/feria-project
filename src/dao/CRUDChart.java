package dao;

import interfaces.Querys;
import modelo.Chart;
import modelo.Response;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDChart extends BaseCRUD<Chart> implements Querys {

    public static CRUDChart crudChart;
    @Override
    public Response<Chart> add(Chart data) {
        return null;
    }

    @Override
    public Response<Chart> get(int id) {
        return null;
    }

    @Override
    public Response<Chart> getMany(int id) {
        return null;
    }

    @Override
    public Response<Chart> getAll() {
        return null;
    }

    @Override
    public Response<Chart> edit(int id) {
        return null;
    }

    @Override
    public Response<Chart> delete(int id) {
        return null;
    }

    @Override
    public void makeRequest(Chart data, String sql) throws SQLException {

    }

    @Override
    public Chart makeResponse(ResultSet rs) throws SQLException {
        return null;
    }

    public static CRUDChart getInstance() {
        if (crudChart == null) {
            crudChart = new CRUDChart();
        }
        return crudChart;
    }
}
