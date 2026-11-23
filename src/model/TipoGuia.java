package model;

/**
 * Especialidad del Guia Turistico
 */
public enum TipoGuia {
    sitio,
    circuito,
    traslado;

    /**
     * Similar a Double.parseDouble en idea.
     * @param tipo representacion textual del enum
     * @return tipo de Guia
     */
    public static TipoGuia parseTipoGuia(String tipo) {
        return switch (tipo.strip().toLowerCase()) {
            case "sitio" -> sitio;
            case "circuito" -> circuito;
            case "traslado" -> traslado;
            default -> throw new IllegalArgumentException("Error al convertir '"+tipo+"' a TipoGuia.");
        };
    }
}
