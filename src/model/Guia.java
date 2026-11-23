package model;

/**
 * Trabajador Guia Local.
 */
public class Guia extends Trabajador {
    private TipoGuia tipo;

    /**
     * Constructor Vacio
     */
    public Guia() {

    }

    /**
     * Constructor Parcial
     * @param tipo Tipo de Guia
     */
    public Guia(TipoGuia tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor de Copia Vacio
     * @param trabajador Trabajador a copiar
     */
    public Guia(Trabajador trabajador) {
        super(trabajador);
    }

    /**
     * Constructor de Copia Completo
     * @param trabajador Trabajador a copiar
     * @param tipo Tipo de Guia
     */
    public Guia(Trabajador trabajador, TipoGuia tipo) {
        super(trabajador);
        this.tipo = tipo;
    }

    /**
     * Constructor Completo
     * @param rut Rut
     * @param nombre Nombre
     * @param direccion Direccion
     * @param sueldo Sueldo
     * @param tipo Tipo de Guia
     */
    public Guia(String rut, String nombre, String direccion, Double sueldo, TipoGuia tipo) {
        super(rut, nombre, direccion, sueldo);
        this.tipo = tipo;
    }

    /**
     * Getter del Tipo de Guia
     * @return Tipo de Guia
     */
    public TipoGuia getTipo() {
        return tipo;
    }

    /**
     * Setter del Tipo de Guia
     * @param tipo Nuevo Tipo de Guia
     */
    public void setTipo(TipoGuia tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Guia{" +
                super.toString() +
                ", tipo=" + tipo +
                '}';
    }
}
