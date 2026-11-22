package model;

public class Transportista extends Trabajador {
    private TipoTransportista tipo;

    public Transportista() {

    }

    public Transportista(TipoTransportista tipo) {
        this.tipo = tipo;
    }

    public Transportista(Trabajador trabajador) {
        super(trabajador);
    }

    public Transportista(Trabajador trabajador, TipoTransportista tipo) {
        super(trabajador);
        this.tipo = tipo;
    }

    public Transportista(String rut, String nombre, String direccion, Double sueldo, TipoTransportista tipo) {
        super(rut, nombre, direccion, sueldo);
        this.tipo = tipo;
    }

    public TipoTransportista getTipo() {
        return tipo;
    }

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
