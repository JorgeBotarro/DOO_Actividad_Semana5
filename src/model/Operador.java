package model;

/**
 * Trabajador Operador Turistico.
 */
public class Operador extends Trabajador {
    private EspecialidadOperador especialidad;

    /**
     * Constructor Vacio
     */
    public Operador() {
    }

    /**
     * Constructor Parcial
     * @param especialidad Especialidad de Operador
     */
    public Operador(EspecialidadOperador especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Constructor de Copia Parcial
     * @param trabajador Trabajador a copiar
     */
    public Operador(Trabajador trabajador) {
        super(trabajador);
    }

    /**
     * Constructor de Copia Completo
     * @param trabajador Trabajador a copiar
     * @param especialidad Especialidad de Operador
     */
    public Operador(Trabajador trabajador, EspecialidadOperador especialidad) {
        super(trabajador);
        this.especialidad = especialidad;
    }

    /**
     * Constructor Completo
     * @param rut Rut
     * @param nombre Nombre
     * @param direccion Direccion
     * @param sueldo Sueldo
     * @param especialidad Especialidad de Operador
     */
    public Operador(String rut, String nombre, String direccion, Double sueldo, EspecialidadOperador especialidad) {
        super(rut, nombre, direccion, sueldo);
        this.especialidad = especialidad;
    }

    /**
     * Getter de Especialidad de Operador
     * @return Especialidad de Operador
     */
    public EspecialidadOperador getEspecialidad() {
        return especialidad;
    }

    /**
     * Setter de Especialidad de Operador
     * @param especialidad Nueva Especialidad de Operador
     */
    public void setEspecialidad(EspecialidadOperador especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Operador{" +
                super.toString() +
                ", especialidad=" + especialidad +
                '}';
    }
}
