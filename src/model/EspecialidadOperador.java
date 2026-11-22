package model;

public enum EspecialidadOperador {
    vuelos,
    hoteles,
    traslados,
    excursiones,
    entradas;

    public static EspecialidadOperador parseEspecialidadOperador(String especialidad) {
        return switch (especialidad.strip().toLowerCase()) {
            case "vuelos" -> vuelos;
            case "hoteles" -> hoteles;
            case "traslados" -> traslados;
            case "excursiones" -> excursiones;
            case "entradas" -> entradas;
            default -> throw new IllegalArgumentException("Error al convertir '"+especialidad+"' a EspecialidadOperador.");
        };
    }
}
