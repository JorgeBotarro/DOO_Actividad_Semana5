package util;

import model.Trabajador;

import java.util.ArrayList;
import java.util.List;

/**
 * Libreria de metodos de filtrado de trabajadores
 */
public class Filtros {

    /**
     * Filtra la lista de trabajadores por el nombre
     * @param trabajadores Trabajadores a filtrar
     * @param nombre Nombre a filtrar (incluso parcialmente)
     * @param invertir Solo incluir aquellos que no contienen el nombre
     * @return Trabajadores filtrados
     */
    public static List<Trabajador> porNombre(List<Trabajador> trabajadores, String nombre, boolean invertir) {
        List<Trabajador> resultado = new ArrayList<>();

        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getNombre().startsWith(nombre)) {
                if (!invertir) {
                    resultado.add(trabajador);
                }
            } else {
                if (invertir) {
                    resultado.add(trabajador);
                }
            }
        }

        return resultado;
    }

    /**
     * Filtra la lista de trabajadores por el sueldo
     * @param trabajadores Trabajadores a filtrar
     * @param sueldo Valor de corte (incluido)
     * @param invertir Solo incluir menores
     * @return Trabajadores filtrados
     */
    public static List<Trabajador> porSueldo(List<Trabajador> trabajadores, Double sueldo, boolean invertir) {
        List<Trabajador> resultado = new ArrayList<>();

        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getSueldo() >= sueldo) {
                if (!invertir) {
                    resultado.add(trabajador);
                }
            } else {
                if (invertir) {
                    resultado.add(trabajador);
                }
            }
        }

        return resultado;
    }

}
