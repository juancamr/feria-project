
package modelo;

public class Gasto {
    private int id;
    private int idReporte;
    private String detalle;
    private double amount;
    
    public Gasto() {}
    
    private Gasto(Builder builder) {
        this.id = builder.id;
        this.idReporte = builder.idReporte;
        this.detalle = builder.detalle;
        this.amount = builder.amount;
    }
    
    public static class Builder {
        private int id;
        private int idReporte;
        private String detalle;
        private double amount;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder idReporte(int idReporte) {
            this.idReporte = idReporte;
            return this;
        }

        public Builder detalle(String detalle) {
            this.detalle = detalle;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Gasto build() {
            return new Gasto(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
