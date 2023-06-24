
package modelo;

public class Finanza {
    private int id;
    private Feria Feria;
    private double gastos;
    private double ingresos;
    
    public Finanza() {}

    public Feria getFeria() {
        return Feria;
    }

    public void setFeria(Feria Feria) {
        this.Feria = Feria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
            
}
