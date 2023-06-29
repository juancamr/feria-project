package modelo;

import java.util.Date;

public class Feria {

    private int id;
    private String nombre;
    private int aforo;
    private double costo;
    private Date fecha;
    private String seguridad;
    private double presupuesto;
    private Local local;
    
    public Feria() {}

    private Feria(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.aforo = builder.aforo;
        this.costo = builder.costo;
        this.fecha = builder.fecha;
        this.seguridad = builder.seguridad;
        this.presupuesto = builder.presupuesto;
        this.local = builder.local;
    }

    public static class Builder {

        private int id;
        private String nombre;
        private int aforo;
        private double costo;
        private Date fecha;
        private String seguridad;
        private double presupuesto;
        private Local local;
        
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public Builder setAforo(int aforo) {
            this.aforo = aforo;
            return this;
        }
        public Builder setCosto(double costo) {
            this.costo = costo;
            return this;
        }
        public Builder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }
        public Builder setSeguridad(String seguridad) {
            this.seguridad = seguridad;
            return this;
        }
        public Builder setPresupuesto(double presupuesto) {
            this.presupuesto = presupuesto;
            return this;
        }
        public Builder setLocal(Local local) {
            this.local = local;
            return this;
        }
        
        public Feria build() {
            return new Feria(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}
