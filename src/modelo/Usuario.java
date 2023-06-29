package modelo;

import java.util.Date;

public class Usuario {

    private int idUsuario;
    private String nombres;
    private String dni;
    private String telefono;
    private String userName;
    private String password;
    private String correo;
    private String tipoUsuario;
    private Date fechaRegistro;

    private Usuario(Builder builder) {
        this.idUsuario = builder.idUsuario;
        this.nombres = builder.nombres;
        this.dni = builder.dni;
        this.telefono = builder.telefono;
        this.userName = builder.userName;
        this.password = builder.password;
        this.correo = builder.correo;
        this.tipoUsuario = builder.tipoUsuario;
        this.fechaRegistro = builder.fechaRegistro;
    }

    public static class Builder {

        private int idUsuario;
        private String nombres;
        private String dni;
        private String telefono;
        private String userName;
        private String password;
        private String correo;
        private String tipoUsuario;
        private Date fechaRegistro;

        public Builder setIdUsuario(int idUsuario) {
            this.idUsuario = idUsuario;
            return this;
        }

        public Builder setNombres(String nombres) {
            this.nombres = nombres;
            return this;
        }

        public Builder setDni(String dni) {
            this.dni = dni;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setUserName(String username) {
            this.userName = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public Builder setTipoUsuario(String tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
            return this;
        }

        public Builder setFechaRegistro(Date fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
