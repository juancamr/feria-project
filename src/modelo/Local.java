package modelo;

import java.util.Date;

public class Local {
    private int idLocal;
    private String nombre;
    private String distrito;
    private int aforo;
    private Date fecha;
    private double costo;
    
    public Local() {}

    private Local(Builder builder) {
        this.idLocal = builder.idLocal;
        this.nombre = builder.nombre;
        this.distrito = builder.distrito;
        this.aforo = builder.aforo;
        this.fecha = builder.fecha;
        this.costo = builder.costo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int idLocal;
        private String nombre;
        private String distrito;
        private int aforo;
        private Date fecha;
        private double costo;

        public Builder setIdLocal(int idLocal) {
            this.idLocal = idLocal;
            return this;
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setDistrito(String distrito) {
            this.distrito = distrito;
            return this;
        }

        public Builder setAforo(int aforo) {
            this.aforo = aforo;
            return this;
        }

        public Builder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder setCosto(double costo) {
            this.costo = costo;
            return this;
        }

        public Local build() {
            return new Local(this);
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
}
