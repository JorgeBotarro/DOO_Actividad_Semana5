package model;

/**
 * Trabajador transportista.
 */
public class Transportista extends Trabajador {
    private TipoTransportista tipo;

    /**
     * Constructor Vacio
     */
    public Transportista() {

    }

    /**
     * Constructor Parcial
     * @param tipo Tipo de Transportista
     */
    public Transportista(TipoTransportista tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor de Copia
     * @param trabajador Trabajador a copiar
     */
    public Transportista(Trabajador trabajador) {
        super(trabajador);
    }

    /**
     * Constructor de Copia Completo
     * @param trabajador Trabajador a copiar
     * @param tipo Tipo de Transportista
     */
    public Transportista(Trabajador trabajador, TipoTransportista tipo) {
        super(trabajador);
        this.tipo = tipo;
    }

    /**
     * Constructor Completo
     * @param rut Rut
     * @param nombre Nombre
     * @param direccion Direccion
     * @param sueldo Sueldo
     * @param tipo Tipo de Transportista
     */
    public Transportista(String rut, String nombre, String direccion, Double sueldo, TipoTransportista tipo) {
        super(rut, nombre, direccion, sueldo);
        this.tipo = tipo;
    }

    /**
     * Getter de Tipo de Transportista
     * @return Tipo de Transportista
     */
    public TipoTransportista getTipo() {
        return tipo;
    }

    /**
     * Setter de Tipo de Transportista
     * @param tipo Nuevo Tipo de Transportista
     */
    public void setTipo(TipoTransportista tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Transportista{" +
                super.toString() +
                ", tipo=" + tipo +
                '}';
    }
}
