package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reporte {

    private int id;
    private Date fecha;
    private Feria feria;
    private Chart chart;
    private List<Gasto> listaGastos;
    private List<Ingreso> listaIngresos;

    public Reporte() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Gasto> getListaGastos() {
        return listaGastos;
    }

    public void setListaGastos(List<Gasto> listaGastos) {
        this.listaGastos = listaGastos;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public List<Ingreso> getListaIngresos() {
        return listaIngresos;
    }

    public void setListaIngresos(List<Ingreso> listaIngresos) {
        this.listaIngresos = listaIngresos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Feria getFeria() {
        return feria;
    }

    public void setFeria(Feria feria) {
        this.feria = feria;
    }

}
