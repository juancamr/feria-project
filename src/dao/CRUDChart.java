package dao;

import interfaces.Querys;
import modelo.Chart;
import modelo.Response;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDChart extends BaseCRUD<Chart> implements Querys {

    public static CRUDChart crudChart;

    @Override
    public Response<Chart> add(Chart chart) {
        try {
            int id = makeRequest(chart, ADD_CHART);
            chart.setId(id);
            return new Response(true,chart);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
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
    public int makeRequest(Chart data, String sql) throws SQLException {
        ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, data.getTitle());
        ps.setString(2, data.getxName());
        ps.setString(3, data.getyName());
        ps.executeUpdate();
        rs = ps.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        }
        ps.close();
        return 0;
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
