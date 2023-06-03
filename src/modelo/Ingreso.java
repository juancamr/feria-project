
package modelo;

public class Ingreso {
    private int id;
    private int cantidadIn;
    private Reporte reporte;
    
    public Ingreso() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadIn() {
        return cantidadIn;
    }

    public void setCantidadIn(int cantidadIn) {
        this.cantidadIn = cantidadIn;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
    
    
}
