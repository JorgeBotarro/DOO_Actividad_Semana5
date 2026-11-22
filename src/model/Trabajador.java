package model;

public class Trabajador {
    private String rut;
    private String nombre;
    private String direccion;
    private Double sueldo;

    public Trabajador() {
    }

    public Trabajador(String rut, String nombre, String direccion, Double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.sueldo = sueldo;
    }

    public Trabajador(Trabajador trabajador) {
        this.rut = trabajador.rut;
        this.nombre = trabajador.nombre;
        this.direccion = trabajador.direccion;
        this.sueldo = trabajador.sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
