package app;

import model.Trabajador;
import util.Filtros;
import util.LectorArchivos;

import java.util.List;

public class Main {
    List<Trabajador> trabajadores = LectorArchivos.leer("src/resources/data.txt");

    void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Todos los trabajadores:");
        System.out.println("========================================");
        for(Trabajador t : trabajadores) {
            System.out.println(t);
        }

        System.out.println("========================================");
        System.out.println("Filtrados por nombre: (Parten con M)");
        System.out.println("========================================");
        List<Trabajador> porNombre = Filtros.porNombre(trabajadores, "M", false);
        for(Trabajador t : porNombre) {
            System.out.println(t);
        }

        System.out.println("========================================");
        System.out.println("Filtrados por nombre: (Parten con M)");
        System.out.println("Filtrados por Sueldo: (Mayores a 850.000)");
        System.out.println("========================================");
        List<Trabajador> porNombreYSueldo = Filtros.porSueldo(porNombre, 850_000.0, false);
        for(Trabajador t : porNombreYSueldo) {
            System.out.println(t);
        }
    }
}
