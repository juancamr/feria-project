
package main.java.modelo;

public class Reporte {
    private int id;
    private String nombreReporte;
    private int column_3;
    private int standId;
    
    public Reporte() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public int getColumn_3() {
        return column_3;
    }

    public void setColumn_3(int column_3) {
        this.column_3 = column_3;
    }

    public int getStandId() {
        return standId;
    }

    public void setStandId(int standId) {
        this.standId = standId;
    }
    
    
}