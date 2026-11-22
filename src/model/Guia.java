package model;

public class Guia extends Trabajador {
    private TipoGuia tipo;

    public Guia() {

    }

    public Guia(TipoGuia tipo) {
        this.tipo = tipo;
    }

    public Guia(Trabajador trabajador) {
        super(trabajador);
    }

    public Guia(Trabajador trabajador, TipoGuia tipo) {
        super(trabajador);
        this.tipo = tipo;
    }

    public Guia(String rut, String nombre, String direccion, Double sueldo, TipoGuia tipo) {
        super(rut, nombre, direccion, sueldo);
        this.tipo = tipo;
    }

    public TipoGuia getTipo() {
        return tipo;
    }

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
