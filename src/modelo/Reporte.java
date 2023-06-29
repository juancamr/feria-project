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
    
    public Reporte () {}

    private Reporte(Builder builder) {
        this.id = builder.id;
        this.fecha = builder.fecha;
        this.feria = builder.feria;
        this.chart = builder.chart;
        this.listaGastos = builder.listaGastos;
        this.listaIngresos = builder.listaIngresos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private Date fecha;
        private Feria feria;
        private Chart chart;
        private List<Gasto> listaGastos;
        private List<Ingreso> listaIngresos;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder setFeria(Feria feria) {
            this.feria = feria;
            return this;
        }

        public Builder setChart(Chart chart) {
            this.chart = chart;
            return this;
        }

        public Builder setListaGastos(List<Gasto> listaGastos) {
            this.listaGastos = listaGastos;
            return this;
        }

        public Builder setListaIngresos(List<Ingreso> listaIngresos) {
            this.listaIngresos = listaIngresos;
            return this;
        }

        public Reporte build() {
            return new Reporte(this);
        }
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
