package util;

import model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de utilidad para la lectura de archivos con trabajadores
 */
public class LectorArchivos {

    /**
     * Dado un archivo estilo csv, extrae una lista de trabajadores
     * @param rutaArchivo archivo estilo csv con un trabajador por linea.
     * @return Lista de trabajadores
     */
    public static List<Trabajador> leer(String rutaArchivo) {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while((linea = br.readLine())!=null) {
                // Saltar lineas vacias y las que parten con # (comentarios)
                if (linea.isEmpty()) { continue; }
                if (linea.startsWith("#")) { continue; }

                try {
                    String[] partes = linea.strip().split(";");
                    String tipo = partes[0].strip().toLowerCase();

                    // Obtener todos los valores en comun con trabajador
                    Trabajador t = new Trabajador();
                    t.setRut(partes[1].strip());
                    t.setNombre(partes[2].strip());
                    t.setDireccion(partes[3].strip());
                    t.setSueldo(Double.parseDouble(partes[4]));

                    // Obtener los valores especificos de cada subclase
                    switch (tipo) {
                        case "trabajador": {
                            trabajadores.add(t);
                        } break;
                        case "guia": {
                            Guia guia = new Guia(t);
                            guia.setTipo(TipoGuia.parseTipoGuia(partes[5]));

                            trabajadores.add(guia);
                        } break;
                        case "operador": {
                            Operador operador = new Operador(t);
                            operador.setEspecialidad(EspecialidadOperador.parseEspecialidadOperador(partes[5]));

                            trabajadores.add(operador);
                        } break;
                        case "transportista": {
                            Transportista transportista = new Transportista(t);
                            transportista.setTipo(TipoTransportista.parseTipoTransportista(partes[5]));

                            trabajadores.add(transportista);
                        } break;
                        default: {
                            throw new IllegalArgumentException("Tipo invalido");
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(linea);
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo '" +  rutaArchivo + "' no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo '" +  rutaArchivo + "'");
        }

        return trabajadores;
    }
}
