package app;

import model.Guia;
import model.Operador;
import model.Trabajador;
import model.Transportista;
import util.Filtros;
import util.LectorArchivos;

import java.util.List;

public class Main {
    List<Trabajador> trabajadores = LectorArchivos.leer("src/resources/data.txt");

    public void printTrabajador(Trabajador t) {
        System.out.println("\t- RUT: " + t.getRut());
        System.out.println("\t- Nombre: " + t.getNombre());
        System.out.println("\t- Direccion: " + t.getDireccion());
        System.out.println("\t- Sueldo: " + t.getSueldo());
    }

    public void printGuia(Guia g) {
        System.out.println("Guia:");
        printTrabajador(g);
        System.out.println("\t- Tipo: " + g.getTipo());
    }

    public void printOperador(Operador o) {
        System.out.println("Operador:");
        printTrabajador(o);
        System.out.println("\t- Especialidad: " + o.getEspecialidad());
    }

    public void printTransportista(Transportista t) {
        System.out.println("Transportista:");
        printTrabajador(t);
        System.out.println("\t- Tipo: " + t.getTipo());
    }

    public void print(Trabajador t) {
        switch (t) {
            case Guia guia -> printGuia(guia);
            case Operador operador -> printOperador(operador);
            case Transportista transportista -> printTransportista(transportista);
            case null, default -> {
                assert t != null;
                printTrabajador(t);
            }
        }
    }

    void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Todos los trabajadores:");
        System.out.println("========================================");
        for(Trabajador t : trabajadores) {
            print(t);
        }

        System.out.println("========================================");
        System.out.println("Filtrados por nombre: (Parten con M)");
        System.out.println("========================================");
        List<Trabajador> porNombre = Filtros.porNombre(trabajadores, "M", false);
        for(Trabajador t : porNombre) {
            print(t);
        }

        System.out.println("========================================");
        System.out.println("Filtrados por nombre: (Parten con M)");
        System.out.println("Filtrados por Sueldo: (Mayores a 850.000)");
        System.out.println("========================================");
        List<Trabajador> porNombreYSueldo = Filtros.porSueldo(porNombre, 850_000.0, false);
        for(Trabajador t : porNombreYSueldo) {
            print(t);
        }
    }
}
