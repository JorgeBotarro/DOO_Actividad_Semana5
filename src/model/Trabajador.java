package model;

/**
 * Trabajador Generico
 */
public class Trabajador {
    private String rut;
    private String nombre;
    private String direccion;
    private Double sueldo;

    /**
     * Constructor vacio
     */
    public Trabajador() {
    }

    /**
     * Constructor completo
     * @param rut Rut
     * @param nombre Nombre
     * @param direccion Direccion
     * @param sueldo Sueldo
     */
    public Trabajador(String rut, String nombre, String direccion, Double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.sueldo = sueldo;
    }

    /**
     * Constructor de copia
     * @param trabajador Trabajador a copiar
     */
    public Trabajador(Trabajador trabajador) {
        this.rut = trabajador.rut;
        this.nombre = trabajador.nombre;
        this.direccion = trabajador.direccion;
        this.sueldo = trabajador.sueldo;
    }

    /**
     * Getter del Rut
     * @return rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * Setter del Rut
     * @param rut Nuevo Rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Getter del Nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del Nombre
     * @param nombre Nuevo Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la Direccion
     * @return Direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter de la Direccion
     * @param direccion Nueva Direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter del Sueldo
     * @return Sueldo
     */
    public Double getSueldo() {
        return sueldo;
    }

    /**
     * Setter del Sueldo
     * @param sueldo Nuevo Sueldo
     */
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
