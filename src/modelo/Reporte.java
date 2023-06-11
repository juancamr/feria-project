
package modelo;
import java.util.ArrayList;
import java.util.List;

public class Reporte {
    private int id;
    private String nombreReporte;
    private int column_3;
    private int standId;
    private List<Gasto> listaGastos;
    private List<Ingreso> listaIngresos;
    
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

    public List<Gasto> getListaGastos() {
        return listaGastos;
    }

    public void setListaGastos(List<Gasto> listaGastos) {
        this.listaGastos = listaGastos;
    }

    public List<Ingreso> getListaIngresos() {
        return listaIngresos;
    }

    public void setListaIngresos(List<Ingreso> listaIngresos) {
        this.listaIngresos = listaIngresos;
    }
    
    
}
