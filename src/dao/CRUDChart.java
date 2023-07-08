package dao;

import interfaces.Querys;
import modelo.Chart;
import modelo.Response;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUDChart extends BaseCRUD<Chart> implements Querys {

    public static CRUDChart crudChart;

    @Override
    public Response<Chart> add(Chart chart) {
        try {
            int idCreated = makeRequest(chart, ADD_CHART);
            chart.setId(idCreated);
            return new Response(true, chart);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
    }

    @Override
    public Response<Chart> get(int id) {
        try {
            rs = st.executeQuery(GET_CHART + id);
            Chart chart = new Chart();
            if (rs.next()) {
                chart = makeResponse(rs);
            }
            chart = addingDataLists(chart);
            return new Response(true, chart);
        } catch (SQLException e) {
            System.out.println(e);
            return new Response(false);
        }
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

    private List getXList(int idChart) throws SQLException {
        try {
            List xList = new ArrayList<>();
            rs = st.executeQuery(GET_X_LIST + idChart);
            while (rs.next()) {
                xList.add(rs.getDouble(3));
            }
            return xList;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    private List getYList(int idChart) throws SQLException {
        try {
            List yList = new ArrayList<>();
            rs = st.executeQuery(GET_Y_LIST + idChart);
            while (rs.next()) {
                yList.add(rs.getDouble(3));
            }
            return yList;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
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
        return new Chart.Builder()
                .setId(rs.getInt(1))
                .setTitle(rs.getString(2))
                .setXName(rs.getString(3))
                .setYName(rs.getString(4))
                .build();
    }

    private Chart addingDataLists(Chart chart) throws SQLException {
        chart.setxData(getXList(chart.getId()));
        chart.setyData(getYList(chart.getId()));
        return chart;
    }

    public static CRUDChart getInstance() {
        if (crudChart == null) {
            crudChart = new CRUDChart();
        }
        return crudChart;
    }
}
