
package main.java.modelo;

public class Gasto {
    private int id;
    private double cantGast;
    private Reporte reporte;
    
    public Gasto() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantGast() {
        return cantGast;
    }

    public void setCantGast(int cantGast) {
        this.cantGast = cantGast;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
    
}
