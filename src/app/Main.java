package app;

import model.Trabajador;
import util.LectorArchivos;

import java.util.List;

public class Main {
    List<Trabajador> trabajadores = LectorArchivos.leer("src/resources/data.txt");

    void main(String[] args) {
        for(Trabajador t : trabajadores) {
            System.out.println(t);
        }
    }
}
