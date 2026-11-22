package model;

public class Operador extends Trabajador {
    private EspecialidadOperador especialidad;

    public Operador() {
    }

    public Operador(EspecialidadOperador especialidad) {
        this.especialidad = especialidad;
    }

    public Operador(Trabajador trabajador) {
        super(trabajador);
    }

    public Operador(Trabajador trabajador, EspecialidadOperador especialidad) {
        super(trabajador);
        this.especialidad = especialidad;
    }

    public Operador(String rut, String nombre, String direccion, Double sueldo, EspecialidadOperador especialidad) {
        super(rut, nombre, direccion, sueldo);
        this.especialidad = especialidad;
    }

    public EspecialidadOperador getEspecialidad() {
        return especialidad;
    }

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
